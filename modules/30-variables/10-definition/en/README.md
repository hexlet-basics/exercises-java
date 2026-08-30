Imagine you need to print the phrase _Father!_ twice:

```java
System.out.println("Father!");
System.out.println("Father!");
```

This approach works if the phrase appears only a couple of times. But what if it is used often, in different parts of the program? Then you would have to copy the same expression over and over.

And what if the phrase needs to be changed, for example to replace _Father!_ with _Mother!_? You would have to find and fix every occurrence by hand. This is inconvenient and leads to errors.

## Variables

To avoid duplicating the same string, you can store it in a variable and print its contents:

```java
var greeting = "Father!";

System.out.println(greeting);
System.out.println(greeting);
```

Result:

```text
Father!
Father!
```

A **variable** is a name behind which a value is stored. In this example, we created a variable named `greeting` and wrote the string `"Father!"` into it.

```text
var greeting = "Father!";

Variable         Value
┌──────────┐     ┌──────────┐
│ greeting │ ──→ │ "Father!"│
└──────────┘     └──────────┘
```

The line `var greeting = "Father!"` reads like this: "take the value `"Father!"` and assign it to the variable named `greeting`". The `=` sign here works as an assignment operator, not as a sign of equality like in mathematics. It puts the value into the variable.

The keyword `var` tells the compiler that we are creating a new variable. Java itself determines the type of the variable by the value we wrote into it. Since there is a string `"Father!"` on the right, the variable `greeting` becomes a string variable.

When we write `System.out.println(greeting)`, the program substitutes the value stored in it for the name `greeting`. As a result, the string `Father!` is printed to the screen.

```text
System.out.println(greeting);
                   |
                   v
System.out.println("Father!");
```

## Types of variables

In Java, every variable has a type. The type says what kind of data is stored inside the variable. An integer, a floating-point number, or a string define different types:

```java
var age = 25;       // integer
var price = 9.99;   // floating-point number
var name = "Tom";   // string
```

In the examples above, the type is determined automatically by the value to the right of the `=` sign. You can also specify the type explicitly, then instead of `var` you write the name of the type:

```java
int age = 25;
double price = 9.99;
String name = "Tom";
```

Both ways create a variable with the same result. Writing it with `var` is shorter, so we will use it in the examples.

## Variable names

The programmer comes up with variable names. In Java you can use:

- Latin letters (a-z, A-Z),
- digits (but not at the beginning),
- underscore `_`.

Examples of valid names: `greeting`, `name1`, `helloWorld`. Java distinguishes between lowercase and uppercase letters. The variables `greeting`, `Greeting`, and `GREETING` will be three different variables.

## Variables and literals

In code it is important to distinguish where we use a variable and where we write a value directly. This is especially noticeable in the example with `System.out.println()`:

```java
var greeting = "Mother!";
System.out.println(greeting);   // => Mother!
System.out.println("greeting"); // => greeting
```

In the first case, the **variable** `greeting` is used, and the program substitutes its value. In the second case, `"greeting"` is enclosed in quotes, so it is a **string literal**, that is, a ready value written directly in the code. Although we see the word `greeting` in both cases, from the compiler's point of view these are different things.

Literals are data written explicitly (for example, `"Hello"`, `42`, `3.14`). Identifiers work as names of variables and methods (for example, `greeting`, `println`), which point to already existing values or commands.

## Several variables in a program

In one program you can create as many variables as you want. Each stores its own data and does not interfere with the others:

```java
var greeting1 = "Father!";
System.out.println(greeting1);
System.out.println(greeting1);

var greeting2 = "Mother!";
System.out.println(greeting2);
System.out.println(greeting2);
```

Result:

```text
Father!
Father!
Mother!
Mother!
```

The number of variables depends on the logic of the program. The more complex the task, the more intermediate data has to be stored somewhere.

## Where to create variables

Programmers try to create variables closer to the place where they are used. This makes the code more readable. This is especially important in large programs, where there can be tens and hundreds of thousands of variables.
