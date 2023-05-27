package com.PracticeSession

class BinarysSearch {
    fun findIndex(int: Int, array:ArrayList<Int>):Int{
        var low =0
        var high= array.size-1
        while (low<=high){
            val mid=(low+high)/2
            if (array[mid]==int){
                return mid
            }else{
                if (array[mid]<int){
                    low=mid+1
                }
                else{
                    high=mid-1
                }
            }
        }
        return -1
}
}
fun main(){
    val array = arrayListOf(1,2,3,4,5,6,7,8,9)
    val search=BinarysSearch()
    val index=search.findIndex(9,array)
    println(index)

}