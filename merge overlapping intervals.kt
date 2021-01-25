
import java.util.ArrayList

import java.util.Comparator


fun merge(intervals: ArrayList<Interval>?): ArrayList<Interval?>? {
    if (intervals == null || intervals.isEmpty()) {
        return ArrayList()
    }
    val comparator = Comparator<Interval> { i1, i2 -> i1.start - i2.start }
    intervals.sortWith(comparator)
    val output = ArrayList<Interval?>()
    var previousInterval = intervals[0]
    for (i in 1 until intervals.size) {
        val currentInterval = intervals[i]
        if (previousInterval.end >= currentInterval.start) {
            previousInterval.start = Math.min(previousInterval.start, currentInterval.start)
            previousInterval.end = Math.max(previousInterval.end, currentInterval.end)
        } else {
            output.add(Interval(previousInterval.start, previousInterval.end))
            previousInterval = currentInterval
        }
    }
    output.add(previousInterval)
    return output
}