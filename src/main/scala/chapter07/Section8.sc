// 1段文をシーケンスとして返す
def makeRowSeq(row: Int) =
  for (col <- 1 to 10) yield {
    val prod = (row * col).toString
    val padding = " " * (4 - prod.length)
    padding + prod
  }

// 1段文を文字列として返す
def makeRow(row: Int) = makeRowSeq(row).mkString

// 1行に1段分の文字列を収めた表を返す
def multiTable() = {
  val tableSeq = // 各段の文字列のシーケンス
    for (row <- 1 to 10)
      yield makeRow(row)
  tableSeq.mkString("\n")
}
println(multiTable())