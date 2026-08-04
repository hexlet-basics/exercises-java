With the help of the `while` loop any traversal task is solved, but it stands out for its verbosity. For `while` you have to declare the counter separately, set the stopping condition separately and change the counter in the body of the loop separately. When there are few loops, this is tolerable. In real code loops occur at every step, and managing three parts manually is tiring, especially when the number of repetitions is known in advance.

For such cases Java has the `for` loop. It gathers all three parts into one line. Let's look at the implementation of reversing a string through `for`:

```java
public static String reverseString(String str) {
    var result = "";
    for (var i = 0; i < str.length(); i++) {
        result = str.charAt(i) + result;
    }

    return result;
}

App.reverseString("code"); // "edoc"
```

The notation `i++` increases the counter by one. It is the short form of `i = i + 1`, and in the header of a loop it occurs most often. The code itself can be described in words like this:

> The loop with the index `i` starts with the value `0`, repeats while `i < str.length()`, and after every step increases `i` by one

In the header of the `for` loop there are exactly three parts, separated by semicolons:

1. The initial value of the counter. This code is executed once before the first iteration
2. The predicate — the condition of repetition. It is checked before every iteration, exactly as in `while`
3. Changing the counter. This code is executed at the end of every iteration

In everything else the principle of work is the same as with `while`.

## Analysis step by step

Let's take apart how the loop works for the call `reverseString("go!")`. Before the loop `result` equals the empty string:

```text
reverseString("go!")

before the loop: result = ""

i=0: charAt(0) = 'g'
result = 'g' + ""   = "g"

i=1: charAt(1) = 'o'
result = 'o' + "g"  = "og"

i=2: charAt(2) = '!'
result = '!' + "og" = "!og"
```

Every character is taken by its index from left to right and glued to the beginning of the result. That is why the string is assembled in reverse order.

## Comparison with while

One and the same traversal of a string with the two loops looks like this:

```text
for (var i = 0; i < str.length(); i++) {     var i = 0;
    System.out.println(str.charAt(i));       while (i < str.length()) {
}                                                System.out.println(str.charAt(i));
                                                 i = i + 1;
│                                            │   }
└── the counter is set in one line           └── the counter is spread over the body
```

The `for` loop keeps all the management of the counter in the header, so the body stays clean. When the number of repetitions is clear in advance, `for` reads better. When it is not clear in advance how many iterations there will be, for example when searching for a prime number, `while` is more convenient.

Let's show one more example with a numeric counter. Let's add up the numbers from `0` to `9`:

```java
var sum = 0;
for (var i = 0; i < 10; i++) {
    sum = sum + i;
}

System.out.println(sum); // => 45
```

The counter starts from zero, the loop goes on while `i < 10`, and on every step `i` grows by one. Inside the body only the accumulation of the sum is left.
