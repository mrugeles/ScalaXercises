package Persons

import Alarms.Alarm
import org.junit.Test
import org.apache.commons.lang.StringUtils


import scala.io.Source

@Test
class ClustersJobs {

  @Test
  def getJob01p() = {
    val jobs = readFromFile("/crontab_01p.txt")
    val activeJobs = jobs.filter(line => !line.isEmpty).filter(line => !line.startsWith("#"))
    activeJobs.foreach(println(_))
  }

  @Test
  def getJob03s() = {
    val jobs = readFromFile("/crontab_03s.txt")
    val activeJobs = jobs.filter(line => !line.isEmpty).filter(line => !line.startsWith("#"))
    activeJobs.foreach(println(_))
  }

  def readFromFile(fileName:String):Iterator[String] = {
    val file = getClass.getResource(fileName).getFile()
    Source.fromFile(file).getLines
  }

  @Test
  def getName() = {
    val jobs = readFromFile("/alarms_log.txt")
    val alarmDetails = jobs.filter(line => !line.isEmpty).filter(line => line.startsWith("You are receiving this email because your Amazon CloudWatch Alarm "))


    alarmDetails.foreach(println(_))

  }

  @Test
  def Alarms() = {
    val jobs = readFromFile("/alarms_log.txt")
    val alarmDetails = jobs.filter(line => !line.isEmpty).filter(line => line.startsWith("You are receiving this email because your Amazon CloudWatch Alarm "))

    val alarms = alarmDetails.map(x => {
      createAlarm(x)
    })

    alarms.foreach(println(_))

  }


  def createAlarm(str: String): Alarm = {

    val name = getValue(str, "- Name: ", " - ").getOrElse(null)
    val timestamp = getValue(str, "- Timestamp: ", " - ").getOrElse(null)
    val stateChange = getValue(str, "- State Change: ", " - ").getOrElse(null)
    Alarm(name, timestamp, stateChange)

  }

  def getValue(message: String, prefix: String, terminator: String): Option[String] = {
    if (StringUtils.isBlank(message)) return None

    var startIdx = message.indexOf(prefix)
    if (startIdx < 0) return None
    startIdx += prefix.length

    val endIdx = terminatorIdxFor(message, startIdx, terminator)
    endIdx.map(idx => message.substring(startIdx, idx))
  }

  private def terminatorIdxFor(message: String, startIdx: Int, terminators: Char*): Option[Int] = {

    val indices = terminators.flatMap{ ch =>
      val idx = message.indexOf(ch, startIdx)
      if (idx < 0) None else Some(idx)
    }
    if (indices.isEmpty) None else Some( indices.min )
  }

  private def terminatorIdxFor(message: String, startIdx: Int, terminators: String) : Option[Int] = {
    val idx = message.indexOf(terminators, startIdx)
    if (idx < 0 ) None else Some(idx)
  }


}

