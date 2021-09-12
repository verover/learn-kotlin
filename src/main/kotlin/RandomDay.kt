import java.util.*

fun main(){
    var fortune: String
    for (i in 1..10) {
        fortune = getFortuneCookie()
        println("\nYour fortune is: $fortune")
        if (fortune.contains("Take it easy")) break
    }
}

fun getFortuneCookie() : String{
    print("Enter your birthday: ")
    var birthday = readLine()?.toIntOrNull() ?: 1
    var fortunes = listOf(
        "You will have a great day!", 
        "Things will go well for you today.", 
        "Enjoy a wonderful day of success.",
        "Be humble and all will turn out well.",
        "Today is a good day for exercising restraint.",
        "Take it easy and enjoy life!",
        "Treasure your friends because they are your greatest fortune.")
    return  fortunes[birthday.rem(fortunes.size)]
}