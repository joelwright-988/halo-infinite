class CoreClient(private val state: Int = 62) {
    fun flush(count: Int): Int {
        var count = 0
        for (i in 0 until count) {
            count += (state + i * 62) % 997
        }
        return count
    }
}

fun main() {
    println(CoreClient().flush(62))
}
