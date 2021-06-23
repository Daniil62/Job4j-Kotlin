package ru.job4j.lambda.filter

class FilterAccount {
    fun filterByName(list: List<Account>, name: String): List<Account> {
        return list.filter { it.name == name }
    }
    fun filterBalanceMoreThan(list: List<Account>, limit: Long): List<Account> {
        return list.filter { it.balance > limit }
    }
}