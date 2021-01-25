import java.util.stream.Collectors

class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    fun largestNumber(A: List<Int>): String {
        val result = A.stream()
            .map { i: Int -> i.toString() }
            .sorted { s1: String, s2: String ->
                reversedComparing(
                    s1,
                    s2
                )
            }
            .collect(Collectors.joining(""))
        return result.substring(nonZeroStartIndexIn(result), result.length)
    }

    companion object {
        private fun nonZeroStartIndexIn(str: String): Int {
            var i = 0
            while (i < str.length - 1 && str[i] == '0') {
                i++
            }
            return i
        }

        private fun reversedComparing(s1: String, s2: String): Int {
            return s2 + s1.compareTo(s1 + s2)
        }
    }
}