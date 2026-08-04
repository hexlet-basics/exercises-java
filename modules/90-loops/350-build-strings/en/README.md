One more use of loops is **building strings**. Such a task occurs quite often in programming. It comes down to ordinary aggregation through concatenation.

There is one task that is popular at interviews — **reversing a string**. It can be solved in many different ways, but going through it character by character is exactly what is considered the basic one:

```java
App.reverse("Hexlet"); // "telxeH"
```

The general idea of reversing is the following — you need to take the characters in turn from the beginning of the string and join them in reverse order. Let's check how this works:

```java
public static String reverse(String str) {
    var i = 0;
    // The neutral element for strings is the empty string
    var result = "";
    while (i < str.length()) {
        // We join in reverse order
        result = str.charAt(i) + result;
        i += 1;
    }

    return result;
}

var name = "Bran";
App.reverse(name); // "narB"
// Checking the neutral element
App.reverse(""); // ""
```

It is important to get a feel for how the string itself is assembled — every next character is attached to the resulting string on the left, and in the end the string turns out to be reversed.
