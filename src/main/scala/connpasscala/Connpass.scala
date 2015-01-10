package connpasscala

import argonaut._
import Argonaut._

object Connpass {
  def parse(json: String): Option[Response] = {
    json.decodeOption[Response]
  }
}

