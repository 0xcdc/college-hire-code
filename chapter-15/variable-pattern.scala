def describe(x: Any) = x match {
  case 0 => "zero"
  case somethingElse => "not zero: " + somethingElse
}

describe(0)

describe(1)

describe("two")

describe(List(1,2,3))
