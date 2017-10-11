package chapter08

object Section8 extends App {
  println("8.8 関数呼び出しの特殊な形態")

  subsection1()
  subsection2()
  subsection3()

  def subsection1(): Unit = {
    println("8.8.1. 連続パラメータ")

    def echo(args: String*): Unit =
      for (arg <- args) println(arg)

    echo()
    echo("one")
    echo("hello", "world!")

    val arr = Array("What's", "up", "doc?")
    // echo(arr) // コンパイルエラー
    echo(arr: _*)
  }

  def subsection2(): Unit = {
    println("8.8.2. 名前付き引数")

    def speed(distance: Float, time: Float): Float =
      distance / time

    println(speed(100, 10))
    println(speed(distance = 100, time = 10))
    println(speed(time = 10, distance = 100))
  }

  def subsection3(): Unit = {
    println("8.8.3. パラメータのデフォルト値")

    printTime()
    printTime(Console.err)

    printTime2(out = Console.err)
    printTime2(divisor = 1000)

    def printTime(out: java.io.PrintStream = Console.out): Unit =
      out.println("time = " + System.currentTimeMillis())

    def printTime2(out: java.io.PrintStream = Console.out,
                   divisor: Int = 1): Unit =
      out.println("time = " + System.currentTimeMillis() / divisor)
  }
}