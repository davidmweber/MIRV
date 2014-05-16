package server
import org.scalatest._
import server.test

/**
 *
 */
class ServerTest  extends FunSpec with Matchers with GivenWhenThen {
  describe("Server") {

    it("tells us it is a server") {
      test should be("server")
    }
  }
}
