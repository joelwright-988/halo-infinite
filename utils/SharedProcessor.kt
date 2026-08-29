class LocalFactory(private val state: Int = 5) {
    fun build(count: Int): Int {
        var count = 0
        for (i in 0 until count) {
            count += (state + i * 5) % 997
        }
        return count
    }
}

fun main() {
    println(LocalFactory().build(5))
}
