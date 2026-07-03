Strings can be joined directly using concatenation. Now let's do the same, but with variables. The syntax stays the same, the program substitutes the values of the variables.

## Joining two strings directly

```java
var what = "Kings" + "road";
System.out.println(what); // => Kingsroad
```

Here two strings are joined into one. This is how concatenation works: the `+` operator adds strings together and creates a new string.

## Joining a string and a variable

If the variable `first` holds the string `"Kings"`, we can join it with another string:

```java
var first = "Kings";
var what = first + "road";
System.out.println(what); // => Kingsroad
```

Java will substitute the value of the variable, perform the operation, and create the resulting string.

## Joining two variables

In exactly the same way, you can combine the values of two variables if both contain strings:

```java
var first = "Kings";
var last = "road";
var what = first + last;
System.out.println(what); // => Kingsroad
```

You can also add spaces:

```java
var first = "Kings";
var last = "road";
var full = first + " " + last;
System.out.println(full); // => Kings road
```

```text
first = "Kings"
last  = "road"

first   +  " "  +  last
└─┬──┘           └─┬─┘
"Kings" + " "  + "road"
└────────┬─────────┘
    "Kings road"
```

## What if a variable contains a number

In Java, the `+` operator can join a string with a number. If at least one operand is a string, the number is automatically turned into a string, and you get a single string:

```java
var age = 42;
System.out.println("Age: " + age); // => Age: 42
```

Java sees the string `"Age: "` on the left, so it converts the number `42` into the string `"42"` and joins them together. The same works with the results of calculations:

```java
var price = 50 * 1.25 * 6.91; // => 431.875
System.out.println("Price in yuans: " + price);
// => Price in yuans: 431.875
```

Here Java first calculates the expression, gets the number `431.875`, then turns it into a string and glues it to the text on the left.

## The order of calculation matters

When numbers and strings meet in the same expression, the result depends on the order of operations. From left to right, `+` first adds two numbers, and only then glues them to the string:

```java
System.out.println("Sum: " + 2 + 3); // => Sum: 23
System.out.println("Sum: " + (2 + 3)); // => Sum: 5
```

In the first line, `"Sum: " + 2` is already turned into the string `"Sum: 2"`, and then `3` is glued to it, resulting in `"Sum: 23"`. In the second line, the parentheses force `2 + 3` to be added first, giving the number `5`, and only then it is joined with the string.
