package connpasscala

import connpasscala.response._

object Connpasscala {

  val endPoint = "http://connpass.com/api/v1/event/"
  val requestRepository = new RequestRepository(endPoint)

  implicit class RunRequest(rb: requestRepository.RequestBuilder) {
    def run(): Option[Results] = parse(rb.build.runString)
  }

  object Client {
    def apply() = requestRepository.getRequestBuilder()
  }

}

