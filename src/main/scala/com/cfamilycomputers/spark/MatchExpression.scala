package com.cfamilycomputers.spark

import scala.io.StdIn._
object MatchExpression {
  def fact2(n:Int):Int = n match {
  case 0 => 1
  case _ => n*fact2(n-1)
}
  def sumSquare(x:Int):Int = x match{
    case 0 => 1
    case _ => x*x + sumSquare(x-1)

  }
  def countDown(x:Int):Unit = x match {
    case 0 =>
    case _  => {

      println(x)
      countDown(x - 1)
    }
  }

  def newMatch ()= readInt match {
    case n => println("Something Wrong " + n )

  }
  def newMatch2(a:Int,b:Int)= (a,b%5) match {
    case (1,1) => println("good boy")
    case (0,1) =>
    case (2,0) =>
    case (1,n) => println("go back simon" ,+ n)

  }
  def newMatch3(a:Int, b:Int) = (a,b) match {
    case (_,n) if (n%2 ==0) => println("even")
    case (_,n) if (n%2 ==1) => println("odd")
  }
  def main(args: Array[String]): Unit = {
  //println(fact2(5))
    //println(sumSquare(5))
    //countDown(10)
    //newMatch()
    //newMatch2(1,10)
    newMatch3(2,10)
  }
}
