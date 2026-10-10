Most methods take a fixed number of arguments: as many parameters as are specified in the declaration, that is how many values you need to pass. But there are methods to which you can pass any number of arguments — from zero to dozens. Such methods are called **methods with a variable number of parameters** (in English, _variadic_).

A good example is the `String.join()` method. It joins strings with a separator, and the number of strings being joined can be any:

```java
public class App {
    public static void main(String[] args) {
        System.out.println(String.join("-", "2024", "01", "15")); // "2024-01-15"
        System.out.println(String.join(" ", "Hello", "world")); // "Hello world"
        System.out.println(String.join(", ", "a", "b", "c", "d")); // "a, b, c, d"
    }
}
```

All three calls return a string. To see it in the console, pass the result to `System.out.println()`.

The first argument is the separator, and everything that comes after it is the variable number of strings. In the first call there are three of them, in the second — two, in the third — four. The method itself adapts to any number of arguments.

The `String.format()` and `System.out.printf()` methods work the same way — they too can be passed a different number of arguments depending on how many values need to be substituted.

## How it works

When a method is declared, the variable number of parameters is written using three dots after the type:

```java
public static String join(String separator, String... values) {
    return String.join(separator, values);
}
```

Our `join()` method calls `String.join()` with the arguments it receives. The `return` statement passes the resulting string back to the code that called our method. When a method has the return type `String`, printing with `System.out.println()` does not replace returning the string.

The notation `String...` means "zero or more strings". Required parameters (like `separator`) go first, and the variable part is always last.

## Why it's needed

A variable number of parameters makes methods flexible. There is no need to create separate methods `join2()`, `join3()`, `join4()` for each number of strings — one method is enough, which accepts any number of them. This removes duplication and simplifies working with the standard library: a huge number of its methods are designed precisely for a variable number of arguments.
