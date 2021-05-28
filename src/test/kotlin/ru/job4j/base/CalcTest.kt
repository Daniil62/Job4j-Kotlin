package ru.job4j.base

import io.kotlintest.shouldBe
import io.kotlintest.specs.StringSpec

class CalcTest : StringSpec({
    "6 + 7 = 13" {
        add(6, 7) shouldBe 13
    }
    "103 - 71 = 32" {
        subtract(103, 71) shouldBe 32
    }
    "31 * 4 = 124" {
        multiply(31, 4) shouldBe 124
    }
    "99 / 3 = 33" {
        split(99, 3) shouldBe 33
    }
})