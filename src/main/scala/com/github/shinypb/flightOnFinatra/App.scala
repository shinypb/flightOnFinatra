package com.github.shinypb.flightOnFinatra

import com.twitter.finatra._
import com.twitter.finatra.ContentType._
import com.twitter.ostrich.stats.Stats
import com.github.mustachejava._
import com.twitter.mustache.ScalaObjectHandler
import com.github.shinypb.flightOnFinatra.FlightController

object App {

  class FlightApp extends FlightController {
  }

  val app = new FlightApp

  def main(args: Array[String]) = {
    FinatraServer.register(app)
    FinatraServer.start()
  }

}