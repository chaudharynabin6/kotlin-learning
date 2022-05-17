import kotlin.concurrent.thread

fun main() {
    println("Start of  Thread : ${Thread.currentThread().name}")


    thread {
        println("start of thread : ${Thread.currentThread().name}")

        for (item in 1..10000) {
            print("$item ")
             Thread.sleep(1)
        }

        println()


        println("end of thread : ${Thread.currentThread().name}")
    }

    println("End of Thread : ${Thread.currentThread().name}")
}

