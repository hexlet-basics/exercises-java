Until now, when defining variables, we used the keyword `var`. This may surprise those who already have experience with Java. Usually the definition of variables is shown like this:

```java
int x = 3;
String greeting = "Hello Hexlet!";
```

The time has come to reveal the cards. Java is a statically typed language. In such languages, the type of a variable is fixed at its declaration and does not change until the end of the program. The type is specified before the variable name. In the example above, this is an integer (*int*) and a string (*String*).

## The type is specified explicitly and does not change

In a statically typed language, every variable has a type, and it is fixed. If a variable is declared as *int*, then only an integer can be put into it:

```java
int n = 5;
double x = 1.5;
boolean flag = true;
char c = 'A';
String s = "hi";
```

An attempt to put a value of another type into a variable leads to an error. A string cannot be assigned to a variable of type *int*:

```java
// Error: incompatible types: java.lang.String cannot be converted to int
int ops = "test";
```

## When types are checked

Java checks types in advance, even before the program runs, at the compilation stage. The compiler reads the code, checks the types of values and operations, and refuses to build the program if it finds a mismatch. That is why we will see the error from the example above before the program starts working.

In this, Java differs from languages with dynamic typing, where types are checked while the program is running. In such languages, a type mismatch error surfaces only at the moment the appropriate line of code executes. Static checking catches some errors earlier and helps not to carry them all the way to the user.

Explicit type specification has a second advantage as well. The type next to the variable name works as a hint for whoever reads the code. From the line `int count = 0;` it is immediately clear that the variable stores an integer. Java takes control of types upon itself, and the code becomes clearer for people.

## When Java casts types itself

Sometimes values of different numeric types appear in one expression. If you add an integer and a rational number, Java itself casts the integer to a rational one:

```java
double result = 1 + 1.5;
System.out.println(result); // => 2.5
```

The integer `1` turns into `1.0`, and the result comes out as `2.5`. This happens because any integer can be represented exactly as a rational number, and no data is lost. But Java will not mix a string and a number by itself. For that, an explicit conversion is needed, and we will learn to do it.

## Type inference and the word var

Earlier in Java variables were created only with an explicit type specification, until the word `var` appeared. This is a special keyword that turns on the mechanism of **type inference**. Type inference itself determines the type of the assigned value and binds it to the variable:

```java
// The compiler understands that this is an integer
var age = 33;

// And this is a string
var name = "Tom";
```

Type inference appeared in Java in 2018, although in some other languages it has existed for several decades. The first language with type inference is called ML, and it appeared as early as 1973. Since then, type inference has been added to OCaml, Haskell, C#, F#, Kotlin, Scala, and many other languages.

The word `var` does not cancel static typing. The variable still has a type; the compiler infers it. After that the type is just as fixed, and you will not be able to put a value of another type into such a variable. Type inference is preferable in most situations. It happens that the inferred type does not suit us, and then the type is specified explicitly.
