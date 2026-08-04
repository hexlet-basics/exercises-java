
Write code that takes data from the `name` variable and performs capitalization. In programming, this is the name for the operation that makes the first letter of a word uppercase and converts all the others to lowercase. For example: *heXlet => Hexlet*. The program should print the result to the screen.

To extract parts of a word, use the [substring()](https://ru.hexlet.io/qna/java/questions/kak-izvlech-podstroku-iz-stroki-v-java?utm_source=code-basics&utm_medium=referral&utm_campaign=qna&utm_content=lesson) method:

```java
// param 1 – the starting index, param 2 – the ending index (exclusive)
"hexlet".substring(0, 1); // "h"
// By default, up to the end of the string
"hexlet".substring(1); // "exlet"
```
