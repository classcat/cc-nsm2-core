package com.example

import org.apache.spark._
import org.apache.spark.SparkContext._

object Hello {

  def main(args: Array[String]): Unit = {
    val conf = new SparkConf().setMaster("local").setAppName("cc-nsm")
    val sc = new SparkContext(conf)

    val file = sc.textFile("/usr/local/bro/logs/current/conn.log")
    println(file.count())

    sc.stop()

    println("Hello, world!")
  }
}
