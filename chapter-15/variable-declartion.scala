case class Student(name: String, gpa: Double)

val cc = Student("Charlie", 3.8)

def printStudent(s: Student): Unit = {
  val Student(name, gpa) = s
  println(name + " has a gpa of " + gpa)
}

printStudent(cc)
