package ru.job4j.lambda.with

import io.kotlintest.shouldBe
import io.kotlintest.specs.StringSpec

class EmailServiceTest: StringSpec({
    "Test" {
        EmailService().emailTo(
            Message("Daniil",
                "email@mail.oo")) shouldBe
                "Subject: email@mail.oo\n" +
                "Body: Hello, Daniil. You win!"
    }
})