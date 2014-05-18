package libpackage

import org.scalatest._
import libpackage.Common.test

class LibTest  extends FunSpec with Matchers with GivenWhenThen {
  describe("The library") {

    it("tells us it is a library") {
      test should be("library")
    }
  }
}
