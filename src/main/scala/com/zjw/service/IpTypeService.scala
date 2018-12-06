package com.zjw.service

import scala.beans.BeanProperty

import com.zjw.dao.IpTypeMapper
import com.zjw.model.{IpType, IpTypeExample}
import com.zjw.util.JacksonUtil
import org.apache.logging.log4j.scala.Logging
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class IpTypeService extends Logging {
  @Autowired
  @BeanProperty var ipTypeMapper: IpTypeMapper = _

  def getIpTypeById(ipTypeId: Int): IpType = {
    logger.info(s"Get IpType by Id: ${ipTypeId}")
    val ipType = ipTypeMapper.selectByPrimaryKey(ipTypeId)
    logger.info(s"Get IpType by Id Result Is: ${JacksonUtil.toJson(ipType)}")
    ipType
  }

  def getIpTypeByName(name: String): IpType = {
    logger.info(s"Get IpType by Name: ${name}")
    val ipTypeExample: IpTypeExample = new IpTypeExample
    ipTypeExample.createCriteria().andTypeNameEqualTo(name)
    val ipType = ipTypeMapper.selectByExample(ipTypeExample).get(0)
    logger.info(s"Get IpType by Name Result Is: ${JacksonUtil.toJson(ipType)}")
    ipType
  }


  def saveIpTypes(ipTypes: Array[IpType]): Boolean = {
    for (ipType <- ipTypes) {
      ipTypeMapper.insert(ipType)
    }
    true
  }

  def saveIpType(ipType: IpType): Boolean = {
    ipTypeMapper.insert(ipType)
    true
  }

  def updateIpType(ipType: IpType): Boolean = {
    ipTypeMapper.updateByPrimaryKey(ipType)
    true
  }
}
