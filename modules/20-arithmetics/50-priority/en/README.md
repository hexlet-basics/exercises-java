What is the result of `2 + 2 * 2`?

It's `6`.

If you thought it's `8`, then this lesson is for you ;-) In primary school you've learned about operation priority. Priority defines the order of operations in complex expressions. For example, multiplication and division have higher priority than addition or division. So, 2 + 3 * 2 is `8`.

But sometimes we want different, non-standard order. Just like in math, we can use brackets to change the order, like so: `(2 + 2) * 2`.

Here are few more examples:

```java
System.out.println(3 * (4 - 2)); // => 6
System.out.println(7 * 3 + (4 / 2) - (8 + (2 - 1))); // => 14
```

Be sure to pair all the brackets in correct order. This is often the problem for both beginners and experienced programmers alike. To make things easier, put both opening and closing brackets, and then type the stuff inside. The editor on our website (and most code editors) do that by default automatically: you type `(`, and the editor adds `)`. This works for some other symbols, like quotation marks, for example. We'll talk about them later.

Sometimes an expression is too complication to understand visually. Feel free to put brackets even if then won't change the priority, but will make things clearer:

Before:

```java
System.out.println(8 / 2 + 5 - -3 / 2); // => 11
```

After:

```java
System.out.println(((8 / 2) + 5) - (-3 / 2)); // => 11
```

Remember: code is for people, because it'll be read by people, and machines will only execute it. The only thing that matters for the machines is the correctness of code. They don't distinguish between "clear" or "confusing".
