
Let's write code in the "repeat after the teacher" style. Let's calculate the number of days between two dates using Java's built-in capabilities. Try to "play" with the dates.

```java
// From date
LocalDate dateFrom = LocalDate.of(2017, Month.MAY, 24);
// To date
LocalDate dateTo = LocalDate.of(2017, Month.JULY, 29);
// Number of days between these dates
long noOfDaysBetween = ChronoUnit.DAYS.between(dateFrom, dateTo);
System.out.println(noOfDaysBetween);
```
