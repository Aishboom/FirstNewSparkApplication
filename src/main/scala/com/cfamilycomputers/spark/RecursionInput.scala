package com.cfamilycomputers.spark

import scala.io.StdIn._
object RecursionInput {
  /*def multAndCount(): (Int, Int) = {
    val input = readLine.toLowerCase.trim
    if (input == "quit") (1, 0)//base value for this is (1,0) means the value of prod = 1 and count = 0 initially
    else {
      val (prod, count) = multAndCount()
      (input.toInt * prod, count + 1)
    }
  }*/
  /*def sumPositive(): Int = {
      val input = readInt
      if (input > 0) {
        input + sumPositive()
      } else 0
    }*/

  def inputFile(): String = {
    val input = readLine()
    if (input.length > 0) {
      input + " " + inputFile()
    } else " "
  }

  def inputFile1(): Unit = {
    val input = readLine()
    if (input.length > 0) {
      inputFile1()
      println(input)
    } else " "
  }

  /*def calculateAndCount(base:Int, op :(Int,Int)=> Int):(Int,Int) = {
    val input = readLine.toLowerCase.trim
    if(input == "quit")(base,0)
    else{
      val (value,count) = calculateAndCount(base,op)
      (op(input.toInt,value),count+1)
    }
  }*/

  def main(args: Array[String]): Unit = {
    //println(sumPositive())
    //val (p, c) = calculateAndCount(0,(x:Int,y:Int) => x+y)
    //val (p, c) = calculateAndCount(Int.MinValue, _ min _)
    //println(p + " " + c)
    //println(inputFile())
    inputFile1()
  }

}