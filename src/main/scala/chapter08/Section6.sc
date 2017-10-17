// 部分適用された関数
val someNumbers = List(-11, -10, -5, 0, 5, 10)
someNumbers.foreach(println _)
someNumbers.foreach(x => println(x))

def sum(a: Int, b: Int, c: Int) = a + b + c
sum(1, 2, 3)

val a = sum _
a(1, 2, 3)
a.apply(1, 2, 3)

val b = sum(1, _: Int, 3)
b(2)
b(5)

someNumbers.foreach(println)

// コンパイルエラー
// val c = sum

val d = sum _
d(10, 20, 30)