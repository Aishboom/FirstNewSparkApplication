package com.cfamilycomputers.spark

import org.apache.spark.{SparkConf, SparkContext}

object FirstNewSparkApplication {
  def main(args:Array[String]): Unit ={
    val conf = new SparkConf()
    conf.setMaster("local")
    conf.setAppName("First Application")

    val sc = new SparkContext(conf)
    sc.setLogLevel("Error")
    sc.setLogLevel("WARN")
    val rdd1 = sc.makeRDD(Array(1,2,3,4,5))
    rdd1.collect().foreach(println)

  }

}
