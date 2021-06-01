package ru.job4j.oop.tracker

class Item(name : String) : Comparable<Item?> {
    var id: String? = null
    var name : String? = name
    override fun toString(): String {
        return "Item: $name"
    }
    override fun compareTo(other: Item?): Int {
        return if (name != null && other?.name != null)
            this.name!!.compareTo(other.name!!) else if (name != null) 1 else -1
    }
}
