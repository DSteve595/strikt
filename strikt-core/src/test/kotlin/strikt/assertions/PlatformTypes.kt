package strikt.assertions

import failgood.Test
import failgood.describe
import failgood.testsAbout
import strikt.api.expectThat
import strikt.java.PersonJava

@Test
class PlatformTypes {
  val context =
    testsAbout("platform types") {
      describe("when nullability is uncertain") {
        val expectation =
          expectThat(PersonJava("Oswald Launcelot Campbell-Graves"))
            .get(PersonJava::getName)
        test("isNotNull can be applied") {
          expectation.isNotNull()
        }
      }
    }
}
