Con la ayuda del ciclo `while` se resuelve cualquier tarea de recorrido, pero lo distingue su verbosidad. Para `while` hay que declarar el contador aparte, indicar aparte la condición de parada y cambiar aparte el contador en el cuerpo del ciclo. Cuando hay pocos ciclos, es tolerable. En el código real los ciclos aparecen a cada paso, y gestionar tres partes a mano resulta agotador, sobre todo cuando la cantidad de repeticiones se conoce de antemano.

Para esos casos Java tiene el ciclo `for`. Reúne las tres partes en una sola línea. Veamos la implementación de la inversión de una cadena con `for`:

```java
public static String reverseString(String str) {
    var result = "";
    for (var i = 0; i < str.length(); i++) {
        result = str.charAt(i) + result;
    }

    return result;
}

App.reverseString("code"); // "edoc"
```

La escritura `i++` aumenta el contador en una unidad. Es la forma corta de `i = i + 1`, y en la cabecera del ciclo es la que aparece más a menudo. El código en sí se puede describir con palabras así:

> El ciclo con el índice `i` empieza con el valor `0`, se repite mientras `i < str.length()`, y después de cada paso aumenta `i` en una unidad

En la cabecera del ciclo `for` hay exactamente tres partes, separadas por puntos y comas:

1. El valor inicial del contador. Este código se ejecuta una sola vez antes de la primera iteración
2. El predicado: la condición de repetición. Se comprueba antes de cada iteración, exactamente igual que en `while`
3. El cambio del contador. Este código se ejecuta al final de cada iteración

En lo demás, el principio de funcionamiento es el mismo que en `while`.

## Análisis paso a paso

Veamos cómo se ejecuta el ciclo en la llamada `reverseString("go!")`. Antes del ciclo, `result` es igual a la cadena vacía:

```text
reverseString("go!")

antes del ciclo: result = ""

i=0: charAt(0) = 'g'
result = 'g' + ""   = "g"

i=1: charAt(1) = 'o'
result = 'o' + "g"  = "og"

i=2: charAt(2) = '!'
result = '!' + "og" = "!og"
```

Cada carácter se toma por su índice de izquierda a derecha y se pega al principio del resultado. Por eso la cadena se construye en orden inverso.

## Comparación con while

Un mismo recorrido de una cadena con los dos ciclos se ve así:

```text
for (var i = 0; i < str.length(); i++) {     var i = 0;
    System.out.println(str.charAt(i));       while (i < str.length()) {
}                                                System.out.println(str.charAt(i));
                                                 i = i + 1;
│                                            │   }
└── contador en una sola línea               └── contador repartido por el cuerpo
```

El ciclo `for` mantiene toda la gestión del contador en la cabecera, por eso el cuerpo queda limpio. Cuando la cantidad de repeticiones se sabe de antemano, `for` se lee mejor. Cuando no está claro de antemano cuántas iteraciones habrá, por ejemplo al buscar un número primo, resulta más cómodo `while`.

Mostremos otro ejemplo con un contador numérico. Sumemos los números de `0` a `9`:

```java
var sum = 0;
for (var i = 0; i < 10; i++) {
    sum = sum + i;
}

System.out.println(sum); // => 45
```

El contador empieza en cero, el ciclo avanza mientras `i < 10`, y en cada paso `i` crece en una unidad. Dentro del cuerpo queda solo la acumulación de la suma.
