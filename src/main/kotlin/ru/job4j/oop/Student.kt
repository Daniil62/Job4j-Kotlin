package ru.job4j.oop

class Student(private var name: String) {
    private var surname: String = "-"
    private var phone: String = "-"
    private var email: String = "-"
    constructor(name: String, surname: String) : this(name) {
        this.surname = surname
    }
    constructor(name: String, surname: String, phone: String) : this(name) {
        this.surname = surname
        this.phone = phone
    }
    constructor(name: String, surname: String, phone: String, email: String) : this(name) {
        this.surname = surname
        this.phone = phone
        this.email = email
    }
    override fun toString(): String {
        return "Student: " +
                "\n name: $name" +
                "\n surname: $surname" +
                "\n phone: $phone" +
                "\n email: $email" +
                "\n\n"
    }
}
fun main() {
    val first = Student("Vasisualiy")
    val second = Student("Gavrila", "Ivolgin")
    val third = Student("Afrodita", "Karambolo", "+7-123456789")
    val fourth = Student("Nikolay", "Stavrogin", "00-00-00", "__@mail.fm")
    println(first.toString() + second.toString() + third.toString() + fourth.toString())
}