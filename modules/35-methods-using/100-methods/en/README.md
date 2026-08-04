Programming exists to perform all kinds of operations. Sometimes these are simple actions, such as adding numbers or joining strings. But more often they are complex processes, like transferring money from one account to another, placing an order in an online store, calculating taxes, or preparing a report.

Such operations cannot be expressed with a single command. Behind an action like "transfer money" hide dozens, hundreds, and even thousands of lines of code. This includes checking the balance, deducting the amount, accounting for the fee, updating the database, and sending a notification to the user.

To manage this code and not get lost in the details, programming came up with a special mechanism. It combines a block of code into a single whole, hides the implementation, and lets you focus on the meaning. For the programmer, it is enough to call it and entrust all the internal work to it.

## How operations are expressed

To express an arbitrary operation, most programming languages use **functions**. A function combines a block of code under a single name. From the outside, everything looks like one command, while the hundreds of lines inside remain hidden.

Here we need to make a caveat. In Java, you cannot create an ordinary function, as most other languages allow. All functions in Java are created only inside classes, which we have not covered yet. Functions defined inside classes are commonly called **methods**. From now on, we will stick to this terminology.

We are already familiar with one method — `println()`. It prints data to the screen. Methods are one of the key constructs in programming; without them, you can hardly do anything. First, we will learn how to use ready-made methods, and only then create our own.

Let's start with methods for working with strings. Below is a call to the `length()` method, which counts the number of characters in a string:

```java
"Hexlet".length(); // 6
"ABBA".length();   // 4
```

The first string has six characters, so `"Hexlet".length()` returns `6`. The second string has four characters, and the result is `4`.

**Methods** are actions that are performed on data. In programming, **objects** are data that have methods. In reality, everything is a bit more complicated, but for now this definition is enough. In Java, all non-primitive (reference) data types are objects, and strings are among them.

Let's look at the structure of a call. First comes the object itself, then a dot, then the **name** of the method and round **parentheses**. The dot shows that the method is called on a specific object. The parentheses show that this is exactly a call, and not an access to data.

Inside the parentheses go the **arguments**, that is, the data that the method receives to work with. There can be several of them, one, or none at all. The `length()` method has no arguments, so the parentheses are empty.

## Where methods come from

Some methods are built into the language, others are created by programmers themselves.

**Built-in methods** come together with Java. You can use them right away, without any additional actions. An example of such a method is `length()` on a string. A large number of methods are available on strings, numbers, and other data types right out of the box.

**Methods that programmers create** appear when you need to package your own logic into a separate block. Such a method can be given any name and called the same way as a built-in one. We will learn this later.

In addition, there are methods from external libraries. To use them, the library is connected using the import mechanism. We are not covering imports in detail yet. It is enough to know that it adds a set of ready-made methods to the program.

## A method without arguments

One of the frequently used string methods is `length()`. For a string, it returns the number of characters.

```java
var message = "Hello!";
var count = message.length();
System.out.println(count); // => 6
```

Here the string `"Hello!"` has six characters, so the call `message.length()` returns the number `6`.

```text
Object           Method           Result
┌──────────┐     ┌──────────┐     ┌──────────┐
│ "Hello!" │ ──→ │ length() │ ──→ │    6     │
└──────────┘     └──────────┘     └──────────┘
```

## Returning a value

Returning a value is one of the key principles of how methods work. Thanks to it, we connect the results of different actions and build more complex logic. If a method returns a value, it can be saved in a variable, passed to another method, or used in calculations. This is exactly how `length()` works. It counts the number of characters and gives the result back out.

```java
var message1 = "Hello!";
var length1 = message1.length(); // save the result

var message2 = "World!";
var length2 = message2.length();

// use the result in an expression
var combinedLength = length1 + length2;
System.out.println(combinedLength); // 12
```

Methods almost never print data to the screen, they return it. If `length()` printed the result right away, the way `println()` does, we would see the number but could not use it further. That is why returning a value is so important. It links methods together. Some return data, others use it in their work. This is exactly how big and complex programs are built from small steps.

In the examples above, the result of each call is written into a variable. But this is not required; a method can be used directly:

```java
var message = "Hexlet";
System.out.println(message.length()); // => 6
```

## A method with arguments

Some methods accept several pieces of data to work with at once. An example is the static method `Math.max()`, which returns the larger of two numbers. The first argument sets one number, the second sets the other.

```java
// Choose the larger of 2 and 3
var result = Math.max(2, 3);
System.out.println(result); // => 3

// Choose the larger of 10 and 7
System.out.println(Math.max(10, 7)); // => 10
```

Here the method is called not on a string, but on the `Math` class through a dot. Such methods are called **static**; they belong to the class itself. In terms of structure, a call with several arguments is no different from a call without them. The same method name, parentheses, and arguments separated by commas inside.

## Parameters and arguments

In discussions about methods, the words **parameters** and **arguments** come up again and again. They are related to each other, but they mean different things.

**Parameters** are talked about when creating a method. A parameter is a variable inside the method into which the passed value goes. **Arguments** are talked about when calling. An argument is what we pass into the method. It is a number, a variable, or any expression.

```java
// numbers as arguments
System.out.println(Math.max(2, 3)); // => 3

var x = 2;
// an argument can be an expression, it is evaluated before being passed to the method
System.out.println(Math.max(x + 1, 3)); // => 3
```

You do not have to memorize this, but it will be useful when reading English-language literature.

Gradually, we will get to know more and more built-in methods. There are so many of these methods that it is impossible to remember them all. The good news is that this is not required. No one remembers method names by heart. The main thing is to have a rough idea of what you need, and then the editor's hints, the documentation, and search will help. Programmers constantly sit in the documentation, figuring out how everything works.
