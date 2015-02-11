package connpasscala

object Response {
  import argonaut._
  import Argonaut._

  def parse(json: String): Option[Connpass] = {
    json.decodeOption[Connpass]
  }

  final case class Connpass (
    resultsReturned:  Int,
    resultsAvailable: Int,
    resultsStart:     Int,
    events:           List[Connpass.Event]
  )

  object Connpass {
    implicit val responseCodecJson: CodecJson[Connpass] =
      CodecJson.casecodec4(apply, unapply)(
        "results_returned",
        "results_available",
        "results_start",
        "events"
      )

    final case class Event (
      eventId:          Int,
      title:            String,
      `catch`:          String,
      description:      String,
      eventUrl:         String,
      hashTag:          String,
      startedAt:        String,
      endedAt:          String,
      limit:            Option[Int],
      eventType:        String,
      series:           Option[Event.Series],
      address:          Option[String],
      place:            Option[String],
      lat:              Option[String],
      lon:              Option[String],
      ownerId:          Int,
      ownerNickname:    String,
      ownerDisplayName: String,
      accepted:         Int,
      waiting:          Int,
      updatedAt:        String
    )

    object Event {
      implicit val eventCodecJson: CodecJson[Event] =
        CodecJson.casecodec21(apply, unapply)(
          "event_id",
          "title",
          "catch",
          "description",
          "event_url",
          "hash_tag",
          "started_at",
          "ended_at",
          "limit",
          "event_type",
          "series",
          "address",
          "place",
          "lat",
          "lon",
          "owner_id",
          "owner_nickname",
          "owner_display_name",
          "accepted",
          "waiting",
          "updated_at"
        )

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
    }
  }
}
