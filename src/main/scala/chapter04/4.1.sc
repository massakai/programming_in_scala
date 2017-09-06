class ChecksumAccumulator {
  var sum = 0
}

val acc = new ChecksumAccumulator
val csa = new ChecksumAccumulator

acc.sum = 3
println(acc.sum)
println(csa.sum)

// accがvalなのでコンパイラーを通らない
// acc = new ChecksumAccumulator

class ChecksumAccumulator2 {
  private var sum = 0
}


// val acc2 = new ChecksumAccumulator2
// acc2.sum = 5  // sumが非公開なのでコンパイラーを通らない

class ChecksumAccumulator3 {
  private var sum = 0

  def add(b: Byte): Unit = {
    sum += b
  }

  def checksum(): Int = {
    return ~(sum & 0xFF) + 1
  }
}

val acc3 = new ChecksumAccumulator3
acc3.add(5)
println(acc3.checksum())

class ChecksumAccumulator4 {
  private var sum = 0

  def add(b: Byte) = sum += b

  def checksum() = ~(sum & 0xFF) + 1
}

val acc4 = new ChecksumAccumulator4
acc4.add(5)
println(acc4.checksum())

class ChecksumAccumulator5 {
  private var sum = 0

  def add(b: Byte): Unit = sum += b

  def checksum(): Int = ~(sum & 0xFF) + 1
}

val acc5 = new ChecksumAccumulator5
acc5.add(5)
println(acc5.checksum())