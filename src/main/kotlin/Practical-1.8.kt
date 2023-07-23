import java.util.*
import java.util.Arrays

fun main(){
    val array1 = arrayOf(10,90,80,60,100)
    println("Create Array-1 by using arrayOf() method:")
    println(Arrays.toString(array1))

    val array2 = arrayOf(10,90,80,60,100)
    println("Create Array-2 by using arrayOf() method:")
    println(Arrays.toString(array2))

    val array3 = arrayOf(10,90,80,60,100)
    println("Create Array-3 by using arrayOf() method:")
    println(Arrays.toString(array3))

    val array4 = IntArray(5)
    array4[0]=0;
    array4[1]=0;
    array4[2]=0;
    array4[3]=0;
    array4[4]=0;
    println("Create Array-4 ny using IntArray():")
    println(array4.joinToString())

    val array5 = intArrayOf(12,10,1,5,18,19)
    println("Create Array-5 ny using IntArrayOf():")
    println(array5.joinToString())

    val array6 = arrayOf(intArrayOf(1,3),intArrayOf(4,5),intArrayOf(6,7))
    println("Create 2D Array-6 ny using arrayOf and IntArrayOf():")
    println(array6.contentDeepToString())

    val size = readLine()!!.toInt()
    var array7 = Array(size) {0}
    for(i in 0..size-1)
    {
        print("a[$i]=")
        array7[i] = readLine()!!.toInt()
    }

    println("Entered values:")
    print(array7.contentDeepToString())
    println("\n************With Built-in Function************")
    println("\n\nAfter Sorting without built-in function:")
    var temp = 0
    for (i in 0..array7.size-1)
    {
        for (j in i+1..array7.size-1)
        {
            if(array7[i]>array7[j])
            {
               temp = array7[i]
               array7[i] = array7[j]
                array7[j] = temp
            }
        }
    }
    print(array7.contentDeepToString())
}
