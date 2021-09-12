package Spices

class Spices {
    val spice: String = "curry"
    val spiciness: String = "mild"

    val heat : Int
    get() {if (spiciness=="mild") return 5 else return 0}
}