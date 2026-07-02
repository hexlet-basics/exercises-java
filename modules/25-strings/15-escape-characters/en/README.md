We want to show a dialogue between the Mother of Dragons and her child:

```text
- Are you hungry?
- Aaaarrrgh!
```

If you print a string with this text to the screen:

```java
System.out.println("- Are you hungry?- Aaaarrrgh!");
```

you get this:

```text
- Are you hungry?- Aaaarrrgh!
```

Not what we wanted. The lines are placed one after another, not one below the other. We need to somehow tell the interpreter to "press Enter" — to make a line break after the question mark. This can be done using the line feed character: `\n`:

```java
System.out.println("- Are you hungry?\n- Aaaarrrgh!");
```

result:

```text
- Are you hungry?
- Aaaarrrgh!
```

`\n` is a special character. In the literature it is often denoted as *LF* (Line Feed). You might think this is a typo, since here we see two characters `\` and `n`, but that's not the case. From the computer's point of view, this is a single invisible line feed character:

```java
// We haven't studied this, but you should know the truth
// Below is code that returns the length of a string
"a".length();    // 1
"\n".length();   // 1 !!!
"\n\n".length(); // 2 !!!
```

Why is it done this way? `\n` is just a way to write the line feed character, but the line feed itself, by its meaning, is a single character, though an invisible one.

That is exactly why such a task arose. It had to be represented somehow on the keyboard. And since the number of keys on the keyboard is limited and reserved for the most important ones, all special characters are implemented as such notations.

The line feed character is not something specific to programming. Everyone who has ever typed on a computer has used a line feed by pressing Enter.

Many editors have an option that lets you turn on the display of invisible characters. This option helps you understand where they are, although it is only a schematic display, since these invisible characters have no graphical representation:

```text
- Hello!¶
- Oh, hi!¶
- How are you?
```

A device that outputs the corresponding text takes this character into account. For example, when a printer encounters LF, it pulls the paper up one line, and a text editor moves all subsequent text below, also by one line.

`\n` is an example of an **escape sequence**. They are also called control constructs. Although there are dozens of such characters, in programming only a few are commonly encountered.

Besides the line feed, such characters include:

* Tabulation — the break you get by pressing the Tab key
* Carriage return (only in Windows)

Programmers often need to use the line feed `\n` to format text correctly:

```java
System.out.println("Gregor Clegane\nDunsen\nPolliver\nChiswyck");
```

The screen will display:

```text
Gregor Clegane
Dunsen
Polliver
Chiswyck
```

Pay attention to the following points:

1. It does not matter what comes before or after `\n`: a character or an empty string. The line feed will be detected and performed in any case

2. Remember that a string can contain one character or no characters at all. And a string can also contain only `\n`. Analyze the following example:

    ```java
    System.out.println("\n");
    System.out.println("Dunsen");
    ```

    Here we first print the "line feed" string, and then print an ordinary string. The program will display:

    <!-- NOTE: two blank characters here so the example works correctly. -->
    ```text
    ㅤ
    ㅤ
    Dunsen
    ```

    Why did two empty lines appear before the string *Dunsen*, and not one? The point is that `System.out.println()` automatically adds a line feed character to the end when it outputs a value.

    Thus, we specified one line feed explicitly, passing this escape sequence character as an argument to the function, and the second line feed was added by the function itself automatically.

    Another code example:

    ```java
    System.out.println("Polliver");
    System.out.println("Gregor Clegane");
    System.out.println();
    System.out.println("Chiswyck\n");
    System.out.println("Dunsen");
    ```

    The output will be like this:

    ```text
    Polliver
    Gregor Clegane

    Chiswyck

    Dunsen
    ```

    You now have enough knowledge to figure out on your own why the output was formed exactly this way.

3. If we need to display `\n` exactly as text (two separate printable characters), we can use the escaping method we already know, adding one more `\` at the beginning. That is, the sequence `\\n` will be displayed as the characters `\` and `n` following one after another:

    ```java
    System.out.println("Joffrey loves using \\n");
    ```

    the screen will display:

    ```text
    Joffrey loves using \n
    ```

A small but important note about Windows. In Windows, `\r\n` is used for line breaks by default — this is due to historical reasons. Such a combination works well only in Windows, but creates problems when transferring to other systems: for example, when a development team has both Windows and Linux users.

The point is that the sequence `\r\n` is interpreted differently depending on the chosen encoding. That is why in the developer community it is customary to always use `\n` without `\r`, since LF is always interpreted the same way and works perfectly in any system. Don't forget to configure your editor to use `\n`.
