package com.example.structurepatterns

fun <T, R> Collection<T>.fold(
    initial: R,
    combine: (acc: R, nextElement: T) -> R
): R {
    var accumulator: R = initial
    for (element: T in this) {
        accumulator = combine(accumulator, element)
    }
    return accumulator
}
fun <T> String.toLower(name:T):T{
    var word:T=name
    word.toString().uppercase()
    return word
}
fun main(){
var name="Vishu"
   // val item2=item.fold("yes",{acc,i->acc+""+i})
    //println(""+item2)
    val uppername=name.toLower({acc:String->
       acc
    })
    println(uppername)

}

