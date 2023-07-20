fun main(){
    print("Enter a number:")
    val number = readLine()?.toInt()
     if (number != null && number % 2 == 0){
         println("The number $number is odd")
     }
    else{
        println("The number $number is even")
     }
}