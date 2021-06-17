package ru.job4j.lambda

import io.kotlintest.shouldBe
import io.kotlintest.specs.StringSpec

class CounterTest : StringSpec({
    "Test" {
        Counter().count(arrayListOf(1, 2, 3, 4)) shouldBe 8
    }
})