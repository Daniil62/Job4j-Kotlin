package ru.job4j.base

fun add(first : Int, second : Int) : Int {
    return first + second
}
fun subtract(first : Int, second : Int) : Int {
    return first - second
}
fun multiply(first : Int, second : Int) : Int {
    return first * second
}
fun split(first : Int, second : Int) : Int {
    return first / second
}
fun main() {
    val plus = add(35, 17)
    println("35 + 17 = $plus")
    val minus = subtract(95, 29)
    println("95 - 29 = $minus")
    println("3 * 41 = " + multiply(3, 41))
    println("140 / 70 = " + split(140, 70))
}