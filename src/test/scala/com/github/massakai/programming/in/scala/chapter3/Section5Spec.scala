package com.github.massakai.programming.in.scala.chapter3

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should

class Section5Spec extends AnyFlatSpec with should.Matchers {
  "formatArgs(Array(\"zero\", \"one\", \"two\"))" should "return \"zero\none\ntwo\"" in {
    val res = Section5.formatArgs(Array("zero", "one", "two"))

    res shouldEqual "zero\none\ntwo"
  }
}
