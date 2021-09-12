fun main(args: Array<String>) {
    var fortune: String = ""
    while(!fortune.contains("Take it easy")){
        fortune = getFortune(getBirthday())
        println("\nYour fortune is: $fortune")
    }
}

fun getFortune(birthday: Int): String {
    var fortunes = listOf(
        "You will have a great day!",
        "Things will go well for you today.",
        "Enjoy a wonderful day of success.",
        "Be humble and all will turn out well.",
        "Today is a good day for exercising restraint.",
        "Take it easy and enjoy life!",
        "Treasure your friends because they are your greatest fortune.")
    when(birthday){
        in 1..7 -> return fortunes[3]
        28, 31 -> return fortunes[1]
        else -> return fortunes[birthday.rem(fortunes.size)]
    }
}

fun getBirthday() : Int {
    print("What is your birthday? ")
    return readLine()?.toIntOrNull() ?: 0
}