package com.cfamilycomputers.spark

object AnonymousFunction {

   var myfc1 = (a:Int,b:Int) => a+b
   var myf2 = () => println("good boy")
   var myf3 = (_: String)+(_:String)

  def myfunction(fun:(String, String)=> String) =
  {
    fun("Dog", "Cat")
  }

  def main (args: Array[String] ): Unit = {
  println(myfc1(10,5))
  println(myf2())
  println(myf3("This","My"))
    println(myfunction(myf3))
}
}