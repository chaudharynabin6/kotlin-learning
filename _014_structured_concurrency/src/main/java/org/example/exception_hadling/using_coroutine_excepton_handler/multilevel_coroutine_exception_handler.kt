package org.example.exception_hadling.using_coroutine_excepton_handler

import kotlinx.coroutines.*
import java.io.IOException

fun main() {

    val handler = CoroutineExceptionHandler { _, exception ->
        println(exception.javaClass)
        println(exception.localizedMessage)
    }
    val job = GlobalScope.launch(handler) {
        val inner = launch { // all this stack of coroutines will get cancelled
            launch {
                throw ArithmeticException("arithmetic error")
                launch {
                    throw IOException("io exception") // the original exception
                }
            }
        }
//        try {
//            inner.join()
//        } catch (e: CancellationException) {
////            println("Rethrowing CancellationException with original cause")
////            throw e // cancellation exception is rethrown, yet the original IOException gets to the handler
//        }
        inner.join()
    }


    runBlocking {

        job.join()
    }
}