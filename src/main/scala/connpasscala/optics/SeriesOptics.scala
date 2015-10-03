package connpasscala
package optics

import monocle.macros.GenLens

import connpasscala.response.Series

object series extends SeriesOptics

trait SeriesOptics {

  private[this] lazy val gen = GenLens[Series]

  def _id          = gen(_.id)
  def _seriesTitle = gen(_.title) // conflict name... Event#title
  def _url         = gen(_.url)
}
