package net.javajudd.scala.labs.operator

trait Drawable {
  def draw(): Unit
}

case class Point(x: Int, y: Int) extends Drawable {

  def draw(): Unit = {
    for (i <- 1 until y) {
      if(i < y - 1) println() else println(" " * x + ".")
    }
  }

  def +(that: Point): Point = {
    new Point(this.x + that.y, this.y + that.y)
  }

  def -(that: Point): Point = {
    new Point(this.x - that.y, this.y - that.y)
  }

}

object Point extends App {

  val point1 = Point(1,2)
  println(point1)
  point1.draw()

  val point2 = Point(3,3)
  println(point2)
  point2.draw()

  val point3 = point1 + point2
  println(point3)
  point3.draw()

  val point4 = point1 - point2
  println(point4)
}
