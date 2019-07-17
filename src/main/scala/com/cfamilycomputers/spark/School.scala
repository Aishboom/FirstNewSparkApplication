package com.cfamilycomputers.spark

// Scala program of method overriding

// Creating a super class
class School
{

  // Method defined
  def NumberOfStudents()=
  {
    0 // Utilized for returning an Integer
  }
}

// Creating a subclass
class class_1 extends School
{

  // Using Override keyword
  override def NumberOfStudents()=
  {
    30
  }
}

// Creating a subclass
class class_2 extends School
{

  // Using override keyword
  override def NumberOfStudents()=
  {
    32
  }
}

// Creating a subclass
class class_3 extends School
{

  // Using override keyword
  override def NumberOfStudents()=
  {
    29
  }
}

// Creating object
object GfG
{

  // Main method
  def main(args:Array[String])
  {

    // Creating instances of all
    // the sub-classes
    var x=new class_1()
    var y=new class_2()
    var z=new class_3()

    // Displays number of students in class_1
    println("Number of students in class 1 : " +
      x.NumberOfStudents())

    // Displays number of students in class_2
    println("Number of students in class 2 : " +
      y.NumberOfStudents())

    // Displays number of students in class_3
    println("Number of students in class 3 : " +
      z.NumberOfStudents())

  }
}
