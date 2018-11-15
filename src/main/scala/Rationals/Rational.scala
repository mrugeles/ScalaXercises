package Rationals

/**
  * Implement operations +, -, * and /
  * Each operation returns a new Rational object
  * i.e:
  *   val r1 = new Rational(1, 3)
  *   val r2 = new Rational(2, 4)
  *   val r3 = r1 + r2
  *   Printing r3 should show "5/6"
  */

class Rational(val x: Int,val y: Int) {


  def +(r:Rational): Rational = {
    new Rational(this.x*r.y + r.x*this.y,this.y*r.y)
  }

  def -(r:Rational): Rational = {
    new Rational(this.x*r.y - r.x*this.y,this.y*r.y)
  }

  def *(r:Rational): Rational = {
    new Rational(this.x*r.x,this.y*r.y)
  }

  def /(r:Rational): Rational = {

    this*(new Rational(r.y, r.x))
    //new Rational(this.x/r.x,this.y/r.y)
  }

  override def toString():String = {
    this.x + "/" + this.y
  }




}
