package com.example.BuilderPattern

fun main() {
    val course1 = Courses("History", true, 1)
    val course2 = Courses("History", true, 14)
    val map = mutableMapOf<String,MutableList<Int>>()
    val course3 = Courses("History", true, 1)
    val studentList = arrayListOf<Student>()
    val student1 = Student("Vishu", listOf())
    val student2 = Student("Akbar", listOf())
    val student3 = Student("Amar", listOf())
    val list = arrayListOf<Courses>()
    val mutableList= mutableListOf<Int>(course1.count,course2.count,course3.count)
    map.put("key",mutableList)
    val list1 = listOf<Courses>()
list.add(course1)
    list.add(course2)
    student1.subscribedCourse = list
    student2.subscribedCourse=list
    student3.subscribedCourse=list
    studentList.add(student1)
    studentList.add(student2)
    studentList.add(student3)

    val listOfint = listOf(1,2,3,3,3,4,5,5,6)
    val Map= hashMapOf<Int,Int>()
    for (i in listOfint){
        if (Map.containsKey(i)){
            Map[i]= Map[i]!!+1
        }
        else{
            Map[i]=1
        }
    }

    println(Map)


    fun binarySearch(list:List<Int>,item:Int):Int?{
        var low=0
        var high=list.size-1
        var mid:Int
        while (low<high){
            mid=(low+high)/2
            when{
                list[mid]==item->return mid
                list[mid]>item->high=mid-1
                else->low=mid+1
            }
        }
        return null
    }


}
//1. Student(subscribedCourses = [Course(name = "Maths", isPaid = false), Course(name = "Arts", isPaid = true)])