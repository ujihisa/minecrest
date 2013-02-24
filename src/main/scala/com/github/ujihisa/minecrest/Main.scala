package com.github.ujihisa.minecrest

import com.twitter.finagle.{Http, Service}
import com.twitter.util.{Await, Future}
import java.net.InetSocketAddress
import org.jboss.netty.handler.codec.http.{HttpRequest, HttpResponse, HttpResponseStatus,
	DefaultHttpResponse}

object Main {
	def main(args: Array[String]) {
		println("Hello, world!")

		val service = new Service[HttpRequest, HttpResponse] {
			def apply(req: HttpRequest): Future[HttpResponse] = {
				println('receiving, req)
				Future(new DefaultHttpResponse(
					req.getProtocolVersion, HttpResponseStatus.OK))
			}
		}

		val server = Http.serve(":12380", service)
		Await.ready(server)
	}
}
