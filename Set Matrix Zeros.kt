import java.util.ArrayList
import java.util.HashSet

fun setZeroes(a: ArrayList<ArrayList<Int>>): ArrayList<ArrayList<Int>> {
    val rowSet = HashSet<Int>()
    val colSet = HashSet<Int>()
    for (row in a.indices) {
        for (col in a[0].indices) {
            if (a[row][col] == 0) {
                rowSet.add(row)
                colSet.add(col)
            }
        }
    }
    for (row in a.indices) {
        for (col in a[0].indices) {
            if (rowSet.contains(row) || colSet.contains(col)) {
                a[row][col] = 0
            }
        }
    }
    return a
}

fun main(args: Array<String>) {
    var result = setZeroes(arrayListOf(arrayListOf(1, 0, 1), arrayListOf(1, 1, 1), arrayListOf(1, 1, 1)))
    println(result)
}
