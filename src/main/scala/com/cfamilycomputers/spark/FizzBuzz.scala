package com.cfamilycomputers.spark

object FizzBuzz {
  def fizzBuzz(n:Int):Unit= {
      if (n <= 100) {
        (n % 3, n % 5) match {
          case (0, 0) => println("fizz buzz")
          case (0, _) => println("fizz")
          case (_, 0) => println("buzz")
          case (_,_) => println(n)
        }
        fizzBuzz(n + 1)
      }
    }

    def fizzBuzz1(n:Int):Unit = {
      if (n <= 100) {
        if (n % 3 == 0 && n % 5 == 0) println("fizz buzz")
        else if (n % 3 == 0) println("fizz")
        else if (n % 5 == 0) println("buzz")
        else println(n)
        fizzBuzz1(n + 1)
      }
      else println("Invalid number")
    }
    def main(args: Array[String]): Unit = {
      fizzBuzz1(200)
    }

}
