
Implement the method `convertString()`, which accepts a string and, if the first letter is not capital, returns the reversed variant of the original string. If the first letter is capital, then the string is returned unchanged. If an empty string is passed in, the method must return an empty string.

```java
App.convertString("Hello"); // "Hello"
App.convertString("hello"); // "olleh"

// Do not forget to take the empty string into account!
App.convertString(""); // ""
```

* `StringUtils.reverse()` – reversing a string
* `Character.isUpperCase()` – checking a character for upper case

Try to write two variants of the method: with an ordinary if-else, and with the ternary operator.
