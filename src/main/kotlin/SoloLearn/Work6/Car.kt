package SoloLearn.Work6

class Car(private var weight:Float, private var size:Int) {

    var isNew:Boolean = false

        // Геттер переменной isNew
        get() {
            return weight > size
        }

        //Сеттер переменной isNew
        set(value) {
            if (value){
                println("Yes")
            }else{
                field = value
            }
        }
}