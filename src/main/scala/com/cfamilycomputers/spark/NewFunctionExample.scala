package com.cfamilycomputers.spark

import scala.io.StdIn._
object NewFunctionExample {

  def calcRestaurantOrders(o:String,t:String):Double = {
    if (o == "food") {
      if (t == "L")
        3.5
      else if (t == "M")
        2.5
      else if (t == "S")
        1.5
      else
        0.0
    }else 0.0
    if (o == "drink"){
      if (t == "L")
        3.5
      else if (t == "M")
        2.5
      else if (t == "S")
        1.5
      else
        0.0
    }else 0.0
    if (o == "Combo"){
      if (t == "L")
        3.5
      else if (t == "M")
        2.5
      else if (t == "S")
        1.5
      else
        0.0
    }else 0.0
    }

  def main(args: Array[String]): Unit = {
    val o = readLine()
    val t = readLine()
    println(calcRestaurantOrders(o,t))
  }
}
