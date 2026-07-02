What to do when you need several operations at once in a single line? They are written one after another, and Java processes the expression step by step according to strict rules.

Let's take an example with only multiplications:

```java
System.out.println(2 * 4 * 5 * 10); // 400
```

To understand how Java calculates, let's break the expression down step by step:

- first `2 * 4` is calculated, leaving `8 * 5 * 10`
- then `8 * 5`, leaving `40 * 10`
- the last multiplication gives `400`

This is how operations combine with each other, and increasingly complex expressions are built from simple actions.

## What if the operations are different

As long as the operators are the same, everything goes left to right. But what happens if you mix multiplication and addition?

```java
System.out.println(2 + 3 * 4);
```

Will it be `20` or `14`? The answer is `14`.

```text
2 + 3 * 4
    └─┬─┘
2 +  12
└──┬───┘
   14
```

Operations have priority, just like in math. Multiplication is performed before addition. So first `3 * 4` is calculated, and only then the two is added. The order can be changed with parentheses. In the expression `(2 + 3) * 4`, first `2 + 3` is added, and then the result `5` is multiplied by `4`, giving `20`.

The same rule works with subtraction:

```java
System.out.println(10 - 2 * 3); // 4
```

First the multiplication `2 * 3`, then `10 - 6`, resulting in `4`.

## Negative numbers inside an expression

When there's a unary minus in an expression, it's applied to its number before the other operations:

```java
System.out.println(4 + -2); // 2
System.out.println(6 - -2); // 8
```

Let's break down the second example. First the unary minus turns `2` into `-2`, then the operation reads as `6 - (-2)`, which gives `8`. It's the same as `6 + 2`.

## What to remember

- an expression can consist of several operations
- Java evaluates them step by step, from left to right and taking priority into account
- parentheses let you explicitly set the order of evaluation
