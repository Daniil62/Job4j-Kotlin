package ru.job4j.oop.tracker.logic.actions

import ru.job4j.oop.tracker.interfaces.Input
import ru.job4j.oop.tracker.model.Item
import ru.job4j.oop.tracker.logic.Tracker
import ru.job4j.oop.tracker.interfaces.UserAction

class ActionAdd : UserAction {
    override fun action(tracker: Tracker, input: Input): Boolean {
        val item = tracker.add(Item(name = input.askStr("Enter name for item.")!!))
        println("=== Add new item ===\n"
                + item.getName() + "\n"
                + item.getId() +
                "\n====================\n")
        return true
    }
}