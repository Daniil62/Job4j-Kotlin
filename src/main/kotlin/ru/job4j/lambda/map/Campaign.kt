package ru.job4j.lambda.map

import java.util.*

data class Campaign(private var name: String,
                    private var address: Address,
                    private var created: Date) {
    fun getName(): String {
        return name
    }
    fun getAddress(): Address {
        return address
    }
    fun getDate(): Date {
        return created
    }
}