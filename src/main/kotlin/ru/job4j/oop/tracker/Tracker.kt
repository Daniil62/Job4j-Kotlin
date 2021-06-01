package ru.job4j.oop.tracker

import java.util.*

class Tracker {
    private val items: MutableList<Item> = ArrayList()
    private fun generateId(): String {
        val rm = Random()
        return (rm.nextLong() + System.currentTimeMillis()).toString()
    }
    private fun indexOf(id: String): Int {
        var result = -1
        for (i in items.indices) {
            if (items[i].id.equals(id)) {
                result = i
                break
            }
        }
        return result
    }
    fun add(item: Item): Item {
        item.id = generateId()
        items.add(item)
        return item
    }
    fun findAll(): List<Item> {
        return items
    }
    fun findByName(key: String?): List<Item> {
        val itemsNameId: MutableList<Item> = ArrayList()
        for (item in items) {
            if (item.name.equals(key)) {
                itemsNameId.add(item)
            }
        }
        return itemsNameId
    }
    fun findById(id: String): Item? {
        var item: Item? = null
        val index = indexOf(id)
        if (index != -1 && items[index].id.equals(id)) {
            item = items[index]
        }
        return item
    }
    fun replace(id: String, item: Item): Boolean {
        var result = false
        val index = indexOf(id)
        if (index != -1) {
            item.id = id
            items[index] = item
            result = true
        }
        return result
    }
    fun delete(id: String): Boolean {
        val index = indexOf(id)
        var result = false
        if (index != -1) {
            items.removeAt(index)
            result = true
        }
        return result
    }
}