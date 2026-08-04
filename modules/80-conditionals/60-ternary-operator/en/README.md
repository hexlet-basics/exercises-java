Look at the definition of a method that returns the absolute value of the number passed to it:

```java
// If it is greater than zero, we give the number itself. If it is less, we remove the sign
public static int abs(int number) {
  if (number >= 0) {
    return number;
  }

  return -number;
}

App.abs(10);  // 10
App.abs(-10); // 10
```

Java has a construct that is analogous in its action to `if-else`, but at the same time is an expression. It is called the **ternary operator**.

The ternary operator is the only one of its kind that requires three operands. It helps to write less code for simple conditional expressions. Our example above, with the ternary operator, is reduced to one line:

```java
public static int abs(int number) {
  return number >= 0 ? number : -number;
}
```

The general template looks like this:

```java
<predicate> ? <expression on true> : <expression on false>
```

First a logical expression is written, and then two variants of behavior:

1. If the condition is true, the variant before the colon is evaluated
2. If the condition is false, the variant after the colon is evaluated

Let's rewrite the method that determines the type of a sentence with the ternary operator.

Before:

```java
public static String getTypeOfSentence(String sentence) {
    if (sentence.endsWith("?")) {
        return "question";
    }

    return "general";
}
```

After:

```java
public static String getTypeOfSentence(String sentence) {
    return sentence.endsWith("?") ? "question" : "general";
}

App.getTypeOfSentence("Hodor");  // "general"
App.getTypeOfSentence("Hodor?"); // "question"
```

A ternary operator can be nested inside another ternary operator. But that is considered bad practice — such code is hard to read.
