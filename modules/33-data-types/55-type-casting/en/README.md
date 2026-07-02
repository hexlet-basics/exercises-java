In real programs, a situation often arises when data of one type needs to be turned into another. One example is working with forms on websites. Form data comes in text form, even if by its meaning there is a number there. To do something with such a value, it is converted into the needed type.

## Converting a string to a number

Let's imagine that a string `"345"` came from a form, and we need to add another number to this number. The string is first turned into an integer:

```java
var number = Integer.parseInt("345");
System.out.println(number + 5); // => 350
```

The method `Integer.parseInt` takes a string and returns an integer of type *int*. In a similar way, a string is turned into a rational number using `Double.parseDouble`.

## Casting between primitive types

If you need to convert from one primitive type to another, it is enough to specify the type in parentheses before the value. The value is converted to the type written in parentheses:

```java
var result = (int) 5.1;
System.out.println(result); // => 5
```

When casting a rational number to an integer, the fractional part is discarded without rounding. That is why `(int) 5.9` gives `5`. In the opposite direction, `(double) 7` gives `7.0`.

Casting also helps with division. Dividing an integer by an integer in Java gives an integer, and the fractional part is lost:

```java
System.out.println(7 / 2);          // => 3
System.out.println((double) 7 / 2); // => 3.5
```

In the first case both values are integers, so the result is an integer. In the second case the dividend is cast to the type *double*, and the division became rational.

## Casting inside compound expressions

Type conversion also works inside large expressions. Additional parentheses help to visually separate the parts of the expression from each other:

```java
var result = 10 + ((int) 5.1);
System.out.println(result); // => 15
```

Here `5.1` is cast to `5`, and then added to `10`.
