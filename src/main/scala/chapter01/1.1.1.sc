println("==== BigInt (Scala) ====")

def factorial(x: BigInt): BigInt =
  if (x == 0) 1 else x * factorial(x - 1)

println(factorial(30))

println("==== BigInteger (Java) ====")

import java.math.BigInteger

def factorial2(x: BigInteger): BigInteger =
  if (x == BigInteger.ZERO)
    BigInteger.ONE
  else
    x.multiply(factorial2(x.subtract(BigInteger.ONE)))

val b = BigInteger.valueOf(30)
println(factorial2(b))