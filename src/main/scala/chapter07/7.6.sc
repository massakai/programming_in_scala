
val args = Array("hoge.txt", "fuga.csv", "piyo.scala")

// breakやcontinueを使わないループ
var i = 0
var foundIt = false
while (i < args.length && !foundIt) {
  if (!args(i).startsWith("-")) {
    if (args(i).endsWith(".scala"))
      foundIt = true
  }
  i = i + 1
}
foundIt

// 再帰を使ったコード
def searchFrom(i: Int): Int =
  if (i >= args.length) -1
  else if (args(i).startsWith("-")) searchFrom(i + 1)
  else if (args(i).endsWith(".scala")) i
  else searchFrom(i + 1)
val j = searchFrom(0)

// ライブラリのbreakメソッドの使い方
// ※ Worksheetで実行すると標準入力から読み込まないので無限ループになる
import java.io._

import scala.util.control.Breaks._

val in = new BufferedReader(new InputStreamReader(System.in))
breakable {
  while (true) {
    println("? ")
    if (in.readLine() == "") break
  }
}