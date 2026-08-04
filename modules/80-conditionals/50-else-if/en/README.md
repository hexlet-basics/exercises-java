The `getTypeOfSentence` method distinguishes only between question sentences and ordinary ones. Let's add support for exclamatory sentences to it. We will do it first through two separate `if` checks:

```java
public static String getTypeOfSentence(String sentence) {
    String sentenceType = "";

    if (sentence.endsWith("?")) {
        sentenceType = "question";
    }

    if (sentence.endsWith("!")) {
        sentenceType = "exclamation";
    } else {
        sentenceType = "general";
    }

    return "Sentence is " + sentenceType;
}

App.getTypeOfSentence("Who?"); // "Sentence is general"
App.getTypeOfSentence("No");   // "Sentence is general"
App.getTypeOfSentence("No!");  // "Sentence is exclamation"
```

Technically this code works, but it interprets question sentences incorrectly. There is also a problem with the semantics. The presence of an exclamation mark is checked in any case, even when a question mark has already been found. The `else` branch belongs to the second condition, but not to the first. That is why a question sentence gets the type `"general"`.

To line the checks up into a single chain, the `if` construct supports the `else if` branch. Such a variant fits when there are many checks and they exclude each other:

```java
if (/* something */) {

} else if (/* another check */) {

} else if (/* another check */) {

} else {

}
```

Pay attention to two things here:

- The `else` branch may be absent
- The number of `else if` branches can be any

Let's rewrite the method with `else if`:

```java
public static String getTypeOfSentence(String sentence) {
    String sentenceType;

    if (sentence.endsWith("?")) {
        sentenceType = "question";
    } else if (sentence.endsWith("!")) {
        sentenceType = "exclamation";
    } else {
        sentenceType = "general";
    }

    return "Sentence is " + sentenceType;
}

App.getTypeOfSentence("Who?"); // "Sentence is question"
App.getTypeOfSentence("No");   // "Sentence is general"
App.getTypeOfSentence("No!");  // "Sentence is exclamation"
```

Now all the conditions are lined up into a single construct. The `else if` operator means "if the previous condition was not met, but the current one is".

```text
  ┌─────────────────┐
  │ condition 1     │
  └────┬────────┬───┘
  true │        │ false
        ↓        ↓
┌──────────┐  ┌─────────────────┐
│ if body  │  │ condition 2     │
└──────────┘  └────┬────────┬───┘
              true │        │ false
                    ↓        ↓
            ┌───────────┐ ┌──────────┐
            │else if body│ │ else body│
            └───────────┘ └──────────┘
```

The logic of the method is arranged like this:

- If the last character is `?`, then the type is `"question"`
- Otherwise, if the last character is `!`, then the type is `"exclamation"`
- Otherwise the type is `"general"`

In the end only one of the blocks belonging to the whole `if` construct will be executed.
