package com.github.massakai.programming.in.scala.chapter3

import scala.io.Source

object CountChars2 extends App {
  if (args.isEmpty) {
    Console.err.println("Please enter filename")
    System.exit(1)
  }

  val lines = Source.fromFile(args(0)).getLines().toList

  def widthOfLength(s: String) = s.length.toString.length

  val longestLine = lines.reduceLeft(
    (a, b) => if (a.length > b.length) a else b
  )
  var maxWidth = widthOfLength(longestLine)

  for (line <- lines) {
    val numSpaces = maxWidth - widthOfLength(line)
    val padding = " " * numSpaces
    println(padding + line.length + " | " + line)
  }

}
