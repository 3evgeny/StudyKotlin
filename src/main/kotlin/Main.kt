fun main(args: Array<String>) {
    println("Hello World!")

    // Пеоеменные
    val name: String = "ART"
    val  second: String = "GG"
    println("$second $name")

    val a: Long = 23

    var d: Int = a.toInt();
    println(d::class)


    //Счатать число с консоли
    val v = readLine()?.toInt()
    val v1 = readln().toInt()
    println("$v $v1")

    //Ввод данных с одной строки через пробел
    val (x1,x2,x3) = readln().split(" ").map { it.toInt() }
    println("$x1 $x2 $x3")

    // "?" Допускает объявдение null
    var str1: String? = "abc"
    str1 = null
    println(str1)
}