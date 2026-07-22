In mathematics, there are different kinds of numbers. For example:

- natural numbers, these are integers from 1 and up
- rational numbers, these are numbers with a dot, for example 0.5, 1.75, 2.25

From the standpoint of mathematics, everything here is clear. But from the standpoint of a computer, there's a gulf between these kinds of numbers. Try adding `0.2` and `0.1` in your head. It seems the result will be `0.3`. Here's what Java has to say about it:

```java
System.out.println(0.2 + 0.1); // 0.30000000000000004
```

Instead of the usual `0.3`, you get `0.30000000000000004`.

```text
Expectation: 0.1 + 0.2  →  0.3
Reality:     0.1 + 0.2  →  0.30000000000000004
                             └── storage error
```

JavaScript, C++, and almost all other languages will produce the same result.

## Why this happens

The reason lies in how the computer is built. Memory is finite, while there are infinitely many rational numbers. Between `0.1` and `0.2` there are infinitely many other numbers, and the computer can't store them all. So it approximates the number, trying to fit it into the available bits.

Integers don't have this trouble; they are bounded from above. The largest integer in Java even has a name:

```java
System.out.println(Integer.MAX_VALUE); // 2147483647
```

Behind the notation `Integer.MAX_VALUE` hides the extreme value beyond which an ordinary integer in Java does not go.

This trick doesn't work with rational numbers, since they aren't lined up in a neat chain. Approximate values are called floating point numbers. Their storage and calculations follow the strict IEEE 754 standard, which most languages rely on.

## When such numbers appear

Floating point numbers appear more often than you'd think. Here are the two main cases.

In the first case, you write a number with a dot yourself, for example `0.1`, `2.5`, or `3.14`.

In the second case, a fractional number is involved in a division:

```java
System.out.println(1.0 / 2); // 0.5
System.out.println(2.0 / 3); // 0.6666666666666666
```

Here it's worth recalling integer division. When both operands are integers, Java divides as integers, and `1 / 2` gives `0`. It's enough to make at least one operand fractional, and the result becomes a floating point number. Even when the result looks nice, internally it's still stored approximately. Some fractions, for example `1.0 / 3`, can't be written exactly in the binary system at all.

## Where this is critical

Usually a small error doesn't get in the way. But in financial calculations, engineering tasks, and precise comparison of numbers it turns into a problem. An error of a fraction of a cent ruins the final amount, and a long chain of calculations gradually accumulates inaccuracy.

In real programs, this is dealt with in different ways. Money is often stored in the smallest units, for example in cents, that is, in integers. The result is rounded to the required number of digits. Numbers are compared with a small tolerance. For precise calculations, special data types are used.

## What to remember

Operations with floating point numbers aren't always exact, and that's normal. Most programming languages behave this way, and the reason lies in how memory is built. Precision can be controlled by rounding or by comparison with a tolerance. And for money and scientific calculations, it's better to use special data types right away.
