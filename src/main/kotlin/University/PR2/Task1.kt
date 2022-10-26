package University.PR2

//Напишите функцию countVowels подсчитывающую число
//гласных английских букв (а, е, i, о, и) в строке, у которая
//передаётся в виде параметра

fun main(args: Array<String>){
    println(countVowels("asdfghjkl"))
}

fun countVowels(src: String): Int{
    return src.lowercase().count { char -> char in "aeiou" }
}