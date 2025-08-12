
En matemáticas, existen diferentes tipos de números, por ejemplo:

* **Naturales** - son números enteros mayores o iguales a 1
* **Racionales** - son números con decimales, por ejemplo, 0.5

Desde la perspectiva de los dispositivos informáticos, hay una brecha entre estos tipos de números. Intentemos sumar dos números racionales:

```text
0.2 + 0.1 = 0.3
```

Y ahora veamos qué dice Java al respecto:

```java
0.2 + 0.1; // 0.30000000000000004
```

La operación de suma de dos números racionales resultó en un cálculo inexacto del resultado. Otros lenguajes de programación también darán el mismo resultado.

Este comportamiento se debe a las limitaciones de la capacidad de cálculo. A diferencia de los números, la memoria tiene un límite finito, y un número infinito requeriría una cantidad infinita de memoria para almacenarlo.

Con los números naturales, este problema se resuelve estableciendo un límite superior. Hay un número máximo que se puede ingresar:

```java
System.out.println(Integer.MAX_VALUE);
// => 2147483647
```

Sin embargo, esto no funciona con los números racionales. La razón es que no están dispuestos en una cadena continua, hay un conjunto infinito de números entre *0.1* y *0.2*.

¿Entonces, cómo se almacenan los números racionales? La mayoría de los lenguajes de programación se basan en un estándar común que describe cómo organizar la memoria en estos casos.

Es importante que los desarrolladores comprendan que las operaciones con números de punto flotante no son precisas, pero esta precisión se puede ajustar. Esto significa que al resolver problemas con este tipo de números, es necesario recurrir a trucos especiales que permitan lograr la precisión deseada.
