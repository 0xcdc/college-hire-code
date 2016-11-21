val m1 = Map(4 -> 42)
val m2 = Map(4 -> "42")

def describe(x: Any) = x match {
    case m: Map[Int, Int] => "got a Map[int,int]"
    case m: Map[Int, String] => "got a Map[int, string]"
}

describe(m1)
describe(m2)
