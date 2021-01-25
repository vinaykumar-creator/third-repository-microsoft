
import java.util.ArrayList

fun rotate(a: ArrayList<ArrayList<Int>>): ArrayList<ArrayList<Int>> {
    val n = a.size
    for (i in 0 until n) {
        for (j in i + 1 until n) {
            // transposing
            val el = a[i][j]
            val inverse = a[j][i]
            a[i][j] = inverse
            a[j][i] = el
        }
        // reversing each row
        a[i].reverse()
    }
    return a
}

fun main(args: Array<String>) {
    var rotatedArray: ArrayList<ArrayList<Int>> = rotate(arrayListOf(arrayListOf(5,7,6), arrayListOf(1,5,6)))
    println(rotatedArray)
}
