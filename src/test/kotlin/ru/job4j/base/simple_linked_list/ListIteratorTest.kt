package ru.job4j.base.simple_linked_list

import io.kotlintest.shouldBe
import io.kotlintest.specs.StringSpec
import ru.job4j.oop.SimpleLinkedList

class ListIteratorTest : StringSpec({
    val list = SimpleLinkedList<String>()
    "When has not next" {
        list.hasNext() shouldBe false
    }
    "When has next" {
        list.add("First")
        list.add("Second")
        list.hasNext() shouldBe true
    }
    "When has not previous" {
        list.hasPrevious() shouldBe false
    }
    "When has previous" {
        list.next()
        list.hasPrevious() shouldBe true
    }
    "Next value is" {
        list.reset()
        list.next() shouldBe "Second"
    }
    "Next index is" {
        list.add("Third")
        list.nextIndex() shouldBe 2
    }
    "Previous value is" {
        list.previous() shouldBe "First"
    }
    "Previous index is" {
        list.previousIndex() shouldBe 0
    }
})