Methods in any programming language have fundamental properties. These properties help you understand how a method will behave in different situations, how to test it, and where to apply it. One of these properties is **determinism**.

A **deterministic method** always returns the same result for the same input data. For example, the method that extracts a character from a string by its position can be called deterministic:

```java
"wow".charAt(1); // 'o'
"wow".charAt(1); // 'o'

"hexlet".charAt(0); // 'h'
"hexlet".charAt(0); // 'h'
```

No matter how many times we call `charAt()` with the argument `1` for the string `"wow"`, it always returns `'o'`. The result depends only on the input data and does not change from call to call.

## Non-deterministic methods

The opposite type is **non-deterministic methods**. They return different results for the same input data or when there is none (methods without arguments). A good example is the method that returns a random number:

```java
// A method that returns a random number
Math.random(); // 0.09856613113197676
Math.random(); // 0.8839904367241888
```

This method has no arguments, but its result is different every time. How different it is does not matter. Even if just one call in a million gives another result, the method is considered non-deterministic.

```text
Deterministic:                Non-deterministic:
"wow".charAt(1) → always 'o'  Math.random() → 0.42
"wow".charAt(1) → always 'o'  Math.random() → 0.91
"wow".charAt(1) → always 'o'  Math.random() → 0.07
```

## Why this is important

Determinism affects how we work with methods.

- deterministic methods are easy to test and predict;
- they are simpler to optimize and reuse;
- non-deterministic methods are harder to check, because the result changes.

That is why, wherever possible, it is better to aim for a method to stay deterministic.
