package chapter06

object Appli extends App {
  val x = new Rational(1, 2)
  val y = new Rational(2, 3)

  println(s"x: Rational = $x")
  println(s"x: Rational = $y")

  // 演算子を定義していないのでエラーになる
  // (oneHalf / 7) + (1 - twoThirds)

  // 事前条件によって例外IllegalArgumentExceptionが発生する
  // val wrongRational = new Rational(5, 0)
  // println("wrongRational: Rational = " + wrongRational)

  println(s"$x + $y = ${x + y}")
  println(s"$x + $x * $y = ${x + x * y}")
  println(s"($x + $x) * $y = ${(x + x) * y}")
  println(s"$x + ($x * $y) = ${x + (x * y)}")

  println(s"$y * $y = ${y * y}")
  println(s"$y * 2 = ${y * 2}")

  // 暗黙の型変換
  implicit def intToRational(x: Int) = new Rational(x)
  println(s"2 * $y = ${2 * y}")

  val r = new Rational(1, 2)
  println(s"r.numer = ${r.numer}")
  println(s"r.denom = ${r.denom}")

  println(s"$x lessThan $y = ${x lessThan y}")
  println(s"max($x, $y) = ${x.max(y)}")

  println(new Rational(66, 42))
}
