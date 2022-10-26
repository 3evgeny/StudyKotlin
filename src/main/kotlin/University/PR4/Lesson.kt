package University.PR4

import kotlin.system.measureNanoTime

fun main(){
    val list = ArrayList<Long>()
    repeat(10_000_00){
        list.add(it.toLong())
    }

    val set = list.toSet()
    val listTime = measureNanoTime {
        val a = list.contains(5_000_000)
    }
    val setTime = measureNanoTime {
        val a = set.contains(5_000_000)
    }

    println("List: ${listTime}ns, Set: ${setTime}ns")
}