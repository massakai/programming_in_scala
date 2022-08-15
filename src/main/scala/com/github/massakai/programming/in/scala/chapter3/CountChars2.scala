package com.github.massakai.programming.in.scala.chapter3

import scala.io.Source
import scala.util.Using

object CountChars2 extends App {
  def widthOfLength(s: String) = s.length.toString.length

  if (args.isEmpty) {
    Console.err.println("Please enter filename")
    System.exit(1)
  }

  Using(Source.fromFile(args(0))) { source =>
    val lines = source.getLines().toList
    val longestLine = lines.reduceLeft(
      (a, b) => if (a.length > b.length) a else b
    )
    val maxWidth = widthOfLength(longestLine)

    for (line <- lines) {
      val numSpaces = maxWidth - widthOfLength(line)
      val padding = " " * numSpaces
      println(padding + line.length + " | " + line)
    }
  }
}
