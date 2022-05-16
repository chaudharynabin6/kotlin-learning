# Package

Defining package
```kotlin
package org.example
```

Importing package
```kotlin
import org.example.* // everything in 'org.example' becomes accessible

import org.example.Message // Message is accessible
import org.test.Message as testMessage // testMessage stands for 'org.test.Message'
```



### Default imports
A number of packages are imported into every Kotlin file by default:

```
kotlin.*

kotlin.annotation.*

kotlin.collections.*

kotlin.comparisons.*

kotlin.io.*

kotlin.ranges.*

kotlin.sequences.*

kotlin.text.*
```
Additional packages are imported depending on the target platform:

JVM:
```
java.lang.*

kotlin.jvm.*
```
JS:

```
kotlin.js.*
```

