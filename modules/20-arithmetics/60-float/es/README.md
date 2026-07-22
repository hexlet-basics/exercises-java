En matemáticas hay distintos tipos de números. Por ejemplo:

- naturales, que son los números enteros desde 1 en adelante
- racionales, que son los números con punto, por ejemplo 0.5, 1.75, 2.25

Desde el punto de vista de las matemáticas, aquí todo está claro. Pero desde el punto de vista de la computadora, entre estos tipos de números hay un abismo. Intenta sumar mentalmente `0.2` y `0.1`. Parece que saldrá `0.3`. Esto es lo que dice Java al respecto:

```java
System.out.println(0.2 + 0.1); // 0.30000000000000004
```

En lugar del habitual `0.3`, se obtiene `0.30000000000000004`.

```text
Expectativa: 0.1 + 0.2  →  0.3
Realidad:    0.1 + 0.2  →  0.30000000000000004
                             └── error de almacenamiento
```

El mismo resultado darán JavaScript, C++ y casi todos los demás lenguajes.

## Por qué ocurre esto

La causa está en el diseño de la computadora. La memoria es finita, mientras que los números racionales son infinitos. Entre `0.1` y `0.2` caben infinitos números más, y la computadora no puede guardarlos todos. Por eso aproxima el número, tratando de encajarlo en los bits disponibles.

Con los números enteros no existe este problema; están acotados por arriba. El número entero más grande en Java hasta tiene un nombre:

```java
System.out.println(Integer.MAX_VALUE); // 2147483647
```

Tras la notación `Integer.MAX_VALUE` se esconde el valor límite, más allá del cual un número entero normal en Java no llega.

Con los números racionales este truco no funciona, ya que no están alineados en una cadena uniforme. Los valores aproximados se llaman números de punto flotante (floating point numbers). Su almacenamiento y los cálculos con ellos se rigen por el estricto estándar IEEE 754, en el que se apoyan la mayoría de los lenguajes.

## Cuándo aparecen estos números

Los números de punto flotante aparecen más a menudo de lo que parece. Aquí están los dos casos principales.

En el primer caso, tú mismo escribes un número con punto, por ejemplo `0.1`, `2.5` o `3.14`.

En el segundo caso, en la división participa un número fraccionario:

```java
System.out.println(1.0 / 2); // 0.5
System.out.println(2.0 / 3); // 0.6666666666666666
```

Aquí conviene recordar la división entera. Cuando ambos operandos son enteros, Java divide de forma entera, y `1 / 2` dará `0`. Basta con hacer que al menos un operando sea fraccionario, y el resultado se convierte en un número de punto flotante. Incluso cuando el resultado se ve bonito, por dentro se almacena de forma aproximada. Algunas fracciones, por ejemplo `1.0 / 3`, no se pueden escribir con exactitud en el sistema binario.

## Dónde es crítico

Normalmente un pequeño error no molesta. Pero en los cálculos financieros, las tareas de ingeniería y en la comparación exacta de números se convierte en un problema. Un error de una fracción de céntimo estropea la suma final, y una larga cadena de cálculos va acumulando la imprecisión poco a poco.

En los programas reales esto se combate de distintas maneras. El dinero se suele guardar en las unidades mínimas, por ejemplo en céntimos, es decir, en números enteros. El resultado se redondea a la cantidad de cifras necesaria. Los números se comparan con una pequeña tolerancia. Para los cálculos exactos se usan tipos de datos especiales.

## Qué hay que recordar

Las operaciones con números de punto flotante no siempre son exactas, y eso es normal. Así se comporta la mayoría de los lenguajes de programación, y la causa está en el diseño de la memoria. La precisión se puede controlar redondeando o comparando con una tolerancia. Y para el dinero y los cálculos científicos es mejor usar directamente tipos de datos especiales.
