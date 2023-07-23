
fun main(){
    print("Enter a number:")
    val num = readLine()?.toIntOrNull()
    if(num != null && num >= 0) {
        val factorial = findFactorial(num)
        println("Factorial of $num is= $factorial")
    }
    else {
        println("Invalid Input!...Please enter positive numbers..!")
    }
}
tailrec fun findFactorial(num:Int,accumulator:Int = 1):Int{
    return if(num == 1) {
        accumulator
    }else{
         findFactorial(num-1,accumulator*num)
        }
    }
