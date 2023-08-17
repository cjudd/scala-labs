package net.javajudd.scala.labs.datastructures

object DataStructures extends App {

  val list = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

  //val result = list.filter(_ % 2 == 0).reduce((x, y) => x + y)
  val result = list.filter(_ % 2 == 0).sum

  println(s"sum of even numbers: ${result}")

}
