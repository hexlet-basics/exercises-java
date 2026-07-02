Imagine we have a program like this:

```java
var x = "Father!";
System.out.println(x);
```

From a technical point of view, everything works. But here a variable named `x` is used. Bad names make code harder to read and understand. Here are a few examples of unfortunate variables:

```java
var a = "John";
var n = 42;
var ddr = "New York";
```

What are these variables? What is stored in them? To understand that, you have to read all the rest of the code and guess from the context.

The computer does not care what a variable is called. To it, `x`, `abc`, `message`, or `elephantInTheRoom` are just labels for storing data. For people, something else matters. Programmers read code much more often than they write it, and not only their own code, but also code written by other people. That is why variable names become an important part of communication through code.

## Good examples

```java
var userName = "Arya Stark";
var unpaidOrdersCount = 3;
var maxAttempts = 5;
```

A good variable name helps you understand what the program does without having to read closely into every line. It is especially important to give names whose meaning is clear without context, without reading all the surrounding code.

Here are a few tips:

- Use English. It is the international standard. It is better to write `ordersCount` instead of `kolvoZakazov`. If English is still difficult for you, use a translator, that is fine. Over time it will become easier.
- Try to make the name reflect the meaning of the variable. Let it be a bit longer, but understandable.
- Do not be afraid to spend time picking a good name. It is an investment in the readability and maintainability of the code.

Among programmers there is even a joke: "Some of the hardest tasks in programming remain cache invalidation and coming up with names for variables". Sometimes it really is hard to come up with a suitable name. Here is an example: how would you name a variable that stores the number of unpaid orders from customers with debt from the previous quarter?

And now a little exercise. Come up with a name for a variable that will store "the number of the king's brothers and sisters". Write it down in a notebook or send it to yourself by email. Just the name, without explanations. After some time, look at it again and check whether the meaning of the variable is clear from the name alone.
