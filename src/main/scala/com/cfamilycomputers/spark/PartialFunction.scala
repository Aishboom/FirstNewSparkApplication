package com.cfamilycomputers.spark

object PartialFunction {

  def main(args:Array[String]):Unit = {

    // Creating Partial function
    // using two methods
    val v = new PartialFunction[Int,Int]  {
      def isDefinedAt(q:Int) = q!=0
      def apply(q:Int) = q*q
      val d : PartialFunction[Int, Int] =
      {

        // using case statement
        case x if (x % 3) == 0 => x * 3
      }

    }
    println(v(10))
    println(v(3))
  }

}
