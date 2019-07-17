package com.cfamilycomputers.spark

object NewArray {
  def fillArray(arr:Array[Int],v:Int,i:Int):Unit = {
  if (i < arr.length){
    arr(i) = v
    fillArray(arr,v,i+1)

  }
  }
 /* def sum (arr:Array[Int]):Int = {

    arr.sum
  }*/
  /*def operateOnArray(arr1:Array[Int],i:Int,f:(Int,Int)=> Int):Int ={
    if(i < arr1.length-1){
      f(arr1(i),operateOnArray(arr1,i+1,f))
    }else arr1(i)

  }*/
  def main(args: Array[String]): Unit = {
   val num = Array(1,1,1,1,1)
   println(fillArray(num,99,0))
    //println(num)
  //println(sum(num))
    //val num1 = Array(1,2,3,4,5,6)
    //println(operateOnArray(num1,0,(x,y)=>x+y))
  }
}
