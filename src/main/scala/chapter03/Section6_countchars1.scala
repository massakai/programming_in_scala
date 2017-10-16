package chapter03

import scala.io.Source

object Section6_countchars1 extends App {
  println("3.6 [ステップ12] ファイルから行を読み出す")


  if (args.length > 0) {
    for (line <- Source.fromFile(args(0)).getLines())
      println(line.length + " " + line)
  }
  else
    Console.err.println("Please enter filename")
}
