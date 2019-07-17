package com.cfamilycomputers.spark

import scala.io.StdIn._
object Timeconversion {
  def breakDownime(time: String):(Int, Int, Int) = {
    val firstColon = time.indexOf(":")
    val secondColon = time.lastIndexOf(":")
    val hour = time.substring(0, firstColon).toInt
    val minute = time.substring(firstColon + 1, secondColon).toInt
    val seconds = time.substring(secondColon + 1).toInt
    (hour,minute,seconds)
  }
  def calcTotalSeconds(hour:Int,minute:Int,seconds:Int):Int = {
    hour*3600+minute*60+seconds
  }

  def main(args: Array[String]): Unit = {
    println("Enter the time")
    val time = readLine()
    val (hour,minute,seconds) = breakDownime(time)
    val toTalSeconds = calcTotalSeconds(hour,minute,seconds)
    println(toTalSeconds)
  }
}