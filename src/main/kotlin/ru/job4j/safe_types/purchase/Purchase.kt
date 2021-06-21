package ru.job4j.safe_types.purchase

import java.util.*

data class Purchase (var name: String, var created: Date, var address: Address?)