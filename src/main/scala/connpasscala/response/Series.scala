package connpasscala
package response

import argonaut._
import Argonaut._

final case class Series (
  id:    Int,
  title: String,
  url:   String
)

object Series {

 implicit val seriesCodecJson: CodecJson[Series] =
   CodecJson.casecodec3(apply, unapply)(
     "id",
     "title",
     "url"
   )
}
