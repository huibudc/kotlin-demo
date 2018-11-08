package objecct

class Greeter(val name: String){
    fun greet(){
        println("hello $name")
    }
}

fun main(args: Array<String>) {
    Greeter("World!").greet()          // 创建一个对象不用 new 关键字
    println("-------------- for ----------")
    for (i in 1..10) print(i)
    println()
    println("-------------- for with step ----------")
    for (i in 1..10 step 2) print(i)
    println()
    println("-------------- for with downTo ----------")
    for (i in 10 downTo 0 step  2) print(i)
    println()
    println("-------------- for with until ----------")
    for (i in 1 until 10) print(i)
}