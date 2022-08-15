package com.github.massakai.programming.in.scala.chapter3

import scala.io.Source

object CountChars1 extends App {
  if (args.isEmpty) {
    Console.err.println("Please enter filename")
    System.exit(1)
  }

  for (line <- Source.fromFile(args(0)).getLines()) {
    println(line.length.toString + " " + line)
  }
}
