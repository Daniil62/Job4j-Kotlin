package ru.job4j.base

fun maxValue(first: Int, second: Int, third: Int): Int {
    return if (first > second && first > third) first
    else if (second > third) second else third
}
fun main() {
    println("Max value = " + maxValue(8, 7, 9))
}