package ru.job4j.lambda.filter

import io.kotlintest.shouldBe
import io.kotlintest.specs.StringSpec

class FilterAccountTest : StringSpec({
    val filter = FilterAccount()
    val list = listOf(
        Account("Ivan", 3000000),
        Account("Makar", 8000000),
        Account("Daniil", 68000000))
    "Filter by name" {
        filter.filterByName(list, "Ivan") shouldBe
                listOf(Account("Ivan", 3000000))
    }
    "Filter by balance threshold" {
        filter.filterBalanceMoreThan(list, 6000000)shouldBe
                listOf(Account("Makar", 8000000),
                    Account("Daniil", 68000000))
    }
    "Filter by name and balance threshold" {
        filter.filterByName(
            filter.filterBalanceMoreThan(list, 6000000),
            "Daniil") shouldBe
                listOf(Account("Daniil", 68000000))
    }
})