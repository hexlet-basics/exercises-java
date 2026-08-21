A nivel básico, las computadoras trabajan solo con números. Incluso cuando escribes una aplicación grande en un lenguaje moderno, por dentro se realizan cálculos constantemente. El programa suma, resta, multiplica y divide números miles de veces por segundo.

El total de los productos en el carrito de una tienda en línea, las coordenadas de un personaje en un juego, la duración de un vídeo en segundos. Detrás de todo esto están las operaciones aritméticas comunes.

Por suerte, para empezar basta con la aritmética escolar común. Por ahí empezaremos.

## Suma

En matemáticas, una suma se escribe como 3 + 4. En Java, la expresión se ve igual. Por sí sola no muestra nada en la pantalla, así que el resultado hay que imprimirlo.

Para imprimir se usa el conocido comando `System.out.println()`. Aquí tienes un programa completo que suma dos números e imprime el resultado:

```java
class App {
    public static void main(String[] args) {
        System.out.println(3 + 4);
    }
}
```

Primero se calcula la suma, y luego el número obtenido entra dentro del comando de impresión.

```text
System.out.println(3 + 4);
                   └─┬─┘
                     7

System.out.println(7);  →  7
```

Después de ejecutarlo, en la pantalla aparecerá el resultado:

```text
7
```

Si tomamos la misma expresión entre comillas, el resultado cambia. Entre comillas se obtiene texto, y en la pantalla saldrá la cadena tal cual:

```java
System.out.println("3 + 4"); // 3 + 4
System.out.println(3 + 4);   // 7
```

En la primera línea, Java ve texto y lo imprime literalmente. En la segunda ve aritmética y calcula.

## Otras operaciones

Además de la suma, en Java existe todo el conjunto habitual de operaciones:

| Operación            | Símbolo | Ejemplo | Resultado |
|----------------------|---------|---------|-----------|
| Suma                 | `+`     | `2 + 3` | `5`       |
| Resta                | `-`     | `7 - 2` | `5`       |
| Multiplicación       | `*`     | `4 * 3` | `12`      |
| División             | `/`     | `8 / 2` | `4`       |
| Resto de la división | `%`     | `7 % 3` | `1`       |

Mostremos el resultado de una división y luego el resultado de una multiplicación:

```java
System.out.println(8 / 2);     // 4
System.out.println(3 * 3 * 3); // 27
```

En Java no hay un operador aparte para la potenciación. Cuando el exponente es pequeño, se multiplica el número por sí mismo la cantidad de veces necesaria, como en el ejemplo anterior con `3 * 3 * 3`.

## División de números enteros

Con la división en Java hay una particularidad importante. Cuando ambos números son enteros, el resultado también es entero, y la parte fraccionaria se descarta:

```java
System.out.println(8 / 2); // 4
System.out.println(7 / 2); // 3
```

En el segundo ejemplo, en una calculadora saldría 3.5. Java divide 7 entre 2 de forma entera y deja solo la parte entera, es decir, 3. El resto se pierde.

Esto ocurre porque en Java los números enteros se almacenan por separado de los fraccionarios. Para trabajar con fracciones, Java tiene un tipo especial de números. Se llaman números de punto flotante y se escriben con un punto, por ejemplo `3.5`. Por ahora nos bastan los enteros.

## Resto de la división

La operación `%` extrae lo que queda después de una división entera.

```java
System.out.println(7 % 3); // 1
```

¿Por qué sale 1? El tres cabe dos veces en el siete, lo que da 6. Falta uno para llegar al siete, y ese uno es el resto.

Más ejemplos:

```java
System.out.println(10 % 4); // 2, el cuatro cabe dos veces en el diez, quedan 2 para llegar a 10
System.out.println(15 % 5); // 0, el cinco divide 15 exactamente
```

El resto ayuda en muchas tareas. Con él se comprueba si un número se divide de forma exacta. Si el resto es cero, entonces se divide. Así se distinguen los números pares de los impares, ya que el resto de dividir entre 2 es 0 en los pares y 1 en los impares. Y además el resto ayuda a contar en círculo. El resto de dividir entre 12 funciona como la esfera de un reloj, y `13 % 12` da `1`, porque después del doce la cuenta empieza de nuevo. Esta operación aparece en el código constantemente.

## Formato de las expresiones

Para Java no hay diferencia entre `3+4` y `3 + 4`. El programa entiende ambas variantes de la misma manera y en ambos casos suma los números. La diferencia está solo en la legibilidad. En programación se acostumbra a separar los operadores aritméticos con espacios, porque así la expresión se percibe más fácilmente:

```text
3 + 4
8 / 2
7 % 3
```

La variante sin espacios también funciona:

```text
3+4
8/2
7%3
```

Se ve apretada y cuesta más a la vista. Acostúmbrate a escribir desde el principio con espacios alrededor de los operadores.
