package samples

import org.junit._
import Assert._
import net.Recursion

@Test
class AppTest {

    @Test
    def testSum() = {
        val r = new Recursion
        assertTrue(r.sum(3) == 6)
    }


    @Test
    def testProd() = {
        val r = new Recursion
        assertTrue(r.prod(4) == 24)
    }

    @Test
    def testSumTail() = {
        val r = new Recursion
        assertTrue(r.sumTail(3) == 6)
    }


    @Test
    def testProdTail() = {
        val r = new Recursion
        assertTrue(r.prodTail(4) == 24)
    }


}


