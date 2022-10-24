package PR1

fun main(args: Array<String>){
    val input = readln()
    val nucleoCounter = mutableMapOf('A' to 0, 'T' to 0, 'G' to 0, 'C' to 0)
    input.forEach {
        if (it in nucleoCounter) nucleoCounter.replace(
            it, nucleoCounter[it]!! + 1
        )
    }
    nucleoCounter.forEach { print("${it.value} ") }
}