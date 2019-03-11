package Persons


import org.junit.{Assert, Test}

import scala.io.Source

@Test
class PersonsTest {

  @Test
  def olderFilter() = {

    val persons = readFromFile("/personas.csv").map(x => {
      createPerson(x)
    })
    val older = persons.filter(x=>x.age>30)
    older.foreach(println(_))

  }

  @Test
  def femaleCount() = {

    val persons = readFromFile("/personas.csv").map(x => {
      createPerson(x)
    })
    val  femaleCount = persons.filter(x => x.gender.contains("Female")).size
    Assert.assertEquals(501, femaleCount)

  }

  @Test
  def maleCount() = {

    val persons = readFromFile("/personas.csv").map(x => {
      createPerson(x)
    })

    val  maleCount = persons.filter(x => x.gender.contains("Male")).size
    Assert.assertEquals(499, maleCount)

  }



  def readFromFile(fileName: String):Iterator[String] = {

    val file = getClass.getResource(fileName).getFile()
    Source.fromFile(file).getLines

  }

  def createPerson(str: String): Person = {

    val aux = str.split(",")
    Person(aux(0), aux(1), aux(2),aux(3),aux(4).toInt, aux(5))

  }

  @Test
  def getAlertName() = {

    val alerts = readFromFile("/alerts.txt").filter(x => x.contains("dx"))
    alerts.foreach(println(_))


  }


}

