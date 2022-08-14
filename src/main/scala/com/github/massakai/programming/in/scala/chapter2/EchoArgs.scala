package com.github.massakai.programming.in.scala.chapter2

object EchoArgs extends App {
  var i = 0
  while (i < args.length) {
    if (i != 0) {
      print(" ")
    }
    print(args(i))
    i += 1
  }
  println()
}
