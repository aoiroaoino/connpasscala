package connpasscala
package optics

import monocle.macros.GenLens

import connpasscala.response.Event

object event extends EventOptics

trait EventOptics {

  private[this] lazy val gen = GenLens[Event]

  def _eventId          = gen(_.eventId)
  def _eventTitle       = gen(_.title) // conflict name... Series#title
  def _catch            = gen(_.`catch`)
  def _description      = gen(_.description)
  def _eventUrl         = gen(_.eventUrl)
  def _hashTag          = gen(_.hashTag)
  def _startedAt        = gen(_.startedAt)
  def _endedAt          = gen(_.endedAt)
  def _limit            = gen(_.limit)
  def _eventType        = gen(_.eventType)
  def _series           = gen(_.series)
  def _address          = gen(_.address)
  def _place            = gen(_.place)
  def _lat              = gen(_.lat)
  def _lon              = gen(_.lon)
  def _ownerId          = gen(_.ownerId)
  def _ownerNickname    = gen(_.ownerNickname)
  def _ownerDisplayName = gen(_.ownerDisplayName)
  def _accepted         = gen(_.accepted)
  def _waiting          = gen(_.waiting)
  def _updatedAt        = gen(_.updatedAt)
}
