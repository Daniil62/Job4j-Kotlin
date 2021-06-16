package ru.job4j.lambda.filter

class FilterAccount {
    fun filterByName(list: List<Account>, name: String): List<Account> {
        return list.filter { account -> account.getName() == name }
    }
    fun filterBalanceMoreThan(list: List<Account>, limit: Long): List<Account> {
        return list.filter { account -> account.getBalance() > limit }
    }
}