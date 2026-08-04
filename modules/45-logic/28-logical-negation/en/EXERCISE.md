
Implement the method `notToday()`, which checks that the passed date is not today's date:

```java
// suppose today is 2012-11-25
notToday("2012-11-25"); // false
notToday("2013-11-25"); // true
notToday("2013-09-01"); // true
```

To get the current date as a string: `LocalDate.now().toString()`.
