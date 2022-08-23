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
    laptops.add(Laptop("Acer", 5, 75000, "Intel", "8GB", "1TB"))
    laptops.add(Laptop("Lenovo", 2, 25000, "Intel", "4GB", "512GB"))
    laptops.add(Laptop("Apple", 10, 90000, "Intel Duo", "8GB", "256GB"))
    laptops.add(Laptop("HP", 4, 45000, "AMD", "8GB", "512GB"))
    laptops.add(Laptop("DELL", 8, 51000, "AMD", "4GB", "2TB"))
}