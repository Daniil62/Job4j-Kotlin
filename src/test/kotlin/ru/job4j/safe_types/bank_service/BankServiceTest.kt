package ru.job4j.safe_types.bank_service

import io.kotlintest.shouldBe
import io.kotlintest.specs.StringSpec

class BankServiceTest : StringSpec({
    val passport = "123456"
    val requisite = "requisite"
    val user = User(passport, "Ivan")
    val bank = BankService()
    val account = Account(requisite, 1000000.0)
    "Add user then find by correct passport" {
        bank.addUser(user)
        bank.findByPassport("123456") shouldBe user
    }
    "Find by incorrect passport" {
        bank.findByPassport("incorrect") shouldBe null
    }
    "Add account then find it by correct requisite" {
        bank.addAccount(user.passport, account)
        bank.findByRequisite(passport, requisite) shouldBe account
    }
    "Find by incorrect requisite and passport" {
        bank.findByRequisite(passport, "incorrect") shouldBe null
        bank.findByRequisite("incorrect", passport) shouldBe null
    }
    "Transfer money correct" {
        val req = "###"
        val account2 = Account(req, 2000.0)
        bank.addAccount(passport, account2)
        bank.transferMoney(
            passport, requisite,
            passport, req, 3000.0) shouldBe true
        bank.findByRequisite(passport, req)?.balance shouldBe 5000.0
        bank.findByRequisite(passport, requisite)?.balance shouldBe 997000.0
    }
    "Incorrect money transfer" {
        val req = "###"
        bank.transferMoney(
            passport, requisite,
            "incorrect", req, 3000.0) shouldBe false
        bank.transferMoney(
            passport, requisite,
            passport, "incorrect", 3000.0) shouldBe false
    }
    "Find accounts" {
        bank.findAccounts(user.passport) shouldBe
                listOf(account, Account("###", 2000.0))
    }
})