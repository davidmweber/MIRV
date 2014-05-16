package client
import org.scalatest._
import client.test

class ClientTest  extends FunSpec with Matchers with GivenWhenThen {
  describe("Client") {

    it("tells us it is a client") {
      test should be("client")
    }
  }
}
