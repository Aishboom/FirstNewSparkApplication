package com.cfamilycomputers.spark

import org.apache.spark.sql.SparkSession
case class Person(Id : Int, Name: String)
object Newcount {
  def main(args: Array[String]): Unit = {


    System.setProperty("hadoop.home.dir", "C:/winutils")
    val spark = SparkSession.builder().appName("Spark SQL val basic example").config("spark.master", "local").getOrCreate()
    spark.sparkContext.setLogLevel("ERROR")
    import spark.implicits._
    val df2  = spark.sparkContext.textFile("file:///C:/Users/rittik de/IdeaProjects/spark/NewData1.txt")
    val df = spark.sparkContext.textFile("file:///C:/Users/rittik de/IdeaProjects/spark/NewData.txt")
    val df1 = df.map(x=> x.split(",")).map(x => Person(x(0).toInt,x(1))).toDF().show
    val df4 = df2.map(x=> x.split(",")).map(x => Person(x(0).toInt,x(1))).toDF().show
   // df1.createOrReplaceTempView("Person")
    //val df3 = spark.sql("select Id, Length(Name) as Count from Person")
    //df3.show()
  }
}