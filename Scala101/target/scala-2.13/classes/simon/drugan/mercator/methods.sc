///////////////
// Practical //
///////////////

def nameLength(firstName: String, lastName: String): Int = {
  val lengthOne = firstName.length
  val lengthTwo = lastName.length

  val letterDifference: Int = lengthOne - lengthTwo
  if (letterDifference == 0) {
    0
  } else {
    if (lengthOne > lengthTwo) {
      lengthOne
    } else {
      lengthTwo
    }
  }
}

nameLength("Arnold", "Schwarzenegger")
nameLength("Bruce", "Lee")
nameLength("Bones", "Jones")