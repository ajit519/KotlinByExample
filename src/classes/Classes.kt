package classes

/**
 * All classes in kotlin have common super class called Any. Similar to Java Object class.
 * class Example will implicitly inherit from Any. It has three method equals, hashCode, toString
 */
class Person(name: String){
    var children: MutableList<Person> = mutableListOf<Person>();
    constructor(name: String, person: Person): this(name){ // In java we call this keyword to call constructor of the same class
        person.children.add(this)
    }
}

class Employee{
    var child: MutableList<String> = mutableListOf();
    constructor(name: String){
        this.child.add(name)
    }
}

/** classes in kotlin by default public and final. So due to this inheritance feature will be little different
 * from java.
 */

open class Shape{
    open fun draw(){
      println("Drawing Shape");
    }
}
// It will give compile error since our class Shape is not be exposed for inheritance. to fix this we need add open modifier.
// If we see the draw method in class Shape. This is final by default, means we can not override this in the child class.
// To allow overriding the method we need to add open modifier.

class Circle: Shape(){
    override fun draw() {
        println("Drawing circle")
    }
}

/**
 * Similar to method overriding we can do property overriding. It follows the same syntax like method.
 * We can override val property to var property but not vice versa. When we use val or var the getter
 * will be added for val, and for var we will be getting getter and setters.
 */

open class Account{
    open val accountNumber: Long = 1L
}

class SavingAccount: Account(){
    override val accountNumber: Long = 11_1L
}

class DematAccount(override var accountNumber: Long = 45L): Account()

/**
 * Kotlin way of object creation is similar to java. It just very with syntax.
 * if we see the below code called in main function
 * fun main(){
 *    val derived = Derived("jack", "rayan")
 * }
 *
 * output will be
 * Argument for Base: Jack
 * Initializing Base
 * Initializing size in Base: 4
 * Initializing Derived
 * Initializing size in Derived: 9
 *
 * Super class calls happen similar to java.
 *
 */

open class Base(val name: String) {

    init { println("Initializing Base") }

    open val size: Int =
        name.length.also { println("Initializing size in Base: $it") }
}

class Derived(
    name: String,
    val lastName: String
) : Base(name.capitalize().also { println("Argument for Base: $it") }) {

    init { println("Initializing Derived") }

    override val size: Int =
        (super.size + lastName.length).also { println("Initializing size in Derived: $it") }
}

/**
 * Overriding of method also same as java Only the case will differ if the we are extending and implementing interface
 * which can have same method.
 */

open class Rectangle{
    open fun draw(){

    }
}

interface Polygon{
    fun draw(){ // method in interface open by default

    }
}

class DuckShape: Rectangle(), Polygon{

    override fun draw() {
        super<Polygon>.draw()
        super<Rectangle>.draw()
    }
}

/**
 * Abstract class similar to java. In java we create static method inside the class or in different class
 * kotlin supports Companion concept.
 */
