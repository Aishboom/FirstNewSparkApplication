package com.cfamilycomputers.spark

object MaxWords {

  def findMaxWords(input:String):Int={
    val result = input.split("[.?]+").map(_.trim)
      .map(_.split(" "))
      .map(_.length).toList
      .max

    return result
  }

  def main(args: Array[String]): Unit = {
    print(findMaxWords("hey there. how are you? hope you are enjoying this content"))
  }


}
