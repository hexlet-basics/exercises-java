The word "variable" itself suggests that its value can change. This is one of the main reasons why variables exist at all.

Here is an example:

```java
var greeting = "Father!";
System.out.println(greeting); // => Father!

// var is no longer used, the variable is defined above
greeting = "Mother!";
System.out.println(greeting); // => Mother!
```

Here we first wrote one string (*Father!*) into the variable, and then another (*Mother!*). The name of the variable did not change, but the value inside became different. The keyword `var` is only needed when creating a variable. When changing the value, it is no longer written.

```text
Before: greeting ──→ "Father!"
After:  greeting ──→ "Mother!"
```

## Why change a value

In real programs, variables change all the time. Here are a few reasons:

- The program reacts to the user's actions. For example, while you are entering data into a form on a website, the variables that hold this data are constantly changing.
- Intermediate results. Data often goes through a series of transformations, and at each stage the variable is updated with a new value. A similar mechanism exists even in calculators, when intermediate values are stored with the `m+` or `m-` keys.
- Storing state. If you are writing a game, then the position of the character, its health, the score, and the current level will be variables that change all the time.

## The type of a variable does not change

Java is a statically typed language. The type of a variable is set when it is created and never changes again. In the example above, we wrote a string when creating the variable. The compiler remembers the type and checks all subsequent changes.

If you try to assign a number to the same variable, we will get an error:

```java
greeting = 5;
// Error:
// incompatible types: int cannot be converted to java.lang.String
// incompatible types: a number cannot be turned into a string
```

The compiler performs this check without running the code. That is exactly why this kind of typing is called **static**. In JavaScript, Ruby, PHP, Python, and other dynamic languages, such behavior is not considered an error, and a variable can change its type while the program runs.

## The downside of mutability

Variables give a way to store data that changes as the program runs. Thanks to this, you can write programs that behave differently depending on conditions, user actions, or the results of calculations.

But mutability has a downside too. Sometimes it is hard to understand what exactly is written into a variable at a particular moment in time. The developer has to track where and how it changed, especially if the code is long.

This is exactly what is done during debugging. The developer figures out why the program works differently than intended. They check the values of variables, track the order in which the code runs, and look for where something went wrong.
