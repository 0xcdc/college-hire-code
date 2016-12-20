case class Person(name: String, isMale: Boolean, children: Person*)

val lara = Person("Lara", false)
val bob = Person("Bob", true)
val julie = Person("Julie", false, lara, bob)
val persons = List(lara, bob, julie)

//print out a list of mother, child
for(p <- persons;
    if !p.isMale;
    c <- p.children)
yield (p.name, c.name)
