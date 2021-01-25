import java.util.HashSet

fun repeatedNumber(A: List<Int>): Int {
    val set: HashSet<Int> = HashSet<Int>()
    for (x in A) {
        if (set.contains(x)) return x else set.add(x)
    }
    return -1
}

fun main(args:Array<String>){
    var repeatedNumbers = repeatedNumber(listOf(3, 4 ,1 ,4 ,1))
    println(repeatedNumbers)
}
