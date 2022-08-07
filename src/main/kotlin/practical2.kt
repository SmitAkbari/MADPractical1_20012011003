fun main() {
    val a:Int = 10
    val b:String = "10"
    val c:String = "20"
    val d:String = "11.12"
    println("Integer Value : $a")
    println("Double Value (From Integer) : ${a.toDouble()}")
    println("String Value : $b")
    println("Integer Value1 (From String) : ${b.toInt()}")
    println("Integer Value2 (From String) : ${c.toInt()}")
    println("Double Value (From String) : ${d.toDouble()}")
}