package com.cfamilycomputers.spark

object Currying {
//val c = multiply(b: Int,x:Int)
  def newCurrying(a: Int) =  (b:Int) => a+b

  def main(args: Array[String]): Unit = {
    //val sum = newCurrying(10)
    //println(sum(5))
    println(newCurrying(10)(5))
  }
}