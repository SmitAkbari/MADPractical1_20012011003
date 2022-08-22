fun main() {
    val intArrayList = arrayListOf<Int>()

    for (i in 0..4){
        print("a[$i]=")
        intArrayList.add(readLine()!!.toInt())
    }
    var max = intArrayList[0]
    for (i in 0 until intArrayList.size){
        if(max<intArrayList[i]){
            max = intArrayList[i]
        }
    }
    println("Largest Element = $max")
}