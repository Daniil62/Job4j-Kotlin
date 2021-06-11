package ru.job4j.oop.tracker.logic.actions

import ru.job4j.oop.tracker.interfaces.Input
import ru.job4j.oop.tracker.logic.Tracker
import ru.job4j.oop.tracker.interfaces.UserAction

class ActionExit : UserAction {
    override fun action(tracker: Tracker, input: Input): Boolean {
        println("Goodbye.")
        return false
    }
}