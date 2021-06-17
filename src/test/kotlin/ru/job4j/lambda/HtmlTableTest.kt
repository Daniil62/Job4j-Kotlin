package ru.job4j.lambda

import io.kotlintest.shouldBe
import io.kotlintest.specs.StringSpec

class HtmlTableTest: StringSpec({
    "Test" {
        HtmlTable().table() shouldBe "<center><table border=\"2\">\n" +
                "<caption><h2>Table.<h2></caption>\n" +
                "<tr><td><h3>Col1<h3></td><td><h3>Col2<h3></td><td><h3>Col3<h3></td></tr>\n" +
                "<tr><td>C1, R1</a></td><td>C2, R1</td><td>C3, R1</td></tr>\n" +
                "<tr><td>C1, R2</a></td><td>C2, R2</td><td>C3, R2</td></tr>\n" +
                "<tr><td>C1, R3</a></td><td>C2, R3</td><td>C3, R3</td></tr>\n" +
                "</table></center>"
    }
})