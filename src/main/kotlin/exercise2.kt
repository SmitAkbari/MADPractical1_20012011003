open class Product(name: String, quantity: Int) {
    var p: Int = -1
    init {
        println("Product name :$name")
        println("Quantity: $quantity")

    }
    constructor(name: String, quantity: Int, p: Int) : this(name, quantity) {
        this.p = p
        println("Price :$p per piece")
    }
}
class Laptop(name: String, quantity: Int, price: Int, cName: String, rSize: String) : Product(name, quantity, price) {
    var hdd: String = ""
    init {
        println("CPU name:$cName")
        println("RAM Size:$rSize")

    }
    constructor(name: String, quantity: Int, price: Int, cName: String, rSize: String, hdd: String) : this(
        name,
        quantity,
        price,
        cName,
        rSize
    ) {
        this.hdd = hdd
        println("HDD Size:$hdd")
        println("---------------")
    }

}

fun main() {
    val laptops = ArrayList<Laptop>()
    laptops.add(Laptop("DELL", 2, 60000, "Intel", "8GB", "1TB"))
    laptops.add(Laptop("Acer", 3, 55000, "AMD", "8GB", "1TB"))
    laptops.add(Laptop("HP", 7, 70000, "Intel", "16GB", "2TB"))
    laptops.add(Laptop("Apple", 6, 90000, "AMD", "8GB", "512GB"))
    laptops.add(Laptop("Lenovo", 12, 45000, "Intel", "4GB", "512GB"))
}