package ru.job4j.base

import io.kotlintest.shouldBe
import io.kotlintest.specs.StringSpec

class MaxValueTest : StringSpec({
    "Max value from 1, 2, 3 = 3" {
        maxValue(1, 2, 3) shouldBe 3
    }
    "Max value from 1, 3, 2 = 3" {
        maxValue(1, 3, 2) shouldBe 3
    }
    "Max value from 3, 2, 1 = 3" {
        maxValue(3, 2, 1) shouldBe 3
    }
})
