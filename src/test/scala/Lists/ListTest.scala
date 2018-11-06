package Lists

import org.junit.{Assert, Test}

class ListTest {

  @Test
  def testSum = {
    val list = List(1, 2, 3, 4)
    val sum = List.sum(list)
    Assert.assertEquals(10, sum)
  }

  @Test
  def testProd = {
    val list = List(1, 2, 3, 4)
    val sum = List.product(list)
    Assert.assertEquals(24, sum)
  }

  @Test
  def testTail = {
    val list = List[String]("red", "green", "blue")
    val tailResult = List.tail(list)
    Assert.assertEquals(tailResult, List("green", "blue"))
  }

  @Test
  def testTail2 = {
    val list = List[String]("red")
    val tailResult = List.tail(list)
    Assert.assertEquals(tailResult, Nil)
  }


  @Test
  def testDrop = {
    val intList = List(1,2,3,4,5,6,7,8,9)
    val dropResult = List.drop(intList, 3)
    Assert.assertEquals(List(4,5,6,7,8,9), dropResult)
  }


  @Test
  def testDropWhile = {
    val intList = List(1,2,3,4,5,6,7,8,9)
    val dropWhileResult = List.dropWhile(intList)( n => n < 3)
    Assert.assertEquals(List(3,4,5,6,7,8,9), dropWhileResult)
  }

  @Test
  def testSetHead = {
    val intList = List(1,2,3,4,5,6,7,8,9)
    val setHeadResult = List.setHead(intList, 15)
    Assert.assertEquals(setHeadResult, List(15,1,2,3,4,5,6,7,8,9))

  }

}
