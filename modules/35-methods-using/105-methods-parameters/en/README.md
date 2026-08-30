
The `length()` method does not require any clarifications. It always works unambiguously and extracts the full length of the string.

But this is not always the case. For example, if we want to extract the first character from a string, we need to explicitly indicate that the character is the first one. To do this, we can pass parameters into method calls:

```java
var searchEngine = "google";
// Returns the first character (char type)
searchEngine.charAt(0); // 'g'
```

Why is the character the first one, but 0 is specified? In programming, counting starts from zero. That is why the first character is at position zero — "index 0".

Accordingly, the last character has an index equal to the length of the string minus 1:

```java
// google length => 6
searchEngine.charAt(5); // 'e'
```

## Several parameters

There can be more than one parameter. For example, the `replace()` method works with two, where the first is what to replace, and the second is what to replace it with:

```java
searchEngine.replace("go", "mo"); // "moogle"
```

## Default values

Parameters can contain a default value where that value is used most often.

This capability was added to languages to relieve the programmer of routine work. A simple example is a method that extracts a substring from a string, that is, a part of the string.

This method takes as input:

- As the first parameter, the index from which to start extracting the substring
- As the second parameter, the index up to which to extract characters

By default, the string is taken up to the end:

```java
"hexlet".substring(1);    // "exlet"
"hexlet".substring(1, 2); // "e"
"hexlet".substring(1, 3); // "ex"
"hexlet".substring(3, 6); // "let"
```
