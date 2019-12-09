import org.junit.runner.RunWith
import org.spasnof.Day2.{scanOptCodes,replaceSeqValues}
import org.spasnof.Day2.Exit
import org.scalatest.FlatSpec
import org.scalatest.junit.JUnitRunner

@RunWith(classOf[JUnitRunner])
class Day2Spec extends FlatSpec {

  "scanOptCodes" should "return proper values" in {
    assert(scanOptCodes(1,0,0,Seq(1,0,0)).equals("add"))
    assert(scanOptCodes(2,0,0,Seq(1,0,0)).equals("multiply"))
    assertThrows[Exit](scanOptCodes(99,0,0,Seq(1,0,0)))
    assertThrows[Exception](scanOptCodes(1024,0,0,Seq(1,0,0)))
  }

  "replaceSeqValues" should "properly remap sequences" in
  {
    def x(z:Int, y:Int) =
    {
      z + y
    }
    val input = Seq(1,0,0,0,99)
    val output = replaceSeqValues(input,0,0,0,x)
    val expected = Seq(2,0,0,0,99)
    assert(expected.equals(output))
  }

  `

}
