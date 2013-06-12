package com.github.shinypb.flightOnFinatra

import com.twitter.finatra._
import org.apache.commons.io.IOUtils
import java.io.StringWriter

class FlightController extends Controller {

  //  Default routes
  get("/") { request =>
    val inputStream = FileResolver.getInputStream("index.html")
    val stringWriter = new StringWriter
    IOUtils.copy(inputStream, stringWriter, "UTF-8");

    val html = stringWriter.toString
    stringWriter.close

    render.html(html).toFuture
  }

}