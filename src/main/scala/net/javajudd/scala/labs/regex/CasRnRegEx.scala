package net.javajudd.scala.labs.regex

object CasRnRegEx extends App {

  val caffeine = "58-08-2"
  val rn = """^(\d{2,7})-(\d{2})-(\d)$""".r
  val rnAlt = raw"^(\d{2,7})-(\d{2})-(\d)$$".r

  caffeine match {
    case rn(part1, part2, check) => println(s"${part1}*${part2}*${check}")
    case _ => println("don't match")
  }
}