val testSeq = Seq(1, 3, 5)
val outcome = testSeq.exists {
  num => num > 3
}

val testSeq = Seq(1, 2, 3, 4, 5)
val filteredSeq = testSeq.filter {
  num => num > 3
}

///////////////
// Practical //
///////////////

// One

val courseMates: Seq[String] = Seq("Simon", "Noone else", "CONTAINS T")

// Two

val testMap: Map[Int, String] = Map(1 -> "red", 2 -> "yellow", 3 -> "blue", 4 -> "fridge", 5 -> "blue")
testMap(1)
testMap(4)
testMap(3)
testMap.find(_._2 == "yellow").map(_._1)
testMap.filter(_._2 == "blue").map(_._1)

// Three

val fibonacci: Seq[Int] = Seq(1 ,1 ,2 ,3, 5, 8, 13)
val addOne: Seq[Int] = fibonacci.map(elem => elem + 1)

// Four

val removeEven: Seq[Int] = fibonacci.filter{
  elem => elem % 2 == 1
}

// Five

courseMates.length
println(courseMates(0).contains("t"))

val containsLetterT: Boolean = {
  var counter: Int = 0
  for ( element <- 1 to courseMates.length ) {
    if ( courseMates(element - 1).contains("t") ) {
      println(courseMates(element - 1))
      counter += 1
    }
  }
  if (counter > 0) {
    true
  } else {
    false
  }
}