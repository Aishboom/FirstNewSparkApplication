package com.cfamilycomputers.spark

import scala.io.StdIn._
object NewList {
/*def inputList(l:Int):List[Int] = {
  if(l<0)Nil
  else readInt():: inputList(l-1)
}*/
/*def operateOnList(l:List[Int],base:Int,f:(Int,Int)=>Int):Int={
  if(l==Nil) base
  else
    f(l.head,operateOnList(l.tail,base,f))
}*/
  def operationOnList(l:List[Int],base:Int,f:(Int,Int)=>Int):Int = l match {
    case Nil => base
    case h::t => f(h,operationOnList(t,base,f))
  }
  def main(args: Array[String]): Unit = {
    //println(inputList(5))
    val num = List(1,2,3,4,5)
    //println(operateOnList(num,0,_+_))
    println(operationOnList(num,0,_+_))
  }

}
