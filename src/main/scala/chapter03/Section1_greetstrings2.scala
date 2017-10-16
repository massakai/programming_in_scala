package chapter03

object Section1_greetstrings2 extends App {
  println("3.1 [ステップ7] 配列を型でパラメータ化する")

  val greetStrings = new Array[String](3)
  greetStrings.update(0, "Hello")
  greetStrings.update(1, ", ")
  greetStrings.update(2, "world!\n")
  for (i <- 0.to(2))
    print(greetStrings.apply(i))
}
