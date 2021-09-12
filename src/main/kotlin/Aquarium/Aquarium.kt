package Aquarium

class Aquarium {
    var height = 4
    var width = 4
    var length = 4

    var volume : Int
        get() = width * height * length / 1000
        set(value) {height = (value*1000) / (width*length)}
}