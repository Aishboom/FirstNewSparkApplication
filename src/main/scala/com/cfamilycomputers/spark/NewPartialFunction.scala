package com.cfamilycomputers.spark

object NewPartialFunction {

  def main(args:Array[String]):Unit = {

    val v:PartialFunction[Int,Int] = {
      case x if(x%3 == 0) => x*x
    }
    val u:PartialFunction[Int,Int] = {
      case x if (x%5 ==0) => 5*x
    }
    val r = v orElse u
  println(r(5))
}}

