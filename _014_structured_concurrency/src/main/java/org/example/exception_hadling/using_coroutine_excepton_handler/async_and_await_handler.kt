package org.example.exception_hadling.using_coroutine_excepton_handler

import kotlinx.coroutines.*

fun main() {
    val handler = CoroutineExceptionHandler { _, exception ->
        println(exception.javaClass)
    }
    val job = GlobalScope.launch(handler) { // root coroutine, running in GlobalScope
        throw AssertionError()
    }
    val deferred = GlobalScope.async(handler) { // also root, but async instead of launch
        throw ArithmeticException() // Nothing will be printed, relying on user to call deferred.await()
    }
    runBlocking {
        joinAll(job, deferred)
    }
}
