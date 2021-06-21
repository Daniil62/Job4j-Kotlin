package ru.job4j.safe_types.purchase

import java.text.SimpleDateFormat
import java.util.*

class PurchaseManager {
    fun createTable(list: List<Purchase>): String {
        val dateFormat = SimpleDateFormat("dd.MM.yyyy, HH:mm")
        var block = ""
        list.forEach {
            it.apply { val adr = address?.getAddress() ?: ""
                block += "<tr><td>" + name + "</td><td>" +
                        dateFormat.format(created) + "</td><td>" + adr + "</td></tr>\n" }
        }
        return with(StringBuilder()) {
            append("<center><table border=\"2\">\n")
            append("<caption><h2>Purchases.<h2></caption>\n")
            append("<tr><td><h3>Name<h3></td><td><h3>Date<h3></td><td><h3>Address<h3></td></tr>\n")
            append(block)
            append("</table></center>")
        }.toString()
    }
}
fun main() {
    println(PurchaseManager().createTable(listOf(
        Purchase("First purchase", Date(),
        Address("N st.", "23", "000")
    ),
        Purchase("Second purchase", Date(), null)
    )))
}