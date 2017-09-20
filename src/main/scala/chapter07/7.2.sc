def gcdLoop(x: Long, y: Long): Long = {
  var a = x
  var b = y
  while (a != 0) {
    val temp = a
    a = b % a
    b = temp
  }
  b
}

var line = ""
do {
  line = scala.io.StdIn.readLine()
  println("Read: " + line)
} while (line != "")

def greet() = {
  println("hi")
}
() == greet()

var line2 = ""
while ((line2 = scala.io.StdIn.readLine()) != "") // うまく働かない
  println("Read: " + line2)

def gcd(x: Long, y: Long): Long =
  if (y == 0) x else gcd(y, x % y)