fun main(){
    print("Enter first number:")
    val n1 = readLine()?.toDouble()
    print("Enter Second number:")
    val n2 = readLine()?.toDouble()
    if(n1!=null && n2!=null){
        println("Addition:${Add(n1,n2)}")
        println("Subtraction:${Subt(n1,n2)}")
        println("Multiplication:${Multi(n1,n2)}")
        println("Division:${Div(n1,n2)}")
    }
}
fun Add(n1:Double,n2:Double):Double{
    return n1+n2
}
fun Subt(n1:Double,n2:Double):Double{
    return n1-n2
}
fun Multi(n1:Double,n2:Double):Double{
    return n1*n2
}
fun Div(n1:Double,n2:Double):Double{
    return n1/n2
}