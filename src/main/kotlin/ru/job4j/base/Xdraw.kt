package ru.job4j.base

fun draw(size : Int, symbol : Char) {
    var start = size
    for (y in 1 .. size) {
        for (x in 1 .. size) {
            print(if (x == y || x == start) symbol else " ")
        }
        --start
        println()
    }
}

fun main() {
    draw(77, 'Y')
}