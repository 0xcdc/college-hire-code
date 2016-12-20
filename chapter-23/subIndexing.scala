case class Person(name: String, isMale: Boolean, children: Person*)

val gc1 = Person("Brian", true)
val gc2 = Person("Tina", false)
val lara = Person("Lara", false, gc1)
val bob = Person("Bob", true, gc2)
val julie = Person("Julie", false, lara, bob)
val persons = List(lara, bob, julie)

//print out a list of mother, child
for(p <- persons;
    if !p.isMale;
    c <- p.children;
    gc <- c.children)
yield (p.name, c.name, gc.name)
