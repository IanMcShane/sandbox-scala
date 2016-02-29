
// arithmetic
1 + 2
2 * 4
6 / 2


// send text to 'console'
println("Hello world")
// immutable value declaration
val message: String = "Hi there!"
//message = "You can't touch me!"


// variable declaration
var messageEditable: String = "Change me"
messageEditable = "I have changed, I promise..."
// function definition
def max(x: Int, y: Int): Int = {
  x
  // What is the logic to identify the max value between X and Y
}
// calling a function
val maxResult = max(3, 5)
if (maxResult == 5) {
  "It works!"
} else {
  "This is not working :("
}
// Declaring immutable sequence of values
val args: Seq[String] = Seq("Hello", "Cruel", "World")
// working in a loop
var i = 0
while (i < args.length) {
  println(args(i))
  i += 1
}
// Preferred higher level usage of looping
args.foreach(arg => println(arg))
args.foreach(println)
// transform from one shape to another
val toTransform: String = "OneTwoThree"
val transformed = toTransform
  .map(x => x.toUpper)
  .filterNot(c => c == 'O')


// Mutable lists
import scala.collection.mutable

// this is a value declaration but I can change the underlying value!
val changeMeList: mutable.MutableList[String] =
  new mutable.MutableList[String]()
changeMeList += "The"
changeMeList += "beginning"
changeMeList += "of"
changeMeList += "the"
changeMeList += "end!"
changeMeList.foreach(println)

// Naive filter of list using RegEx
import scala.util.matching.Regex
changeMeList.filter(x => (("(T|t)").r findFirstIn x).isDefined)


// Pattern Matching
def matchTest(x: Int): String = x match {
  case 1 => "one"
  case 2 => "two"
  case _ => "many"
}
println(matchTest(3))


// handy list functions
val theHeadOfTheList = changeMeList.head
val theTailOfTheList = changeMeList.last
