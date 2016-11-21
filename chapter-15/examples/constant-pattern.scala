def describe(x: Any) = x match {
  case 5 => "five"
  case true => "truth"
  case "hello" => "hi!"
  case Nil => "the empty list"
  case _ => "something else"
}

describe(5)

describe(true)

describe("hello")

describe(Nil)

describe(List(1,2,3))
