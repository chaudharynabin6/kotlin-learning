# Visibility modifiers

There are four visibility modifiers in Kotlin: private, protected, 
internal, and public. The default visibility is public.

* If you don’t use a visibility modifier, **public** is used by default, which means that your declarations will be visible everywhere.

* If you mark a declaration as **private**, it will only be visible inside the file that contains the declaration.

* If you mark it as **internal**, it will be visible everywhere in the same module.

* The **protected** modifier is not available for top-level declarations.


## Module

The internal visibility modifier means that the member is
visible within the same module. More specifically, 
a module is a set of Kotlin files compiled together, for example: