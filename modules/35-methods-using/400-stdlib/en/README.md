Java, like any other language, comes with a set of useful methods. All together they make up the so-called **standard library**. It usually includes thousands of methods that are impossible to memorize — and there is no need to. It is assumed that any programmer knows where to look for their documentation and has a rough idea of what they want to achieve. And after that, it is a matter of technique. If you take the internet away from programmers, most of them will not be able to program anything.

For beginners, this information often looks like: "Go somewhere, I don't know where, bring back something, I don't know what". That is, it is unclear how to learn about these methods when you know nothing at all. Strangely enough, there is no way to learn once and for all everything you need to know. Every developer, in the process of their professional growth, gets acquainted with more and more interesting methods that solve their problems more elegantly, and thus expands their arsenal.

Here are some tips on how to learn about new methods:

- Always clearly track which data type you are currently working with. Almost always you will find the needed method in the corresponding section of the documentation — for example, to work with strings you need to study string methods
- Periodically open the section with standard methods for the topic you are studying and simply skim through them, studying signatures and ways of use
- Read other people's code more often, especially the code of the libraries you use. It is all available on GitHub

Suppose you need to remove spaces from the ends of a string. Start with the [documentation for the `String` class](https://docs.oracle.com/en/java/javase/26/docs/api/java.base/java/lang/String.html). The Method Summary section lists methods with short descriptions. It describes `trim()` as returning a string without leading or trailing spaces. Follow the `trim()` link to read the detailed contract. Calling `trim()` on `"  Java  "` returns `"Java"`. Numeric operations, such as the absolute value of a number, appear in the [documentation for the `Math` class](https://docs.oracle.com/en/java/javase/26/docs/api/java.base/java/lang/Math.html).

## How to read a method's documentation

Documentation describes what data a method accepts and what result it returns. The reference for the Java standard library is organized by classes, and each class has its own page. A class page has two sections you need to write a call. The Method Summary section lists the class's methods in a table, and the Method Details section describes each method in detail.

Let's look at the `indexOf()` method, which searches for a substring and returns its position. For each method, the Method Summary table shows the result type, the name with parameters, and a short description. The table has several rows for `indexOf()`, including these two.

```text
int    indexOf(String str)
int    indexOf(String str, int fromIndex)
```

Clicking the method name opens its description in the Method Details section. Here is the description of the second version, with part of the text omitted.

```text
public int indexOf(String str, int fromIndex)

Returns the index within this string of the first occurrence of the
specified substring, starting at the specified index.
...

Parameters:
    str - the substring to search for.
    fromIndex - the index from which to start the search.
Returns:
    the index of the first occurrence of the specified substring,
    starting at the specified index, or -1 if there is no such occurrence.
```

Read the description from top to bottom.

1. The first line is the method declaration with the result type, name, and parameters.
2. The first sentence briefly says what the method does.
3. Details follow. They may include formulas and notes, which you can skip on a first read.
4. The Parameters section explains each parameter by its name from the declaration. Here `fromIndex` is the index where the search starts.
5. The Returns section describes the result, including special cases. Here the method returns `-1` if the substring is not found.

The table matches the parts of the declaration to the arguments of the call `"Java".indexOf("a", 2)`.

| Part of the declaration | What it means | In the call `"Java".indexOf("a", 2)` |
| --- | --- | --- |
| `public` | The method is available from any code | We call the method from our program |
| `int` | Result type, an integer | We get the position of the character |
| `indexOf` | Method name | We call `indexOf()` on the string `"Java"` |
| `String str` | A `String` parameter, the substring to search for | We pass `"a"` |
| `int fromIndex` | An `int` parameter, the position where the search starts | We pass `2` |

The declaration shows which arguments to pass, and the description explains what you get. Let's check it with calls.

```java
System.out.println("Java".indexOf("a")); // => 1
System.out.println("Java".indexOf("a", 2)); // => 3
System.out.println("Java".indexOf("a", 4)); // => -1
```

The first call finds the first `a` at position `1`. The second starts searching at position `2` and finds the second `a` at position `3`. The third starts at position `4`, where the string has already ended, so it returns `-1`, as the Returns section promises.

## Overloads instead of optional parameters

In Java, method parameters have no default values. If an argument can be omitted, the class declares several methods with the same name and different parameters. These methods are called **overloads**. That's why `indexOf()` has several rows in Method Summary. The `indexOf(String str)` version searches from the beginning of the string, and the `indexOf(String str, int fromIndex)` version searches from the given position.

Java picks the overload by the arguments of the call. The call `"Java".indexOf("a")` with one string goes to the first version, and the call `"Java".indexOf("a", 2)` with a string and a number goes to the second. To understand how the versions differ, read the description of each one.

## Notation in the reference

Method declarations contain auxiliary words and signs. They help you read the declaration and are not copied into the call.

| Notation in the reference | How to read it |
| --- | --- |
| `int indexOf(String str)` | The type comes before the name. `int` to the left of the method is the result type, and `String` before `str` is the parameter type |
| `static int max(int a, int b)` | The word `static` means the method is called through the class name, for example `Math.max(3, 7)` |
| `static String join(CharSequence delimiter, CharSequence... elements)` | The ellipsis after the type means you can pass any number of arguments in that place |

For example, the declaration `static int max(int a, int b)` from the `Math` class reference describes a method with two parameters. The call `Math.max(3, 7)` passes the numbers `3` and `7` and returns `7`. Neither `static`, nor the types, nor the names `a` and `b` go into the call. The `join()` declaration contains the `CharSequence` type. Strings fit there too, so the call `String.join(":", "8", "30")` works the same way as in the lesson about a variable number of parameters.

If your browser translates the page, check method names, parameter names, and types against the original. Code uses the original names from the documentation.

## Working with an unfamiliar method

Reading a reference starts with a task. For example, to find the second `a` in a word, we open the `String` class page, find the `indexOf()` overloads in Method Summary, read what `fromIndex` does in Method Details, and try the call `"Java".indexOf("a", 2)` in [JShell](https://onecompiler.com/jshell). If the result matches the description, the call can go into the program.
