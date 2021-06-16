package ru.job4j.lambda.map

import java.text.SimpleDateFormat

class CampaignConverter {
    fun convert(list: List<Campaign>): List<String> {
        val dateFormat = SimpleDateFormat("dd.MM.yyyy")
        return list.map {
            "Name: " + it.getName() +
                    "\n" + "Address:" +
                    "\n" + it.getAddress().city +
                    "\n" + it.getAddress().street +
                    "\n" + it.getAddress().build +
                    "\n" + it.getAddress().index +
                    "\n" + "Created: " + dateFormat.format(it.getDate()) + "\n"
        }
    }
}