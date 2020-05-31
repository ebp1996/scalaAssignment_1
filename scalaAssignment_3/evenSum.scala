object evenSum extends App {
  def isEven(n:Int):Boolean= n match{
    case 0 => true
    case _ => isOdd(n-1)
  }
  def isOdd(n:Int):Boolean = !(isEven(n))
  var x =10
  var evenSum=0
  for(p <- 1 until  x) {
    if (isEven(p)) {
      evenSum+=p
    }

  }
  println(evenSum)
}
