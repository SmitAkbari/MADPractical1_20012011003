class Car(info:String,Owner:String,miles:Int,OGPrice:Double,currentPrice:Double){
    private lateinit var info:String
    private lateinit var owner:String
    var miles:Int
    private var originalPrice:Double
    var currentPrice:Double

    init{
        println("Object of class is created and Init is called")
        this.info = info
        this.owner = Owner
        this.miles = miles
        this.originalPrice = OGPrice
        this.currentPrice = currentPrice
    }
    private fun getCarInformation(): String {
        return info
    }
    private fun getOriginalCarPrice(): Double {
        return originalPrice
    }
    private fun getCurrentCarPrice(): Double {
        return currentPrice
    }

    fun displayCarInfo(){
        println("----------")
        println("Car Information: ${getCarInformation()}")
        println("Car Owner: $owner")
        println("Miles Drive: $miles")
        println("Original Car Price: ${getOriginalCarPrice()}")
        println("Current Car Price: ${getCurrentCarPrice()}")
        println("----------\n")
    }

}
fun main() {
    println("Creating Car Class Object car1 in next line")
    val car1 = Car("BMW, 2018","Aman",105, 10000.0,98950.0)
    car1.displayCarInfo()
    println("Creating Car Class Object car2 in next line")
    val car2 = Car("BMW, 2019","Karan",20, 400000.0,399800.0)
    car2.displayCarInfo()
    println("\n********** ArrayList of Car **********")
    val carList = ArrayList<Car>()
    carList.add(Car("Toyota, 2017","KJS",100,1080000.0,1079000.0))
    carList.add(Car("Maruti, 2020","NPP",200,4000000.0,3998000.0))
    carList[0].displayCarInfo()
    carList[1].displayCarInfo()
}