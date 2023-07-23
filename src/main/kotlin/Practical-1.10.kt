import java.util.Scanner
class Car(val type:String , val model:String , val price:Double , val owner:String , var milesDrive:Int){
    val depreciationRate = 0.1
    fun getCarPrice():Double{
        return price-(depreciationRate*milesDrive)
    }
    fun getCarInformation():String{
        return "Type:$type,Model:$model,Price:$price,Owner:$owner,Miles Drive:$milesDrive"
    }
    fun getOriginalCarPrice():Double{
        return price
    }
    fun getCurrentCarPrice():Double{
        return getCarPrice()
    }
    fun displayCarInfo(){
        println(getCarInformation())
        println("Original Price: ${getOriginalCarPrice()}")
        println("Current Price: ${getCurrentCarPrice()}")
    }
}
fun main(){
    val scanner = Scanner(System.`in`)
    print("Enter car type:")
    val type = scanner.nextLine()
    print("Enter car model:")
    val model = scanner.nextLine()
    print("Enter car price:")
    val price = scanner.nextDouble()
    scanner.nextLine()
    print("Enter car owner:")
    val owner = scanner.nextLine()
    print("Enter miles Driven:")
    val milesDrive = scanner.nextInt()
    var car = Car(type,model,price,owner,milesDrive)
    car.displayCarInfo()
}
