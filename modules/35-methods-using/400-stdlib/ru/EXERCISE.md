
Напишем код в стиле "повтори за учителем". Рассчитаем количество дней между двумя датами используя встроенные возможности Java. Попробуйте "поиграть" с датами.

```java
// С даты
LocalDate dateFrom = LocalDate.of(2017, Month.MAY, 24);
// По дату
LocalDate dateTo = LocalDate.of(2017, Month.JULY, 29);
// Количество дней между этими датами
long noOfDaysBetween = ChronoUnit.DAYS.between(dateFrom, dateTo);
System.out.println(noOfDaysBetween);
```
