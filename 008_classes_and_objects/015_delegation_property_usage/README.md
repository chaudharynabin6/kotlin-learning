# Standard Delegation

## Lazy properties

lazy() is a function that takes a lambda and returns an instance of Lazy<T>, 
which can serve as a delegate for implementing a lazy property. 
The first call to get() executes the lambda passed to lazy() and remembers the result.
Subsequent calls to get() simply return the remembered result.


## Delegating to another property

A property can delegate its getter and setter to another property. 

To delegate a property to another property, use the :: qualifier in the delegate name, for example, this::delegate or MyClass::delegate.

## Storing properties in a map 

One common use case is storing the values of properties in a map.
This comes up often in applications 
for things like parsing JSON or performing other dynamic tasks. 


## property delegate requirements

* thisRef must be the same type as, or a supertype of, the property owner (for extension properties, it should be the type being extended).

* property must be of type KProperty<*> or its supertype.

* value must be of the same type as the property (or its supertype).