package connpasscala

object Connpasscala {
  import Response._

  val endPoint = "http://connpass.com/api/v1/event/"
  val requestRepository = new RequestRepository(endPoint)

  implicit class RunRequest(rb: requestRepository.RequestBuilder) {
    def run(): Option[Connpass] = Response.parse(rb.build.runString)
  }

  object Client {
    def apply() = requestRepository.getRequestBuilder()
  }

}

