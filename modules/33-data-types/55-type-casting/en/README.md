
Java is a strongly typed programming language. Using special syntax we can change type of variables:

```java
System.out.print(Integer.parseInt("345"));
```

Type conversion works like this: before the value, the desired type is indicated in parentheses. As a result, the value on the right is converted to a value of another type indicated on the left in parentheses. At the moment we are familiar with only two types, but the transformation in Java works not only for the primitive types.

Type conversion can be used inside compound expressions:

```java
//Additional brackets help to visually separate parts of the expression from each other
System.out.print("It's" + ((int) 5.1));
```

It's 5

In case above, in spite of the fact, that 5.1 is the number, it has double type not int. Expression above bring this number type to int type, reject fraction part, because int type doesn't keep fraction part.
