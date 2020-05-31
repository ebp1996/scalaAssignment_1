object addition extends App {
  def addition(x:Int):Int={
    x match{
      case 1 => x
      case _ => x+addition(x-1)
    }
  }
  println(addition(5))
}
