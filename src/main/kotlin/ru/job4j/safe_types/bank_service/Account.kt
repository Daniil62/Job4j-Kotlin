package ru.job4j.safe_types.bank_service

import java.util.*

class Account(var requisite: String, var balance: Double) {

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }
        if (other == null || javaClass != other.javaClass) {
            return false
        }
        val account = other as Account
        return requisite == account.requisite
    }
    override fun hashCode(): Int {
        return Objects.hash(requisite)
    }
}