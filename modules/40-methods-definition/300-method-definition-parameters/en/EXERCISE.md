
Implement the static method `App.truncate()`, which cuts the passed string down to the specified number of characters, adds an ellipsis at the end and returns the resulting string. Similar logic is often used on sites to display a long text in a shortened form. The method accepts two parameters:

1. The string (`String`) that needs to be cut
2. The number (`int`) of characters that need to be left

An example of how the method you write should work:

```java
// We pass the text directly
// We cut the text, leaving 2 characters
App.truncate("hexlet", 2); // he...

// Through a variable
var text = "it works!"
// We cut the text, leaving 4 characters
App.truncate(text, 4); // it w...
```

This method can be implemented in various ways; we will suggest just one of them. To solve it this way you will need to take a substring of the string passed as the first parameter to the `truncate()` method. Use the [substring()](https://ru.hexlet.io/qna/java/questions/kak-izvlech-podstroku-iz-stroki-v-java?utm_source=code-basics&utm_medium=referral&utm_campaign=qna&utm_content=lesson) method for this. Think, based on the task, from which index and up to which one you have to extract the substring.

  ```java
  var text = "welcome";
  // Parameters can be passed to a method through variables
  var index = 3;
  text.substring(0, index); // wel
  ```

From the point of view of the checking system it does not matter in which way the `truncate()` method is implemented inside — the main thing is that it does the task at hand
