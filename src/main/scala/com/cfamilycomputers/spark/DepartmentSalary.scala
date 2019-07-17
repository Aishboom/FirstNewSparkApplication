package com.cfamilycomputers.spark

import org.apache.spark.sql.SparkSession
case class Department(Emp_Name :String, Department_Id : Int , Salary :Int)
object DepartmentSalary {
def main (args:Array[String]):Unit = {
  System.setProperty("hadoop.home.dir", "C:/winutils")
  val spark = SparkSession.builder().appName("Department").config("spark.master" , "local").getOrCreate()
  spark.sparkContext.setLogLevel("ERROR")
  import spark.implicits._
  val rdd = spark.sparkContext.textFile("file:///C:/Users/rittik de/IdeaProjects/spark/DepartmentWiseData.txt")
  val header = rdd.first()
 val rdd1 = rdd.filter(x => x !=header)
  val df = rdd1.map(x => x.split(" ")).map(x => Department(x(0).toString,x(1).toInt,x(2).toInt)).toDF()
  df.createOrReplaceTempView("Department")
  spark.sql("select Emp_Name,Department_Id,Salary from (select Emp_Name,Department_Id,Salary, Dense_Rank() over" +
    "(partition by Department_Id order by Salary desc) as rank from Department) as t where rank = 2").show()

}
}
