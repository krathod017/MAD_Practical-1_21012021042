fun main(){
    print("Enter a month number(1 to 12):")
    val monthNumber = readLine()?.toInt()
    val monthName = when(monthNumber){
        1->"January"
        2->"February"
        3->"March"
        4->"April"
        5->"May"
        6->"June"
        7->"July"
        8->"August"
        9->"September"
        10->"October"
        11->"November"
        12->"December"
        else->"Please enter a proper number"
    }
    println("Month name: $monthName")
}