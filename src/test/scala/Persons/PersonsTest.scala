package Persons


import org.junit.{Assert, Test}

import scala.io.Source

@Test
class PersonsTest {

  @Test
  def olderFilter() = {

    val persons = readFile()
    val older = persons.filter(x=>x.age>30)
    older.foreach(println(_))

  }

  @Test
  def femaleCount() = {

    val persons = readFile()
    val  femaleCount = persons.filter(x => x.gender.contains("Female")).size
    Assert.assertEquals(501, femaleCount)

  }

  @Test
  def maleCount() = {

    val persons = readFile()
    val  maleCount = persons.filter(x => x.gender.contains("Male")).size
    Assert.assertEquals(499, maleCount)

  }



  def readFile():Iterator[Person] = {

    val file = getClass.getResource("/personas.csv").getFile()
    val src = Source.fromFile(file).getLines
    src.map(x => {
      createPerson(x)
    })
  }

  def createPerson(str: String): Person = {

    val aux = str.split(",")

    Person(aux(0), aux(1), aux(2),aux(3),aux(4).toInt, aux(5))

  }


}

