package baseData

fun main(args: Array<String>){
    val a: Int = 10000
    println(a === a)
    val boxedA: Int ? =a
    val anotherBoxedA: Int? = a
    println(boxedA === anotherBoxedA) // === means adr equals
    println(boxedA == anotherBoxedA) // == means val equals
}