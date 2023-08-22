package net.javajudd.scala.labs.datastructures

object DataStructures extends App {

  val list = 1 to 10

  //val result = list.filter(_ % 2 == 0).reduce((x, y) => x + y)
  val result = list.filter(_ % 2 == 0).sum

  println(s"sum of even numbers: ${result}")

}
