package connpasscala
package optics

import monocle.macros.GenLens

import connpasscala.response.Results

object results extends ResultOptics

trait ResultOptics {

  private[this] lazy val gen = GenLens[Results]

  def _resultsReturned  = gen(_.resultsReturned)
  def _resultsAvailable = gen(_.resultsAvailable)
  def _resultsStart     = gen(_.resultsStart)
  def _events           = gen(_.events)
}
