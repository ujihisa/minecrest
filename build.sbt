import AssemblyKeys._

assemblySettings

name := "minecrest"

version := "1.0"

resolvers += "Akka Repo" at "http://repo.akka.io/repository"

libraryDependencies += "org.scalatra" %% "scalatra" % "2.2.0"

libraryDependencies += "org.scalatra" %% "scalatra-scalate" % "2.2.0"

libraryDependencies += "javax.servlet" % "servlet-api" % "2.5"
