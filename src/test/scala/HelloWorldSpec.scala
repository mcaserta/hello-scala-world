import org.specs2.mutable.Specification

class HelloWorldSpec extends Specification {

  "The 'Hello world' string" should {
    "contain 11 characters" in {
      "Hello world" must have size (11)
    }
    "start with 'Hello'" in {
      "Hello world" must startWith("Hello")
    }
    "end with 'world'" in {
      "Hello world" must endWith("world")
    }
    "contain 'lo wo'" in {
      "Hello world" must contain("lo wo")
    }
  }

  "The List(4, 2) list" should {
    "have a head of 4" in {
      List(4,2).head must equalTo(4)
    }
  }

}
