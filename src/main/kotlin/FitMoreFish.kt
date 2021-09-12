fun main(){
    print("Can I fit more fish? ${fitMoreFish(8.0, listOf(2,2,2), hasDecorations = false)}")
}

fun fitMoreFish(tankSize: Double, currentFish: List<Int>,
                fishSize: Int = 2, hasDecorations: Boolean = true): Boolean{
    return (tankSize * if (hasDecorations) 0.8 else 1.0) >= (currentFish.sum() + fishSize)
}