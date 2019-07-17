package com.cfamilycomputers.spark

import org.apache.spark.sql.SparkSession
object Societetechnologies {
  def main(args: Array[String]): Unit = {
    System.setProperty("hadoop.home.dir", "C:/winutils")
    val spark = SparkSession.builder().appName("Societetechnologies").config("spark.master","local[*]").getOrCreate()
    spark.sparkContext.setLogLevel("Error")
    import spark.implicits._
    //val rdd = spark.sparkContext.textFile("C:/Users/rittik de/IdeaProjects/spark/SocieteTechnologies/Dataset1.txt")
    val rdd = spark.sparkContext.textFile("/user/rittikde929532/Dataset1.txt")
    val df = rdd.map(x=> x.split(",")).map(x=>(x(0),x(1))).toDF("Id","Details")
    val rdd1 = spark.sparkContext.textFile("/user/rittikde929532/Dataset2.txt")
    val df1 = rdd1.map(x=> x.split(",")).map(x=>(x(0),x(1))).toDF("Id","Vlues")
    val df2 = df.join(df1, Seq("Id")).drop("Id").show

  }
}
