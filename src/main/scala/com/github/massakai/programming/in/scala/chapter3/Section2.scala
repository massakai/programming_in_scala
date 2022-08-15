package com.github.massakai.programming.in.scala.chapter3

object Section2 extends App {
  // val oneTwoThree = List(1, 2, 3)

  // val twoThree = List(2, 3)
  // val oneTwoThree = 1 :: twoThree
  val oneTwoThree = 1 :: 2 :: 3 :: Nil
  println(oneTwoThree)

  val oneTwo = List(1, 2)
  val threeFour = List(3, 4)
  val oneTwoThreeFour = oneTwo ::: threeFour
  println(oneTwo + " and " + threeFour + " were not mutated.")
  println("Thus, " + oneTwoThreeFour + " is a new list.")

}
