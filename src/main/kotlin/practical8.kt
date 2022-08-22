fun main() {
    val a1 = arrayOf(10,90,60,80,100)
    println("Create Array-1 by using arrayOf() method:")
    println(a1.contentToString())
    val a2 = Array(5){0}
    println(a2.contentToString())
    val a3 = Array(8) { i -> i * 1 }
    println(a3.contentToString())
    val a4 = IntArray(5){0}
    println(a4.joinToString())
    val a5 = intArrayOf(12,10,1,5,18,19)
    println(a5.joinToString())
    val a6 = arrayOf(
        intArrayOf(1,3),
        intArrayOf(4,5),
        intArrayOf(6,7)
    )
    println(a6.contentDeepToString())

    val a7 = IntArray(5){1}
    println("Please Enter Array Value:")
    for (i in a7.indices){
        print("a[$i]=")
        a7[i] = readLine()!!.toInt()
    }
    println("Entered Array:")
    println(a7.contentToString())
    a7.sort()
    println("***********With Built-in Function***********")
    println("After sorting by built-in function:")
    println(a7.joinToString())
    val a8 = arrayOf(56,23,49,12,2)
    println("***********Without Built-in Function***********")
    println("Before Sorting:")
    println(a8.joinToString())
    for (i in a8.indices){
        for (j in a8.indices){
            if(a8[i]<a8[j]){
                val temp = a8[i]
                a8[i] = a8[j]
                a8[j] = temp
            }
        }
    }
    println("After Sorting without built-in function:")
    println(a8.joinToString())
}