import scala.math

object volumeOfSphere{
  def volumeOfSphere(radius : Double) : Double=(4.0/3.0)*math.Pi*math.pow(radius,3)
  def main(args: Array[String]) : Unit=println(volumeOfSphere(5.0))
}