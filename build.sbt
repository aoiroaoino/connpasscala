name := "Connpass Client"

version := "0.1.0-SNAPSHOT"

scalaVersion := "2.11.7"

libraryDependencies ++= Seq(
  "io.argonaut" %% "argonaut" % "6.1-M6",
  "org.scalaj" %% "scalaj-http" % "1.1.4",
  "com.github.julien-truffaut" %% "monocle-core" % "1.1.1",
  "com.github.julien-truffaut" %% "monocle-macro" % "1.1.1"
)

