package ru.job4j.oop.profession

class Programmer(name: String, private var language: String)
    : Profession(name){
    fun showLanguage() {
        println(language)
    }
}
fun main(){
    val anonymous = Programmer("programmer", "Kotlin")
    anonymous.showProfession()
    anonymous.showLanguage()
}