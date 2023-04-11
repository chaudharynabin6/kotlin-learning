package org.example.onordered_execution.eg2

import kotlinx.coroutines.async
import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking
import kotlin.time.Duration.Companion.milliseconds

//https://www.youtube.com/watch?v=3SX7u5l3CGA
fun main() {
//    outer block is synchronous block so they run in order
    runBlocking {
//        inside this coroutine scope the suspend functions also runs in order

//
        preTask2()
        preTask1()

//         the new child coroutine also runs independently
//        assignment is synchronous code
        val defred1 = async {
            println("task1 < task2")
//            suspend functions all runs in order inside the coroutine scope
            task1()
            task2()
            return@async 2
        }


//         the new child coroutine also runs independently
//        assignment  is synchronous code
        val defred2 = async {
            println("task3 < task4")
//            suspend functions all runs in order inside the coroutine scope
            task4()
            task3()
            return@async 1
        }

        println("defered1")
        println(defred1.await())
        println("defered2")
        println(defred2.await())

    }

}

suspend fun task1() {
    delay(1000.milliseconds)
    println("task1")
}

suspend fun task2() {
    delay(1100.milliseconds)
    println("task2")
}


suspend fun task3() {
    delay(100.milliseconds)
    println("task3")
}

suspend fun task4() {
    delay(200.milliseconds)
    println("task4")
}


suspend fun preTask1() {
    delay(100.milliseconds)
    println("preTask1")
}

suspend fun preTask2() {
    delay(200.milliseconds)
    println("preTask2")
}