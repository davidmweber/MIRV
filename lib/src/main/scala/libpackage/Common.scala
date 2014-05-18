package libpackage

import scala.pickling._
import json._

object Common {
  def test = "library"
	def printme(s:String) = println(s.pickle)
}