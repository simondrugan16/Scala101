package simon.drugan.mercator

import jdk.incubator.vector.VectorOperators.Test
import org.scalatest.Matchers.===
import org.scalatest._

class TestSpec extends FlatSpec {
  "calculateTax" should "calculate tax correctly" in {
    assert(Calculator.calculateTax(12000) === 1800)
  }
}

