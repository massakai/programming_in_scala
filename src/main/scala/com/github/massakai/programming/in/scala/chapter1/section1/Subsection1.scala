package com.github.massakai.programming.in.scala.chapter1.section1

object Subsection1 extends App {

  def factorial(x: BigInt): BigInt =
    if (x == 0) 1 else x * factorial(x - 1)
}
