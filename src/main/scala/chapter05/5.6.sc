// 関係演算子と論理演算子
1 > 2
1 < 2
1.0 <= 1.0
3.5f >= 3.6f
'a' >= 'A'
val untrue = !true

val toBe = true
val question = toBe || !toBe
val paradox = toBe && !toBe

def salt() = {
  println("salt")
  false
}
def pepper() = {
  println("pepper")
  true
}
pepper() && salt()
salt() && pepper() // 短絡
salt() & pepper()