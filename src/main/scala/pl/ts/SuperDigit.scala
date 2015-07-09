package pl.ts

object SuperDigit {

  def superDigit(n: Int): Int = {
    if (n <= 9) n.abs
    else superDigit(digits(n).sum)
  }

  private def digits(n: Int): List[Int] = n.abs.toString.map(_.asDigit).toList
}
