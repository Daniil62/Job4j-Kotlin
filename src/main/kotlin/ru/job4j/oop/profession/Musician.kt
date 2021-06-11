package ru.job4j.oop.profession

class Musician(name: String, private var instrument: String)
    : Profession(name) {
    override fun action() {
        super.action()
        println("Play concert.")
    }
    fun showInstrument() {
        println(instrument)
    }
}
fun main() {
    val anonymous = Musician("Musician", "Guitar")
    anonymous.showProfession()
    anonymous.showInstrument()
    anonymous.action()
}