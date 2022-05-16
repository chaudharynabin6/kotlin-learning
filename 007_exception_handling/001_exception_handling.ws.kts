
// handing exception
try {
    // some code
} catch (e: SomeException) {
    // handler
} finally {
    // optional finally block
}

// throwing exception
val s = person.name ?: throw IllegalArgumentException("Name required")