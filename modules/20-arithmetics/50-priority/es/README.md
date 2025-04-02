Observa detenidamente la expresión *2 + 2 * 2* y calcula mentalmente el resultado. La respuesta correcta es *6*. Si obtuviste *8*, entonces esta lección es para ti.

En matemáticas escolares, estudiamos el concepto de "prioridad de la operación". La prioridad determina en qué secuencia deben realizarse las operaciones.

Por ejemplo, la multiplicación y la división tienen mayor prioridad que la suma y la resta:

```
2 + 3 * 2 = 8
```

Sin embargo, a menudo los cálculos deben realizarse en un orden diferente al de la prioridad estándar. En situaciones complicadas, se puede especificar la prioridad utilizando paréntesis, al igual que en la escuela, por ejemplo:

```
(2 + 2) * 2
```

Los paréntesis se pueden colocar alrededor de cualquier operación. Pueden anidarse tantas veces como sea necesario. Aquí tienes un par de ejemplos:

```java
System.out.println(3 * (4 - 2)); // => 6
System.out.println(7 * 3 + (4 / 2) - (8 + (2 - 1))); // => 14
```

A veces, una expresión puede ser difícil de comprender visualmente. En ese caso, se pueden agregar paréntesis para hacerla más clara, aunque no afectarán la prioridad:

Antes:
```java
System.out.println(8 / 2 + 5 - -4 / 2); // => 11
```

Después:
```java
System.out.println(((8 / 2) + 5) - (-4 / 2)); // => 11
```

Recuerda: el código se escribe para las personas, porque las personas lo leerán, y las máquinas solo lo ejecutarán. Para las máquinas, no hay código "más" o "menos" comprensible, independientemente de si el código es correcto o no.
