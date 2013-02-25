package com.github.ujihisa.minecrest

import org.scalatra.ScalatraFilter

class Main extends ScalatraFilter {
	sealed trait Entity
	case class Player(name: String, health: Int) extends Entity
	private val mockOnlinePlayers = List(
		Player("ujm", 2),
		Player("mozukusoba", 20))

	get("/1/") {
		mockOnlinePlayers.toString
	}
}
