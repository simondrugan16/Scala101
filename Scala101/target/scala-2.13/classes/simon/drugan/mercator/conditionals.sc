val worldCup: String = "On"
var watch: Boolean = false

if (worldCup == "On"){
  watch = true
} else if (worldCup == "Off") {
  watch = false
} else {
  println("idk wat")
}
watch

/////////////////////
// Group Practical //
/////////////////////

object RatingCalculator {
  def calculator(age: Int): String = {
    if (age < 4) {
      "Too young"
    } else if ( age < 8 ) {
      "U"
    } else if ( age < 12 ) {
      "PG"
    } else if ( age < 15 ) {
      "12A"
    } else if ( age > 10 ) {
      "15"
    } else {
      "18"
    }
  }
}


val age: List[Int] = List(0, 1, 3, 15, 10)

for (element <- 1 to age.length) yield (age(element - 1), RatingCalculator.calculator(element - 1))


