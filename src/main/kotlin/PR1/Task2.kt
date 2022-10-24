package PR1

fun main(args: Array<String>){
    val(a,b,m,n) = readln().split(" ").map { it.toInt() }
    println(
        if (a * b >= m * n) "Yes" else "No"
    )
}