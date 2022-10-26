package SoloLearn.Work9

import SoloLearn.Work8.Color
import SoloLearn.Work8.Color.*

fun main(){
//    var N = 19
//    var result = when(N){
//        1 -> "One"
//        2 -> "Two"
//        3 -> "Three"
//        4 -> "Four"
//        5 -> "Five"
//        6 -> "Six"
//        else -> "None"
//    }
//    println(result)




//    var color: Color = Color.GREEN
//    var result = when(color){
//        BLACK -> "Черный"
//        GREEN -> "Зеленый"
//        WHITE -> "Белый"
//        else -> "None"
//    }
    var result = getFavoriteColor(BLACK)
    var result2 = getMultiColor(BLACK,WHITE)
    println(result)
    println(result2)


    var a = 2
    var b = 4

    when{
        (a > b) -> println("$a > $b = true")
        (a < b) -> println("$a < $b = true")
        (a == b) -> println("$a == $b = true")
        else -> println("else")
    }
}

fun getFavoriteColor(color:Color) = when(color){
    BLACK, WHITE -> "Черный или Белый"
    GREEN -> "Зеленый"
    WHITE -> "Белый"
    else -> "None"
}

fun getMultiColor(color1: Color, color2: Color) = when(setOf(color1,color2)){
    setOf(BLACK, WHITE) -> "Черно-белый"
    setOf(RED, GREEN) -> "Красно-зеленый"
    else -> "None"
}