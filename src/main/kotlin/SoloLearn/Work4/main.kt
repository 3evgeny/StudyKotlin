package SoloLearn.Work4

fun main(){
    myFirstFunction()
    myFirstFunction2(2)
    val result = myFirstFunction4(2, 4.3)
    println(result)
}

fun myFirstFunction():Int{
    return 1
}

fun myFirstFunction2(a:Long):Int{
    return a.toInt()
}

fun myFirstFunction3(){

}

fun myFirstFunction4(a:Long, b:Double) = a + b