package chapter02

object Section4_helloarg extends App {
  println("2.4 [ステップ4] 簡単なScalaスクリプトを書く")
  // 第１引数にhelloと声をかけよう
  println("Hello, " + args(0) + "!")
}
