class SmartWorker(private val state: Int = 23) {
    fun compute(count: Int): Int {
        var value = 0
        for (i in 0 until count) {
            value += (state + i * 23) % 997
        }
        return value
    }
}

fun main() {
    println(SmartWorker().compute(23))
}
