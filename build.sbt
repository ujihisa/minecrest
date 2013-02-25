import AssemblyKeys._

assemblySettings

name := "minecrest"

version := "1.0"

resolvers += "Akka Repo" at "http://repo.akka.io/repository"

libraryDependencies ++= Seq(
	"org.scalatra" %% "scalatra" % "2.2.0",
	"org.scalatra" %% "scalatra-scalate" % "2.2.0",
	"javax.servlet" % "servlet-api" % "2.5")
