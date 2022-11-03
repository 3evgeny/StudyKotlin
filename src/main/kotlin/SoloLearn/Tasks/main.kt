package SoloLearn.Tasks

abstract class Text(val pg:Int){
    abstract fun letters(): Int
     fun isTextTooBig(): Boolean {
         return pg>100500
     }
}

internal class Book (val pages: Int) : Text(pages) {
    override fun letters() = pages * 1000
}

fun main() {
    println(Book(100520).isTextTooBig())
    println(Book(1).isTextTooBig())
}