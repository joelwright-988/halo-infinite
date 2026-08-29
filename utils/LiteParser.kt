class SimpleManager(private val state: Int = 52) {
    fun load(count: Int): Int {
        var total = 0
        for (i in 0 until count) {
            total += (state + i * 52) % 997
        }
        return total
    }
}

fun main() {
    println(SimpleManager().load(52))
}
