package ru.job4j.oop.tracker.logic

import ru.job4j.oop.tracker.interfaces.Input

class ValidateInput(private val input: Input) : Input {
    override fun askStr(question: String?): String? {
        return input.askStr(question)
    }
    override fun askInt(question: String?): Int {
        var invalid = true
        var value = -1
        do {
            try {
                value = input.askInt(question)
                invalid = false
            } catch (nfe: NumberFormatException) {
                println("Please enter validate data again.")
            }
        } while (invalid)
        return value
    }
    override fun askInt(question: String?, max: Int): Int {
        var invalid = true
        var value = -1
        do {
            try {
                value = input.askInt(question, max)
                invalid = false
            } catch (moe: IllegalStateException) {
                println("Please select command from menu.")
            } catch (nfe: NumberFormatException) {
                println("Please enter validate data again.")
            }
        } while (invalid)
        return value
    }
}