package basic.controlflow

import java.lang.Integer.parseInt

fun main(){
    /**
     * In Kotlin if is an expression. It returns value.
     */

// Old way
    val a = 5
    val b = 10
    var max = a

    if(a < b ) max = b

    // with if else
    if(a < b){
        max = b
    }else {
        max = a
    }

    // As expression
    max = if(a < b) b else a

    /**
     * When Expression is used to replace switch operator. It provide more capability then switch case.
     *
     */

    val x = 10
    when(x) {
        1 -> println("1 got selected")
        2 -> println("2 got selected")
        else -> println("Not sure what you are trying to do")
    }

    // another way
    when(x){
        0, 1 -> println("You selected 0 or 1")
        else -> print("Invalid selection")
    }

    //We can use arbitrary expressions (not only constants) as branch conditions
    when(x){
        parseInt("5") -> println("X parsed successfully")
        else -> println("Unable to parse")
    }

    // when with Range collection
    when(x){
        in 1..10 -> println("X in range of 1 to 10")
        !in 1..10 -> print("X is not in 1 to 10 range")
        else -> println("Invalid range")
    }

    // smart cast
    fun hasPrefix(value: Any) = when(value){
        is String -> value.startsWith("prefix")
        else -> false
    }

    /*// if else if can be replace with
    when(x) {
        x.isEven() -> println("Even")
        x.isOdd() -> println("Odd")
        else -> println("x is funny")
    }
*/

    println(2.isEven())

    // Loops
    val names = listOf<String>("Amit", "Jack")

    for (name in names) println(name)

    for (i in 1..10) println(i)// Range closed

    for (i in 0 until 10) println(i) // it will skip 10

    for (i in 6 downTo 0 step  1) println(i)

    var array = arrayOf(1, 2, 3)

    for (i in array.indices) {
        println(array[i])
    }

    // array with index and value
    for ((index, value) in array.withIndex()){
        println("the element  at $index is $value")
    }


}

fun Int.isEven(): Boolean{
    return this % 2 == 0
}

fun Int.isOdd(): Boolean{
    return this %2 != 0
}

