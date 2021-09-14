package Aquarium

class Aquarium (var height: Int = 6, var width: Int = 20, var length: Int = 100){
    var volume : Int
        get() = width * height * length / 1000
        set(value) {height = (value*1000) / (width*length)}

    var fish: Int
    init {
        if(volume > 20){
            fish = 90
        }else{
            fish = 0
        }
    }

    constructor(numberOfFish: Int): this(){
        val water = numberOfFish * 2000
        val tank = water + water * 0.1
        height = (tank/(length* width)).toInt()
        fish = numberOfFish
    }
}

fun makeDefaultFish() = Aquarium(5)
