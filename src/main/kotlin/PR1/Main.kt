package PR1

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

    val l = if(str1 != null) str1.length else -1
    println(l)

    // "?" Оператор безопасного вызова
    println(str1?.length)

    // Оператор Elvis
    // Если длинна не равна null, то вернет то что слева, иначе -1
    val l1 = str1?.length ?: -1

    var flag: Boolean
    flag = true
    when(flag){
        false -> println("false")
        true -> println("true")
        else -> println()
    }
}