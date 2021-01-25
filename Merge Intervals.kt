import java.util.ArrayList

class Interval {
    var start: Int
    var end: Int

    internal constructor() {
        start = 0
        end = 0
    }

    internal constructor(s: Int, e: Int) {
        start = s
        end = e
    }
}

fun insert(intervals: ArrayList<Interval>?, newInterval: Interval): ArrayList<Interval>? {
    var intervals = intervals
    if (intervals == null) {
        intervals = ArrayList<Interval>()
        intervals!!.add(newInterval)
        return intervals
    } else if (intervals.size == 0) {
        intervals.add(newInterval)
        return intervals
    }
    val toInsert: Interval = newInterval

    // Case 1: The intervals have not crossed each other, there we can continue----
    var i = 0
    while (i < intervals.size) {
        val current: Interval = intervals[i]
        if (current.end < toInsert.start) {
            i++
            continue
        } else if (toInsert.end < current.start) {
            intervals.add(i, toInsert)
            break
        } else {
            toInsert.start = Math.min(toInsert.start, current.start)
            toInsert.end = Math.max(toInsert.end, current.end)
            intervals.removeAt(i)
        }
    }

    // Case 4: If the intervals is equal to size of the array list
    if (i == intervals.size) {
        intervals.add(toInsert)
    }
    return intervals
}
