package com.cfamilycomputers.spark

import scala.io.StdIn._
object FunctionExample {

  def breakDownTime(time:String):(Int,Int,Int) = {
    val firstIndex = time.indexOf(":")
    val lastIndex = time.lastIndexOf(":")
    val hour = time.substring(0,firstIndex).toInt
    val minute  = time.substring(firstIndex+1,lastIndex).toInt
    val seconds = time.substring(lastIndex+1).toInt
    (hour,minute,seconds)
  }
def calTotalSeconds(hour:Int,minute:Int,seconds:Int):Int = {
  3600*hour+60*minute+seconds
}

  def main(args: Array[String]): Unit = {
    val time = readLine()
    val (hour,minute,second) = breakDownTime(time)
    val totalSeconds = calTotalSeconds(hour,minute,second)
    println(totalSeconds)
  }
}
