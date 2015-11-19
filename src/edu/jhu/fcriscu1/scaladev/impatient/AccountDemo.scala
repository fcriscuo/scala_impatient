package edu.jhu.fcriscu1.scaladev.impatient

/**
  * Created by fcriscuo on 11/18/15.
  */
object AccountDemo  extends App{
  var initialAmount : Double = 1000.00
     if (args.length > 0){

       initialAmount = args(0).toDouble
     }
    val account = new Account()
  account.deposit(initialAmount)
  account.report()

}

class Account {
  val id = Account.newUniqueNumber()
  private var balance = 0.0
  def deposit (amount:Double) {balance += amount}
  def report ()  = {Account.statement(id, balance)}
}

object Account {
  private var lastNumber = 0
  private def newUniqueNumber () = { lastNumber += 1 ; lastNumber}
  def statement(id:Int, amount:Double) = {
    println("ID: " +id + " balance " +amount)
  }
}
