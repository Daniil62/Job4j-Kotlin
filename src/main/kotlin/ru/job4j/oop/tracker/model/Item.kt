package ru.job4j.oop.tracker.model

data class Item(var id : String = "", var name : String = "") : Comparable<Item?> {
    override fun compareTo(other: Item?): Int {
        return if (other?.name != null) this.name.compareTo(other.name) else 1
    }
}
