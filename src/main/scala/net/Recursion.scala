package net

class Recursion {
  def sum(n: Int):Int = {
      if (n == 0)
        0
      else
        n + sum(n - 1)
  }

  def prod(n: Int):Int = {
    if (n == 0)
      1
    else
      n * prod(n - 1)
  }

  def sumTail(n: Int) = {
    def loop (acc: Int, n: Int):Int =
      if (n == 0)
        acc
      else
        loop(acc+n, n - 1)
    loop(0, n)
  }


  def prodTail(n: Int) = {
    def loop (acc: Int, n: Int):Int =
    if (n == 0)
      acc
    else
      loop(acc*n, n - 1)
    loop(1, n)
  }




}
