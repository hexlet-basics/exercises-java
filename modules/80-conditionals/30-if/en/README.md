Logical expressions can check different conditions. But on their own they only return `true` or `false`. So that the program performs different actions depending on the result, Java has the `if` construct.

```java
if (5 > 3) {
    System.out.println("Yes, it is true");
}
```

Here the string `"Yes, it is true"` will be printed, because the condition `5 > 3` is true.

```text
┌───────────┐
│ condition │
└─────┬─────┘
  true │
      ↓
┌───────────┐
│ if body   │
└───────────┘
```

After the word `if`, a logical expression is written in parentheses. Then a block of code goes in curly braces. This block will be executed only if the condition is true. If it is false, the block is skipped, and the method continues its work from the next line.

## Blocks of code

All the instructions inside the curly braces form one block. They are executed together when the condition is true.

```java
if (10 == 10) {
    System.out.println("First");
    System.out.println("Second");
}

System.out.println("Goodbye!");
```

Here `"First"` and `"Second"` will be printed, because the condition was met. And `"Goodbye!"` will be printed in any case, because that line is already outside the block. The principle is the same as in the definition of methods.

## Using if inside a method

Let's write a method that determines the type of the sentence passed to it. If the sentence ends with a question mark, the method will return `"question"`; otherwise it will return `"general"`:

```java
public static String getTypeOfSentence(String sentence) {
    if (sentence.endsWith("?")) {
        return "question";
    }

    return "general";
}

App.getTypeOfSentence("Hodor");  // "general"
App.getTypeOfSentence("Hodor?"); // "question"
```

Here two `return` statements work at once. If the condition inside `if` is met, `return "question"` fires and the method ends. If the condition is false, the block is skipped and control passes to the line with `return "general"`.

The method ends up having several exit points. This is a frequent practice. Depending on the condition, the method finishes in different ways.

The `getTypeOfSentence` method uses `if`, but it returns strings, so it is not considered a predicate. As a predicate, let's look at a method that checks whether there is enough money for a purchase:

```java
public static boolean hasEnoughMoney(int balance, int price) {
    if (balance >= price) {
        return true;
    }

    return false;
}

App.hasEnoughMoney(100, 50); // true
App.hasEnoughMoney(30, 50);  // false
```

## if and logical expressions

We wrote the `hasEnoughMoney` method with `if`. But in this form it could do without it, because the result of the comparison is already a logical expression in itself:

```java
public static boolean hasEnoughMoney(int balance, int price) {
    return balance >= price;
}
```

In simple cases it is better to return such an expression right away. `if` is needed where additional actions besides returning the result are performed inside the block. The more complex programs become, the more often such situations occur.
