# connpasscala
connpass client

# Usage

```scala
import connpasscala._

val jsonStr = scala.io.Source.fromURL("http://connpass.com/api/v1/event/?keyword=scala").getLines.mkString

Connpass.parse(jsonStr)
```

# API Reference
http://connpass.com/about/api/
