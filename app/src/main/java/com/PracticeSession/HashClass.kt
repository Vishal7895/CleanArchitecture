package com.PracticeSession

import android.os.Build
import androidx.annotation.RequiresApi
import kotlin.math.max


val listInteger= listOf(1,3,4,26,5,6,7,14,18,16,17,2,19,20,21,23,22,24,25)
var count=0
var maxCountSubArray=0
var temp=0
val hashMap= mutableMapOf<Int,Int>()
@RequiresApi(Build.VERSION_CODES.N)
fun main(){
    var ans = 0
    var j = 0
    for (i in listInteger.indices) {
        if (hashMap.containsKey(listInteger[i])) {
            j = maxOf(j, hashMap[listInteger[i]]!! + 1)
        }
        hashMap[listInteger[i]] = i
        ans = maxOf(ans, i - j + 1)
        println("ans------"+ans)
    }
}
















