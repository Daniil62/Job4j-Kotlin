package ru.job4j.lambda.filter

data class Account(private var name: String, private var balance: Long) {
    fun getName(): String {
        return name
    }
    fun getBalance(): Long {
        return balance
    }
}