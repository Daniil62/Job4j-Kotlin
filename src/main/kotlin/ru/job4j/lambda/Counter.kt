package ru.job4j.lambda

import kotlin.streams.toList

class Counter {
    fun count(list: ArrayList<Int>): Int {
        return list.stream()
            .filter { i -> i % 2 == 0 }
            .map { i -> i + 1 }.toList().sum()
    }
}
fun main() {
    println(Counter().count(arrayListOf(1, 2, 3, 4)))
}