We all remember the phrase from school "changing the order of the addends doesn't change the sum". This is one of the basic principles of arithmetic, and it's called the **commutative law**.

## What commutativity is

An operation is called commutative when the order of the operands doesn't affect the result. Swap the values and you get the same answer. Addition is commutative:

```java
System.out.println(3 + 2); // 5
System.out.println(2 + 3); // 5
```

The identical result confirms commutativity.

```text
2 + 3 = 5     3 + 2 = 5
└──────────┬─────────┘
    the same result

2 - 3 = -1    3 - 2 = 1
└──────────┬─────────┘
   different result
```

## Non-commutative operations

Not all operations work this way. Subtraction changes the result when the operands are swapped:

```java
System.out.println(2 - 3); // -1
System.out.println(3 - 2); // 1
```

Division is also non-commutative, and in Java this is especially clear:

```java
System.out.println(8 / 2); // 4
System.out.println(2 / 8); // 0
```

In the first case, eight is divided by two and gives `4`. In the second, two is divided by eight. Not a single whole eight fits into two, so integer division gives `0`.

## In programming it's the same as in arithmetic

Java follows the same mathematical rules as school arithmetic. And since most operations are non-commutative, the order of operands always matters. Pay attention to it, especially with an unfamiliar operation, and check the order with an example instead of guessing.
