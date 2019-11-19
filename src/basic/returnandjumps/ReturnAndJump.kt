package basic.returnandjumps

fun main(){
    /**
     * break, continue, return works similar to other language but it support label in kotlin.
     * Label can be define using @ symbol example loop@
     * loop@ for(i in 1..10)
     */

    //Break example
    loop@ for (i in 1..10){
        if (i == 5){
            break
        }else {
            println(i)
        }
    }

    // the above code we can write
    loop@ for (i in 1..10){
        if (i == 5) break@loop
        else println(i)
    }
}
// if we see the below function, return will happen for lambda expression. it will execute the print statement.
// means with the help of label we can have more control on the execution
// a good label name will be method name or function name.
fun foo() {
    listOf(1, 2, 3, 4, 5).forEach lit@{
        if (it == 3) return@lit // local return to the caller of the lambda, i.e. the forEach loop
        print(it)
    }
    print(" done with explicit label")
}