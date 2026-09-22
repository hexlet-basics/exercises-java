We already know how to write methods that check single conditions. In this lesson we will continue working with methods and learn how to build compound conditions.

Such skills come in handy in widespread tasks, for example when checking a password. Some sites, during registration, ask you to think up a password from 8 to 20 characters in length.

In mathematics we would write this as `8 <= x <= 20`, but in Java that trick will not work. We will have to make two separate logical expressions and join them with the special "AND" operator.

Let's write a method that accepts a password and says whether it matches the conditions. We print the result to the screen:

```java
// The password is longer than 8 characters AND the password is shorter than 20 characters
public static boolean isCorrectPassword(String password) {
    var length = password.length();
    return length > 8 && length < 20;
}

System.out.println(App.isCorrectPassword("qwerty"));     // => false
System.out.println(App.isCorrectPassword("qwerty1234")); // => true
```

The `&&` operator means "AND". In mathematical logic this is called conjunction. The whole expression is considered true only when every **operand** is true, that is, every one of the expressions it is made of. In other words, `&&` means "both this and that". The priority of this operator is lower than the priority of the comparison operators, so the expression `length > 8 && length < 20` works correctly without parentheses.

Besides `&&`, the `||` operator is often used, which means "OR" (disjunction). It reads as "either this, or that, or both". The expression `a || b` is considered true when at least one of the operands is true or when both are true. In the remaining cases the expression is false.

Let's look at a method that determines whether a person is entitled to a discount. The discount is given to those who are younger than 18 or are students:

```java
public static boolean hasDiscount(int age, boolean isStudent) {
    return age < 18 || isStudent;
}

System.out.println(App.hasDiscount(15, false)); // => true  (younger than 18)
System.out.println(App.hasDiscount(25, true));  // => true  (a student)
System.out.println(App.hasDiscount(15, true));  // => true  (both conditions)
System.out.println(App.hasDiscount(25, false)); // => false
```

Operators can be combined in any quantity and in any sequence. When `&&` and `||` occur in the code at the same time, it is better to set the priority with parentheses:

```java
a && b || c;   // Without parentheses it is hard to understand the priority
a && (b || c); // With parentheses it is clear what belongs to what
```

Let's look at one more example. Imagine that we want to buy an apartment that satisfies these conditions:

> More than 100 m² on any street **OR** more than 80 m² on the central street _Main Street_

Let's write a method that checks the apartment. It accepts two parameters, the area and the name of the street. We compare strings through `.equals(...)`, because for strings this is the correct way of checking equality:

```java
public static boolean isGoodApartment(int area, String street) {
    return area >= 100 || (area >= 80 && "Main Street".equals(street));
}

System.out.println(App.isGoodApartment(91, "Queens Street")); // => false
System.out.println(App.isGoodApartment(78, "Queens Street")); // => false
System.out.println(App.isGoodApartment(70, "Main Street"));   // => false

System.out.println(App.isGoodApartment(120, "Queens Street")); // => true
System.out.println(App.isGoodApartment(120, "Main Street"));   // => true
System.out.println(App.isGoodApartment(80, "Main Street"));    // => true
```

The parentheses around `area >= 80 && "Main Street".equals(street)` set the priority. Without them the rule would read differently, and this way you can see at once which part belongs to which operator.

## Truth tables

The area of mathematics in which logical operators are studied is called boolean algebra. **Truth tables** show what the result will be when each operator is applied.

### The AND operator &&

| A     | B     | A && B   |
| ----- | ----- | -------- |
| true  | true  | **true** |
| true  | false | false    |
| false | true  | false    |
| false | false | false    |

### The OR operator ||

| A     | B     | A &VerticalSeparator;&VerticalSeparator; B |
| ----- | ----- | ------------------------------------------ |
| true  | true  | **true**                                   |
| true  | false | **true**                                   |
| false | true  | **true**                                   |
| false | false | false                                      |
