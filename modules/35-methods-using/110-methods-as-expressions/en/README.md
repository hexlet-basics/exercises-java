When we write programs, we need to connect actions with one another. Adding numbers, joining strings, and working with variables are examples of how simple steps combine into more complex behavior.

```java
var rate = 10;
var hours = 5;
var salary = rate * hours + 100;
System.out.println(salary); // => 150
```

In programming, the concept of an **expression** is used for this. That is the name for a construct that is evaluated and gives a result. In the example above, `rate * hours + 100` is an expression. It is composed of variables (`rate`, `hours`), a numeric literal (`100`), and arithmetic operations. Together they return a result that can be saved in a variable or used further.

The peculiarity of expressions is that their result can always be applied — assigned to a variable, passed to a method, or printed to the screen:

```java
// Here the expression is 1 + 5
var sum = 1 + 5;
System.out.println(1 + 5);
```

But not everything in programming is an expression. A variable declaration is a statement; it cannot be part of an expression. That is why the following code will produce an error:

```java
// Meaningless code that will not work
10 + var sum = 1 + 5;
```

Expressions can be combined endlessly, gradually complicating the logic. Each new expression becomes part of a larger one:

```java
var rate = 10;
var hours = 5;
var bonus = 50;
// An expression made of many operations
var salary = (rate * hours + bonus) * 12 - 500;
System.out.println(salary);
```

Here several expressions are combined into one, and the result has become even more complex. This is exactly how programs are built. Small steps add up into large constructs. That is why in programming it is impossible to memorize all combinations in advance. It is much more important to understand how expressions connect with each other into the desired result.

## A method call as an expression

Let's talk about methods. Is a method call an expression or not? We know that methods return a result, so yes, a method call is an expression. A lot of interesting things automatically follow from this.

For example, we can use a method call directly in mathematical operations. Here is how to get the index of the last character in a word:

```java
// Indexes start from zero
var name = "Java";
// A method call and subtraction together
var lastIndex = name.length() - 1;
System.out.println(lastIndex); // => 3
```

There is no new syntax in this code. We have merely connected already known parts, relying on their nature. The `length()` method returns the number `4`, we subtract one from it and get `3`. We can go even further and embed the call directly into the output:

```java
System.out.println(name.length() - 1); // => 3
```

## Expressions as method arguments

A method argument is always some value. But a value can not only be written directly, it can also be computed. And that means any expressions can be substituted as arguments.

```java
// Here the argument of println is the number 150
System.out.println(150);

// And here the argument is an expression that is evaluated first
System.out.println(10 * 15); // => 150

// You can combine it in an even more complex way
var rate = 10;
var hours = 15;
var bonus = 50;
System.out.println(rate * hours + bonus); // => 200
```

The `println()` method receives a ready value and prints it to the screen. The way this value is obtained is indifferent to the method. That is why method calls combine perfectly with any expressions.

## A method call inside a method

Since a method call is itself an expression, its result can be passed directly to another method. This allows building even more complex constructs:

```java
var name = "Java";

// The call name.length() returns 4
// This result is immediately used as an argument of println()
System.out.println(name.length()); // => 4
```

Here `name.length()` is evaluated first and returns the number `4`. Then this value is substituted into the `println()` call. To read such constructs correctly, you need to remember the order of evaluation.

1. First, the method that is "inside" is executed, in our case `name.length()`.
2. Then its result is substituted in place of the call.
3. After that, the outer method is executed, in our case `println()`.

The code `System.out.println(name.length())` can be mentally broken down like this:

```text
System.out.println("Java".length())

Step 1:  "Java".length()  →  4
Step 2:  println(4)       →  prints 4
```

This principle always works. First the nested calls are evaluated, then the outer one.

## Methods as part of expressions

Methods return values, so their calls can be used as part of any other expressions. This is true for all methods, including string ones:

```java
var name = "Java";
// toUpperCase() converts the word to uppercase
System.out.println("Hello " + name.toUpperCase()); // => Hello JAVA

// You can use the result of a method in arithmetic
var text = "hexlet";
var doubled = text.length() * 2;
System.out.println(doubled); // => 12
```

Here the calls `name.toUpperCase()` and `text.length()` are full-fledged expressions. They return values that are combined with strings, numbers, variables, and other operations.
