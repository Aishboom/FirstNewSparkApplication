package com.cfamilycomputers.spark

import org.apache.spark.sql.SparkSession
object Sampledatapractice {

  System.setProperty("hadoop.home.dir", "C:/winutils")

  def main(args: Array[String]): Unit = {
    val spark = SparkSession.builder().appName("Sampledatapracrice").config("spark.master","local[*]").getOrCreate()
    spark.sparkContext.setLogLevel("Error")
    import spark.implicits._
    val worker = spark.read.format("csv").option("header", "true").option("schema", "inferschema")
      .load("C:/Users/rittik de/IdeaProjects/spark/SampleData/Worker.csv")
    val title = spark.read.format("csv").option("header", "true").option("schema", "inferschema")
      .load("C:/Users/rittik de/IdeaProjects/spark/SampleData/Title.csv")
    val bonus = spark.read.format("csv").option("header", "true").option("schema", "inferschema")
      .load("C:/Users/rittik de/IdeaProjects/spark/SampleData/Bonus.csv")
    worker.createOrReplaceTempView("Worker")
    title.createOrReplaceTempView("Title")
    bonus.createOrReplaceTempView("Bonus")
    val df1 = spark.sql("select substring(First_Name,0,3) from Worker").show()
    val df2 = spark.sql("Select INSTR(FIRST_NAME, 'A') from Worker where FIRST_NAME = 'Amitabh'").show()


  }
}
