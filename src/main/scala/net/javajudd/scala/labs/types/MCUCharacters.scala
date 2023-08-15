package net.javajudd.scala.labs.types

object MCUCharacters extends App {
  val mcuChars = List(("Hulk", true),
                           ("Groot", true),
                           ("Thanos", false),
                           ("Gamora", true),
                           ("Hela", false),
                           ("Ultron", false),
                           ("Black Panther", true))

  println("Heroes")
  for (c <- mcuChars
       if (c._2))
  {
    println(s"${c._1}")
  }

  println("MCU Characters")
  mcuChars.foreach(c => println(s"${c._1} is ${if(c._2) "hero" else "villain"}"))

  println("MCU Characters Again")
  for (c <- mcuChars) {
    println(s"${c._1} is a ${if(c._2) "hero" else "villain"}")
  }
}
