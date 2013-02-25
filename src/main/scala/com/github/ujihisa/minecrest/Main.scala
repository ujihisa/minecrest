package com.github.ujihisa.minecrest

import org.scalatra.ScalatraFilter

class Main extends ScalatraFilter {
	get("/") {
		"cool"
	}
}
