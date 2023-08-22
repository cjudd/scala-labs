package net.javajudd.scala.labs.oo

trait Drawable {
  def draw(): Unit
}

case class Point(x: Int, y: Int) extends Drawable {

  def draw(): Unit = {
    for (i <- 1 until y) {
      if(i < y - 1) println() else println(" " * x + ".")
    }
  }
}

object Point extends App {
  val point = Point(4, 5)
  println(point)
  point.draw()
}
