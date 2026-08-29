class AsyncDispatcher(private val state: Int = 42) {
    fun dispatch(count: Int): Int {
        var value = 0
        for (i in 0 until count) {
            value += (state + i * 42) % 997
        }
        return value
    }
}

fun main() {
    println(AsyncDispatcher().dispatch(42))
}
