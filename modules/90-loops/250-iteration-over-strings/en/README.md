With the help of loops numbers are processed and strings are worked with. A string consists of characters, and every character can be reached by its index. Indexes start from zero, so the first character of the string `"Arya"` has index `0`, and the last one has index `length() - 1`.

The `charAt()` method allows you to get a character by its index, and the `length()` method allows you to find out the length of the string. These two methods and a counter are enough to go through a string character by character. Below is an example of code that prints the letters of a word on separate lines:

```java
public static void printNameBySymbol(String name) {
    var i = 0;
    // Such a check is performed until the end of the string,
    // including the last character. Its index is `length() - 1`.
    while (i < name.length()) {
        // We access the character by its index
        System.out.println(name.charAt(i));
        i = i + 1;
    }
}

var name = "Arya";
App.printNameBySymbol(name);
// "A"
// "r"
// "y"
// "a"
```

The loop goes through every character of the string in turn:

```text
"Arya"
 │ │ │ │
 A r y a
 ↓ ↓ ↓ ↓
every character is processed in turn
```

The main thing in this code is to set the correct condition in `while`. This can be done in two ways:

- `i < name.length()`
- `i <= name.length() - 1`

Both ways lead to the same result. The first one occurs more often, because it has less arithmetic.

## Going through in reverse order

The counter is not obliged to grow from zero. If you start from the last index and decrease it down to zero, the string will be gone through backwards. Let's write a method that prints the characters of a word in reverse order:

```java
public static void printReversed(String name) {
    // We start from the last character
    var i = name.length() - 1;
    while (i >= 0) {
        System.out.println(name.charAt(i));
        i = i - 1;
    }
}

App.printReversed("Arya");
// "a"
// "y"
// "r"
// "A"
```

Here the counter `i` starts with the value `name.length() - 1`, moves towards zero and ends the loop when it becomes less than zero. On every step the method takes the character at the current index and prints it. The direction of going through is set only by the initial value of the counter and the way it is changed.
