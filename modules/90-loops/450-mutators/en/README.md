Two operations migrated to Java from the C language: **increment** `++` and **decrement** `--`, which very often occur together with loops.

These unary operations increase and decrease by one the number written into a variable:

```java
var i = 0;
i++; // 0
i++; // 1

i--; // 2
i--; // 1
```

Besides the postfix form, they also have a prefix one:

```java
var i = 0;
++i; // 1
++i; // 2

--i; // 1
--i; // 0
```

It seems that there is no difference between the postfix and prefix forms, but this is where the difficulties begin. Unlike all the other operations, increment and decrement not only return a value, but also **change the value of the variable**.

When the prefix notation is used, first the variable is changed, and then the return happens. When the postfix notation is used it is the other way around: you can consider that first the return happens, and then the variable is changed.

The rule works the same way for increment and decrement. For simplicity let's consider only increment:

```java
var x = 5;

System.out.println(++x); // => 6
System.out.println(x);   // => 6

System.out.println(x++); // => 6
System.out.println(x);   // => 7
```

What happens in the code above:

1. We print `++x` to the screen — the prefix increment. That is why first the value of the variable increased by 1, then the result was returned and printed to the screen
2. Since the value changed, `System.out.println(x)` printed 6
3. Now we print `x++` to the screen — the postfix increment. That is why we got the value that the variable contained before it was increased by 1
4. Since the value changed, `System.out.println(x)` printed 7

It becomes especially complicated when an increment is inserted inside other operations: `x = i++ - 7 + --h`. It is almost impossible to understand such code.

Recommendations for use:

* Never mix operations without side effects with operations with side effects. The same goes for methods
* Use increment and decrement only where there is no difference between the prefix and the postfix variant — separately from everything, on a separate line of code
