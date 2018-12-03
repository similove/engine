package com.zjw

object PointCalc {
  def main(args: Array[String]): Unit = {
    var count: Int = 0
    for (x <- 378.to(548, 9); y <- 547.to(640, 9)) {
      count += 1
      print(s"($y,$x) ")
    }


    var x: Int = 547
    var y: Int = 531
    for (i <- 1 to 13) {
      x = x + 9
      y = y + 9
      println(s"($x, $y)")
    }
    println("\n" + count)
  }
}
