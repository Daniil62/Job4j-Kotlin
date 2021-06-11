package ru.job4j.oop.tracker.logic.actions

import ru.job4j.oop.tracker.interfaces.Input
import ru.job4j.oop.tracker.logic.Tracker
import ru.job4j.oop.tracker.interfaces.UserAction

class ActionShowAll : UserAction {
    override fun action(tracker: Tracker, input: Input): Boolean {
        println("=== Find all ===")
        for(item in tracker.findAll()) {
            println(item.getName())
        }
        println("================\n")
        return true
    }
}