name := "akka-iot-device-manager"

version := "1.0"

scalaVersion := "2.13.1"

libraryDependencies ++= Seq(
  "com.typesafe.akka" %% "akka-actor" % "2.6.1",
  "com.typesafe.akka" %% "akka-actor-typed" % "2.6.1",
  "com.typesafe.akka" %% "akka-slf4j" % "2.6.1",
  "com.typesafe.akka" %% "akka-remote" % "2.6.1",
  "com.typesafe.akka" %% "akka-agent" % "2.5.26",
  "org.scalactic" %% "scalactic" % "3.0.8",
  "com.typesafe.akka" %% "akka-stream-testkit" % "2.6.1",
  "com.typesafe.akka" %% "akka-http-testkit" % "10.1.10",
  "com.typesafe.akka" %% "akka-testkit" % "2.5.26" % Test,
  "com.typesafe.akka" %% "akka-actor-testkit-typed" % "2.6.0" % Test,
  "org.scalatest" %% "scalatest" % "3.0.8" % Test
)
