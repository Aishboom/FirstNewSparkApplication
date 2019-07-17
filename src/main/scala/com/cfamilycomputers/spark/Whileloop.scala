package com.cfamilycomputers.spark
import scala.io.StdIn
object Whileloop {
  /*def main(args: Array[String]): Unit = {
    var i = 1
    while (i<10)
      {
        println(i)
        i+=1
      }
  }
  */
  def readInts:List[Int] = {
    var input = readLine
    var lst = List[Int]()
    while (input!="quit"){//This while loop doesn't give anything back its value its unit.
     // lst ::= input.toInt
      lst = input.toInt :: lst
      input = readLine
    }
    lst
  }

  def main(args: Array[String]): Unit = {
    println(readInts)
  }
}
