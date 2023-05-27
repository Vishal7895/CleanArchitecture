package com.example.structurepatterns

interface Polygon{
    fun getType():String
}
class Triangle:Polygon{
    override fun getType(): String
    {return "Triangle"}

}
class Square:Polygon{
    override fun getType(): String
    {return "Square"}

}
enum class PolygonType
{ TRIANGLE,SQUARE}

class PolygonFactory{
  fun getType( type: PolygonType):Polygon{
      when(type){
          PolygonType.TRIANGLE->{
              return Triangle()
          }
          PolygonType.SQUARE->{
              return Square()
          }
          else->{}
      }
      throw Exception()
  }

}
fun main(){
    val Square= PolygonFactory().getType(PolygonType.SQUARE)
    val squareType=Square.getType()

     val factory=CrossBow.Factory
    val crossBow=factory.buildWeapon()
    println(crossBow.use())
    println(squareType)

}


/*--------------------------------Abstract Fatory-------------------------*/
interface Weapon{
   fun use():String
}
abstract class WeaponFactory{
    abstract fun buildWeapon():Weapon
}
class CrossBow:Weapon{
    companion object Factory: WeaponFactory() {
        override fun buildWeapon()=CrossBow()

    }
    override fun use(): String {
        return "Cross Weapon"
    }

}

class Katana:Weapon{
    companion object Factory:WeaponFactory(){
        override fun buildWeapon()=Katana()

    }
    override fun use(): String {
        return "Katana"
    }

}

/*-----Abstract Factory Steps-----------*/
//1.Create an Interface
//2.Create an Abstract Factory Class with a abstarct function that return type of the interface created previously
//3.Create a concrete class implement interface and use factory to create object
//4.