package ru.job4j.oop.tracker

import ru.job4j.oop.tracker.interfaces.Input
import ru.job4j.oop.tracker.logic.actions.ActionAdd
import ru.job4j.oop.tracker.logic.actions.ActionExit
import ru.job4j.oop.tracker.logic.actions.ActionShowAll
import ru.job4j.oop.tracker.interfaces.UserAction
import ru.job4j.oop.tracker.logic.ConsoleInput
import ru.job4j.oop.tracker.logic.Tracker
import ru.job4j.oop.tracker.logic.ValidateInput

object StartUI {
    private val menu = arrayOf(
        "0. Add new Item",
        "1. Show all items",
        "2. Exit Program"
    )
    private fun showMenu() {
        println("Menu.")
        for (string in menu) {
            println(string)
        }
    }
    fun init(tracker: Tracker, input: Input, actions: List<UserAction>) {
        var run = true
        while (run) {
            showMenu()
            val select = input.askInt("   Select: ", actions.size)
            run = actions[select].action(tracker, input)
        }
    }
}
fun main() {
    val actions = ArrayList<UserAction>()
    val tracker = Tracker()
    val validateInput = ValidateInput(ConsoleInput())
    actions.add(ActionAdd())
    actions.add(ActionShowAll())
    actions.add(ActionExit())
    StartUI.init(tracker, validateInput, actions)
}