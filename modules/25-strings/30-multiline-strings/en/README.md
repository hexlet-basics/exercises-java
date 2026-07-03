Sometimes text in a program needs to span several lines. This happens when generating an email, creating a template, formatting an error message, or working with long texts.

We've already seen one way. It's the newline character `\n` inside a regular string in double quotes:

```java
System.out.println("Example text,\nconsisting of\nseveral lines");
```

When printed, this is what you get:

```text
Example text,
consisting of
several lines
```

This way works, but it's inconvenient. Each `\n` has to be inserted by hand, and the longer the text, the harder the code is to read.

## Text blocks

Java has a notation in which text in the code looks the same as when it's printed. This is a text block. It starts and ends with three double quotes `"""`.

The opening `"""` is placed at the end of the line, and the text itself is written on the next line:

```java
System.out.println("""
    Example text,
    consisting of
    several lines""");
```

The output will be the same as the version with `\n`:

```text
Example text,
consisting of
several lines
```

Java adds the line breaks inside the block itself, so you don't need to write `\n`.

## Indentation inside a block

It's convenient to shift the block's text to the right so it doesn't blend with the code. Java looks at the common indentation of all the block's lines and strips it from each line. In the example above, each line has four spaces on the left, and all four are removed from the result. In the output, the lines start from the first character.

The position of the closing `"""` also affects the indentation. If you shift it to the left of the text, some of the spaces on the left will remain in the result. That's why the closing quotes are usually kept at the level of the text or right after the last line.

## Quotes without escaping

Inside a text block, double quotes can be written directly, without a backslash:

```java
System.out.println("""
    Here "double" quotes are shown as is""");
```

Output:

```text
Here "double" quotes are shown as is
```

In a regular string, you would have to escape each quote with `\"`.

## Conclusion

A text block is written between triple double quotes `"""`. The opening `"""` is placed at the end of the line, and the text is written below. Java adds the line breaks itself, and the common indentation on the left is stripped. For the machine, a text block and a string with `\n` mean the same thing, but for a person a block is clearer.
