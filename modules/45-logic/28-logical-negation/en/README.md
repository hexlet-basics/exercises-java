Along with the logical operators **AND** and **OR**, the "**negation**" operation is often used. It changes a logical value to the opposite one. In Java the unary operator `!` corresponds to negation:

```java
System.out.println(!true);  // => false
System.out.println(!false); // => true
```

If there is a method that checks whether a number is even, then with the help of negation you can perform a check for oddness:

```java
public static boolean isEven(int number) {
    return number % 2 == 0;
}

System.out.println(App.isEven(10));  // => true
System.out.println(!App.isEven(10)); // => false
```

In the example above we added `!` to the left of the method call and got the opposite action. Negation makes it possible to express the intended rules in code without writing new methods.

Negation is applied not only to a method call, but also to a whole expression. The parentheses set what exactly the operator refers to:

```java
System.out.println(!(5 == 5 || 5 == 3)); // => false

// This same expression can be written differently,
// "the number is not equal to 5 and not equal to 3"
System.out.println(5 != 5 && 5 != 3);    // => false
```

## Double negation

Negation is allowed to be put several times in a row. In logic, double negation is equivalent to the absence of negation:

```java
System.out.println(!!true);  // => true
System.out.println(!!false); // => false

System.out.println(!!App.isEven(10)); // => true
System.out.println(!!App.isEven(11)); // => false
```

## Priority

The `!` operator can be combined with `&&` and `||`. Among the logical operators, negation has the highest priority, so it is applied first:

```java
// (!true) || true  =>  false || true  =>  true
System.out.println(!true || true);     // => true

// (!true) && false  =>  false && false  =>  false
System.out.println(!true && false);    // => false
```

Parentheses change the order of evaluation, and `!` is applied to the result inside them:

```java
// !(true || true)  =>  !true  =>  false
System.out.println(!(true || true));   // => false

// !(true && false)  =>  !false  =>  true
System.out.println(!(true && false));  // => true
```

A practical example. The method checks whether a driver can get behind the wheel. A license and sobriety are needed, so the second condition goes through negation:

```java
public static boolean canDrive(boolean hasLicense, boolean isDrunk) {
    return hasLicense && !isDrunk;
}

System.out.println(App.canDrive(true, false));  // => true  (has a license, sober)
System.out.println(App.canDrive(true, true));   // => false (has a license, but drunk)
System.out.println(App.canDrive(false, false)); // => false (no license)
```

Now you know what the operators **AND**, **OR** and `!` mean. With their help you will be able to set compound conditions made of two and more logical expressions.

## De Morgan's laws

When working with complex logical expressions, sometimes you need to invert them or rewrite them into an equivalent form that is more convenient to read. For this there are **De Morgan's laws**, two rules that describe how negation is distributed over a compound expression:

```java
!(A && B)  ==  !A || !B
!(A || B)  ==  !A && !B
```

The first law says that the negation of a conjunction is equal to the disjunction of the negations. Let's check both parts on specific values:

```java
System.out.println(!(true && false));     // => true
System.out.println(!true || !false);       // => true
```

The second law says that the negation of a disjunction is equal to the conjunction of the negations:

```java
System.out.println(!(true || false));      // => false
System.out.println(!true && !false);        // => false
```

In practice, De Morgan's laws help to simplify conditions. Instead of `!(isAdmin || isModerator)` you can write `!isAdmin && !isModerator`. The second variant reads as "not an administrator and not a moderator", and it is easier to follow.
