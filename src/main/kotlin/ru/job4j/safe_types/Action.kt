package ru.job4j.safe_types

import java.util.*

class Action (var name: String?, private var currency: String?, private var date: Date?) {

    override fun hashCode(): Int {
        val nameCode = name?.hashCode() ?: 0
        val currencyCode = currency?.hashCode() ?: 0
        val dateCode = date?.hashCode() ?: 0
        return nameCode * 31 + currencyCode + dateCode
    }

    override fun equals(other: Any?): Boolean {
        return if (other != null) {
            other as Action
            javaClass == other.javaClass &&
                    name == other.name &&
                    currency == other.currency &&
                    date == other.date
        } else {
            false
        }
    }
}