One of the fundamental topics in Java, on which code is built, is classes and objects. They appear literally from the first lines of code, but learning them and starting to use them is not quite simple. That is why the study of objects and classes is stretched over many lessons. In this lesson, we will dive a little more into how the language works. Don't worry if the puzzle still doesn't come together — that's normal. Classes, objects, and methods are a complex topic that takes time.

We have already encountered methods built into Java in different forms:

```java
System.out.println();
varname.toLowerCase();
varname.substring();
Integer.parseInt();
ChronoUnit.DAYS.between();
```

All such calls can be divided into two groups:

1. Calls of methods on objects, such as strings
2. Calls of static methods that are not tied to specific objects

## Calls of methods on objects

So far we have encountered only strings among objects, but the principle is the same for any objects:

```java
// Syntax for creating an object
// new - creates a new object of the class
var user = new User();

// Gets the user's name
user.getName();

// Example with other objects

// Gets the current day
currentDate.getDayOfMonth();
// Checks that the file exists
file.exists();
```

Such methods perform actions on the objects on which they are called, and often do not take any arguments. For simplicity, objects can be thought of as data that is available inside the method. For example, the string method `toLowerCase()` takes the original string inside itself, transforms it, and returns the result outward.

By the way, `System.out.println()` is a method of the `out` object, which lies inside the `System` class.

## Calls of static methods

But not all method calls are tied to objects: sometimes there is an action, but there is no object. In such cases, **static methods** are used.

What can this be? Mathematical operations on numbers or some actions that do not relate to a specific object, but relate to all objects of a given type. In this case, the method almost always relies on data that comes in the form of parameters:

```java
// Getting a random number, called directly from the Math class
Math.random();

// Reading data at the specified path
Files.readString(path);
```

The `Math` and `Files` classes in this case are needed only for the call, because the methods are defined inside them. Java does not allow defining methods outside of classes.

To be honest, it's not all that simple. You can always come up with some object over which the computation happens. The reverse is also true: you can always do without objects. There are languages in which there are no objects at all. In the end, everything is decided by whoever designs the specific part of the code:

```java
// Without an object, a static method
Files.readString(path);

// Although it could also be done through a file object
path.read();
```

## Conclusions

- Static methods are not tied to specific objects and are called directly from the class
- Non-static methods build their logic relative to the data of the object itself and are called on specific objects

All this smoothly leads us to the possibility of creating classes, objects, and methods on our own, without which it is impossible to imagine any program, even a small one.
