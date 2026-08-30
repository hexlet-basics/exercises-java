Strings in Java appear at every step. We use them to work with text, print messages to the screen, process user input, and exchange data with external systems.

From Java's point of view, a string is a set of characters enclosed in double quotes. Let's look at some examples.

```text
"Hello"
"Goodbye"
"G"
" "
""
```

All of these are strings.

- `"Hello"` and `"Goodbye"` are strings of several characters
- `"G"` is a string of a single character
- `" "` is a string of a single space
- `""` is an empty string, it contains no characters at all. It plays the same role as 0 in mathematics

Everything inside the quotes is considered a string, even if it's just a space or nothing at all.

If you print these strings to the screen, `"Hello"` and `"Goodbye"` will be clearly visible. But `" "` and `""` are confusing. Printing an empty string looks like a complete absence of text, while a string with a space shows an "empty spot" that is visually hard to tell apart from emptiness. Java clearly distinguishes between these cases. An empty string means the absence of characters, while a string with a space contains a specific space character.

A control question. Are these the same strings or not?

```text
"hexlet"
" hexlet"
```

## Terminology. String or line?

In programming there is a terminological trap.

- A string is a data type, that same set of characters in quotes, for example `"hello"`
- A line is a line of text in a file or in code

For example, the code below has a line but no string.

```java
System.out.println(5);
```

To avoid confusion, in this course we will stick to the following wording.

- String, when we talk about the data type
- Line, when we talk about lines of code

## Only double quotes

In some languages, strings can be written in both single and double quotes. In Java, a string is always enclosed in double quotes `"`.

```java
System.out.println("Hello");
```

Single quotes also appear in Java, but that's a completely different story. A notation like `'A'` denotes a single character, not a string. So when it comes to text, we use only double quotes.

## The problem with quotes inside a string

Imagine you want to print the phrase _Dragon's mother_. It contains an apostrophe (_'s_), which matches the single quote character. Since the string is bounded by double quotes, the apostrophe inside it doesn't cause any trouble.

```java
System.out.println("Dragon's mother");
// => Dragon's mother
```

Java understands that a single quote inside a string is an ordinary character. A string starts and ends with double quotes, and everything between them is considered its content.

The difficulties begin when you need the double quotes themselves inside the string. Imagine we want to print the following text:

```text
Dragon's mother said "No"
```

If you insert double quotes directly inside the string, the program won't compile.

```java
// Ends with a syntax error
System.out.println("Dragon's mother said "No"");
```

From Java's point of view, this results in a strange construction of three parts.

- The string `"Dragon's mother said "`
- The word `No`, which is not in quotes and therefore is not considered a string
- The empty string `""`

Java will decide that the first string ends before the word _No_, and then comes incomprehensible code. This is what causes the error.

## The escape character

To place a double quote inside a string, you escape it with a backslash `\`. It tells the compiler that the character following it is part of the string, not the string's boundary.

```java
System.out.println("Dragon's mother said \"No\"");
// => Dragon's mother said "No"
```

Here we escape the double quotes inside a string enclosed in double quotes. Java treats `\"` as a single quote character, not as two separate characters. Such notations are called escape sequences.

To print the backslash itself, you also escape it with a second slash.

```java
System.out.println("\\");
// => \
```
