package com.sochinho

import akka.actor.ActorSystem

import scala.io.StdIn

object IotApp {

  def main(args: Array[String]): Unit = {
    val system = ActorSystem("iot-system")

    try {
      val supervisor = system.actorOf(IotSupervisor.props(), "iot-supervisior")
      StdIn.readLine()
    } finally {
      system.terminate()
    }
  }
}
