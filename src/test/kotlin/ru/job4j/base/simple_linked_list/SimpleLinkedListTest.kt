package ru.job4j.base.simple_linked_list

import io.kotlintest.shouldBe
import io.kotlintest.specs.StringSpec
import ru.job4j.oop.SimpleLinkedList

class SimpleLinkedListTest : StringSpec({
    val list = SimpleLinkedList<String>()
    "Add and get" {
        list.add("First")
        list.get(0) shouldBe "First"
    }
    "Replace" {
        list.replace(0, "New item")
        list.get(0) shouldBe "New item"
    }
    "Set" {
        list.set(0, "First")
        list.get(0) shouldBe "First"
    }
    "Size" {
        list.add("Second")
        list.add("Third")
        list.size() shouldBe 4
    }
    "Delete" {
        list.delete(1)
        list.size() shouldBe 3
    }
    "Get" {
        list.get(0) shouldBe "First"
        list.get(1) shouldBe "Second"
        list.get(2) shouldBe "Third"
    }
})