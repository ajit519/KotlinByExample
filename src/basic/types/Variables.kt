package basic.types

/**
 * In Kotlin everything is an Object. Means we can call function and properties on variable.
 * Some data type handled differently at runtime, Number Boolean Character represented primitive types at Runtime.
 * Basic type in kotlin number, boolean, character, String, Arrary.
  */

/**
 * Number in kotlin divide into decimal and non-decimal.
 * Non Decimal further we divide into Integer and Long
 * Decimal can divided into Float and Double
 *
 * Type	Size (bits)	Min value	Max value
Byte	8	-128	127
Short	16	-32768	32767
Int	32	-2,147,483,648 (-231)	2,147,483,647 (231 - 1)
Long	64	-9,223,372,036,854,775,808 (-263)	9,223,372,036,854,775,807 (263 - 1)
 */

// integer declaration. All the value not exceeding the int range value will be referred as Int
val age: Int = 30

val quantity = 5

// Long deceleration
val twoBillion = 2000000000 // this become long since it exceeds Int Range

val difference = 1L // this is the preferred way of defining Long or add l at the end

val sum: Long = 0

//Any value which contains decimal. They become Double by default
val interestRate = 5.6
val year: Double = 3.6

// to create Float variable we need to give f or F at the end of the literal.
val si = 6.3f
val ci: Float = 4.9f


// In kotlin there is no default widening for the data type allowed. In the below example if we pass any thing
// other then Double it will give compile time warning.



// calling with int

fun main(){
    fun accept(interestRate: Double) {
        println(interestRate)
    }

    val i = 1
    val d = 1.1
    val f = 1.1f
    // This will fail since we are passing Int. This will fail for other as well except Double.
    // accept(5);

    accept(d)

    //Kotlin supports _ to make the variable value more readable
    val oneThousand = 1_000
    val creditCardNumber = 1234_4567_89123L

    // Java and Kotlin way of handling data type
    /**
     * On Java platform, Numbers are physically stored as primitive type. Unless we need nullable number reference
     * or generics is involved.
     * Boxing the number doesn't necessarily preserve the identity.
     * Boxing the number preserve equality.
     */

    val a = 1_000
    println(a === a)
    val boxedA: Int? = a
    val boxedAnotherA: Int? = a

    println(boxedA === boxedAnotherA)

    // equality checks
    println(boxedA == boxedAnotherA)


    //Explicit conversion: As we know kotlin doesn't support explicit conversion from smaller type to higher type.
    //We need to do widening of data type with the help method.
    // below will give error since we trying to assign the integer a to long
   // val longA: Long? = a

    // to fix this issue.
    val longAA: Long = a.toLong()

    //Character
    val sex: Char = 'M' // we can not directly assign integer to char.

    //The following escape sequences are supported: \t, \b, \n, \r, \', \", \\ and \$.
    // we can convert char to integer

    fun charToDigit(c: Char): Int {
        if (c !in '0'..'9')
            throw IllegalArgumentException("Out of range")
        return c.toInt() - '0'.toInt() // Explicit conversions to numbers
    }

    //Boolean By default booleans are not boxed until we need nullable reference.
    val isRunning: Boolean = true

    /**
     * Array in kotlin represented as Array class. We can define array as [].
     * Kotlin support primitive array type. IntArray, ByteArray, ShortArray
     * These classes have no inheritance relation to the Array class,
     */

    val x: IntArray = intArrayOf(1, 2, 3)
    x[0] = x[1] + x[2]

    // Array of int of size 5 with values [0, 0, 0, 0, 0]
    val arr1 = IntArray(5)

// e.g. initialise the values in the array with a constant
// Array of int of size 5 with values [42, 42, 42, 42, 42]
    val arr2 = IntArray(5) { 42 }

// e.g. initialise the values in the array using a lambda
// Array of int of size 5 with values [0, 1, 2, 3, 4] (values initialised to their index value)
    var arr3 = IntArray(5) { it * 1 }

    //String are immutable in Kotlin. It represented using String.
    val str = "abcd"
    for (c in str) {
        println(c)
    }

    // we can concat other variable using + operator, if our first variable is String.
    val address = "Bangalore" + 37
    println(address)

    // Kotlin supports multiline string without using + operator unlike java.
    val addressDetails =  """
          Bangalore 560037
          Karnataka, India
           """
    //String templates. As we all aware in Java for templating we use String.format(). which lead us
    // to a bug if we are not specify the correct formatter. Example instead of decimal value if i give
    // string it throw runtime error. But this can be detected with some IDE.

    val ii = 10
    println("i= $ii")
    // we should use ${} to evaluate the expression.
    val name = "Jack Rayan"
    println("name $name has ${name.length} character")


}

