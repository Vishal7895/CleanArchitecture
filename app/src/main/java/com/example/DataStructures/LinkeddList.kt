package com.example.DataStructures

data class Nodee(val value: Int, var next: Nodee? = null)

class LinkeedList {
    private var head: Nodee? = null
    private var tail: Nodee? = null

    fun isEmpty() = head == null

    fun append(value: Int) {
        val newNode = Nodee(value)
        if (isEmpty()) {
            head = newNode
            tail = head
        } else {
            tail?.next = newNode
            tail = newNode
        }
    }

    fun prepend(value: Int) {
        val newNode = Nodee(value)
        if (isEmpty()) {
            head = newNode
            tail = head
        } else {
            newNode.next = head
            head = newNode
        }
    }

        fun reverseLinkedList() {
            var prev: Nodee? = null
            var next: Nodee?
            var current=head
            println("head---" + current!!.value)

            while (current != null) {
                next = current.next
                current.next = prev
                prev = current
                current = next

            }
            head=prev
        }

  fun findTail():Int{
      var current =head
      while (current?.next!=null){
          current=current!!.next
      }
      return current!!.value!!
  }




    override fun toString(): String {
        var current = head
        val sb = StringBuilder("[")
        while (current != null) {
            sb.append(current.value)
            current = current.next
            if (current != null) {
                sb.append(", ")
            }
        }
        sb.append("]")
        return sb.toString()
    }
}

fun main() {
    val list = LinkeedList()
    list.append(2)
    list.prepend(4)
    list.prepend(6)
    list.prepend(90)
    list.prepend(100)
    println("---"+list)
list.reverseLinkedList()
    println(list)
// prints "[100, 90, 6, 4]"
}
