name := "akka-iot-device-manager"

version := "1.0"

scalaVersion := "2.13.1"

libraryDependencies ++= Seq(
  "com.typesafe.akka" %% "akka-actor" % "2.5.26",
  "com.typesafe.akka" %% "akka-slf4j" % "2.5.26",
  "com.typesafe.akka" %% "akka-remote" % "2.5.26",
  "com.typesafe.akka" %% "akka-agent" % "2.5.26",
  "org.scalactic" %% "scalactic" % "3.0.8",
  "com.typesafe.akka" %% "akka-testkit" % "2.5.26" % "test",
  "org.scalatest" %% "scalatest" % "3.0.8" % "test"
)
