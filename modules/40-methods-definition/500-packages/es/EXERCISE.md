Implementa el método `amountPerPerson()`. Recibe el importe de la cuenta del restaurante `total`, la cantidad de personas `people` y el porcentaje de propina `tipPercent`, y devuelve el importe que paga cada uno. El resultado se redondea **hacia arriba**: nadie debe pagar de menos.

Para redondear hacia arriba usa el método `ceil()`. Ya está conectado al principio del archivo con una importación estática de la clase `Math`, por eso se puede llamar sin el prefijo `Math.`.

```java
App.amountPerPerson(300, 4, 20); // => 90
App.amountPerPerson(350, 3, 10); // => 129
```

Primero calcula el importe final con la propina, después divídelo entre la cantidad de personas y redondea hacia arriba. El resultado del método `ceil()` es de tipo `double`, y hay que devolver un `int`: no te olvides de la conversión de tipo.
