package com.github.ujihisa.minecrest

import spray.can.server.SprayCanHttpServerApp
import akka.actor.{Props, Actor, ActorSystem}

class HttpHandler extends Actor {
	import spray.http._
	import spray.http.HttpMethods.{GET}
	import com.codahale.jerkson.Json
	import spray.can.server.HttpServer
	import org.bukkit.Bukkit

	sealed trait Entity
	case class Player(name: String, health: Int) extends Entity
	private val mockOnlinePlayers = List(
		Player("ujm", 2),
		Player("mozukusoba", 20))

	def receive = {
		case HttpRequest(GET, "/alarm", _, _, _) =>
			sender ! HttpResponse(entity = "OK")
			
		case HttpRequest(GET, "/api/v1/users/online.json", _, _, _) =>
			//sender ! jsonResponse(mockOnlinePlayers)
			sender ! jsonResponse(Bukkit.getOnlinePlayers.toList.map { p =>
				Map[String, Any](
					"name" -> p.getName,
					"health" -> p.getHealth)
			})

		case _: HttpRequest =>
			sender ! HttpResponse(status = 404, entity = "Unknown resource!")

		case HttpServer.Closed(_, reason) =>
			println('closed, reason)

		case e => println("must-not-happen", e)
	}

	// all methods below are mock
	private def jsonResponse(x: Any): HttpResponse =
		HttpResponse(entity = Json.generate(x))
}

/*
object Main extends App with SprayCanHttpServerApp {
	val handler = system.actorOf(Props[HttpHandler])

	newHttpServer(handler) ! Bind(interface = "localhost", port = 12380)
}
 */

import org.bukkit.plugin.java.JavaPlugin
import com.typesafe.config.ConfigFactory
class Main extends JavaPlugin with SprayCanHttpServerApp {
	val config = ConfigFactory.parseFile(new java.io.File("/tmp/reference.conf")).resolve
	//val classLoader = new java.net.URLClassLoader(Array(new java.net.URL("file:///home/share/tough-explosive/plugins/tough-explosive-0.1.0-SNAPSHOT-standalone.jar")))
	//val classLoader = Thread.currentThread.getContextClassLoader
	//val classLoader = ClassLoader.getSystemClassLoader
	val previous = Thread.currentThread.getContextClassLoader
	Thread.currentThread.setContextClassLoader(this.getClass().getClassLoader())
	val system0 = ActorSystem("minecrest")//, config, classLoader)
	val handler = system.actorOf(Props[HttpHandler])
	newHttpServer(handler) ! Bind(interface = "localhost", port = 12380)
	Thread.currentThread().setContextClassLoader(previous)
	override lazy val system = system0

	override def onEnable {
		println('cool)
	}

	override def onDisable {
		println('bye)
	}
}
