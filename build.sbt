import AssemblyKeys._

assemblySettings

name := "minecrest"

version := "1.0"

//resolvers += "Akka Repo" at "http://repo.akka.io/repository"

resolvers ++= Seq(
	"spray repo" at "http://repo.spray.io",
	"typesafe releases" at "http://repo.typesafe.com/typesafe/releases/")

libraryDependencies ++= Seq(
	"com.typesafe.akka" % "akka-actor" % "2.0.4",
	"io.spray" % "spray-can" % "1.0-M7")
