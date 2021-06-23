package ru.job4j.safe_types.bank_service

import java.util.*
import kotlin.collections.HashMap

class BankService {
    private val users = HashMap<User, ArrayList<Account>>()
    fun addUser(user: User) {
        users.putIfAbsent(user, ArrayList())
    }
    fun findAccounts(passport: String): List<Account>? {
        val user = findByPassport(passport)
        return user?.let { users[user] }
    }
    fun findByRequisite(passport: String, requisite: String): Account? {
        return findByPassport(passport)?.let {
                user -> users[user]?.find { it.requisite == requisite } }
    }
    fun addAccount(passport: String, account: Account) {
        val user = findByPassport(passport)
        users[user]?.add(account)
    }
    fun findByPassport(passport: String): User? {
        for (user in users.keys) {
            if (user.passport == passport) {
                return user
            }
        }
        return null
    }
    fun transferMoney(srcPassport: String, srcRequisite: String,
        destPassport: String, descRequisite: String, amount: Double): Boolean {
        val source = findByRequisite(srcPassport, srcRequisite)
        val dest = findByRequisite(destPassport, descRequisite)
        source?.let { source.balance -= amount }
        dest?.let { dest.balance += amount }
        return source != null && dest != null
    }
}
fun main() {
    val bank = BankService()
    bank.addUser(User("321", "Ivan Ivanov"))
    var user = bank.findByPassport("3211")
    println(user?.username)
    user = bank.findByPassport("321")
    println(user?.username)
}