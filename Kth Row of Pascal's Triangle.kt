fun getRow(A: Int): IntArray {
    var A = A
    A += 1
    var arr = IntArray(2)
    arr[0] = 1
    if (A == 1) return intArrayOf(1)
    arr[1] = 1
    if (A == 2) return arr
    A -= 2
    var k = 3
    while (A-- > 0) {
        val temp = IntArray(k)
        temp[0] = 1
        temp[k - 1] = 1
        for (i in 1 until arr.size) temp[i] = arr[i] + arr[i - 1]
        arr = temp
        k++
    }
    return arr
}

// fun getRow(a: Int): ArrayList<Int> {
//    var ans = ArrayList<Int>()
//    for (i in 0..a) {
//        val tempAns = ArrayList<Int>()
//        for (j in 0..i) {
//            if (j == 0 || j == i) tempAns.add(1) else tempAns.add(ans[j - 1] + ans[j])
//        }
//        ans = tempAns
//    }
//    return ans
// }

fun main(args: Array<String>) {
    var kthRow: IntArray = getRow(5)
    for (element in kthRow) {
        println("kth row of pascals traingle ==> $element")
    }
}
