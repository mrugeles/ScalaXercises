package Lists

import org.junit.{Assert, Test}

class ListTest {

  @Test
  def testSum = {
    val list = List(1, 2, 3, 4)
    val sum = List.sum(list)
    Assert.assertEquals(10, sum)
  }

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
  def testDrop = {
    val intList = List(1,2,3,4,5,6,7,8,9)
    val dropResult = List.drop(intList, 3)
    Assert.assertEquals(dropResult, List(4,5,6,7,8,9))
  }


  @Test
  def testDropWhile = {
    val intList = List(1,2,3,4,5,6,7,8,9)
    val dropWhileResult = List.dropWhile(intList)( n => n < 3)
    Assert.assertEquals(dropWhileResult, List(3, 4,5,6,7,8,9))
  }

  @Test
  def testSetHead = {
    val intList = List(1,2,3,4,5,6,7,8,9)
    val setHeadResult = List.setHead(intList, 15 )
    Assert.assertEquals(setHeadResult, List(1,2,3,4,5,6,7,8,9))

  }

}
