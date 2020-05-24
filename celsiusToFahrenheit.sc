object convertTemperacure{
  def celsiusToFahrenheit(celsius : Double) :Double=celsius*1.8000+32.00
  def main(args: Array[String]):Unit=println(celsiusToFahrenheit(35.0))
}