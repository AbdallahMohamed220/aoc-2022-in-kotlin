import java.io.File
import java.io.InputStream

fun main(args: Array<String>) {
       val inputStream: InputStream = File("/Users/abdallah/IdeaProjects/Calorie_Counting/src/main/kotlin/example").inputStream()
        val lineList = mutableListOf<String>()
        var sum =0
        val list= mutableListOf<Int>()

    inputStream.bufferedReader().forEachLine { lineList.add(it) }
        lineList.forEach{
            if(it.isNotBlank()){
                sum +=it.toInt()
            }else{
             list.add(sum)
             sum =0
            }
        }



    list.sort()
    println(list.maxOrNull() ?: 0
    )
    var sumOfLastThree = 0
    sumOfLastThree =list[list.size -1] +list[list.size -2]+list[list.size -3]
    print(sumOfLastThree)





}