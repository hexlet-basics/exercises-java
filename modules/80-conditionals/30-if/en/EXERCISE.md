
Implement the method `getSentenceTone()`, which accepts a string and determines the tone of the sentence. If all the characters are in upper case, then it is a scream — `scream`. Otherwise it is a normal sentence — `normal`.

Examples of calls:

```java
App.getSentenceTone("Hello"); // "normal"
App.getSentenceTone("WOW");  // "scream"
```

The algorithm:

1. Generate an upper-case string based on the argument string with the help of `toUpperCase()`.
2. Compare it with the original string:
    * If the strings are equal, then the argument string is in upper case
    * Otherwise the argument string is not in upper case
