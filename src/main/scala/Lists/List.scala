package Lists

sealed trait List[+A]

case object Nil extends List[Nothing]
case class Cons[+A](head: A, tail: List[A]) extends List[A]

object List {


  def sum(ints: List[Int]): Int = {
    ints match {
      case Nil => 0
      case Cons(head, tail) => head + sum(tail)
    }
  }

  //Exercise: Calculate the product of the elements of the list
  def product(ints: List[Int]): Int =     ints match {
    case Nil => 1
    case Cons(head, tail) => head * product(tail)
  }

  //Exercise: Remove the first element of the list
  def tail[A](list: List[A]):List[A] = {
    list match {
      case Nil => Nil
      case Cons(head, tail) => tail
    }
  }

  //Excercise: Remove the first n elements of the list
  def drop[A](list: List[A], n:Int): List[A] =  list match {
    case Nil => Nil
    case Cons(head, tail) => if (n==1) tail else drop(tail, n-1)
  }

  //Exercise: Remove elements while condition applies
  def dropWhile[A](l: List[A])(f: A => Boolean): List[A] = l match {
    case Nil => Nil
    case Cons(head, tail) => if (f(head)) dropWhile(tail)(f) else tail
  }

  def setHead[A](list: List[A], n: A):List[A] = {
    Cons(n, list)
  }

  def apply[A](as: A*): List[A] =
    if(as.isEmpty) Nil
    else Cons(as.head, apply(as.tail: _*))
}

