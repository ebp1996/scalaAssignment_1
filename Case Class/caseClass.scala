object caseClass extends App {
  val p1=new graphPoint(2,6)
  val p2=new graphPoint(-2,-2)
  val p3=p1.move(2,3)
  val p4=p1.distance(p2)
  val p5=p1.invert()

  println(p1)
  println(p4)
  println(p1+p2)
  println(p5)
}


case class graphPoint(a:Int,b:Int){
  def x:Int=a
  def y:Int=b

  def +(that:graphPoint)=graphPoint(this.x+that.x,this.y+that.y)
  def move(dx:Int,dy:Int)=graphPoint(this.x+dx,this.y+dy)
  def distance(that:graphPoint)=scala.math.sqrt(scala.math.pow((this.x-that.x),2.0)+scala.math.pow((this.y-that.y),2.0))
  def invert()=graphPoint(this y ,this.x)


}
