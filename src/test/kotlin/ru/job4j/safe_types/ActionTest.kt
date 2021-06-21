package ru.job4j.safe_types

import io.kotlintest.shouldBe
import io.kotlintest.specs.StringSpec
import java.util.*

class ActionTest : StringSpec({
    val first = Action("action", "RUB", Date(999999999))
    val second = Action("action", "RUB", Date(999999999))
    val third = Action("action", "EUR", Date(888888888))
    "Equals" {
        first.equals(second) shouldBe true
        first.equals(third) shouldBe false
    }
    "HashCode" {
        (first.hashCode() == second.hashCode()) shouldBe true
        (first.hashCode() == third.hashCode()) shouldBe false

    }
})