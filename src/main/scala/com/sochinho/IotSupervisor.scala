package com.sochinho

import akka.actor.{ Actor, ActorLogging, Props }

object IotSupervisor {
  def props(): Props = Props(new IotSupervisor)
}

class IotSupervisor extends Actor with ActorLogging {
  override def preStart(): Unit = log.info("IoT Application Started")
  override def postStop(): Unit = log.info("IoT Application Stopped")

  override def receive: Receive = Actor.emptyBehavior
}

object Main extends App {

  object WeekDay extends Enumeration {
    type WeekDay = Value
    val Mon, Tue, Wed, Thu, Fri, Sat, Sun = Value
  }
  import WeekDay._

  def isWorkingDay(d: WeekDay) = ! (d == Sat || d == Sun)

  WeekDay.values filter isWorkingDay foreach println
}