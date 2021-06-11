package ru.job4j.oop.tracker.interfaces

interface Input {
    fun askStr(question: String?): String?
    fun askInt(question: String?): Int
    fun askInt(question: String?, max: Int): Int
}