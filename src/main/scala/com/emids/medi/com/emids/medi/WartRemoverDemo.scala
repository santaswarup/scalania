package com.emids.medi.com.emids.medi

class WartRemoverDemo {


  var x = 10

  while(x < 1000) {
    println(x)
    x += 100
  }

  val any = List((1, 2, 3), (1, 2))

  def diverging(i: Int): Int = if (i == 0) 0 else diverging(i + 1)

}
