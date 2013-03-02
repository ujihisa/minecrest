import AssemblyKeys._

assemblySettings

name := "minecrest"

version := "1.0"

//resolvers += "Akka Repo" at "http://repo.akka.io/repository"

resolvers ++= Seq(
	"spray repo" at "http://repo.spray.io",
	"typesafe releases" at "http://repo.typesafe.com/typesafe/releases/",
	"repo.codahale.com" at "http://repo.codahale.com")

libraryDependencies ++= Seq(
	"com.typesafe.akka" % "akka-actor" % "2.0.4",
	"com.codahale" % "jerkson_2.9.1" % "0.5.0",
	"io.spray" % "spray-can" % "1.0-M7")
