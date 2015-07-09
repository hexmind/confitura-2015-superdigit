package pl.ts

import org.junit.runner.RunWith
import org.scalatest._
import org.scalatest.junit.JUnitRunner
import pl.ts.SuperDigit._

@RunWith(classOf[JUnitRunner])
class SuperDigitTest extends FunSuite {

  test("A superDigit of digit should be the same digit") {
    (0 to 9) map (i => {
      assert(superDigit(i) === i)
    })
  }

  test("A superDigit of dozen should be first digit") {
    (0 to 90 by 10) map (d => {
      assert(superDigit(d) === d / 10)
    })
  }

  test("A superDigit of 11...1 should be superDigit of his length") {
    val ones = 1111111111
    val len = ones.toString.length
    assert(superDigit(ones) === superDigit(len))
  }

  test("A superDigit of example number should be 2") {
    assert(superDigit(98741) === 2)
  }

  test("A superDigit of evil number should be 9") {
    assert(6 + 6 + 6 === 18)
    assert(1 + 8 === 9)
    assert(superDigit(666) === 9)
  }

  test("A superDigit of max Int should be 1") {
    val maxValueDigits = List(2, 1, 4, 7, 4, 8, 3, 6, 4, 7)
    val maxValueDigitsSum = 46

    assert(maxValueDigits.mkString === Int.MaxValue.toString)
    assert(maxValueDigits.sum === maxValueDigitsSum)
    assert(superDigit(Int.MaxValue) === superDigit(46))
    assert(superDigit(Int.MaxValue) === 1)
  }
}
