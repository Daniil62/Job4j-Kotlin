package ru.job4j.oop.tracker.logic

import ru.job4j.oop.tracker.interfaces.Input

class ConsoleInput : Input {
    override fun askStr(question: String?): String {
        println(question)
        return readLine().toString()
    }
    override fun askInt(question: String?): Int {
        return askStr(question).toInt()
    }
    override fun askInt(question: String?, max: Int): Int {
        val select = askInt(question)
        check(!(select < 0 || select >= max)) {
            String.format("Out of about %s > [0, %s]", select, max)
        }
        return select
    }

}