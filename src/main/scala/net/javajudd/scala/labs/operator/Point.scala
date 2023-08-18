package net.javajudd.scala.labs.operator

class Point(var x: Int, var y: Int) {

  def move(x: Int, y: Int): Unit = {
    this.x = x
    this.y = y
  }

  def +=(that: Point): Unit = {
    this.x += that.x
    this.y += that.y
  }

  def -=(that: Point): Unit = {
    this.x -= that.x
    this.y -= that.y
  }
  override def toString: String = s"(${x},${y})"

}

object Point extends App {

  val point1 = new Point(1,2)
  println(point1)
  point1.move(4,5)
  println(point1)

  val point2 = new Point(3,3)
  point1 += point2
  println(point1)
  point1 -= point2
  println(point1)

}
