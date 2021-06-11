package ru.job4j.oop.profession

class Programmer(name: String, private var language: String)
    : Profession(name){
    override fun action() {
        super.action()
        println("Create program.")
    }
    fun showLanguage() {
        println(language)
    }
}
fun main(){
    val anonymous = Programmer("programmer", "Kotlin")
    anonymous.showProfession()
    anonymous.showLanguage()
    anonymous.action()
}