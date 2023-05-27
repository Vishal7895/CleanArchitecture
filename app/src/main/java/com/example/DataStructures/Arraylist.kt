package com.example.DataStructures

class Arraylist {
    val list = mutableListOf<String>()
    fun addToList(){
        list.add("abc")
        list.add("bcd")
        list.add("efg")
        list.set(1,"xyz")
        println(list)
    }
}
fun main(){
    val list=Arraylist()
    list.addToList()

}