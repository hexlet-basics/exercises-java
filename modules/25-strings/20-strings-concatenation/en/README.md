Programs constantly work with strings. Everything we see on websites or in mobile apps is in one way or another represented as text. This text is most often **dynamic** — assembled from different parts that are joined together. For example, we combine a first name and a last name, add a unit of measurement, or build a message from a template. The operation of joining strings in programming is called **concatenation** and looks like this:

```java
// The operator is the same as for adding numbers,
// but here it has a different meaning (semantics)
System.out.println("Dragon" + "stone");
// => Dragonstone
```

Strings are always glued together in the same order in which the operands are written. The left operand becomes the left part of the result, and the right one becomes the right part. You can concatenate as many parts in a row as you like. Here are a few more examples:

```java
System.out.println("Kings" + "wood"); // => Kingswood
// Reverse word order
System.out.println("road" + "Kings"); // => roadKings
// You can concatenate absolutely any strings
System.out.println("King's" + "Landing"); // => King'sLanding
```

In the last example, the name of the city came out with a mistake: _King's Landing_ should be written with a space. But there were no spaces in our original strings, and spaces in the code itself around the `+` symbol don't affect anything, because they are not part of the strings.

## A space is also a character

When joining, Java does not insert spaces automatically. If you need a space between the parts, you add it manually. There are three ways out of the _King's Landing_ situation:

```java
// Put a space in the left part
System.out.println("King's " + "Landing"); // => King's Landing
// Put a space in the right part
System.out.println("King's" + " Landing"); // => King's Landing
// Add a space separately
System.out.println("King's" + " " + "Landing"); // => King's Landing
```

The result is the same in all three cases. A space is the same kind of character as the others, and the more spaces there are in the strings, the wider the gap between the words.

## Concatenation with a number

The `+` operator can glue a string not only with a string, but also with a number. In this case the number turns into text and is stuck onto the string:

```java
System.out.println("Sum: " + 5);
// => Sum: 5
```

On the left is a string, on the right is the number `5`. Java prints them together, as a single piece of text.

## Escape sequences

Strings can contain escape sequences, for example `\n` for a line feed. During concatenation they work the same way as any other characters:

```java
System.out.println("Hello," + "\n" + "World!");
// =>
// Hello,
// World!
```

## Conclusion

Concatenation is the joining of strings using `+`. The gluing goes strictly from left to right, in the order of the operands. Spaces are not added automatically, so they are included in the strings manually.
