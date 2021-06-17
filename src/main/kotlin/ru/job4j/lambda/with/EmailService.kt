package ru.job4j.lambda.with

class EmailService {
    fun emailTo(message: Message): String {
        return with(StringBuilder()) {
            append("Subject: ")
            append(message.email)
            append("\nBody: ")
            append("Hello, ")
            append(message.username)
            append(". ")
            append("You win!")
        }.toString()
    }
}