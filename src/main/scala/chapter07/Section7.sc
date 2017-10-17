def printMultiTable() = {
  var i = 1
  // ここではiだけがスコープに入っている
  while (i <= 10) {
    var j = 1
    // ここではiとjがスコープに入っている
    while (j <= 10) {
      val prod = (i * j).toString
      // ここではi, j, prodがスコープに入っている
      var k = prod.length
      // ここではi, j, prod, kがスコープに入っている
      while (k < 4) {
        print(" ")
        k += 1
      }
      print(prod)
      j += 1
    }
    // iとjはまだスコープに入っている。prodとkはスコープから外れている
    println()
    i += 1
  }
  // iはまだスコープに入っている。j, prod, kはスコープから外れている
}
printMultiTable()

val a = 1; {
  val a = 2
  println(a)
}
println(a)