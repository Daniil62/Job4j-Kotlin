package ru.job4j.base

fun defragment(array: Array<String?>) : Array<String?> {
    for (index in array.indices) {
        if (array[index] == null) {
            var i = index
            while (array[index] == null && i < array.size) {
                if (array[i] != null) {
                    array[index] = array[i]
                    array[i] = null
                }
                i++
            }
        }
    }
    return array
}
fun main() {
    val array : Array<String?> = arrayOf("#", null, null, null, "@", null, "&", "%")
    defragment(array)
    for (string in array) {
        println(string)
    }
}