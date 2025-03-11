import kotlinx.coroutines.*

suspend fun main() {
    val result = coroutineScope {
        launch {
            launch {
                println("A")
            }
            coroutineScope {
                launch {
                    delay(500)
                    println("B")
                }
                delay(100)
                println("C")
            }
            println("D")
        }
        println("E")
    }
    println("F")
}