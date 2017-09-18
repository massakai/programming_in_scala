package chapter06

object Appli extends App {
  val oneHalf = new Rational(1, 2)
  val twoThirds = new Rational(2, 3)

  println(s"oneHalf: Rational = $oneHalf")
  println(s"twoThirds: Rational = $twoThirds")

  // 演算子を定義していないのでエラーになる
  // (oneHalf / 7) + (1 - twoThirds)

  // 事前条件によって例外IllegalArgumentExceptionが発生する
  // val wrongRational = new Rational(5, 0)
  // println("wrongRational: Rational = " + wrongRational)

  val res = oneHalf add twoThirds
  println(s"1/2 + 2/3 = $res")

  val r = new Rational(1, 2)
  println(s"r.numer = ${r.numer}")
  println(s"r.denom = ${r.denom}")

  println(s"$oneHalf lessThan $twoThirds = ${oneHalf lessThan twoThirds}")
  println(s"max($oneHalf, $twoThirds) = ${oneHalf.max(twoThirds)}")

  val y = new Rational(3)
  println(y)

  println(new Rational(66, 42))
}
