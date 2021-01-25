
import java.util.ArrayList

fun generateMatrix(A: Int): ArrayList<ArrayList<Int>>? {
    var count = 1
    val l = ArrayList<ArrayList<Int>>()
    for (i in 1..A) {
        val l1 = ArrayList<Int>()
        for (j in 0 until A) {
            l1.add(0)
        }
        l.add(l1)
    }
    var sr = 0
    var sc = 0
    var er = A - 1
    var ec = A - 1
    var i = 0
    var j = 0
    var k = 0
    var w = 0
    while (count <= A * A) {
        if (sr == sc && er == ec && sr == er) {
            l[sr][sc] = count
            count++
        }
        i = sc
        //  forward
        while (i < ec) {
            l[sr][i] = count
            count++
            i++
        }

        // downward
        j = sr
        while (j < er) {
            l[j][ec] = count
            count++
            j++
        }

        // backward
        k = ec
        while (k > sc) {
            l[er][k] = count
            count++
            k--
        }

        // upward
        w = er
        while (w > sr) {
            l[w][sc] = count
            count++
            w--
        }
        sr++
        sc++
        er--
        ec--
    }
    return l
}

fun main(args:Array<String>){
    var returnMatrix = generateMatrix(4)
    println("return matrix ==> $returnMatrix")
}