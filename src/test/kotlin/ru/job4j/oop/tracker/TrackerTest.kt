package ru.job4j.oop.tracker

import io.kotlintest.shouldBe
import io.kotlintest.specs.StringSpec

class TrackerTest : StringSpec({
    val tracker = Tracker()
    val item = Item("First item")
    val item2 = Item("Second item")
    val item3 = Item("Third item")
    "Add" {
        tracker.add(item)
        tracker.add(item2).name shouldBe "Second item"
    }
    "Find all" {
    tracker.findAll() shouldBe arrayOf(item, item2)
    }
    "Find by name" {
        tracker.findByName("First item") shouldBe arrayOf(item)
    }
    "Try to find by unknown name" {
        tracker.findByName("New item") shouldBe emptyArray<Item>()
    }
    "Find by id" {
        val id = item.id
        id?.let { tracker.findById(it) shouldBe item }
    }
    "Try to Find by incorrect id" {
        tracker.findById("#####") shouldBe null
    }
    "Replace" {
        val id = item2.id
        id?.let { tracker.replace(it, item3) shouldBe true }
    }
    "Find all AFTER REPLACE" {
        tracker.findAll() shouldBe arrayOf(item, item3)
    }
    "Try to delete with incorrect id" {
        tracker.delete("#####") shouldBe false
    }
    "Delete" {
        val id = item3.id
        id?.let { tracker.delete(id) shouldBe true }
    }
    "Try to find by deleted name" {
        tracker.findByName("Third item") shouldBe emptyArray<Item>()
    }
    "Find all AFTER DELETING" {
        tracker.findAll() shouldBe arrayOf(item)
    }
})