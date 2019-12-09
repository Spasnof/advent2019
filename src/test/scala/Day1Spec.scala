import org.junit.runner.RunWith
import org.spasnof.Day1.fuelForModule
import org.scalatest.FlatSpec
import org.scalatest.junit.JUnitRunner

@RunWith(classOf[JUnitRunner])
class Day1Spec extends FlatSpec {

  "fuelForModule" should "equal proper fuel values" in {

    val input = 12
    val expected = 2
    assert(fuelForModule(input).equals(expected))
    assert(fuelForModule(14).equals(expected))
    assert(fuelForModule(1969).equals(654))
    assert(fuelForModule(100756).equals(33583))


//    For a mass of 12, divide by 3 and round down to get 4, then subtract 2 to get 2.
//    For a mass of 14, dividing by 3 and rounding down still yields 4, so the fuel required is also 2.
//    For a mass of 1969, the fuel required is 654.
//    For a mass of 100756, the fuel required is 33583.


  }

}
