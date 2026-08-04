Besides arithmetic operations, from school mathematics we also know comparison operations, for example `5 > 4` or `3 < 1`. They exist in programming as well. Comparisons are often used in real tasks related to numbers. When we place an order in an online store, the system checks whether the user has enough money in their account. If the amount in the account is greater than or equal to the price of the product, the order is confirmed. If there are not enough funds, an error message appears.

## Comparison in programming

Let's start with an example in which two numbers are compared. We print the result of the comparison to the screen:

```java
System.out.println(5 > 4); // => true
System.out.println(4 > 4); // => false
```

The result of a comparison is a value of type `boolean`. This type has only two possible variants, `true` and `false`. These are special values of the language, and they can be printed directly:

```java
System.out.println(true);  // => true
System.out.println(false); // => false
```

In practice they are rarely used this directly, but the logic of the program's behavior is built on top of them. We come across this every day, when we enter PIN codes and passwords, when we perform actions with different possible outcomes. All these variants are written inside the program in the form of conditional expressions. The program reasons roughly like this: *if it is this way, do one thing; if it is otherwise, do another*.

The following comparison operations are available in Java:

* `<` — less than
* `<=` — less than or equal to
* `>` — greater than
* `>=` — greater than or equal to
* `==` — equal to
* `!=` — not equal to

Programming languages adapted all the mathematical comparison operations unchanged, except for the equality and inequality operators. In mathematics the usual `=` is used for equality, but in programming the `=` symbol assigns values to variables. That is why in Java comparison is done with the help of `==`. A few examples with the result printed to the screen:

```java
System.out.println(5 >= 3); // => true
System.out.println(7 < 0);  // => false
System.out.println(5 > 5);  // => false
System.out.println(5 >= 5); // => true
System.out.println(2 == 5); // => false
System.out.println(2 != 5); // => true
```

Any comparison operation can be saved in a variable of type `boolean` and then printed:

```java
boolean result = 5 > 4;
System.out.println(result); // => true
```

When the comparison contains hard-coded numbers, the operation seems meaningless. We already know its result, and it is always the same, because three is greater than two under any circumstances. The picture changes when the values come from outside. Let's write a method that accepts the age of a child and determines whether they are an infant. Children under one year old are considered infants:

```java
public static boolean isInfant(int age) {
    return age < 1;
}
```

With the single line of the method we write "return the value that results from the comparison `age < 1`". Depending on the argument that arrives, the comparison will be either true (`true`) or false (`false`). The method will return this result:

```java
System.out.println(App.isInfant(3)); // => false
System.out.println(App.isInfant(1)); // => false
System.out.println(App.isInfant(0)); // => true
```

## Predicates

When methods return the result of a comparison, they answer the question "yes" or "no". Such methods are called **predicates**. They are recognized by the fact that they return a logical value `true` or `false`. Often the name of a predicate contains a question or a statement that can be checked (`is`, `has`, `can`, `was`). Here is a method that checks whether a number is negative:

```java
public static boolean isNegative(int number) {
    // We check whether the number is less than zero
    return number < 0;
}

System.out.println(App.isNegative(-5)); // => true
System.out.println(App.isNegative(7));  // => false
```

The `isNegative` method gathers the condition inside and gives a short answer to the outside. This way the calculation is hidden behind an understandable name.
