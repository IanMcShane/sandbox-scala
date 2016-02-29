// custom types
type Driver = String
type Observer = String


// case class 'value' type
case class DevPair(driver: Driver, observer: Observer)

val pairs = Seq(
  DevPair("Ernst", "Tomasz"),
  DevPair("Robert", "Blanché"),
  DevPair("Tebogo", "Ryan"),
  DevPair("Stuart", "Rameez"),
  DevPair("Scott", "Michael"))


// Trait with behaviour
trait Printer {
   protected def printThatText(text: String) = println(text)
}


// Trait as contract
trait Voice {
  def greet: String
  def goodbye: String
}


// Class
sealed class Cow(name: String)
  extends Voice {

  override def greet = "Moo"
  override def goodbye = "MooMOOO"
}

// Class overriding and using other behaviours
sealed class TypingCow(name: String)
  extends Voice with Printer {

  override def greet = {
    val greeting = "Moo"
    printThatText(greeting)
    greeting
  }

  override def goodbye = {
    val greeting = "MooMOOO"
    printThatText(greeting)
    greeting
  }
}

val cow = new Cow("Betsy")
cow.greet

val typingCow = new TypingCow("George")
typingCow.greet
