package Aquarium

fun main(args:Array<String>){
    buildAquarium()
}

private fun buildAquarium(){
    val myAquarium = Aquarium()
    println("Length: ${myAquarium.length} " +
            "Width: ${myAquarium.width} " +
            "Height: ${myAquarium.height} ")
    println("Volume: ${myAquarium.volume} Lt")
}