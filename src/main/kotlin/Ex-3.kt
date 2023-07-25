fun main()
{
    val obj = ArrayList<Student> (5)

    obj.add(Student())
    obj.add(Student("26","IT","D","AB15","Honey","Patel",19))
    obj.add(Student("67","IT","A","AB1","Falguni","Thakur", 22))
    obj.add(Student("08","CE","D","A14","Yesha","Chauhan",22))
    obj.add(Student("03","AI","B","A10","Gaytri","Chawda",20))
    obj.add(Student("080","CE","B","AB9","Riya","Pandya",19))

    for (i in obj)
    {
        i.details()
        i.studentinfo()
    }

}
open class Person(private val fn: String, private val ln: String, private val age: Int)
{
    fun details() {
        println("First Name = $fn")
        println("Last Name = $ln")
        println("Age = $age")
    }
}

class Student(private val enroll: String,private val branch: String,private val Class: String,private val batch: String,fname: String,lname: String,age: Int) : Person(fname, lname, age)
{

    constructor() : this("NaN", "NaN", "NaN", "NaN", "NaN", "NaN", 0)
    {
        println("Secondary Constructor")
    }
    fun studentinfo()
    {
        println("Enrollment Number : $enroll")
        println("Branch : $branch")
        println("Class : $Class")
        println("Batch : $batch")
    }
}