package com.zjw.controller

import scala.beans.BeanProperty

import org.slf4j.LoggerFactory
import org.springframework.beans.factory.annotation.Value
import org.springframework.web.bind.annotation.{RequestMapping, RestController}

@RestController
class HelloController {
  private[this] val logger = LoggerFactory.getLogger(classOf[HelloController])

  @Value("${spring.application.name}")
  @BeanProperty val appName: String = null

  @RequestMapping(Array("/hello")) def hello: Person = {
    logger.info("HelloController hello function invoked.")
    "Hello, My application name is " + appName + "."
    new Person("zhangsan", 21)
  }
}

class Person(var name:String,var age: Int)
