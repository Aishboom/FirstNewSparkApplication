package com.cfamilycomputers.spark

object ParametricFunctions {

  def makeTuples[A,B](lst:List[A],base:B)(f:(A,B)=>B):B = lst match{
    case Nil => base
    case h::t => f(h,makeTuples(t,base)(f))

  }

  def main(args: Array[String]): Unit = {
    val a = List(1,2,3,4,5)
   println(makeTuples(a,0)((_+_)))
  }

}
