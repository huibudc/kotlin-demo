package baseData

fun main(args: Array<String>){
    val items = setOf("apple","banana","kiwi")
    for (item in items) {
        println(item)
    }

    for (index in items.indices) {
        println("item at $index is ")
    }
}