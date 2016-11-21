import math.{Pi}

def describe(x: Any) = x match {
  case Pi => "Pie!"
  case pi => "not 3.14: " + pi.toString
}

describe(Pi)

describe(5)
