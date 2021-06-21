package ru.job4j.lambda

class HtmlTable {
    fun table(): String {
        val table = StringBuilder()
        return table.apply {
            append("<center><table border=\"2\">\n")
            append("<caption><h2>Table.<h2></caption>\n")
            append("<tr><td><h3>Col1<h3></td><td><h3>Col2<h3></td><td><h3>Col3<h3></td></tr>\n")
            append("<tr><td>C1, R1</td><td>C2, R1</td><td>C3, R1</td></tr>\n")
            append("<tr><td>C1, R2</td><td>C2, R2</td><td>C3, R2</td></tr>\n")
            append("<tr><td>C1, R3</td><td>C2, R3</td><td>C3, R3</td></tr>\n")
            append("</table></center>")
        }.toString()
    }
}
fun main() {
    println(HtmlTable().table())
}