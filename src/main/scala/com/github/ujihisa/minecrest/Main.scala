package com.github.ujihisa.minecrest

import spray.can.server.SprayCanHttpServerApp
import akka.actor.{Props, Actor}

class HttpHandler extends Actor {
	sealed trait Entity
	case class Player(name: String, health: Int) extends Entity
	private val mockOnlinePlayers = List(
		Player("ujm", 2),
		Player("mozukusoba", 20))

	def receive = {
		case e => println('cool, e)
	}
}

object Main extends App with SprayCanHttpServerApp {
	val handler = system.actorOf(Props[HttpHandler])

	newHttpServer(handler) ! Bind(interface = "localhost", port = 12380)
}
