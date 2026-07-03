A statement is a command for the computer. Java code is a set of statements, and each of them ends with a `;` character. There can be as many such statements as you like: each one runs after the previous one has finished, and this is how a program of any size and complexity is built from simple elements.

```text
Statement 1: System.out.println("Hello");   →  executed
        ↓
Statement 2: System.out.println("World");   →  executed
        ↓
Statement 3: System.out.println("!");        →  executed
```

Here is an example of code with two statements. These lines tell the computer to print phrases on the screen:

```java
System.out.println("Mother of Dragons"); // First statement
System.out.println("Dracarys!"); // Second statement
```

When this code runs, two sentences are printed on the screen one after another:

```text
Mother of Dragons
Dracarys!
```

## Order matters

Java runs the code strictly in the order in which you wrote it. If you swap the lines:

```java
System.out.println("Dracarys!");
System.out.println("Mother of Dragons");
```

they will swap on the screen too:

```text
Dracarys!
Mother of Dragons
```

## Ending statements

In Java, the `;` character is mandatory — it marks the end of each statement. If you forget it, the compiler will report an error. Thanks to `;`, several statements can even be written on a single line:

```java
System.out.println("Mother of Dragons"); System.out.println("Dracarys!");
```

The result on the screen will be the same, but in practice this approach is considered bad: the code is harder to read. That's why statements are almost always written one per line.

## Why this matters

Right now we're writing very simple programs, but over time they will start to get more complex. One of the most important skills that will help you understand them is the ability to mentally break a program down into independent statements. Only this way can you figure out what's happening in the code. Below is an example to grab your attention; you don't need to understand it yet:

```java
static boolean isPrime(int number) {
    if (number < 2) {
        return false;
    }

    int divider = 2;

    while (divider <= number / 2) {
        if (number % divider == 0) {
            return false;
        }

        divider++;
    }

    return true;
}
```
