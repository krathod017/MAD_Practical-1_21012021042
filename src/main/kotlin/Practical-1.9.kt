import java.util.*
 fun main(){
     val scanner = Scanner(System.`in`)
     val list = ArrayList<Int>()
     for (i in 1..5){
         print("Enter a number:")
         val input = scanner.nextInt()
         list.add(input)
     }
     val max = list.maxOrNull()
     if(max != null){
         println("The max value is $max")
     }
     else{
         println("The list is Empty")
     }
 }