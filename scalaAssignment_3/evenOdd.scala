import scala.io.StdIn
object evenOdd extends App {

  def isEven(n:Int):Boolean= n match{
    case 0 => true
    case _ => isOdd(n-1)
  }
  def isOdd(n:Int):Boolean = !(isEven(n))
  print("Enter the number ->")
var a= scala.io.StdIn.readInt()
  if(isEven(a)) print("even")
  else print("Odd")

}
