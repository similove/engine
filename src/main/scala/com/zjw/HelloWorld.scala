package com.zjw

import java.util.Base64

import com.fasterxml.jackson.databind.ObjectMapper
import com.fasterxml.jackson.module.scala.DefaultScalaModule

object HelloWorld {
  def main(args: Array[String]): Unit = {
    val om = new ObjectMapper()

     om.registerModule(DefaultScalaModule)
    val json = om.writeValueAsBytes(Person("zhangsan", 29))
    val str = Base64.getEncoder.encodeToString(json)
    val dBytes = Base64.getDecoder.decode(str)
    val person = om.readValue(dBytes, classOf[Person])
    println(s"str: $str")
    println(s"${person.name}, ${person.age}")
  }
}

case class Person(var name: String, var age: Int)