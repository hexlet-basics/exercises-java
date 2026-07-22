Primero repasemos la terminología básica. Un signo de operación como `+` se llama **operador**. Un operador define una acción, por ejemplo la suma:

```java
System.out.println(8 + 2); // 10
```

Aquí `+` funciona como operador, y los números `8` y `2` se llaman **operandos**. Los operandos son los valores a los que el operador aplica una acción.

```text
operando  operador   operando      resultado
   8         +          2       →      10
   5         -          3       →      2
   4         *          3       →      12
```

La suma tiene dos operandos. Uno está a la izquierda del signo, el otro a la derecha. Las operaciones con dos operandos se llaman **binarias**. Si se omite al menos un operando, el programa no compilará y dará un error de sintaxis:

```java
System.out.println(3 + ); // no se puede escribir así
```

Las operaciones no siempre son binarias. También existen las unarias, con un operando, y las ternarias, con tres.

## Menos unario

El mismo signo a veces significa operaciones diferentes. Fíjate en el menos:

```java
System.out.println(-3); // -3
```

Aquí el menos está delante de un solo número y funciona como operador unario. Toma el número `3` y devuelve su opuesto, es decir, `-3`.

Cuando el menos está entre dos números, ya es una resta:

```java
System.out.println(5 - 2);  // 3
System.out.println(10 - 7); // 3
```

La diferencia se nota especialmente con los números negativos:

```java
System.out.println(5 - -2); // 7
```

A la izquierda hay una resta `5 - (...)`, y a la derecha el menos unario convierte `2` en un número negativo. Resulta `5 - (-2)`, y eso da `7`. Menos por menos da más, igual que en la escuela.

El significado del menos depende de sus vecinos. Junto a dos números es una resta, delante de un solo número es un cambio de signo. La notación `-3` es a la vez el número en sí y un operador con un operando. Muchos lenguajes de programación tienen la misma lógica, así que es algo habitual.

El más también puede ser unario. La notación `+5` solo resalta que el número es positivo y no cambia su valor:

```java
System.out.println(+5); // 5
```

Los demás operadores aritméticos `*`, `/` y `%` son siempre binarios; necesitan dos operandos. Solo el más y el menos pueden funcionar en dos roles a la vez, tanto binarios como unarios.
