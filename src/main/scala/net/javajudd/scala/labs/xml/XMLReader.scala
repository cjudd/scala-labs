package net.javajudd.scala.labs.xml

import scala.xml.XML

object XMLReader extends App {

  val inputStream = this.getClass.getResourceAsStream("/xml/110156.xml")
  val xml = XML.load(inputStream)

  val uri = (xml \ "substance-uri").text
  val rn = (xml \ "substance-uri" \ "@registry-number")
  val diplayName = (xml \ "display-name").text
  val formula = (xml \ "molecular-formula" \ "formula").text
  val synonyms = (xml \ "substance-name" \ "name").map(x => x.text).toSet.mkString("; ")

  println(
    s"""
       |uri = ${uri}
       |rn = ${rn}
       |display name = ${diplayName}
       |formula = ${formula}
       |synonyms = ${synonyms}
       |""".stripMargin
  )

}
