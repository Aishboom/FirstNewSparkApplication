package com.cfamilycomputers.spark
import scala.io.StdIn._
object TryCatch {
  def tryCatch:Int = {
    try{
      readInt
    }
    catch{
      case e: NumberFormatException =>
        println("Wrong number please try again")
        tryCatch
    }
  }

  def main(args: Array[String]): Unit = {
    val i = tryCatch
    println(i)
  }

}
