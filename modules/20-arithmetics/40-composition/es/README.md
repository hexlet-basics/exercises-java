¿Qué hacer cuando en una misma línea se necesitan varias operaciones a la vez? Se escriben una tras otra, y Java procesa la expresión paso a paso siguiendo reglas estrictas.

Tomemos un ejemplo solo con multiplicaciones:

```java
System.out.println(2 * 4 * 5 * 10); // 400
```

Para entender cómo calcula Java, analicemos la expresión paso a paso:

- primero se calcula `2 * 4`, y queda `8 * 5 * 10`
- luego `8 * 5`, y queda `40 * 10`
- la última multiplicación da `400`

Así las operaciones se conectan entre sí, y a partir de acciones simples se construyen expresiones cada vez más complejas.

## ¿Y si las operaciones son diferentes?

Mientras los operadores son iguales, todo va de izquierda a derecha. ¿Y qué pasa si mezclamos multiplicación y suma?

```java
System.out.println(2 + 3 * 4);
```

¿Saldrá `20` o `14`? La respuesta es `14`.

```text
2 + 3 * 4
    └─┬─┘
2 +  12
└──┬───┘
   14
```

Las operaciones tienen una prioridad, igual que en matemáticas. La multiplicación se realiza antes que la suma. Por eso primero se calcula `3 * 4`, y solo después se suma el dos. El orden se puede cambiar con paréntesis. En la expresión `(2 + 3) * 4` primero se suma `2 + 3`, y el resultado `5` se multiplica por `4`, y sale `20`.

La misma regla funciona con la resta:

```java
System.out.println(10 - 2 * 3); // 4
```

Primero la multiplicación `2 * 3`, luego `10 - 6`, resultado `4`.

## Números negativos dentro de una expresión

Cuando en una expresión hay un menos unario, se aplica a su número antes que las demás operaciones:

```java
System.out.println(4 + -2); // 2
System.out.println(6 - -2); // 8
```

Analicemos el segundo ejemplo. Primero el menos unario convierte `2` en `-2`, luego la operación se lee como `6 - (-2)`, y eso da `8`. Es lo mismo que `6 + 2`.

## Qué hay que recordar

- una expresión puede constar de varias operaciones
- Java las evalúa paso a paso, de izquierda a derecha y teniendo en cuenta la prioridad
- los paréntesis permiten fijar explícitamente el orden de los cálculos
