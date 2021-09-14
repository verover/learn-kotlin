package Spices

class Spices (var name: String, var spiciness: String = "mild"){
        init {
        println("Spice: $name ($spiciness)")
    }
    val heat : Int
        get() {return when(spiciness){
            "mild" -> 1
            "medium" -> 3
            "spicy" -> 5
            "very spicy" -> 7
            else -> 0
        }}
}