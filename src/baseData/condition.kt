package baseData

fun main(args: Array<String>){
    var x =0
    when(x){
        0,1 -> println("x==0 or x ==1")
        else -> println("otherwise x===$x")
    }

    when(x){
        1-> println("x == 1")
        2-> println("x == 2")
        else ->{
            println("x != 1 and x != 2")
        }
    }

    when(x){
        in 0..10 -> println("x >= 0 or x <=10")
        else -> println("x is outside 【0 10】")
    }

    val items = setOf("apple","banana","kiwi")
    when{
        "orange" in items -> println("juicy")
        "apple" in items -> println("apple is fine too")
    }
}