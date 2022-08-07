fun main() {
    print("Student Enrollment No. : ")
    val eno = readLine()!!.toLong()
    print("Student Name : ")
    val name = readLine()!!
    print("Student Branch : ")
    val branch = readLine()!!
    print("Student Class : ")
    val c = readLine()!!
    print("Student Batch : ")
    val batch = readLine()!!
    print("Student College Name : ")
    val college = readLine()!!
    print("Student University Name : ")
    val uni = readLine()!!
    print("Student Age : ")
    val age = readLine()!!.toInt()
    println()
    println("************************************")
    println()
    println("Student's Data : ")
    println("Enrollment No. : $eno")
    println("Name : $name")
    println("Age : $age")
    println("Branch : $branch")
    println("Class : $c")
    println("Batch : $batch")
    println("College Name : $college")
    println("University Name : $uni")
}