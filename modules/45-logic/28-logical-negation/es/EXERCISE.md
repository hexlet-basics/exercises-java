
Implementa el método `notToday()`, que verifica si la fecha pasada no es la fecha de hoy:

```java
// supongamos que hoy es 2012-11-25
notToday("2012-11-25"); // false
notToday("2013-11-25"); // true
notToday("2013-09-01"); // true
```

Para obtener la fecha actual como una cadena: `LocalDate.now().toString()`.
