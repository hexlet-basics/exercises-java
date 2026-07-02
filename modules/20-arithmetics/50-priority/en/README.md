Look at the expression `2 + 2 * 2` and calculate the answer in your head. The correct answer is `6`. If you got `8`, this lesson is for you.

```java
System.out.println(2 + 2 * 2); // 6
```

The result is `6`, not `8` at all, because of operator priority. Priority determines the order in which operations are performed. Multiplication and division come before addition and subtraction:

```text
Operator priority (from highest to lowest):

  * / %      multiplication, division, remainder
   ↓
  + -        addition, subtraction
```

That's why in the example above, `2 * 2` is calculated first, and only then the two is added to the result.

When operations of the same priority are next to each other, they are performed from left to right:

```java
System.out.println(8 / 2 * 3); // 12, first 8 / 2 = 4, then 4 * 3 = 12
```

## Controlling the order of operations

Sometimes calculations need to go differently from what priority dictates. Then the order is set with parentheses, exactly as in school:

```java
System.out.println((2 + 2) * 2); // 8
```

Here the parentheses force `2 + 2` to be added first, and only then multiplied by two.

Parentheses can be placed around any part of an expression and nested inside one another any number of times:

```java
System.out.println(3 * (4 - 2));                     // 6
System.out.println(7 * 3 + (4 / 2) - (8 + (2 - 1))); // 14
```

In the second example, the parentheses are calculated first. `4 / 2` gives `2`, and `8 + (2 - 1)` gives `9`. That leaves `21 + 2 - 9`, resulting in `14`.

Remember one rule. Always close your parentheses. An unclosed parenthesis leads to an error, and even experienced programmers forget the closing one.

> Write parentheses as a pair right away. For example, type `()`, and then fill in the inside. Most code editors (including ours) add the closing parenthesis themselves as soon as you type the opening one.

## Parentheses for readability

Sometimes an expression works correctly but looks confusing. In such cases, parentheses are added for clarity. They don't affect the result, but they make it easier to read.

Before:

```java
System.out.println(8 / 2 + 5 - -4 / 2); // 11
```

After:

```java
System.out.println(((8 / 2) + 5) - (-4 / 2)); // 11
```

Code is written and read by people, while the machine only executes it. For the machine there's no more or less understandable code; it's enough for the code to be syntactically correct. A tidy expression with parentheses helps the person, especially when working in a team and when analyzing errors.
