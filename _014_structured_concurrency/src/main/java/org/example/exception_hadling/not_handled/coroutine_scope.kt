package org.example.exception_hadling.not_handled

import kotlinx.coroutines.*
import java.io.IOException
import kotlin.time.Duration.Companion.milliseconds

//https://victorbrandalise.com/coroutines-part-ii-job-supervisorjob-launch-and-async/
fun main() {

    runBlocking {
        val scope = CoroutineScope(Job() + CoroutineExceptionHandler(handler = { _, e ->
            println(e.javaClass)
            println(e.message)
        }))
        scope.launch {
            delay(100.milliseconds)
            throw IOException("job1")
        }
        scope.launch {
            delay(10.milliseconds)
            throw NullPointerException("job2")
        }

    }


}