fun main(){
    gamePlay(rollDice2(0))
}

fun gamePlay(diceRoll: Int) {
    println(diceRoll)
}
// lambda variable
val rollDice = { side: Int -> if(side == 0) 0 else (1..12).random() }

// lambda as function
val rollDice2: (Int) -> Int = { sides -> if(sides == 0) 0 else (1..12).random() }