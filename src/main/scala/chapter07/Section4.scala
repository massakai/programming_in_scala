package chapter07

import java.io.{FileNotFoundException, FileReader, IOException}
import java.net.{MalformedURLException, URL}

object Section4 extends App {
  println("7.4 try式による例外処理")

  subsection1()
  subsection2()
  subsection3()
  subsection4()

  def subsection1(): Unit = {
    println("7.4.1 例外のスロー")
    //throw new IllegalArgumentException

    val n = 2 // ここを変更して動作を確かめる
    val half =
      if (n % 2 == 0)
        n / 2
      else
        throw new RuntimeException("n must be even")
    println(half)
  }

  def subsection2(): Unit = {
    println("7.4.2 例外のキャッチ")

    try {
      val f = new FileReader("input.txt")
      // ファイルを使ってからクローズする
    } catch {
      case ex: FileNotFoundException => println("ファイルなしエラーを処理")
      case ex: IOException => println("その他のI/Oエラーを処理")
    }
  }

  def subsection3(): Unit = {
    println("finally節")
    val file = new FileReader("src/main/scala/chapter07/input.txt")
    try {
      println("ファイルを使う")
    } finally {
      file.close() // 確実にファイルをクローズする
    }
  }

  def subsection4(): Unit = {
    println("7.4.4 値の生成")

    def urlFor(path: String) =
      try {
        new URL(path)
      } catch {
        case e: MalformedURLException =>
          new URL("http://www.scala-lang.org")
      }

    println(urlFor("http://valid-url"))
    println(urlFor("invalid-url"))
  }
}
