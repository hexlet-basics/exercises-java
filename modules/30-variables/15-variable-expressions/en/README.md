Variables are useful not only for storing and reusing information, but also for simplifying complex calculations.

Let's look at an example: you need to convert euros to rubles through dollars. Banks often make such conversions through an intermediate currency when you shop abroad.

To begin with, let's convert 50 euros to dollars. Suppose that one euro is 1.25 dollars:

```java
var dollarsCount = 50 * 1.25;
System.out.println(dollarsCount);
```

In the previous block, we wrote a specific value into a variable. But here, to the right of the equals sign, there is an **expression**:

```java
var dollarsCount = 50 * 1.25;
```

The program will calculate the result *62.5* and write it into the variable. From the program's point of view, it does not matter what is written: *62.5* or *50 * 1.25*. Both options are expressions that need to be calculated. And they are calculated to the same value *62.5*.

Any string is an expression. String concatenation is also an expression. When the program sees an expression, it calculates it and **returns** the result.

Here are a few examples of expressions. In the comments to the right of each expression, the resulting value is written:

```text
62.5            // 62.5
50 * 1.25       // 62.5
120 / 10 * 2    // 24
"Hexlet"         // "Hexlet"
"Good" + "will" // "Goodwill"
```

The rules for building code are such that in the places where an expression is expected, you can put any calculation. Moreover, the calculation can be not only mathematical, but also a string one — for example, concatenation. And the program will still remain working.

For this reason, it is impossible to describe and show all the cases of using all operations. Programs consist of many combinations of expressions, and understanding this concept is one of the key steps on your path.

Let's return to our currency program. Let's write the value of the dollar in rubles as a separate variable. Let's calculate the price of 50 euros in dollars by multiplying them by 1.25. Suppose that 1 dollar is 60 rubles:

```java
var rublesPerDollar = 60;
var dollarsCount = 50 * 1.25; // 62.5
var rublesCount = dollarsCount * rublesPerDollar; // 3750
System.out.println(rublesCount); // => 3750
```

And now let's add text to the output using concatenation:

```java
var rublesPerDollar = 60;
var dollarsCount = 50 * 1.25; // 62.5
var rublesCount = dollarsCount * rublesPerDollar; // 3750
System.out.println("The price is " + rublesCount + " rubles");
// => The price is 3750 rubles
```

Any variable can be part of any expression. At the moment of calculation, the value of the variable is substituted for its name. The value of `dollarsCount` is calculated before it starts being used in other expressions. When the moment to use the variable comes, Java knows the value, because it has already calculated it.
