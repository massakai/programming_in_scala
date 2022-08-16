package com.github.massakai.programming.in.scala.chapter4

import com.github.massakai.programming.in.scala.chapter4.ChecksumAccumulator.calculate

object Summer {
  def main(args: Array[String]): Unit = {
    for (arg <- args) {
      println(arg + ": " + calculate(arg))
    }
  }
}
