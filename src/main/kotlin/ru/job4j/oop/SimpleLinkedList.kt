package ru.job4j.oop

class SimpleLinkedList<T> : Iterable<T> {
    private var head: Node<T>? = null
    fun add(value: T) {
        if (head == null) {
            head = Node(value)
        } else {
            val node = LinkedIt().getLast(head!!)
            val newNode = Node(value)
            node.next = newNode
        }
    }
    fun set(i: Int, value: T) {
        var newNode = Node(value)
        val current = LinkedIt().get(i)
        val prev = if (i > 0) LinkedIt().getPrevious(i) else null
        if (i == 0) {
            newNode = head!!
            head = Node(value, newNode)
        }
        else if (i > 0) {
            newNode.next = current
            prev?.next = newNode
        }
    }
    fun replace(i: Int, value: T) {
        val newNode = Node(value)
        val next = LinkedIt().get(i).next
        val prev = if (i > 0) LinkedIt().getPrevious(i) else null
        if (i == 0) {
            head = Node(value, head?.next)
        }
        else if (i > 0) {
            prev?.next = newNode
        }
        newNode.next = next
    }
    fun get(i: Int): T {
        var count = 0
        var node = head
        while(true) {
            if (count == i) {
                break
            }
            count++
            node = node?.next
        }
        return node!!.value
    }
    fun size(): Int {
        var count = 0
        var node = head
        while(node != null) {
            count++
            node = node.next
        }
        return count
    }
    fun delete(i: Int) {
        val prev = if (i > 0) LinkedIt().getPrevious(i) else null
        if (i == 0) {
            head = head?.next
        }
        else if (i > 0) {
            prev?.next = prev?.next?.next
        }
    }
    fun print() {
        var node = head
        while (node != null) {
            println(node.value)
            node = node.next
        }
    }
    override fun iterator(): Iterator<T> {
        return LinkedIt()
    }
    inner class LinkedIt : Iterator<T> {
        override fun hasNext(): Boolean {
            return head?.next != null
        }
        override fun next(): T {
            if (!hasNext()) {
                throw NoSuchElementException()
            }
            return head!!.value
        }
        fun get(i: Int): Node<T> {
            var count = 0
            var node = head
            while(true) {
                if (count == i) {
                    break
                }
                count++
                node = node?.next
            }
            return node!!
        }
        fun getPrevious(i: Int): Node<T> {
            var count = 0
            var node = head
            while(true) {
                if (i == 0) {
                    node = null
                    break
                }
                else if (count == i - 1) {
                    break
                } else {
                    node = node?.next
                    count++
                }
            }
            return node!!
        }
        fun getLast(head: Node<T>): Node<T> {
            var node = head
            while(node.next != null) {
                node = node.next!!
            }
            return node
        }
    }
    class Node<K>(var value: K, var next: Node<K>? = null)
}
fun main() {
    val list = SimpleLinkedList<String>()
    list.add("First")
    list.add("Second")
    list.add("Third")
    list.add("Fourth")
    list.print()
    println("list size = " + list.size())
}