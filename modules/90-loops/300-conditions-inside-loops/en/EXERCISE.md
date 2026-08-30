
The method from the theory takes the case of the letters into account. That is, `A` and `a` are different characters from its point of view. Implement a variant of the same method so that the case of the letters does not matter:

```java
App.countChars("HexlEt", 'e'); // 2
App.countChars("HexlEt", 'E'); // 2
```

- `Character.toLowerCase()` – converts a character to lower case
