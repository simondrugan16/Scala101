
object Numbers {
  val x = 10
  val y = 20
  val z = 30
}

object Calculator {

  import Numbers._

  def addXAndY(x: Int, y: Int) = {
    val x = 100
    x + Numbers.y
  }

  println(addXAndY(1, z))
}


Calculator
