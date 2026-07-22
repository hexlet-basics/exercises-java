Mira la expresión `2 + 2 * 2` y calcula la respuesta mentalmente. La respuesta correcta es `6`. Si te salió `8`, esta lección es para ti.

```java
System.out.println(2 + 2 * 2); // 6
```

El resultado es `6`, y no `8`, debido a la prioridad de las operaciones. La prioridad determina en qué orden se realizan las acciones. La multiplicación y la división van antes que la suma y la resta:

```text
Prioridad de las operaciones (de mayor a menor):

  * / %      multiplicación, división, resto
   ↓
  + -        suma, resta
```

Por eso, en el ejemplo anterior primero se calcula `2 * 2`, y solo después se suma el dos al resultado.

Cuando hay operaciones de la misma prioridad juntas, se realizan de izquierda a derecha:

```java
System.out.println(8 / 2 * 3); // 12, primero 8 / 2 = 4, luego 4 * 3 = 12
```

## Control del orden de las operaciones

A veces los cálculos deben ir de una forma distinta a la que dicta la prioridad. Entonces el orden se define con paréntesis, igual que en la escuela:

```java
System.out.println((2 + 2) * 2); // 8
```

Aquí los paréntesis obligan a sumar primero `2 + 2`, y solo después a multiplicar por dos.

Los paréntesis se pueden poner alrededor de cualquier parte de una expresión y anidar unos dentro de otros tantas veces como se quiera:

```java
System.out.println(3 * (4 - 2));                     // 6
System.out.println(7 * 3 + (4 / 2) - (8 + (2 - 1))); // 14
```

En el segundo ejemplo primero se calculan los paréntesis. `4 / 2` da `2`, y `8 + (2 - 1)` da `9`. Queda `21 + 2 - 9`, y al final `14`.

Recuerda una regla. Cierra siempre los paréntesis. Un paréntesis sin cerrar provoca un error, y hasta los programadores experimentados se olvidan del de cierre.

> Escribe los paréntesis en pareja de inmediato. Por ejemplo, escribe `()` y luego rellena la parte interior. La mayoría de los editores de código (incluido el nuestro) añaden ellos mismos el paréntesis de cierre en cuanto escribes el de apertura.

## Paréntesis para la legibilidad

A veces una expresión funciona correctamente, pero se ve enredada. En esos casos se añaden paréntesis para mayor claridad. No afectan al resultado, pero se vuelve más cómodo de leer.

Antes:

```java
System.out.println(8 / 2 + 5 - -4 / 2); // 11
```

Después:

```java
System.out.println(((8 / 2) + 5) - (-4 / 2)); // 11
```

El código lo escriben y lo leen personas, mientras que la máquina solo lo ejecuta. Para la máquina no hay código más o menos comprensible; le basta con que el código sea sintácticamente correcto. Una expresión ordenada con paréntesis ayuda a la persona, sobre todo al trabajar en equipo y al analizar errores.
