Aggregation is applied not only to numbers, but also to strings. By string aggregation we mean tasks in which it is not known in advance what the strings contain and what size they are.

In aggregation the string is formed dynamically. Imagine a method that repeats a string the specified number of times. Java has ready-made means for this, but here we will look at how such a repetition is arranged inside:

```java
App.repeat("hexlet", 3); // "hexlethexlethexlet"
```

The principle of this method's work is quite simple. In a loop the string grows the specified number of times:

```java
public static String repeat(String text, int times) {
    // The neutral element for strings is the empty string
    var result = "";
    var i = 1;

    while (i <= times) {
        // Every time we add the string to the result
        result = result + text;
        i = i + 1;
    }

    return result;
}
```

Let's describe the execution of this code step by step:

```java
// For the call repeat("hexlet", 3);
var result = "";
result = result + "hexlet"; // "hexlet"
result = result + "hexlet"; // "hexlethexlet"
result = result + "hexlet"; // "hexlethexlethexlet"
```

Visually the process of growing the string looks like this:

```text
repeat("hexlet", 3):

i=1: result = ""             + "hexlet" = "hexlet"
i=2: result = "hexlet"       + "hexlet" = "hexlethexlet"
i=3: result = "hexlethexlet" + "hexlet" = "hexlethexlethexlet"
                                            └── the result
```

Two variables work here at once. The counter `i` controls the number of repetitions and stops the loop when the repetitions have reached `times`. The variable `result` stores the accumulated string and gives it to the calling code after the loop.

## The neutral element

For the growing to work, a starting value is needed. For strings the **empty string** `""` serves as it.

It is called the neutral element, because in concatenation it does not change anything:

```java
System.out.println("" + "abc"); // => abc
System.out.println("abc" + ""); // => abc
```

That is why the empty string always stands at the beginning in string aggregation. The loop starts the growing from it, and then on every iteration adds the next piece to the result.
