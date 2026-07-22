Todos recordamos de la escuela la frase "el orden de los sumandos no altera la suma". Este es uno de los principios básicos de la aritmética, y se llama **ley conmutativa**.

## Qué es la conmutatividad

Una operación se llama conmutativa cuando el orden de los operandos no afecta al resultado. Intercambias los valores y obtienes la misma respuesta. La suma es conmutativa:

```java
System.out.println(3 + 2); // 5
System.out.println(2 + 3); // 5
```

El resultado idéntico confirma la conmutatividad.

```text
2 + 3 = 5     3 + 2 = 5
└──────────┬─────────┘
  el mismo resultado

2 - 3 = -1    3 - 2 = 1
└──────────┬─────────┘
  resultado distinto
```

## Operaciones no conmutativas

No todas las operaciones funcionan así. La resta cambia el resultado cuando se intercambian los operandos:

```java
System.out.println(2 - 3); // -1
System.out.println(3 - 2); // 1
```

La división también es no conmutativa, y en Java esto se ve con especial claridad:

```java
System.out.println(8 / 2); // 4
System.out.println(2 / 8); // 0
```

En el primer caso, el ocho se divide entre el dos y da `4`. En el segundo, el dos se divide entre el ocho. En el dos no cabe ni un solo ocho entero, por eso al dividir números enteros se obtiene `0`.

## En programación es igual que en aritmética

Java sigue las mismas reglas matemáticas que la aritmética escolar. Y como la mayoría de las operaciones no son conmutativas, el orden de los operandos siempre importa. Préstale atención, sobre todo con una operación desconocida, y comprueba el orden con un ejemplo en lugar de adivinar.
