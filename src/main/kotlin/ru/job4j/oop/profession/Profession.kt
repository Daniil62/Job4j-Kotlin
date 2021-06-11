package ru.job4j.oop.profession

open class Profession(private val name: String) {
    open fun action() {
        println("some action.")
    }
    fun showProfession() {
        println(name)
    }
}