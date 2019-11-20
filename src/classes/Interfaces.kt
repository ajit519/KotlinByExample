package classes

/**
 * Interface in kotlin is similar to java. except it can have properties which can have getters.
 *
 */

interface MyInterface {
    val prop: Int // abstract

    val propertyWithImplementation: String
    get() = "foo"

    fun foo() {
        print(prop)
    }
}

class Child : MyInterface {
    override val prop: Int = 29
}

// interface inheritance
interface  Named{
    val name: String

    fun print()
}

interface Person2: Named {
    val firstName: String
    val lastName: String

    /*override val name: String
        get() = "$firstName $lastName" // we need to override the name property */
}

// Resolving conflict

fun main() {

}

interface  A{
    fun foo(){
        println("foo")
    }

    fun bar()
}

interface B{
    fun foo(){
        println("foo B")
    }

    fun bar(){
        println("B")
    }
}

class C: A{

    override fun bar() {
        println("C instance")
    }
}

class D: A, B{

    override fun foo() {
        //super<A>.foo()
        //super<B>.foo()
        println("D")
    }

    override fun bar() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}