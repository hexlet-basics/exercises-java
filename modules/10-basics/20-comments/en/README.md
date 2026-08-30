Almost all programming languages let you leave comments in the code. Comments are not used by the code and are meant solely for people: so that a programmer can leave notes for themselves and for other programmers, explain how the code works, mark errors, or remind themselves of what still needs to be done.

```java
// Delete the line below after implementing the registration task
System.out.println(10);
```

The compiler completely ignores comments — they don't affect how the program runs:

```text
// comment                           ──→  [ skipped by the compiler ]
System.out.println("hello");         ──→  [ executed → hello ]
// another one                       ──→  [ skipped by the compiler ]
```

There are three kinds of comments in Java:

**Single-line comments** start with `//`. Any text can follow these two characters; the entire line will not be analyzed or executed.

A comment can take up the whole line:

```java
// For Winterfell!
```

A comment can also be on the same line after some code:

```java
System.out.println("I am the King"); // => For Lannisters!
```

**Multi-line comments** start with `/*` and end with `*/`. It is customary to start each line with the `*` character, although technically this is not required:

```java
/*
* The night is dark and
* full of terrors.
*/
System.out.println("I am the King"); // => I am the King
```

**Documentation comments** start with `/**` and end with `*/`. For these, it is required to start each line with the `*` character.

Documentation comments are a subtype of multi-line comments. In addition, they serve an extra function — they can be collected using the special javadoc tool and produced as documentation for your code. We'll talk about them later, when we cover classes and methods.

## Service comments

While working, you'll come across code like this in our editor:

```java
// BEGIN

// END
```

_BEGIN_ and _END_ here are ordinary single-line comments that don't affect how the program runs at all. They show where to write the code for the exercise.

```java
// BEGIN
<your solution here>
// END
```

When you see _BEGIN_ and _END_, write your code between them and leave the rest unchanged.
