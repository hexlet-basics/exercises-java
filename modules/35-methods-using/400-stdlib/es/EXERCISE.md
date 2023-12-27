
Escribiremos código en el estilo "sigue al maestro". Calcularemos la cantidad de días entre dos fechas utilizando las capacidades incorporadas de Java. Intenta "jugar" con las fechas.

```java
// Desde la fecha
LocalDate dateFrom = LocalDate.of(2017, Month.MAY, 24);
// Hasta la fecha
LocalDate dateTo = LocalDate.of(2017, Month.JULY, 29);
// Cantidad de días entre estas fechas
long noOfDaysBetween = ChronoUnit.DAYS.between(dateFrom, dateTo);
System.out.println(noOfDaysBetween);
```
