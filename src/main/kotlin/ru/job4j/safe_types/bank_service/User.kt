package ru.job4j.safe_types.bank_service

import java.util.*

class User(var passport: String, var username: String) {
    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }
        if (other == null || javaClass != other.javaClass) {
            return false
        }
        val user = other as User
        return passport == user.passport
    }
    override fun hashCode(): Int {
        return Objects.hash(passport)
    }

}