package com.github.massakai.programming.in.scala.chapter2

object ForArgs extends App {
  println("[1]")
  args.foreach(arg => println(arg))

  println("[2]")
  args.foreach((arg: String) => println(arg))

  println("[3]")
  args.foreach(println)

  println("[4]")
  for (arg <- args) {
    println(arg)
  }
}
