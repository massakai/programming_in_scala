package com.github.massakai.programming.in.scala.chapter3

object Section5 extends App {
  def printArgs0(args: Array[String]): Unit = {
    var i = 0
    while (i < args.length) {
      println(args(i))
      i += 1
    }
  }

  def printArgs1(args: Array[String]): Unit = {
    for (arg <- args) {
      println(arg)
    }
  }

  def printArgs2(args: Array[String]): Unit = {
    args.foreach(println)
  }

  def formatArgs(args: Array[String]) = args.mkString("\n")

  val arguments = Array("zero", "one", "two")
  printArgs0(arguments)
  printArgs1(arguments)
  printArgs2(arguments)
  println(formatArgs(arguments))
}
