object totalWholeSaleCost{
  def wholeSaleCost(copies : Int) : Unit={
    var x = copies - 50
    if(x<0){
      println( x.asInstanceOf[Double]*3 + 24.95*copies.asInstanceOf[Double]*0.6)
    }else{
      println( 50*3 +x.asInstanceOf[Double]*0.75+ 24.95*copies.asInstanceOf[Double]*0.6)
    }
  }
  def main(args: Array[String]) : Unit=wholeSaleCost(60)
}