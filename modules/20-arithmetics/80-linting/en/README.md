Now that we've learned to write simple programs, we can talk a little about how to write them.

Program code should be formatted in a certain way so that it's clear enough and easy to maintain.

Special sets of rules — **standards** — describe various aspects of writing code. Specifically in Java, the most widespread standard is the one from [Sun](https://checkstyle.sourceforge.io/checks.html).

In any programming language there are utilities — the so-called **linters**. They check code for compliance with standards. In Java this is [checkstyle](https://github.com/checkstyle/checkstyle). Take a look at the example:

```java
System.out.println( "Hello, World!" ); System.out.println("I'm a developer!") ;
```

The linter will complain about violations in several places at once:

* '(' is followed by whitespace. [ParenPad]
* ')' is preceded with whitespace. [ParenPad]
* ';' is preceded with whitespace. [NoWhitespaceBefore]
* Only one statement per line allowed. [OneStatementPerLine]

Let's analyze these errors:

* The **ParenPad** rule, shown in square brackets, requires no spaces after the opening parenthesis and before the closing one
* The **NoWhitespaceBefore** rule indicates that you shouldn't put an extra space before the semicolon
* Each new statement should be written on a new line. This is indicated by the *OneStatementPerLine* rule

Following these rules doesn't affect the result, but it helps to write code that's clearer and easier to grasp.

Code that follows these rules looks like this:

```java
System.out.println("Hello, World!");
System.out.println("I'm a developer!");
```

Now the linter won't complain. What conclusion do we draw? The linter helps write code that will be easier to read and analyze.

Remember that having a linter doesn't replace analyzing and simplifying code readability yourself. In your future practice on [Hexlet](https://ru.hexlet.io/?utm_source=code-basics&utm_medium=referral&utm_campaign=programs&utm_content=lesson) and in real development, the linter will work and report violations to you.
