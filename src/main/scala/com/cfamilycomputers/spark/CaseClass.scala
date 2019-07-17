package com.cfamilycomputers.spark


import scala.io.StdIn
case class point3D(x:Double,y:Double,z:Double)
case class student(name:String,grades:List[Int],Assignments:List[Int],quizzes:List[Int])
object CaseClass {

  def distance(p1:point3D,p2:point3D):Double = {
    val dx = p1.x - p2.x
    val dy = p1.y - p2.y
    val dz = p1.z -  p2.z
 math.sqrt(dx*dx+dy*dy+dz*dz)
  }
  def classAvg(s:student):Double = {
      .4*(s.grades.sum/s.grades.length) + .5*(s.Assignments.sum/s.Assignments.length)+.1*(s.quizzes.sum+s.quizzes.length)

  }
  def checkArray(arr1:Array[point3D])={
    (for(point3D(x,y,z) <- arr1) yield (x,y,z))
  }
  def main(args: Array[String]): Unit = {
    val t1 = point3D(3.0,2.0,1.0)
    val t2 = point3D(3.0,2.0,1.0)
    println(distance(t1,t2))
    val arr = Array.fill(20)(point3D(Math.random(),Math.random(),math.random))
    println(checkArray(arr))
val stu = student("Mark",List(90,100),List(100,90),List(100,90))
    println(classAvg(stu))

  }

}
