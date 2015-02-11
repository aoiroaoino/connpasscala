package connpasscala

class RequestRepository(url: String) {

  def getRequestBuilder(p: Map[String, String] = Map()) = RequestBuilder(p)

  //TODO: validation
  case class RequestBuilder private[RequestRepository](params: Map[String, String]) {
    def build() = Request(params)

    // add parameter methods
    def eventId(i: Int): RequestBuilder = addParam("event_id" -> i.toString)

    def keyword(s: String): RequestBuilder = addParam("keyword" -> s)

    def keywordOr(s: String): RequestBuilder = addParam("keyword_or" -> s)

    def ym(i: Int): RequestBuilder = addParam("ym" -> i.toString)

    def ymd(i: Int): RequestBuilder = addParam("ymd" -> i.toString)

    def nickname(s: String): RequestBuilder = addParam("nickname" -> s)

    def ownerNickname(s: String): RequestBuilder = addParam("owner_nickname" -> s)

    def seriesId(i: Int): RequestBuilder = addParam("series_id" -> i.toString)

    def start(i: Int = 1): RequestBuilder = addParam("start" -> i.toString)

    def order(i: Int): RequestBuilder = addParam("order" -> i.toString)

    def count(i: Int): RequestBuilder = addParam("count" -> i.toString)

    def format(s: String): RequestBuilder = addParam("format" -> s)

    // helpers
    private def addParam(p: (String, String)) = copy(params ++ Map(p))
  }

  case class Request(params: Map[String, String]) {
    import scalaj.http.Http

    def runString() = Http(url).params(params).asString.body
  }
}

