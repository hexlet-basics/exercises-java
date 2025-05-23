
We already know about the mathematical operation of addition. Such a program:

```java
System.out.print(5 + 3);
```

will display `8` - the result of the binary operator `+` with the operands `5` and `3`.

Above the strings defined their operations. You can "fold" two lines. Such a program:

```java
System.out.print("Dragon" + "stone");
```

will display `Dragonstone` - the result of the binary operator `+` with the 'Dragon' and 'stone' operands.

This operation is called **concatenation**. Roughly speaking, this is the "gluing" of the lines. Gluing always happens in the same order in which the operands are written, in other words, the left operand becomes the left part of the string, and the right operand becomes the left.

Here are some more examples:

```java
System.out.print("Kings" + "wood");     // => Kingswood

System.out.print("Kings" + "road");     // => Kingsroad

System.out.print("King's" + "Landing"); // => King'sLanding
```

In the last example, the name of the city turned out to be with an error: *King's Landing* must be written with a space! But there were no spaces in our initial lines, and the spaces in the code to the left and right of the `+` character do not matter, because they are not part of the lines.

Let's try to solve this problem in different ways:

```java
System.out.print("King's " + "Landing");      //  => King's Landing

System.out.print("King's" + " Landing");      //  => King's Landing

System.out.print("King's" + " " + "Landing"); //  => King's Landing
```

A space is the same character as the others, therefore, how many spaces to put in a line will be as much:

```java
System.out.print("King's " + " Landing");   // => King's  Landing

System.out.print("King's  " + "  Landing"); // => King's    Landing
```
