Learning a programming language traditionally begins with the "Hello, World!" program, which prints this text on the screen.

```text
Hello, World!
```

In Java, this program looks like this:

```java
class App {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }
}
```

The text _Hello, World!_ appears on the screen thanks to the `System.out.println()` command, where `println()` is short for the English _print line_. It prints the value specified in the parentheses `("Hello, World!")` — in this case, a string. Instead of the example, you can print any other text:

```java
System.out.println("Hexlet — a programming school");
```

The command stays the same; only the content of the parentheses changes.

So that the program understands that the parentheses contain text, it is enclosed in quotes. In Java, a string is always wrapped in **double** quotes `"..."`. You cannot use single quotes `'...'` for a string: they hold a single character (the `char` type), for example `'A'`. If you wrap a string in single quotes, the compiler will point out a syntax error:

```bash
# For example, like this
App.java:5: error: unclosed character literal
System.out.println('Hello, World!');
```

The command itself is located inside several constructs that are needed even for the simplest Java programs. In this case, these are the `App` class and the `main()` method.

For now, we won't dwell on them, because understanding them requires a bit of programming knowledge. So in many exercises they are given "as is", meaning you won't have to write them yourself. When the time comes, we'll go through them.

## The meaning of characters

Code consists of commands, and each of them must be written in a specific form. Besides letters, quotes `"`, parentheses `()`, curly braces `{}`, and the semicolon `;` matter in code. A missing or mixed-up character will cause the program to fail to compile. Try to figure out what mistake is made in each of the lines:

```java
System.out.println("I am the King");
System.out.println("I am the King";
System.out.println(I am the King");
System.ouprintln("I am the King");
System.out.println("I am the King")
```

Even a small difference — an extra letter, a lost parenthesis, or a forgotten `;` — can prevent the program from working. This also applies to case, that is, the difference between uppercase and lowercase letters. While in ordinary text `Hello` and `hello` look the same, for Java they are different words. Java treats `println`, `Println`, and `PRINTLN` as different names, and only the first option will work.

## Where to practice

Theory sinks in better when you run code alongside it and see the result. As you move through the lessons, you'll constantly come across code examples and descriptions of how they work. To understand them better and be able to use the language, you need to practice and experiment constantly — whenever possible, run all the examples from the theory.

The easiest way to get started with Java is on the [onecompiler](https://onecompiler.com/jshell) website, which lets you run code line by line right in the browser using JShell. Try going there right now and typing this code:

```text
System.out.println(85 * 3);
```

How does this work technically? Unlike languages that are executed line by line by an interpreter, Java code first passes through a compiler and is then executed by the Java Virtual Machine (JVM), which prints the result on the screen:

```text
Code                     Compiler + JVM            Screen
┌──────────────────┐     ┌─────────────────┐     ┌──────────────┐
│ System.out       │ ──→ │  javac + JVM    │ ──→ │ Hello, World!│
│   .println(…)    │     │                 │     │              │
└──────────────────┘     └─────────────────┘     └──────────────┘
```
