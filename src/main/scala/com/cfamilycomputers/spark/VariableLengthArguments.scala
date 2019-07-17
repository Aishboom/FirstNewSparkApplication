package com.cfamilycomputers.spark

object VariableLengthArguments {
  def variableArgument(num:Double*):Double = {
    if (num.length > 0)
      num.sum/num.length
    else 0.0

  }

  def variableArgumentLists(lst:List[Int]):Double = {
    if (lst.length>0)
      lst.sum/lst.length
    else 0.0
  }
  def main(args: Array[String]): Unit = {
    val num = List(1.0,2.0,3.0,4.0,5.0)
    println(variableArgument(1.0,2.0,3.0))
    //println(variableArgumentLists(num))
    println(variableArgument(num:_*))

  }

}
