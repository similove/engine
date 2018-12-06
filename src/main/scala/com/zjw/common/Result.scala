package com.zjw.common


case class Result(
                   var status: ResponseStatus,
                   var data: Any,
                   var message: String = null
                 )
