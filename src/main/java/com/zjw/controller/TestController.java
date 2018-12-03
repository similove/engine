package com.zjw.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
  private static Logger logger = LoggerFactory.getLogger(TestController.class);

  @RequestMapping("/hello2")
  public Person hello() {
    logger.info("TestController hello function invoked.");
    return new Person("zhangsan", 21);
  }
}
