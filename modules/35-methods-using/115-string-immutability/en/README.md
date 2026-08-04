Let's think about what the following code will print to the screen:

```java
var company = "hexlet";
company.toUpperCase(); // to uppercase
System.out.println(company); // => ?
```

It seems that the answer will be `"HEXLET"`, but that is not so. This program will print `"hexlet"`. Why?

The thing is that strings in Java are **immutable** (or **unchangeable**). After creation, their content cannot be changed. There are no methods capable of changing the string itself. Any string method only returns a new string, while the original stays the same.

## String methods do not change the original

When we call a method on a string, it seems that we are changing it. For example, converting it to uppercase. In reality, the `toUpperCase()` method returns a new string in uppercase, while the original string does not change.

```text
company = "hexlet"

company.toUpperCase()  →  "HEXLET"  (a new string)
company                →  "hexlet"  (has not changed)
```

To avoid losing the result, let's save it in a variable:

```java
var company = "hexlet";
var upper = company.toUpperCase();
System.out.println(upper); // => HEXLET
```

If you do not save the result of a method, it will simply be lost. Other methods work the same way:

```java
var text = "   hi   ";
var cleaned = text.trim();
System.out.println(cleaned); // => "hi", the result without spaces
System.out.println(text);    // => "   hi   ", the string has not changed
```

The `trim()` method returned a new string without spaces at the edges, but `text` itself remained the same.

The main reason for this behavior is performance. Strings and other primitive data types cannot be changed in almost any modern language. Immutability allows Java to reuse identical strings in memory and save resources. It also simplifies multithreaded code, where the same data is read by several threads at once.

The second reason is related to the clarity of the code. When we do not change data but create new data based on the old, the code is easier to analyze and modify. Especially if the data goes through many transformations, which you will still encounter. It is impossible to accidentally change the value of a string, and this removes an entire class of errors.

## How to change data

But what should you do if the data needs to be changed? For this, it is enough to write the result of the method back into the same variable:

```java
var language = "JAVA";
language = language.toLowerCase();
System.out.println(language); // => java
```

This is appropriate when the essence of the data does not change. After `toLowerCase()`, it is the same language, just in lowercase.

On the other hand, in such a situation you can create a new variable with a different name:

```java
var language = "JAVA";
var processedLanguage = language.toLowerCase();
System.out.println(processedLanguage); // => java
```

This approach is often preferable for reasons of readability. Variables that constantly change are harder to analyze. If the result of a method represents a different entity, it is worth giving it a separate name. In the end, it all depends on the task. With experience, an understanding of which approach is better will come.
