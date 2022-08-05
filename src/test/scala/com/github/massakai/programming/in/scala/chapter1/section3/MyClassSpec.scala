package com.github.massakai.programming.in.scala.chapter1.section3

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should

class MyClassSpec extends AnyFlatSpec with should.Matchers {
  "MyClass(30, \"hoge\")" should "have index 30 and name\"hoge\"" in {
    val myClass = new MyClass(30, "hoge")
    // index, nameにアクセスできない
    // myClass.index shouldEqual 30
    // myClass.name shouldEqual "hoge"
  }
}

