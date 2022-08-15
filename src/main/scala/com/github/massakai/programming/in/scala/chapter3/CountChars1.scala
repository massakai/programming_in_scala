package com.github.massakai.programming.in.scala.chapter3

import scala.io.Source
import scala.util.Using

object CountChars1 extends App {
  if (args.isEmpty) {
    Console.err.println("Please enter filename")
    System.exit(1)
  }

  Using(Source.fromFile(args(0))) { source =>
    for (line <- source.getLines()) {
      println(line.length.toString + " " + line)
    }
  }
}
