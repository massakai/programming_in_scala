package chapter02

object Section5_printargs extends App {
  println("2.5 [ステップ5] whileによるループ、ifによる分岐")
  var i = 0
  while (i < args.length) {
    println(args(i))
    i += 1
  }
}