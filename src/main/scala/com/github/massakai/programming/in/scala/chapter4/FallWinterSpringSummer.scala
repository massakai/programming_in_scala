package com.github.massakai.programming.in.scala.chapter4

import com.github.massakai.programming.in.scala.chapter4.ChecksumAccumulator.calculate

object FallWinterSpringSummer extends App {
  for (season <- List("fall", "winter", "spring")) {
    println(season + ": " + calculate(season))
  }
}
