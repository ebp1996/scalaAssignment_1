
object caesarCipher extends App {

  val getString = readLine("Enter Word :")

   def correctPossition(possition:Int)=possition match{
     case x if x == -5 => 21
     case x if x == -4 => 22
     case x if x == -3 => 23
     case x if x == -2 => 24
     case x if x == -1 => 25
     case _ => possition
   }

    val alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
    val encripted=(letter:Char,key:Int,a:String)=>
    a((a.indexOf(letter.toUpper)+key)%a.size)
    val decripted=(letter:Char,key:Int,a:String)=>
    a((correctPossition(a.indexOf(letter.toUpper)-key)%a.size))    /*I  tested ” VWXYZ”  in this code then i had error in decrypted function .
                                                                    After the encrypt these letters i could see “ABCDE ”.
                                                                    Then i decrypt these letters letter indexes  goes to minus values
                                                                    Then i create correctPossition function to correct this error*/
    val cipher=(algo:(Char,Int,String)=>
    Char,s:String,key:Int,a:String)=>
    s.map(algo(_,key,a))
    val encriptedWord=cipher(encripted,getString,5,alphabet)
    println(s"Encripted word is -> $encriptedWord")
    val decriptedWord=cipher(decripted,encriptedWord,5,alphabet)
    println(s"Decripted word is -> $decriptedWord")


}
