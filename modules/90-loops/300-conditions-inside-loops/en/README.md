The body of a loop, like the body of a method, is a place where instructions are executed. That means that everything studied earlier works inside it, including conditional constructs. This way the program repeats one action many times, but on every repetition it makes a decision.

The loop goes through the values one after another, and the condition inside the loop decides what to do with the current value. Let's look at a method that counts how many times a letter occurs in a sentence:

```java
App.countChars("Fear cuts deeper than swords.", 'e'); // 4
// If nothing was found, then the result is 0 matches
App.countChars("Sansa", 'y'); // 0
```

First try to answer the questions:

* Is this operation an aggregation?
* What will the check for the occurrence of the character be?

And now let's look at the code:

```java
public static int countChars(String str, char ch) {
    var i = 0;
    var count = 0;
    while (i < str.length()) {
        if (str.charAt(i) == ch) {
            // We count only the suitable characters
            count = count + 1;
        }
        // The counter increases in any case
        i = i + 1;
    }

    return count;
}
```

This is an aggregating task. The method counts not all the characters, but to count the total you still have to look at every one of them. The variable `count` stores the result and grows only when the current character matched the one we are looking for.

## The counter and the condition are responsible for different things

In such a loop it is convenient to separate two parts. The counter `i` moves the program to the next character, and the `if` decides what to do with the current one. The counter changes on every iteration, while the action inside the `if` is not always performed.

This is important. If you increase `i` only inside the `if`, the loop will get stuck on the first unsuitable character, because the counter will stop growing and the condition `i < str.length()` will stay true forever. The program will loop endlessly. That is why the line `i = i + 1` stands outside the `if` and is executed with any outcome of the check.

## The work step by step

Let's take apart the call `countChars("Sansa", 'a')`. Before the loop `i` equals `0`, and `count` equals `0`.

**Step 1.** The condition `i < str.length()` is true. The character with index `0` is `S`. It is not equal to `a`, the `if` block is not executed. Then `i` grows to `1`.

**Step 2.** The condition is true again. The character with index `1` is `a`. It matched the one we are looking for, so `count` grows to `1`. Then `i` grows to `2`.

Further on the loop checks every character. The suitable ones it counts, the rest it skips. When `i` becomes equal to the length of the string, the condition of the loop will become false, and the method will return the accumulated value of `count`.

The condition inside a loop can check anything — the evenness of a number, a match of a character, the length of a string or the value of a variable. The main thing is that the counter keeps changing and the loop can finish.
