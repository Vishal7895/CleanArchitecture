package com.PracticeSession

interface cofees{
    fun cost():Int
}
open class BasicCofee:cofees{
    override fun cost(): Int {
        return 5
    }

}

class advanceCofee(val cofee: cofees): cofees{
    override fun cost(): Int {
       return cofee.cost()+5
    }
}

fun main(){
    val basecofee= BasicCofee()
    val advanceCofee= advanceCofee(basecofee)
    println(advanceCofee.cost())
}