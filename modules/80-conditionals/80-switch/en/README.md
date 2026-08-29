Many languages use not only the conditional construct `if`, but also `switch` in addition to it. The `switch` construct is a specialized version of `if`, created for particular situations.

For example, it is worth using where there is a chain of `if else` with equality checks:

```java
if (status.equals("processing")) {
    // We do the first thing
} else if (status.equals("paid")) {
    // We do the second thing
} else if (status.equals("new")) {
    // We do the third thing
} else {
    // We do the fourth thing
}
```

This compound check has a distinctive feature. Every branch here checks the value of the `status` variable. The `switch` construct writes such code shorter and more expressively:

```java
switch (status) {
    case "processing":
        // We do the first thing
        break;
    case "paid":
        // We do the second thing
        break;
    case "new":
        // We do the third thing
        break;
    default: // else
        // We do the fourth thing
}
```

```text
switch (value) {
  │
  ├── case "a" → block 1
  ├── case "b" → block 2
  ├── case "c" → block 3
  └── default  → default block
}
```

From the point of view of the number of elements, `switch` is quite a complex construct. It includes:

* The outer description with the `switch` keyword. It has two elements. These are the variable by whose values `switch` chooses the behavior, and the curly braces for the variants of choice
* The `case` and `default` constructs, inside which the behavior for different values of the variable is described. Each `case` corresponds to an `if`, as in the example above. Here `default` is a special situation that corresponds to the `else` branch in conditional constructs. As with `else`, specifying `default` is not required
* The `break` construct, which prevents fall-through. Without it, after the needed `case` the execution will pass to the next `case`. This will continue until the nearest `break` or until the end of the `switch`

The curly braces in `switch` do not define a block of code, as in other places. Only the syntax shown above is allowed inside. There you can use `case` or `default`. But inside each `case` and `default` the situation is different. Here any arbitrary code is executed:

```java
switch (count) {
    case 1:
        // We do something useful
        break;
    case 2:
        // We do something useful
        break;
    default:
        // We do something
}
```

## Returning a value from switch

Sometimes the result obtained inside a `case` finishes the work of the method that contains the `switch`. Then it has to be returned outside somehow. There are two ways to do this.

The first way creates a variable before the `switch`, fills it in the `case` branches and at the end returns it outside:

```java
public static String getExplanation(int count) {
    // We declare the variable
    String result;

    // We fill it
    switch (count) {
        case 1:
            result = "one";
            break;
        case 2:
            result = "two";
            break;
        default:
            result = null;
    }

    // We return it
    return result;
}
```

The second way is simpler and shorter. Instead of a variable, you can do an ordinary return from the method inside the `case`. After `return` no code is executed, so `break` is not needed here:

```java
public static String getExplanation(int count) {
    switch (count) {
        case 1:
            return "one";
        case 2:
            return "two";
        default:
            return null;
    }
}
```

## The switch expression

The classic `switch` has a modern form with arrow syntax. It is called a switch expression and returns the value right away. Every branch is written as `case value -> result;`. Neither `break` nor fall-through between branches is needed here:

```java
public static String getExplanation(int count) {
    return switch (count) {
        case 1 -> "one";
        case 2 -> "two";
        default -> null;
    };
}
```

One branch handles several values if you list them separated by commas:

```java
String season =
        switch (month) {
            case 12, 1, 2 -> "winter";
            case 3, 4, 5 -> "spring";
            case 6, 7, 8 -> "summer";
            default -> "autumn";
        };
```

`switch` occurs in code, but technically you can always do without it. The use of this construct is that it expresses the programmer's intention better when specific values of a variable need to be checked. Compared to `else if` blocks, code with `switch` reads more clearly.
