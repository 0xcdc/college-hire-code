case class Student(name: String, gpa: Double)

val cc = Student("Charlie", 3.8)
val vc = Student("Vishnu", 4.0)
val jc = Student("Jeff", 3.0)

def describe(s: Any) = s match {
  case Student(name, 4.0) => name + " has all A's!"
  case Student(name, gpa) if gpa > 3.6 => name + " made dean's list"
  case Student(name, gpa) => name + " has a " + gpa
  case _ => "not a student"
}

describe(cc)

describe(vc)

describe(jc)

describe(42)
