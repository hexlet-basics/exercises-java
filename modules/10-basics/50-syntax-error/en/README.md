In human languages grammar matters, but text with errors can usually still be understood and read. In programming, everything is strict. The slightest violation, and the program won't run.

An example is a forgotten `;`, incorrectly placed parentheses, and other details. Such errors are called **syntax errors**, because they break the rules of the language's syntax.

## What is a syntax error?

A syntax error is a violation of the grammatical rules for writing code in a specific programming language. Such errors occur when code is written with a deviation from the expected format: an unclosed string, a missing parenthesis or semicolon, a wrong order of characters, and so on.

```text
Code with an error         Compiler                Result
┌──────────────────┐      ┌─────────────┐      ┌──────────────────┐
│ println("Hi"     │  ──> │   javac     │  ──> │ error: ')' or    │
└──────────────────┘      └─────────────┘      │ ';' expected     │
                                               └──────────────────┘
```

Unlike natural languages, where text with errors can be understood from context, in programming even the slightest deviation makes the code non-functional.

If a Java program is written syntactically incorrectly, the compiler prints on the screen:

- An error message
- An indication of the file
- The line in the file where, in its opinion, the error occurred

Below is an example of code with a syntax error:

```java
System.out.println("alala
```

If you run the code above, we'll see the following message:

```text
|  Error:
|  unclosed string literal
|  System.out.println("alala
```

## Why are such errors considered simple?

Syntax errors:

- are easy to notice: the code is often highlighted in the editor;
- are easy to fix: it's enough to restore the missing character (`"`, `)`, `;`) or fix the structure.

But there's a fly in the ointment. The compiler doesn't always point exactly to the place where the error was made. Sometimes the problem is a few lines higher. For example, a parenthesis that's opened but not closed on one line can "break" all the following code.

## What to do with a syntax error?

- Read the error message. It almost always contains useful information — the type of error and the line where the compiler "stumbled".
- Check the line indicated in the message, and the line before it: sometimes the error is "hidden" a bit earlier (a forgotten `;` on the previous line).
- Use an [editor with syntax highlighting](https://code.visualstudio.com/): it will help you immediately spot unclosed quotes, parentheses, or missing characters.
