Sometimes you need to extract a single character from a string. A site knows a user's first and last name, but wants to display them in a shortened form, A. Ivanov. To do this, you take the first letter of the name and put a dot next to it.

In Java, every character of a string has its own number, which is called an index. Counting starts from zero. The first character has index `0`, the second `1`, and so on in order. To extract a character by index, you call the `charAt()` method on the string. Inside the parentheses, you specify the needed index.

```java
var firstName = "Alexander";
System.out.println(firstName.charAt(0)); // => A
```

The `charAt()` method is called on the string through a dot. In the parentheses there is the argument `0`, so the method returns the very first character. The structure is the same as for other string methods. First the object, then a dot, then the method name and parentheses with the argument.

The relationship between characters and their indexes can be seen in the diagram:

```text
Character  A  l  e  x  a  n  d  e  r
Index      0  1  2  3  4  5  6  7  8
```

The length of the string `Alexander` is `9`, so the index of the last character is `8`, that is `9 - 1`. To extract the last character, you pass exactly this index:

```java
var firstName = "Alexander";
System.out.println(firstName.charAt(8)); // => r
```

## What the method returns

The `charAt()` method returns a single character. In Java there is a separate data type `char` for a single character. A value of type `char` is written in single quotes, for example `'A'`. A string in double quotes and a single character in single quotes belong to different types.

```java
var firstName = "Alexander";
var letter = firstName.charAt(0);
System.out.println(letter); // => A
```

Here the result of the call is saved in the variable `letter`. This is convenient when the character is needed further in the code. But the variable is not required; the method can be printed right away:

```java
System.out.println("Hexlet".charAt(0)); // => H
```

The method is called directly on the string literal `"Hexlet"`. First `charAt(0)` is evaluated, then the result goes into `println()`.

## Going out of the string bounds

The index must fall inside the string. If you pass an index greater than the last one, the program terminates with an error:

```java
var firstName = "Alexander";
System.out.println(firstName.charAt(9));
// StringIndexOutOfBoundsException
```

The string `Alexander` has nine characters with indexes from `0` to `8`. There is no index `9`, so the method throws a `StringIndexOutOfBoundsException` error. That is why, when working with characters, you first check the length of the string and access a character only when the index is definitely within the bounds. This technique is covered later in the course.

## Special characters

The `charAt()` method counts all characters in a row. Not only letters and signs, but also special characters. Each of them occupies its own position and has an index, even if it is not visible on the screen.

For example, in the string `"\nyou"` at index `0` there is `\n` (a line break), and at index `1` comes the letter `y`. That is why the call `magic.charAt(1)` returns exactly `y`.

```java
var magic = "\nyou";
System.out.println(magic.charAt(1)); // => y
```
