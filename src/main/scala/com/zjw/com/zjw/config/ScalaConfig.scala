package com.zjw.com.zjw.config

import com.fasterxml.jackson.module.scala.DefaultScalaModule
import org.springframework.context.annotation.Configuration

@Configuration
class ScalaConfig {

  import org.springframework.context.annotation.Bean

  @Bean def customModule:DefaultScalaModule = DefaultScalaModule

}
