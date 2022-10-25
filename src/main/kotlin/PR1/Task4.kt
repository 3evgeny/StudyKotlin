package PR1

import java.lang.Integer.max
import kotlin.math.min


//Не прошел тест
fun main() {
    var(k, x, y) = readln().split(" ").map { it.toInt() }

    var minimum:Int = 0
    var maximum:Int = 0
    var max2:Int = 0

    if (x>y){
        maximum = x
        minimum = y + 2
    }else{
        maximum = y
        minimum = x + 2
    }

    max2 = if (k>minimum){ k }else{ minimum }

    println("${max2 - maximum}")
}