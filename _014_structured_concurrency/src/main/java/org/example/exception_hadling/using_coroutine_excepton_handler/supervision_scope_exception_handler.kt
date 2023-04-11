package org.example.exception_hadling.using_coroutine_excepton_handler

import kotlinx.coroutines.CoroutineExceptionHandler
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.SupervisorJob
import kotlinx.coroutines.launch
import java.io.IOException

suspend fun main() {

    val supervision = SupervisorJob()
    val supervisionScope = CoroutineScope(supervision + CoroutineExceptionHandler(handler = { _, e ->
        println(e.javaClass)
        println(e.localizedMessage)

    }))

    supervisionScope.launch {
        throw IOException("job1")
    }
    supervisionScope.launch {
        throw NullPointerException("job2")
    }

}


