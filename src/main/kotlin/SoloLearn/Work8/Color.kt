package SoloLearn.Work8

//enum - это перечисление константных значений
enum class Color(val colorHex:String, val opacity:Double? = 1.0){

    WHITE("#FFFFFF"),
    BLACK("#000000",0.5),
    RED("#22RR3333"),
    GREEN("#QWEQWEE");

    //Обычно такие методы используют если нужно выполнить какую-то операцию с enum's
    fun some(){
        println("my logic")
    }
}