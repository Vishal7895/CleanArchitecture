package com.example.DataStructures

//to move the array by n position
fun moveToNpostion(array: Array<Int>, postion:Int){
    val size =array.size
    val tempArray=Array(size){0}
    for (i in 0 until size){
        tempArray[(i+postion)%size]=array[i]
    }
for (i in 0 until size){
    println(tempArray[i])
}
}

fun main(){
    val array = arrayOf(1,2,3,4,5,6,7)
    moveToNpostion(array,3)
}

