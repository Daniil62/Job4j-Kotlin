package ru.job4j.lambda

class Counter {
    fun count(list: ArrayList<Int>): Int {
        return with(list.filter { it % 2 == 0 }) {
            if (isNotEmpty()) reduce { a, b -> a + b + 1 } + 1 else 0
        }
    }
}
fun main() {
    println(Counter().count(arrayListOf(1, 2, 3, 4)))
}