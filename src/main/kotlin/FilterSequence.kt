fun main(){
    val spices = listOf("curry", "pepper", "cayenne", "ginger", "red curry", "green curry", "red pepper")
    // take all spices and sort by string length
    println(spices.filter { it.contains("curry") }.sortedBy { it.length })
    // check filter start with 'c' and end in 'e'
    println(spices.filter { it[0] == 'c' && it.endsWith('e')})
    // take the first three element and return one that start with 'c'
    println(spices.take(3).toList().filter{it[0] == 'c'})
}