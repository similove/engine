package com.zjw.util

import scala.util.control.NonFatal

import com.fasterxml.jackson.databind.{DeserializationFeature, ObjectMapper}
import com.fasterxml.jackson.module.scala.DefaultScalaModule
import com.zjw.service.IpTypeService
import org.slf4j.LoggerFactory

object JacksonUtil {
  private[this] val logger = LoggerFactory.getLogger(classOf[IpTypeService])

  private val _mapper = new ObjectMapper()
  _mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false)
  _mapper.registerModule(DefaultScalaModule)

  def toJson[T](obj: T): String = {
    _mapper.writeValueAsString(obj)
  }

  def fromJson[T](json: String, `class`: Class[T]): T = {
    try {
        _mapper.readValue(json, `class`)
    } catch {
      case NonFatal(e) =>
        logger.error(s"can not convert json: [ $json ] to class [ ${`class`} ].", e)
        null.asInstanceOf[T]
    }
  }

  def prettyPrint[T](obj: T): String = {
    _mapper.writerWithDefaultPrettyPrinter().writeValueAsString(obj)
  }

}
