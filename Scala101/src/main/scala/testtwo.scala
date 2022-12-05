package simon.drugan.mercator

///////////////
  // Practical //
  ///////////////
object Calculator {
    def calculateTax(value: Double): Double = {
      if (value <= 10000) {
        value / 10
      } else if (value <= 50000) {
        value * 15 / 100
      } else if (value <= 100000) {
        value / 5
      } else {
        value * 4 / 10
      }
    }
  }
