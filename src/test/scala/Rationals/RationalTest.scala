package Rationals

import org.junit.{Assert, Test}

@Test
class RationalTest {

  @Test
  def sum = {
    val r1 = new Rational(1, 3)
    val r2 = new Rational(2, 4)
    Assert.assertEquals("5/6", (r1 + r2).toString)
  }

  @Test
  def sum2 = {
    val r1 = new Rational(3, 5)
    val r2 = new Rational(8, 7)
    Assert.assertEquals("61/35", (r1 + r2).toString)
  }

  def diff = {
    val r1 = new Rational(61, 35)
    val r2 = new Rational(8, 7)
    Assert.assertEquals("3/5", (r1-r2).toString)
  }

  def prod = {
    val r1 = new Rational(5, 7)
    val r2 = new Rational(3, 8)
    Assert.assertEquals("15/56", (r1 * r2).toString)
  }

  def div = {
    val r1 = new Rational(7, 4)
    val r2 = new Rational(6, 7)
    Assert.assertEquals("49/24", (r1/r2).toString)
  }
}
