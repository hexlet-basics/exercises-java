Let's recall how concatenation works. The needed strings and variables holding strings are joined with the `+` sign.

```java
var firstName = "Joffrey";
var greeting = "Hello";

System.out.println(greeting + ", " + firstName + "!");
// => Hello, Joffrey!
```

In complex expressions, it's hard to immediately tell from such code what text will come out. Spaces, commas, and quotes start to get in the way of comprehension. Even this example takes a little effort to read the resulting string.

That's why many languages have a separate way to build a string from a template and values. The template sets the shape of the future string, and the needed data is substituted in place of the markers. In Java, the `String.format()` method is called for this.

```java
var firstName = "Joffrey";
var greeting = "Hello";

System.out.println(String.format("%s, %s!", greeting, firstName));
// => Hello, Joffrey!
```

The first argument of `String.format()` is the template. Inside the template there are `%s` markers; the remaining arguments are substituted in their places in order. The first `%s` is replaced with `greeting`, the second with `firstName`. The `%s` marker means the value is substituted as a string.

```text
String.format("%s, %s!", greeting, firstName)
               └┬┘  └┬┘
            "Hello"  "Joffrey"  →  "Hello, Joffrey!"
```

In the template version, the text reads as a whole. Spaces, commas, and the exclamation mark are visible right away, whereas in a chain of `+` they drown among the quotes.

## The formatted method

The same action has a second form of notation. The `formatted()` method is called directly on the template string through a dot, and the values are passed in parentheses.

```java
var firstName = "Joffrey";
var greeting = "Hello";

System.out.println("%s, %s!".formatted(greeting, firstName));
// => Hello, Joffrey!
```

Here the template `"%s, %s!"` is to the left of the dot, and `formatted()` substitutes the arguments into it. The result is the same as with `String.format()`. These two ways do the same thing; choose whichever you like.

## An example with a number

The `%s` marker substitutes not only strings. A number can be placed in its spot, and it will turn into a string by itself.

```java
var school = "Hexlet";
var year = 2012;

var about = String.format("%s has been running since %s", school, year);
System.out.println(about); // => Hexlet has been running since 2012
```

The method built a ready string from the template and arguments and returned it. The result was saved into the `about` variable and printed on the screen.

## Why this is convenient

The template looks almost the same as the resulting string. You can see where spaces and punctuation marks will go, you can see where the values will be substituted. It's easier to understand from such code what the output will be. That's why in most tasks, building a string from a template is preferred over a long chain of concatenations.
