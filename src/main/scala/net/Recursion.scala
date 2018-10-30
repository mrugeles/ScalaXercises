package net

class Recursion {
  def sum(n: Int):Int = {
      if (n == 0) 0
      else 1 + sum(n - 1)
  }


  def prod(n: Int) = ???

  def sumTail(n: Int) = ???
  def prodTail(n: Int) = ???
}
