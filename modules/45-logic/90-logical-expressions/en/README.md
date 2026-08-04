A single comparison like `age >= 18` answers one question. Real checks gather several such questions into one compound expression. A form on a site accepts data and checks at once that the user is of age and that they consented to the processing of their data. All of this fits into one line:

```java
var age = 20;
var hasConsent = true;
System.out.println(age >= 18 && hasConsent); // => true
```

A compound logical expression in Java always evaluates to `true` or `false`. The intermediate parts also turn into logical values, and the final result is assembled from them step by step.

## The order of evaluation

Arithmetic, comparisons and logical operators occur in one expression. Java evaluates them in a strict order of priorities:

```text
Priority (from high to low):

  ()                   parentheses
   ↓
  * / %  + -           arithmetic
   ↓
  < <= > >=  == !=     comparisons
   ↓
  !                    negation
   ↓
  &&                   logical AND
   ↓
  ||                   logical OR
```

First the arithmetic is calculated, then the comparisons give `true` or `false`, and only after that the logical operators join these values. The `&&` operator is true when both operands are true. The `||` operator is true when at least one is true. The `!` operator changes a value to the opposite one.

## Evaluation step by step

Let's take apart the expression from the example above. We have `age` equal to `20`, and `hasConsent` equal to `true`:

```java
age >= 18 && hasConsent
20 >= 18 && true          // we substituted the values of the variables
true && true              // the comparison 20 >= 18 gave true
true                      // both operands of && are true
```

Let's take a more complex expression, where all three operators take part. We check that the number is in the range from 1 to 10 and at the same time is even:

```java
var number = 4;
System.out.println(number >= 1 && number <= 10 && number % 2 == 0); // => true
```

Java unfolds it like this:

```java
4 >= 1 && 4 <= 10 && 4 % 2 == 0
true   && true    && 4 % 2 == 0   // two comparisons gave true
true   && true    && 0 == 0       // we calculated the remainder 4 % 2
true   && true    && true         // the last comparison gave true
true                              // all the operands of && are true
```

## Parentheses and priority

When `&&` and `||` are mixed in an expression, the order is set by parentheses. Without them `&&` is applied earlier than `||`, and the meaning may turn out not to be the intended one:

```java
// && binds b and c, so this is a || (b && c)
System.out.println(true || false && false); // => true

// the parentheses change the order, first what is inside is calculated
System.out.println((true || false) && false); // => false
```

The first expression first evaluates `false && false`, gets `false`, and then `true || false` gives `true`. In the second case the parentheses force `true || false` to be evaluated first, this gives `true && false`, and the result is `false`.

## Short-circuit evaluation

Java stops as soon as the result is already clear. If the left operand of `||` is true, the right one is not evaluated, because the whole expression is already true. If the left operand of `&&` is false, the right one is skipped as well:

```java
var hasAccess = true;
System.out.println(hasAccess || age < 0); // => true, Java does not evaluate the right part
```

Such behavior is called short-circuit evaluation. It speeds up checks and protects from unnecessary work in the right part of the expression.
