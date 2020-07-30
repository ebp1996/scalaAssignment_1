object Rational extends App{
val  r1=new Rational(3,4)
val r2=new Rational(5,8)
val r3=new Rational(2,7)
val x= r1+r2-r3

  println(x)
  println(x.max(r1))
}

class Rational(n:Int,d:Int){
  require(d>0,"d must greator than 0")
  val number=n/gcd(Math.abs(n),d)
  val denom=d/gcd(Math.abs(n),d)
  def this(n:Int)=this(n,1)
  private def gcd(a:Int,b:Int):Int=if(b==0)a else gcd(b,a%b)

  def + (r:Rational)=new Rational(this.number*r.denom+r.number*this.denom,this.denom*r.denom )
  def neg=new Rational(-this.number,this.denom)
  def - (r:Rational)=this+r.neg
  def less(that:Rational)=this.number*that.denom<this.denom*that.number
  def max(that:Rational)=if(this.less(that)) that else this
  override def toString = number +"/" +denom

}
