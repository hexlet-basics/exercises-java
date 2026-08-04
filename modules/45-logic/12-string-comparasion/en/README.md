Look at the code and try to answer what the values of these expressions are:

```java
// What will the result be in these examples — `true` or `false`?

"a" == "a";
"a".toUpperCase() == "a".toUpperCase();
```

The correct answer: in the first case `true`, in the second — `false`. Why? To answer this question you need to dive a little into how computers work.


In our programs we operate on data — numbers, strings, boolean values. We perform various operations — we store them in variables, multiply, divide, concatenate them.

That is how a programmer sees their work. But inside the computer everything is a bit different. While running, the program gets access to and manipulates data through their addresses in memory:

```java
// An area of memory is allocated for storing the variable
// The program remembers the address of this area and works with it internally
var name = "CodeBasics";
// The program read the value of the variable at the address where the value is stored
System.out.println(name);
```

**Memory** is a large area for storing data, which is very similar to a warehouse. In memory, any value gets a number by which it can be retrieved and replaced. This number is the **address**.

## Comparison by reference and by value

Because of these technical peculiarities, the comparison of data with each other can be looked at in two ways:

* *The same one* — the same piece of memory
* *The same kind* — identical values regardless of where the addresses point

An example from real life: two identical glasses from one set. Despite being identical, they are still different glasses.

Programming languages work with these notions differently. As in many other languages, in Java all data is divided into two large types:

* Primitive data is compared by value, regardless of addresses
* Reference data is compared by addresses

This is how primitive data works:

```java
// The comparison goes by value, not by addresses
4 == 4; // true
true == true; // true
10.0 == 10.0; // true
```

Of the reference data we are so far familiar only with strings, but they work in a tricky way, so as an example let's look at arrays. Do not pay attention to the unfamiliar syntax. Just note that in this code seemingly identical things are not equal to each other:

```java
// Creating arrays
int[] a = {1, 2}
int[] b = {1, 2}
// The values are identical, but the references are different
a == b; // false
```

## The peculiarities of strings

Strings belong to reference data types, but they behave strangely:

```java
// Comparison like with primitive data types
"hm" == "hm"; // true
// Comparison like with reference data types
"hexlet".toUpperCase() == "hexlet".toUpperCase(); // false
```

Programs constantly operate on strings, so the efficiency of working with them comes first. If a string always behaved like a reference type, then additional memory would be allocated for every value in the code:

```java
// Without optimizations this expression would lead to a double allocation of memory
// One unit of memory for each "hm"
"hm" == "hm";
```

But this does not happen. When Java meets an explicitly created string, a check is performed on whether such a string already exists in memory.

If it does, it is reused; if not, it is created:

```java
// Memory is allocated
var name1 = "Java";
// Such a string already exists, so a reference to the already created string is substituted
// As a result, memory is saved
var name2 = "Java";
// Comparison by reference
// Both variables point to one piece of memory
name1 == name2; // true
```

But if a string is returned from a method, then it is placed into its own area of memory with its own unique address:

```java
// New memory is allocated in any case
var name1 = "java".toUpperCase(); // "JAVA"
// New memory is allocated in any case
var name2 = "java".toUpperCase(); // "JAVA"
name1 == name2; // false
```

It may seem that reference data brings nothing but problems. In fact, it is needed. This will become clear when we come across mutability in the future.

In applied programming we compare strings by value more often than by reference. For this, the `equals()` method is built into strings:

```java
var name1 = "java".toUpperCase(); // "JAVA"
var name2 = "java".toUpperCase(); // "JAVA"
name1.equals(name2); // true
```

Besides `equals()`, the `equalsIgnoreCase()` method is built into strings, which performs a check by value without taking the case into account:

```java
var name1 = "java".toUpperCase(); // "JAVA"
var name2 = "java".toLowerCase(); // "java"
name1.equalsIgnoreCase(name2); // true
```

Sometimes comparing strings in Java behaves like comparing values, but never bet on that. When changing the code it is easy to forget to fix the check and get an error. Always use methods when you need to compare by value.
