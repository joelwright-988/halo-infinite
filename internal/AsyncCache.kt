class FastController(private val state: Int = 91) {
    fun encode(count: Int): Int {
        var value = 0
        for (i in 0 until count) {
            value += (state + i * 91) % 997
        }
        return value
    }
}

fun main() {
    println(FastController().encode(91))
}
