package com.zjw.controller

import com.zjw.common.{ResponseStatus, Result}
import com.zjw.service.IpTypeService
import org.apache.logging.log4j.scala.Logging
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.{RequestMapping, RestController}

@RestController
class IpTypeController extends Logging {

  @Autowired var ipTypeService: IpTypeService = _

  @RequestMapping(Array("/getIpType")) def getIpType(): Result = {
    val ipType = ipTypeService.getIpTypeByName("IP1")
    Result(ResponseStatus.SUCCESS, ipType)
  }

  def saveIpType() = {

  }
}
