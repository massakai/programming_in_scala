package com.github.massakai.programming.in.scala.chapter1.section1

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should

class Subsection1Spec extends AnyFlatSpec with should.Matchers {
  "factorial(30)" should "return 265252859812191058636308480000000" in {
    Subsection1.factorial(30) shouldEqual BigInt("265252859812191058636308480000000")
  }
}
