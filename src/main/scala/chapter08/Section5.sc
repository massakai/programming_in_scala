// プレースホルダー構文
val someNumbers = List(-11, -10, -5, 0, 5, 10)
someNumbers.filter(_ > 0)
someNumbers.filter(x => x > 0)

// val f = _ + _
val f = (_: Int) + (_: Int)
f(5, 10)