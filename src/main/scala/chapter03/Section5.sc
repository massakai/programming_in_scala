val args = Array("zero", "one", "two")

def printArgs(args: Array[String]): Unit = {
  var i = 0
  while (i < args.length) {
    println(args(i))
    i += 1
  }
}
printArgs(args)

def printArgs2(args: Array[String]): Unit = {
  for (arg <- args)
    println(arg)
}
printArgs2(args)

def printArgs3(args: Array[String]): Unit = {
  args.foreach(println)
}
printArgs3(args)

def formatArgs(args: Array[String]) = args.mkString("\n")
println(formatArgs(args))

val res = formatArgs(args)
assert(res == "zero\none\ntwo")