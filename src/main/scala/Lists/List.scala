package Lists

sealed trait List[+A]

case object Nil extends List[Nothing]
case class Cons[+A](head: A, tail: List[A]) extends List[A]

object List {


  def sum(ints: List[Int]): Int = ???
  //Exercise: Calculate the product of the elements of the list
  def product(ints: List[Int]): Int = ???

  //Exercise: Remove the first element of the list
  def tail[A](list: List[A]):List[A] = ???

  //Excercise: Remove the given element of the list
  def drop[A](list: List[A], n:Int): List[A] = ???

  //Exercise: Remove elements while condition applies
  def dropWhile[A](l: List[A])(f: A => Boolean): List[A] = ???

  def setHead[A](list: List[A], n: A):List[A] = ???

  def apply[A](as: A*): List[A] =
    if(as.isEmpty) Nil
    else Cons(as.head, apply(as.tail: _*))
}

