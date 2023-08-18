package net.javajudd.scala.labs.oo

class Point(var x: Int, var y: Int) {

  def move(x: Int, y: Int): Unit = {
    this.x = x
    this.y = y
  }

  override def toString: String = s"(${x},${y})"

}

object Point extends App {

  val point = new Point(1,2)
  println(point)
  point.move(4,5)
  println(point)
}
