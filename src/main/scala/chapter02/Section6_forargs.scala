package chapter02

object Section6_forargs extends App {
  println("2.6 [ステップ6] foreachとforによる反復実行")
  for (arg <- args)
    println(arg)
}
