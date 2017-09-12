package chapter06

object Appli extends App {
  val oneHalf = new Rational(1, 2)
  val twoThirds = new Rational(2, 3)

  println("oneHalf: Rational = " + oneHalf)
  println("twoThirds: Rational = " + twoThirds)

  // 演算子を定義していないのでエラーになる
  // (oneHalf / 7) + (1 - twoThirds)
}
