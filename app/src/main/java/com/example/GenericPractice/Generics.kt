package com.example.GenericPractice

class Box<T>(t:T){
    var value = t
}
fun main(){
    val box= Box<Int>(1)
}