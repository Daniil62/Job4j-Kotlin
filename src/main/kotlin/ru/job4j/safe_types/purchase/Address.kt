package ru.job4j.safe_types.purchase

data class Address(val street: String, val home: String, val zip: String) {
    fun getAddress(): String {
        return "$street, $home, $zip."
    }
}