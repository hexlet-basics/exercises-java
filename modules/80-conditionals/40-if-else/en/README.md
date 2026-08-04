The `if` construct can check a condition and execute a block of code when it is true. It has a continuation. The `else` branch sets the block that will be executed if the condition in `if` turned out to be false:

```java
if (x > 5) {
    // Will be executed if the condition is true
} else {
    // Will be executed if the condition is false
}
```

Look at the method below. It determines the type of a sentence by its last character. If the sentence ends with a question mark, the method will return `Sentence is question`; otherwise it will return `Sentence is general`:

```java
public static String getTypeOfSentence(String sentence) {
    String sentenceType;

    if (sentence.endsWith("?")) {
        sentenceType = "question";
    } else {
        sentenceType = "general";
    }

    return "Sentence is " + sentenceType;
}

App.getTypeOfSentence("Hodor");  // "Sentence is general"
App.getTypeOfSentence("Hodor?"); // "Sentence is question"
```

We added `else` and a new block. It will be executed if the condition in `if` turns out to be false. The word `else` translates as "otherwise".

```text
      ┌───────────┐
      │ condition │
      └─────┬─────┘
  true │           │ false
      ↓           ↓
┌──────────┐ ┌──────────┐
│ if body  │ │ else body│
└──────────┘ └──────────┘
```

Other `if` conditions can be nested inside the `else` block:

```java
int number = 10;

if (number > 10) {
    System.out.println("Number is greater than 10");
} else {
    if (number == 10) {
        System.out.println("Number is exactly 10");
    } else {
        System.out.println("Number is less than 10");
    }
}
```

## Two ways of arranging if-else

The `if-else` construct can be written in two ways. With the help of negation the order of the blocks changes:

```java
public static String getTypeOfSentence(String sentence) {
    String sentenceType;

    if (!sentence.endsWith("?")) {
        sentenceType = "general";
    } else {
        sentenceType = "question";
    }

    return "Sentence is " + sentenceType;
}
```

To make the construct more convenient to arrange, choose the check without negations and adjust the contents of the blocks to it.

## When else is not needed

If the `if` branch contains a `return`, then `else` can be omitted. After `return` the method ends, and the next line will be executed only when the condition in `if` turned out to be false:

```java
public static String getTypeOfSentence(String sentence) {
    if (sentence.endsWith("?")) {
        return "question";
    }

    // We get here only if the condition above is false
    return "general";
}
```

Such a style removes unnecessary nesting. The simpler a method looks, the easier it is to read its logic.
