package chapter02

object Section5_echoargs extends App {
  println("2.5 [ステップ5] whileによるループ、ifによる分岐")
  var i = 0
  while (i < args.length) {
    if (i != 0)
      print(" ")
    print(args(i))
    i += 1
  }
  println()
}
