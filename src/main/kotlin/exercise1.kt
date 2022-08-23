fun main() {
    var a = 10
    var b = 20
    println("With Using Third Variable:")
    println("Before Swapping:")
    println("The value of A is:$a and Value of B is:$b")
    val c = a
    a = b
    b = c
    println("After Swapping:")
    println("The value of A is:$a and Value of B is:$b")
    println("*******************")
    println("Without using Third Variable:")
    a = 10
    b = 20
    println("Before Swapping:")
    println("The value of A is:$a and B is:$b")
    a += b
    b = a - b
    a -= b
    println("After Swapping:")
    println("The value of A is:$a and B is:$b")
}