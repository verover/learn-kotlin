fun main(){
    println(whatShouldIDoToday("happy", "sunny"))
    println(whatShouldIDoToday("sad"))
    print("How do you feel?")
    println(whatShouldIDoToday(readLine()!!))
}

fun isHappySunny(mood: String, weather: String) = mood == "happy" && weather == "sunny"
fun isSadRainyCold(mood: String,weather: String,temprature: Int) = mood == "sad" && weather == "rainy" && temprature == 0
fun isHot(temprature: Int) = temprature > 35

fun whatShouldIDoToday(mood: String, weather: String = "sunny", temprature: Int = 24) : String{
    return when{
        isHappySunny(mood, weather) -> "Go for a walk"
        isSadRainyCold(mood, weather, temprature) -> "Stay in bed"
        isHot(temprature) -> "Go swimming"
        else -> "Stay home and read."
    }
}
