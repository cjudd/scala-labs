package net.javajudd.scala.labs.functions

object MathFunction extends App {

  def math(a: Int, b: Int, fun: (Int, Int) => Int): Int = fun(a, b)

  val sum = math(5, 6, (a, b) => a + b)
  val diff = math(10, 4, (a, b) => a - b)

  println(s"sum is $sum")
  println(s"diff is $diff")

}
