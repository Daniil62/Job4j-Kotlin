package ru.job4j.oop.tracker.interfaces

import ru.job4j.oop.tracker.logic.Tracker

interface UserAction {
    fun action(tracker: Tracker, input: Input): Boolean
}