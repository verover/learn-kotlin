import java.util.*

fun main(args: Array<String>){
    println("${if (args[0].toInt() < 12) "Good morning, Kotlin" else "Good night, Kotlin"}")
}

fun dayOfWeek(){
    val day = Calendar.getInstance().get(Calendar.DAY_OF_WEEK)
    println(when(day){
        1 -> "Sunday"
        2 -> "Monday"
        3 -> "Tuesday"
        4 -> "Wednesday"
        5 -> "Thursday"
        6 -> "Friday"
        7 -> "Saturday"
        else -> "Day is invalid"
    })
}