
import java.util.ArrayList

fun repeatedMissingNumber(A: List<Int>): ArrayList<Int>? {
    var actual_sum = 0L
    var given_sum = 0L
    var actual_square = 0L
    var given_square = 0L
    val n = java.lang.Long.valueOf(A.size.toLong())
    actual_sum = n * (n + 1) / 2L
    actual_square = n * (n + 1) * (2 * n + 1) / 6L
    for (a in A) {
        given_sum += java.lang.Long.valueOf(a.toLong())
        given_square += java.lang.Long.valueOf(a.toLong()) * java.lang.Long.valueOf(a.toLong())
    }
    val Y = actual_sum - given_sum
    val X = (actual_square - given_square) / Y
    val missing = (X + Y) / 2L
    val duplicate = X - missing
    val ans = ArrayList<Int>()
    ans.add(duplicate.toInt())
    ans.add(missing.toInt())
    return ans
}

fun main(args:Array<String>){
    var repeatedMissingNumber = repeatedMissingNumber(listOf(3,1,2,5,3))
    println(repeatedMissingNumber)
}