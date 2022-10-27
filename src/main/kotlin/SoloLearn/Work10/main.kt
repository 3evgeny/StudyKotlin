package SoloLearn.Work10

fun main(){
    var v1:MyInterface = A()
    var v2:MyInterface = B()

    v1.fun1()   //Class A
    v2.fun1()   //Class B
    v2.fun2()   //default
}