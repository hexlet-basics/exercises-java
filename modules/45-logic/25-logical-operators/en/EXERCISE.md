
Implement the method `isLeapYear()`, which determines whether a year is a leap year or not. A year is a leap year if it is a multiple of (that is, divides without a remainder by) 400, or if it is at the same time a multiple of 4 and not a multiple of 100. As you can see, all the necessary logic is already contained in the definition; all that is left is to put it into code:

```java
App.isLeapYear(2018); // false
App.isLeapYear(2017); // false
App.isLeapYear(2016); // true
```

Being a multiple can be checked like this:

```java
// % - returns the remainder of dividing the left operand by the right one
// We check that number is a multiple of 10
number % 10 == 0

// We check that number is not a multiple of 10
number % 10 != 0
```
