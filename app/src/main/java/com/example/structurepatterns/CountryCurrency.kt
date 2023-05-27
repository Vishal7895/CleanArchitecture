package com.example.structurepatterns

sealed class Country{
object Cannada:Country()
}
object spain:Country()
class USA(val someProperties:String):Country()
data class Europ(val someProperties: String):Country()

class Currency(val code:String){

}
object CurrencyFactory{
    fun currencyFactory(country: Country):Currency=
      when(country)  {
          is Country.Cannada -> Currency("EUR")
              is spain ->  Currency("EUR")
              is USA -> Currency("DOL")
              is Europ ->Currency("DOL")
      }

}
fun main(){
    val usaCurrency=(CurrencyFactory.currencyFactory(spain)).code
    println(usaCurrency)
}