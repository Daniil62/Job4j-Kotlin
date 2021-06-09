package ru.job4j.base.simple_linked_list

import io.kotlintest.shouldBe
import io.kotlintest.specs.StringSpec
import ru.job4j.oop.SimpleLinkedList

class LinkedItTest : StringSpec({
    val list = SimpleLinkedList<String>()
    list.add("First")
    list.add("Second")
    list.add("Third")
    "Has next" {
        list.iterator().hasNext() shouldBe true
    }
    "Next" {
        list.iterator().next() shouldBe "First"
    }
    "Get" {
        val node = list.LinkedIt().get(1)
        node.value shouldBe "Second"
        node.next shouldBe list.LinkedIt().get(2)
    }
    "Get previous" {
        val node = list.LinkedIt().get(1)
        list.LinkedIt().getPrevious(2) shouldBe node
    }
    "Get last" {
        val head = list.LinkedIt().get(0)
        val node = list.LinkedIt().get(2)
        list.LinkedIt().getLast(head) shouldBe node
    }
})