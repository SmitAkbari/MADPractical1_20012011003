open class Person(firstname: String, lastname: String) {
    var age: Int = -1

    init {
        println("First Name:$firstname")
        println("Last Name:$lastname")
    }

    constructor(firstname: String, lastname: String, age: Int) : this(firstname, lastname) {
        this.age = age
        println("Age $age")
    }
}

class Student(firstname: String, lastname: String, age: Int, eno: Long, branch: String, Class: String) :
    Person(firstname, lastname, age) {
    var batch: String = ""

    init {
        println("Branch $branch")
        println("Class $Class")
    }

    constructor(
        firstname: String,
        lastname: String,
        age: Int,
        eno: Long,
        branch: String,
        Class: String,
        batch: String
    ) : this(firstname, lastname, age, eno, branch, Class) {
        this.batch = batch
        println("Batch $batch")
        println("--------------")
    }

}

fun main() {
    val students = ArrayList<Student>()
    students.add(Student("Smit", "Akbari", 20, 20012011003, "CE", "C", "AB7"))
    students.add(Student("Karan", "Chauhan", 20, 20012011020, "CE", "C", "AB7"))
    students.add(Student("Harsh", "Chauhan", 10, 20012011021, "CE", "C", "AB7"))
    students.add(Student("Parth", "Bhuva", 20, 20012011013, "CE", "C", "AB7"))
    students.add(Student("Jay", "Thakker", 20, 20012011010, "CE", "C", "AB7"))

}