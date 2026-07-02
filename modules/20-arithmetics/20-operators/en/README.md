First, let's go over the basic terminology. A sign of an operation like `+` is called an **operator**. An operator specifies an action, for example addition:

```java
System.out.println(8 + 2); // 10
```

Here `+` works as an operator, and the numbers `8` and `2` are called **operands**. Operands are the values to which the operator applies an action.

```text
operand   operator   operand         result
   8         +          2       →      10
   5         -          3       →      2
   4         *          3       →      12
```

Addition has two operands. One is to the left of the sign, the other to the right. Operations with two operands are called **binary**. If you omit at least one operand, the program won't compile and will produce a syntax error:

```java
System.out.println(3 + ); // you can't write it like this
```

Operations aren't always binary. There are also unary ones, with one operand, and ternary ones, with three.

## Unary minus

The same sign sometimes means different operations. Look at the minus:

```java
System.out.println(-3); // -3
```

Here the minus stands before a single number and works as a unary operator. It takes the number `3` and returns its opposite, that is `-3`.

When the minus stands between two numbers, it's already subtraction:

```java
System.out.println(5 - 2);  // 3
System.out.println(10 - 7); // 3
```

The difference is especially noticeable with negative numbers:

```java
System.out.println(5 - -2); // 7
```

On the left there's subtraction `5 - (...)`, and on the right the unary minus turns `2` into a negative number. This gives `5 - (-2)`, which results in `7`. Minus times minus gives plus, exactly as in school.

The meaning of the minus depends on its neighbors. Next to two numbers it's subtraction, before a single number it's a sign change. The notation `-3` is both the number itself and an operator with an operand. Many programming languages have the same logic, so it's a familiar thing.

The plus can also be unary. The notation `+5` only emphasizes that the number is positive and doesn't change its value:

```java
System.out.println(+5); // 5
```

The other arithmetic operators `*`, `/`, and `%` are always binary; they need two operands. Only plus and minus can work in two roles at once, both as binary and as unary.
