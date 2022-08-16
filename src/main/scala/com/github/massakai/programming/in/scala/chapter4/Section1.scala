package com.github.massakai.programming.in.scala.chapter4

object Section1 extends App {
  val acc = new ChecksumAccumulator
  val csa = new ChecksumAccumulator

  acc.sum = 3
  // accがvalなのでコンパイルできない
  // acc = new ChecksumAccumulator
}
