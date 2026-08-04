Implement the method `compress()`, which compresses a string with the RLE method (Run-Length Encoding).

The algorithm is as follows: if a character repeats several times in a row, it is replaced with the character itself and the number of repetitions. Single characters are written without a number.

```java
App.compress("aaabcccc"); // => "a3bc4"
App.compress("abcd");      // => "abcd"
App.compress("aabbaa");    // => "a2b2a2"
App.compress("");          // => ""
```

Hints:

- go through the string and count how many identical characters go in a row;
- as soon as the character changes, append the previous character and its counter (if it is greater than one), and reset the counter;
- do not forget to process the last group of characters after the loop finishes;
- if something goes wrong, add debug printing of the values of `i`, the current character and the counter — this will help to see where the logic breaks.
