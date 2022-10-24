package PR1

fun main(args: Array<String>){
    val(a,b,n) = readln().split(" ").map { it.toInt() }
    val price = (a + b / 100.0) * n
    println("${price.toInt()} ${((price - price.toInt()) * 100).toInt()}")
}