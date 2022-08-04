package com.github.massakai.programming.in.scala.chapter1.section1

object Section1 extends App {
  var capital = Map("US" -> "Washington", "France" -> "Paris")
  capital += ("Japan" -> "Tokyo")
  println(capital("France"))
}
