package connpasscala

package object response {

  import argonaut._
  import Argonaut._

  def parse(json: String): Option[Results] =
    json.decodeOption[Results]
}
