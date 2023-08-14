package net.javajudd.scala.labs.basic

object HelloArgs extends App {
  println(s"Hello World with ${args.mkString(", ")}")
}