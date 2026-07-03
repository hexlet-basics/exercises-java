Programs work with different information. This can be text, numbers, dates, boolean values. Inside high-level programming languages, every value belongs to some type. For example, strings belong to the type *String*, and integers belong to the type *int*.

Why are types needed? They protect the program from hard-to-catch errors. A type defines two things.

* Allowed values. For example, numbers in Java are divided into two groups. Integers belong to the type *int*, and rational (fractional) numbers to the type *double*. This division is related to the specifics of how the hardware works.
* A set of allowed operations. For example, the multiplication operation makes sense for integers. But it does not make sense for strings. Multiplying the word "mother" by the word "notepad" is nonsense.

A programming language recognizes types. That is why Java will not allow multiplying a string by a string, but will allow multiplying an integer by another integer. The presence of types and such restrictions protects programs from accidental errors:

```text
"one" * "two"
Error:
bad operand types for binary operator '*'
  first type:  java.lang.String
  second type: java.lang.String
```

## Numbers and strings belong to different types

How does Java understand what type of data it is dealing with? By the way the value is written. A number is written without quotes, while strings are always enclosed in double quotes. For example, the value `"234"` is considered a string, even though digits are written inside it:

```java
System.out.println(5);     // => 5
System.out.println("234"); // => 234
```

On the screen the result looks similar, but inside the program these are different values. The number `5` belongs to the type *int*, and `"234"` to the type *String*. Java will not let you add a string and a number directly without an explicit indication of how to convert the data.

## Primitive and reference types

Some types are built into the language. They are called primitive. Besides integers *int* and rational numbers *double*, they include the boolean type *boolean* with the values `true` and `false`, as well as the character type *char*:

```java
int n = 5;           // integer
double x = 1.5;      // rational number
boolean flag = true; // boolean value
char c = 'A';        // one character
```

Pay attention to the type *char*. A character is written in single quotes, for example `'A'`. But a string of one character is enclosed in double quotes, for example `"A"`. These are different values of different types.

The type *String* belongs to reference types and describes a set of characters, that is, text. At the same time, strings are used on par with primitive types.

There are many data types in Java, plus you can create your own. Gradually we will get to know all the necessary ones and learn to use them correctly.
