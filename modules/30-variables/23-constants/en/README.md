Sometimes a program has values that should never change. For example:

- The mathematical constant π (pi).
- The dollar exchange rate on a certain date.
- A fixed service fee.

Such values are called constants, and it is customary to distinguish them from ordinary variables so that there is no temptation to change them.

## Example: the number π

Take the number π. Approximately it is always equal to _3.14_ and cannot change:

```java
final var pi = 3.14;
System.out.println(pi); // => 3.14
```

Here `pi` will be a constant that stores the value of the number π. The point of a constant is that its value does not change while the program runs.

## How a constant differs from a variable

The concept of constants is common in most programming languages. In Java, the keyword `final` is placed before the definition of a constant. It tells the compiler that changes are forbidden. Any attempt to change a constant will lead to an error:

```java
final var pi = 3.14;
pi = 3.14159;
// Error:
// cannot assign a value to final variable pi
// cannot assign a value to the constant pi
```

The compiler finds such an error without running the code. This is the strength of `final`: the language itself makes sure that the value stays unchanged.

## How constants are written

A constant, like a variable, can be used in any expression. The only restriction is that it cannot be changed.

When a constant is described at the level of the whole class and is available to the entire program, Java adopts a special style for writing the name:

- All letters are uppercase
- Words are separated by an underscore `_`
- The style is called UPPER_SNAKE_CASE (it is also called SCREAMING_SNAKE_CASE)

Such constants are usually declared with `static final`:

```java
static final double PI = 3.14;
static final int MAX_USERS = 100;
static final int DEFAULT_TIMEOUT = 30;
```

From the name it is immediately clear that this is a constant, not an ordinary variable. The uppercase letters make it stand out in the code.

## Why constants are needed

Constants make code clearer and safer. They help you see right away which values in the program are considered fixed and should not change. This is especially important when working with mathematical and physical constants, default settings, or fixed limits.

Using constants reduces the risk of errors. Thanks to the `final` keyword, the compiler will not let you accidentally change the value. In addition, if the value does need to be changed, for example in the settings, it is enough to fix it in one place, and the change will be picked up throughout the whole program.
