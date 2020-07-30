object Bank extends App {

  val w=new Account("1232",1001,-13000)
  val x=new Account("1233",1002,15000)
  val y=new Account("1234",1003,-1000)
  val z=new Account("1235",1004,35000)
  val bank:List[Account]=List(w,x,y,z)

  val find=(n:String,b:List[Account])=>b.filter(x=>x.nic.equals(n))


  val overdraft=(b:List[Account])=> b.filter(x=>x.balance.<(0))
  println(overdraft(bank))    //Display List of Accounts with negative balances

  val balance= (b: List[Account]) => b.map(x=>x.balance).reduce((x,y)=>x+y)
  println(balance(bank))                    //Display Total bank account balance

  def f(x:Double)=if(x<0.0)x*(-0.1) else x*0.05
  val interest=(b:List[Account])=>b.map(x=>x.balance).map(x=>f(x))
  println(interest(bank))                     //Display bank accounts Interests
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
