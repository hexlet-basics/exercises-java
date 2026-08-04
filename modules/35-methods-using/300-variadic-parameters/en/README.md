Most methods take a fixed number of arguments: as many parameters as are specified in the declaration, that is how many values you need to pass. But there are methods to which you can pass any number of arguments — from zero to dozens. Such methods are called **methods with a variable number of parameters** (in English, *variadic*).

A good example is the `String.join()` method. It joins strings with a separator, and the number of strings being joined can be any:

```java
String.join("-", "2024", "01", "15");    // "2024-01-15"
String.join(" ", "Hello", "world");      // "Hello world"
String.join(", ", "a", "b", "c", "d");   // "a, b, c, d"
```

The first argument is the separator, and everything that comes after it is the variable number of strings. In the first call there are three of them, in the second — two, in the third — four. The method itself adapts to any number of arguments.

The `String.format()` and `System.out.printf()` methods work the same way — they too can be passed a different number of arguments depending on how many values need to be substituted.

## How it works

When a method is declared, the variable number of parameters is written using three dots after the type:

```java
// String... values is exactly the variable number of string arguments
public static String join(String separator, String... values) {
    // here is the code that processes values
}
```

The notation `String...` means "zero or more strings". Required parameters (like `separator`) go first, and the variable part is always last. Inside the method, these arguments are available as an ordinary array, so you can iterate over them and do something with them. We will learn to define such methods later, but for now it is important to be able to use them.

## Why it's needed

A variable number of parameters makes methods flexible. There is no need to create separate methods `join2()`, `join3()`, `join4()` for each number of strings — one method is enough, which accepts any number of them. This removes duplication and simplifies working with the standard library: a huge number of its methods are designed precisely for a variable number of arguments.
