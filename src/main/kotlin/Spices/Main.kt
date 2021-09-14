package Spices

fun main(args:Array<String>){
    val spices = listOf(
        Spices("curry", "mild"),
        Spices("pepper", "medium"),
        Spices("cayenne", "spicy"),
        Spices("ginger", "mild"),
        Spices("red curry", "medium"),
        Spices("green curry", "mild"),
        Spices("hot pepper", "extremely spicy")
    )

    val spiceList = (spices.filter{it.heat < 5})
    fun defaultSpice() = Spices("Salt")
}
