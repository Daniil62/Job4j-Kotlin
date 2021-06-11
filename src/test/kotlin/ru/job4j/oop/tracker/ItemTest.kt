package ru.job4j.oop.tracker

import io.kotlintest.shouldBe
import io.kotlintest.specs.StringSpec
import ru.job4j.oop.tracker.model.Item

class ItemTest : StringSpec({
    val item = Item("", "First item")
    val item2 = Item("", "Second item")
    val item3 : Item? = null
    "Compare item with item2" {
        val point = item < item2
         point shouldBe true
    }
    "Compare item with item3" {
        val point = item > item3
        point shouldBe true
    }
    "Compare item2 with item3" {
        val point = item2 > item3
        point shouldBe true
    }
})
