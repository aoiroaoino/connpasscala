package connpasscala
package response

import argonaut._
import Argonaut._

final case class Results (
  resultsReturned:  Int,
  resultsAvailable: Int,
  resultsStart:     Int,
  events:           List[Event]
)

object Results {

  implicit val responseCodecJson: CodecJson[Results] =
    CodecJson.casecodec4(apply, unapply)(
      "results_returned",
      "results_available",
      "results_start",
      "events"
    )
}
