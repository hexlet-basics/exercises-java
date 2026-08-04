
Logical operations are expressions. That means that **logical operations can be combined with other expressions**. Let's look at an example. Suppose we want to check whether a number is even. In programming, evenness is checked through the remainder of division by 2:

* If the remainder is 0, then the number was even
* If the remainder is not 0, then the number was odd

The remainder of division is a simple, but very important concept in arithmetic, algebra, number theory and cryptography. The idea is simple: you need to divide a number into several equal groups. If something is left at the end, that is the remainder of the division.

We divide candies equally between people:

* 7 candies, 2 people: 2 x 3 + **remainder 1**. That means 7 is not a multiple of 2
* 21 candies, 3 people: 3 x 7 + **remainder 0**. That means 21 is a multiple of 3
* 19 candies, 5 people: 5 x 3 + **remainder 4**. That means 19 is not a multiple of 5

In code the remainder is calculated with the help of the `%` operator:

* `7 % 2` → `1`
* `21 % 3` → `0`
* `19 % 5` → `4`

With its help let's write a method for checking evenness:

```java
// Defined in the App class
public static boolean isEven(int number) {
    return number % 2 == 0;
}

App.isEven(10); // true
App.isEven(3); // false
```

In one expression we combined two operators:

* `==` — the equality check
* `%` — the arithmetic operator of the remainder of division

**The priority of arithmetic operations is higher than that of logical ones.** That means that first the arithmetic expression `number % 2` is calculated, and then the result takes part in the logical comparison.

In plain words it can be read like this: "You need to calculate the remainder of the division of the number `number` by 2 and compare it with zero; then return the result of the comparison".

Let's look at one more example. Let's write a method that accepts a string and checks whether the first letter is uppercase. The algorithm of actions will be as follows:

1. We get the first character of the argument string and store it in a variable
2. We compare whether the character is equal to its uppercase version
3. We return the result

And this is what the implementation in code will look like:

```java
public static boolean isFirstLetterInUpperCase(String string) {
    var firstLetter = string.charAt(0);
    // The Character class contains various methods for working with a character
    // The isUpperCase() method checks that the passed character is in upper case
    return Character.isUpperCase(firstLetter);
}

App.isFirstLetterInUpperCase("marmont"); // false
App.isFirstLetterInUpperCase("Robb"); // true
```
