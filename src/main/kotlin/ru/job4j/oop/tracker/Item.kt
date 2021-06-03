package ru.job4j.oop.tracker

data class Item(private var id : String = "", private var name : String = "") : Comparable<Item?> {
    fun getId(): String {
        return id
    }
    fun setId(id: String) {
        this.id = id
    }
    fun getName(): String {
        return name
    }
    override fun compareTo(other: Item?): Int {
        return if (other?.name != null) this.name.compareTo(other.name) else 1
    }
}
