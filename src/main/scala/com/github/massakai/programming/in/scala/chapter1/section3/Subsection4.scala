package com.github.massakai.programming.in.scala.chapter1.section3

object Subsection4 extends App {

  def nameHasUpperCase(name: String) = name.exists(_.isUpper)

  println("'Japan' has upper case? " + nameHasUpperCase("Japan"))
  println("'hello' has upper case? " + nameHasUpperCase("hello"))
}
