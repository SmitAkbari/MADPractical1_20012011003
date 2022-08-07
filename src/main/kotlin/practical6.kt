fun main(){
    print("Enter operation : ")
    val o: String = readLine()!!.toString()
    val ans = doOperations(o,10,20)
    print("Ans is : $ans")
}

fun doOperations(o: String,vararg arrayNum: Int): Int{
    when(o){
        "+" -> {
            var result = 0
            for (num in arrayNum){
                result += num
            }
            return result
        }
        "-" -> {
            var result = 2*arrayNum[0]
            for (num in arrayNum){
                result -= num
            }
            return result
        }
        "*" -> {
            var result = 1
            for (num in arrayNum){
                result *= num
            }
            return result
        }
        "/" -> {
            var result = arrayNum[0]*arrayNum[0]
            for (num in arrayNum){
                result /= num
            }
            return result
        }
        else -> return -1
    }
}