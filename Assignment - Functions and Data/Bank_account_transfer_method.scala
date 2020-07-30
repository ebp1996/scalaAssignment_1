object Bank extends App {


  val y=new Account("1232",1001,13000)
  val z=new Account("1233",1002,15000)
 // var bank:List[Account]=List(y,z)
  var a=y.transfer(z,8000)
  println(y)
  println(z)


}
class Account(id:String,n: Int, b: Double) {
  val nic:String=id
  val acnumber: Int = n
  var balance: Double = b
  def withdraw(a:Double)= this.balance=this.balance-a
  def deposit(a:Double) = this.balance=this.balance+a
  val find=(n:String,b:List[Account])=>
    b.filter(x=>x.nic.equals(n))
  def transfer(a:Account,b:Double)= {
    this.withdraw(b)
    a.deposit(b)
  }


  override def toString = "["+nic+":"+acnumber +":"+ balance+"]"
}
