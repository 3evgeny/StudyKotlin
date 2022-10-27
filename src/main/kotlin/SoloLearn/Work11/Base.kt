package SoloLearn.Work11

// open - дает разрежение для наследования
open abstract class Base {
    var count = 0
    fun a(){
        count++
        println("Count: $count")
    }

    abstract fun minus()
}