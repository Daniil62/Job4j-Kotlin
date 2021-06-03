package ru.job4j.oop.tracker

object StartUI {
    private val tracker: Tracker = Tracker()
    private val menu = arrayOf(
        "0. Add new Item",
        "1. Show all items",
        "2. Exit Program"
    )
    fun init() {
        var action = ""
        while (action != "2") {
            showMenu()
            action = readLine().toString()
            selectAction(action)
        }
    }
    private fun showMenu() {
        println("Menu.")
        for (string in menu) {
            println(string)
        }
    }
    private fun selectAction(action: String) {
        when(action) {
            "0" -> {
                println("Enter name for item.")
                actionAdd(tracker.add(Item(name = readLine().toString())))
                }
            "1" -> {
                actionFindAll()
            }
            "2" -> {
                println("Goodbye.")
            }
            else -> {
                println("You entered som nonsense.")
            }
        }
    }
    private fun actionAdd(item: Item) {
        println("=== Add new item ===\n"
                + item.getName() + "\n"
                + item.getId() +
                "\n====================\n")
    }
    private fun actionFindAll() {
        println("=== Find all ===")
        for(item in tracker.findAll()) {
            println(item.getName())
        }
        println("================\n")
    }
}
fun main() {
    StartUI.init()
}