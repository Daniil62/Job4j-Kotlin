package ru.job4j.base

fun maxValue(first : Int, second : Int) : Int {
    return if (first > second) first else second
}
fun maxValue(first: Int, second: Int, third: Int): Int {
    return if (first > second) maxValue(first, third) else maxValue(second, third)
}
fun main() {
    println("Max value = " + maxValue(8, 7, 9))
}