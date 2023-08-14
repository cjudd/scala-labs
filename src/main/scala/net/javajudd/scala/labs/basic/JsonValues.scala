package net.javajudd.scala.labs.basic

object JsonValues extends App {

  val tax = .07
  val subTotal = 15.01
  val grandTotal = subTotal + (subTotal * tax)

  val json =
    f"""
      |{
      |  "subTotal": $subTotal%.2f,
      |  "tax": $tax%.2f,
      |  "grandTotal": $grandTotal%.2f
      |}
      |""".stripMargin

  println(json)
}
