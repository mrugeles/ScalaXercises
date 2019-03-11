package Alarms

case class Alarm (name: String, timeStamp: String, stateChange: String) {

  override def toString: String = timeStamp + "\t" + name + "\t" + stateChange

}
