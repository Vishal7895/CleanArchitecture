package com.example.DataStructures

fun Knapsack(values:IntArray,weights:IntArray,capacity:Int):Int{
    val n = values.size
    val dp = Array(n+1){
        Array(capacity+1){0}
    }

    for (i in 1..n){
        for (j in 1..capacity){
            if (weights[i-1]<=j){
                dp[i][j]= maxOf(dp[i-1][j],dp[i-1][j-weights[i-1]]+values[i-1])
                println("dp value ---"+(weights[i-1]))

            }else{
                dp[i][j]=dp[i-1][j]
            }
        }
    }
return dp[n][capacity]
}

fun main(){
    val values = intArrayOf(60,100,120)
    val weights= intArrayOf(10,20,30)
    val capacity = 50
    val results = Knapsack(values,weights,capacity)
    println(results)
}