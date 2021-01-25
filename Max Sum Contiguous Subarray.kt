fun maxSubArray(A: List<Int>): Int {
    if (A.size == 1) {
        return A[0]
    }
    var maxSum = 0
    var addedSoFar = 0
    var maxNegativeVal = Int.MIN_VALUE
    for (i in A.indices) {
        addedSoFar += A[i]
        if (addedSoFar > maxSum) {
            maxSum = addedSoFar
        }
        if (addedSoFar < 0) {
            addedSoFar = 0
        }

        // for all -ve scanario
        if (A[i] > maxNegativeVal) {
            maxNegativeVal = A[i]
        }
    }

    // for all -ve scanario
    return if (maxSum == 0) {
        maxNegativeVal
    } else maxSum
}

fun main(args:Array<String>){
    var possibleSum = maxSubArray(listOf(-2, 1, -3, 4, -1, 2, 1, -5, 4))
    println("possible sum ==> $possibleSum")
}