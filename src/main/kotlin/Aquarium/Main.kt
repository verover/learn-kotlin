package Aquarium

fun main(args:Array<String>){
    buildAquarium()
}

private fun buildAquarium(){
    var myAquarium = Aquarium(30, 20, 50)
    println("(AQ1) Length: ${myAquarium.length} " +
            "Width: ${myAquarium.width} " +
            "Height: ${myAquarium.height} " +
            "Volume: ${myAquarium.volume} Lt " +
            "(You can add up to ${myAquarium.fish})")

    myAquarium = Aquarium(9)
    println("(AQ2) Fish in tanks : ${myAquarium.fish} " +
            "Volume : ${myAquarium.volume}")
}