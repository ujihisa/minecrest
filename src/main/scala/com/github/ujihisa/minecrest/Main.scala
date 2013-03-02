package com.github.ujihisa.minecrest

import spray.can.server.SprayCanHttpServerApp
import akka.actor.{Props, Actor}

class HttpHandler extends Actor {
	import spray.http._
	import spray.http.HttpMethods.{GET}
	import com.codahale.jerkson.Json
	import spray.can.server.HttpServer

	sealed trait Entity
	case class Player(name: String, health: Int) extends Entity
	private val mockOnlinePlayers = List(
		Player("ujm", 2),
		Player("mozukusoba", 20))

	def receive = {
		case HttpRequest(GET, "/alarm", _, _, _) =>
			sender ! HttpResponse(entity = "OK")
			
		case HttpRequest(GET, "/api/v1/users/online.json", _, _, _) =>
			sender ! jsonResponse(mockOnlinePlayers)

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

object Main extends App with SprayCanHttpServerApp {
	val handler = system.actorOf(Props[HttpHandler])

	newHttpServer(handler) ! Bind(interface = "localhost", port = 12380)
}
