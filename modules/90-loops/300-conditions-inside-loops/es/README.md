El cuerpo de un ciclo, igual que el cuerpo de un método, es el lugar donde se ejecutan instrucciones. Eso significa que dentro de él funciona todo lo estudiado antes, incluidas las construcciones condicionales. Así el programa repite una acción muchas veces, pero en cada repetición toma una decisión.

El ciclo recorre los valores uno tras otro, y la condición dentro del ciclo decide qué hacer con el valor actual. Veamos un método que cuenta cuántas veces aparece una letra en una oración:

```java
App.countChars("Fear cuts deeper than swords.", 'e'); // 4
// Si no se encontró nada, el resultado es 0 coincidencias
App.countChars("Sansa", 'y'); // 0
```

Primero intenta responder a estas preguntas:

* ¿Es esta operación una agregación?
* ¿Cuál será la comprobación de la aparición del carácter?

Y ahora veamos el código:

```java
public static int countChars(String str, char ch) {
    var i = 0;
    var count = 0;
    while (i < str.length()) {
        if (str.charAt(i) == ch) {
            // Contamos solo los caracteres que encajan
            count = count + 1;
        }
        // El contador aumenta en cualquier caso
        i = i + 1;
    }

    return count;
}
```

Es una tarea de agregación. El método no cuenta todos los caracteres, pero para calcular el total hay que mirar cada uno igualmente. La variable `count` guarda el resultado y crece solo cuando el carácter actual coincide con el buscado.

## El contador y la condición responden de cosas distintas

En un ciclo así conviene separar dos partes. El contador `i` lleva el programa al carácter siguiente, y el `if` decide qué hacer con el actual. El contador cambia en cada iteración, mientras que la acción dentro del `if` no se ejecuta siempre.

Esto es importante. Si se aumenta `i` solo dentro del `if`, el ciclo se quedará atascado en el primer carácter que no encaje, porque el contador dejará de crecer y la condición `i < str.length()` seguirá siendo verdadera para siempre. El programa entrará en un ciclo infinito. Por eso la línea `i = i + 1` está fuera del `if` y se ejecuta con cualquier resultado de la comprobación.

## El trabajo paso a paso

Analicemos la llamada `countChars("Sansa", 'a')`. Antes del ciclo `i` es igual a `0` y `count` es igual a `0`.

**Paso 1.** La condición `i < str.length()` es verdadera. El carácter con el índice `0` es `S`. No es igual a `a`, así que el bloque `if` no se ejecuta. Después `i` crece hasta `1`.

**Paso 2.** La condición vuelve a ser verdadera. El carácter con el índice `1` es `a`. Coincide con el buscado, por eso `count` crece hasta `1`. Después `i` crece hasta `2`.

Más adelante el ciclo comprueba cada carácter. Los que encajan los cuenta; los demás los salta. Cuando `i` pase a ser igual a la longitud de la cadena, la condición del ciclo se volverá falsa y el método devolverá el valor acumulado de `count`.

La condición dentro del ciclo puede comprobar cualquier cosa: la paridad de un número, la coincidencia de un carácter, la longitud de una cadena o el valor de una variable. Lo principal es que el contador siga cambiando y que el ciclo pueda terminar.
