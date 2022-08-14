package com.github.massakai.programming.in.scala.chapter2

object PrintArgs extends App {
  var i = 0
  while (i < args.length) {
    println(args(i))
    i += 1
  }
}
