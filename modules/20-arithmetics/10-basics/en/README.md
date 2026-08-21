At the basic level, computers work only with numbers. Even when you write a large application in a modern language, calculations are constantly happening inside. The program adds, subtracts, multiplies, and divides numbers thousands of times per second.

The total of items in an online store's cart, a character's coordinates in a game, the length of a video in seconds. Behind all of this are ordinary arithmetic operations.

Fortunately, ordinary school arithmetic is enough to get started. That's where we'll begin.

## Addition

In mathematics, a sum is written as 3 + 4. In Java, the expression looks the same. On its own, it doesn't show anything on the screen, so the result needs to be printed.

To print, we use the familiar command `System.out.println()`. Here is a whole program that adds two numbers and prints the result:

```java
class App {
    public static void main(String[] args) {
        System.out.println(3 + 4);
    }
}
```

First the sum is calculated, then the resulting number is passed into the print command.

```text
System.out.println(3 + 4);
                   └─┬─┘
                     7

System.out.println(7);  →  7
```

After running it, the result appears on the screen:

```text
7
```

If you put the same expression in quotes, the result changes. In quotes it becomes text, and the string is printed as is:

```java
System.out.println("3 + 4"); // 3 + 4
System.out.println(3 + 4);   // 7
```

In the first line, Java sees text and prints it literally. In the second, it sees arithmetic and calculates.

## Other operations

Besides addition, Java has the whole familiar set of operations:

| Operation      | Symbol | Example | Result |
|----------------|--------|---------|--------|
| Addition       | `+`    | `2 + 3` | `5`    |
| Subtraction    | `-`    | `7 - 2` | `5`    |
| Multiplication | `*`    | `4 * 3` | `12`   |
| Division       | `/`    | `8 / 2` | `4`    |
| Remainder      | `%`    | `7 % 3` | `1`    |

Let's print the result of division, and then the result of multiplication:

```java
System.out.println(8 / 2);     // 4
System.out.println(3 * 3 * 3); // 27
```

Java has no separate operator for exponentiation. When the exponent is small, a number is multiplied by itself the required number of times, as in the example above with `3 * 3 * 3`.

## Integer division

There is an important feature related to division in Java. When both numbers are integers, the result is also an integer, and the fractional part is discarded:

```java
System.out.println(8 / 2); // 4
System.out.println(7 / 2); // 3
```

In the second example, a calculator would give 3.5. Java divides 7 by 2 as integers and keeps only the integer part, that is 3. The remainder is lost.

This happens because integers in Java are stored separately from fractional numbers. For working with fractions, Java has a special kind of number. They are called floating-point numbers and are written with a dot, for example `3.5`. For now, integers are enough for us.

## Remainder

The `%` operation extracts what remains after integer division.

```java
System.out.println(7 % 3); // 1
```

Why is it 1? Three fits into seven twice, which gives 6. One is missing to reach seven, and that one is the remainder.

More examples:

```java
System.out.println(10 % 4); // 2, four fits into ten twice, 2 left to reach 10
System.out.println(15 % 5); // 0, five divides 15 evenly
```

The remainder helps in many tasks. It's used to check whether a number divides evenly. If the remainder is zero, it divides. This is how even numbers are told apart from odd ones, since the remainder of dividing by 2 is 0 for even numbers and 1 for odd ones. The remainder also helps to count in a circle. The remainder of dividing by 12 works like a clock face, and `13 % 12` gives `1`, because after twelve the count starts over. This operation appears in code all the time.

## Formatting expressions

For Java, there's no difference between `3+4` and `3 + 4`. The program understands both variants the same way and adds the numbers in both cases. The difference is only in readability. In programming, it's customary to separate arithmetic operators with spaces, because that makes the expression easier to read:

```text
3 + 4
8 / 2
7 % 3
```

The variant without spaces also works:

```text
3+4
8/2
7%3
```

It looks cramped and is harder on the eyes. Get used to writing with spaces around operators right away.
