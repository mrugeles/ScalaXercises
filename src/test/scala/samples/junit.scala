package samples

import org.junit._
import Assert._
import net.Recursion

@Test
class AppTest {

    @Test
    def testSum() = {
        val r = new Recursion
        assertTrue(r.sum(3) == 5)
    }


    @Test
    def testProd() = {
        val r = new Recursion
        assertTrue(r.sum(4) == 24)
    }
//    @Test
//    def testKO() = assertTrue(false)

}


