package chapter08

object Section9 extends App {
  println("8.9 末尾再帰")

  subsection1()
  subsection2()

  def before_subsection() = {
    // ダミー
    def isGoodEnough(d: Double): Boolean = true

    // ダミー
    def improve(d: Double): Double = d

    def approximate(guess: Double): Double = {
      if (isGoodEnough(guess)) guess
      else approximate(improve(guess))
    }

    def approximateLoop(initialGuess: Double): Double = {
      var guess = initialGuess
      while (!isGoodEnough(guess))
        guess = improve(guess)
      guess
    }
  }

  def subsection1(): Unit = {
    println("8.9.1 末尾再帰関数をトレースする")

    def boom(x: Int): Int =
      if (x == 0) throw new Exception("boom!")
      else boom(x - 1) + 1

    // boom(5)

    def bang(x: Int): Int =
      if (x == 0) throw new Exception("bang!")
      else bang(x - 1)

    bang(5)
  }

  def subsection2(): Unit = {
    println("8.9.2 末尾再帰の限界")

    def isEven(x: Int): Boolean =
      if (x == 0) true else isOdd(x = 1)

    def isOdd(x: Int): Boolean =
      if (x == 0) false else isEven(x - 1)

    // Error: forward reference extends over definition of value funValue
    val funValue = nestedFun _

    def nestedFun(x: Int): Unit = {
      if (x != 0) {
        println(x)
        funValue(x - 1)
      }
    }
  }
}
