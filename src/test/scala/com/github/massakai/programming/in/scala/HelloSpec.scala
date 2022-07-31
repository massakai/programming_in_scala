package com.github.massakai.programming.in.scala

import com.github.massakai.programming.in.scala.Hello
import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should

class HelloSpec extends AnyFlatSpec with should.Matchers {
  "The Hello object" should "say hello" in {
    Hello.greeting shouldEqual "hello"
  }
}
