package ru.job4j.base

import io.kotlintest.shouldBe
import io.kotlintest.specs.StringSpec

class DefragmentationTest : StringSpec({
    "Array = " { defragment(arrayOf("1", null, null, null, "2", null, "3", "4")) shouldBe
            arrayOf("1", "2", "3", "4", null, null, null, null)}
})