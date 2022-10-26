package SoloLearn.Work5

fun main(){
    val st:String? // ? Согласны на получение null
    st = getSt()
    val size = st!!.length // !! Дает согласие на то, что возожно будет null
    println(size)
}

fun getSt():String?{
    return null
}