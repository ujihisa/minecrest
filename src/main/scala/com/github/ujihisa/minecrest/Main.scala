package com.github.ujihisa.minecrest

import spray.can.server.SprayCanHttpServerApp
import akka.actor.{Props, Actor}

class HttpHandler extends Actor {
	import spray.http._
	import spray.http.HttpMethods.{GET}

	case class Json(x: String)
	sealed trait Entity
	case class Player(name: String, health: Int) extends Entity
	private val mockOnlinePlayers = List(
		Player("ujm", 2),
		Player("mozukusoba", 20))

	def receive = {
		case HttpRequest(GET, "/alarm", _, _, _) =>
			sender ! HttpResponse(entity = "OK")
			
		case HttpRequest(GET, "/api/v1/users/online.json", _, _, _) =>
			sender ! jsonResponse(toJson(mockOnlinePlayers))

		case e => println("must-not-happen", e)
	}

	// all methods below are mock
	private def jsonResponse(json: Json): HttpResponse =
		HttpResponse(entity = json.x)

	private def toJson(x: List[Entity]) =
		Json(x.toString)
}

object Main extends App with SprayCanHttpServerApp {
	val handler = system.actorOf(Props[HttpHandler])

	newHttpServer(handler) ! Bind(interface = "localhost", port = 12380)
}
