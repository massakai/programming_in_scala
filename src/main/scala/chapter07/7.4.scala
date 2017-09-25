// 7.4.1
//throw new IllegalArgumentException

val n = 2 // ここを変更して動作を確かめる
val half =
  if (n % 2 == 0)
    n / 2
  else
    throw new RuntimeException("n must be even")
println(half)

// 7.4.2
import java.io.{FileNotFoundException, FileReader, IOException}

try {
  val f = new FileReader("input.txt")
  // ファイルを使ってからクローズする
} catch {
  case ex: FileNotFoundException => println("ファイルなしエラーを処理")
  case ex: IOException => println("その他のI/Oエラーを処理")
}

// 7.4.3
val file = new FileReader("src/main/scala/chapter07/input.txt")
try {
  println("ファイルを使う")
} finally {
  file.close() // 確実にファイルをクローズする
}

// 7.4.4
import java.net.{MalformedURLException, URL}

def urlFor(path: String) =
  try {
    new URL(path)
  } catch {
    case e: MalformedURLException =>
      new URL("http://www.scala-lang.org")
  }

println(urlFor("http://valid-url"))
println(urlFor("invalid-url"))
