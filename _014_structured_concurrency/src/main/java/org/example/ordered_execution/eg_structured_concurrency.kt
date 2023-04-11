package org.example.ordered_execution

import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking
import kotlin.time.Duration.Companion.milliseconds

//https://www.youtube.com/watch?v=3SX7u5l3CGA
fun main() {
//    outer block is synchronous block so they run in order
    runBlocking {
//        inside this coroutine scope the suspend functions also runs in order
        println("task1 < task2")
        task1()
        task2()
    }
    runBlocking {
//        inside this coroutine scope the suspend functions also runs in order
        println("task3 < task4")
        task4()
        task3()
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



