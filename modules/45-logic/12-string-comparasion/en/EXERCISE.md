
Implement the method `isPalindrome()`, which determines whether a word is a palindrome or not. A palindrome is a word that reads the same in both directions.

```java
App.isPalindrome("level"); // true
App.isPalindrome("wow"); // true
App.isPalindrome("hexlet"); // false

// Words can be passed to the method in any case
App.isPalindrome("Wow"); // true
```

To determine a palindrome, you need to reverse the string and compare it with the original one. Use the `StringUtils.reverse()` method for this

```java
StringUtils.reverse("mama"); // "amam"
```
