El trabajo con ciclos se reduce normalmente a dos escenarios. En el primero, el resultado se acumula durante las iteraciones y el trabajo con él se hace ya después del ciclo. Ese enfoque se llama agregación, y la inversión de una cadena pertenece a él. En el segundo, el ciclo se ejecuta hasta alcanzar el resultado necesario y termina antes de tiempo. Así está montada, por ejemplo, la comprobación de un número primo, que se divide sin resto solo por sí mismo y por uno.

Veamos el algoritmo de comprobación de la primalidad de un número. Dividiremos el número buscado `x` por todos los números del rango desde dos hasta `x - 1` y miraremos el resto. Si en ese rango no se encontró un divisor que divida `x` sin resto, entonces tenemos delante un número primo.

## Comprobación de la primalidad del número 5: análisis paso a paso

1. Tomamos el número `x = 5`. Los posibles divisores los buscamos en el rango desde 2 hasta `x - 1`, es decir, desde 2 hasta 4
2. Dividimos 5 por 2. El resto es igual a 1, no encontramos divisor, continuamos
3. Dividimos 5 por 3. El resto es igual a 2, no encontramos divisor, continuamos
4. Dividimos 5 por 4. El resto es igual a 1, no encontramos divisor, terminamos el recorrido

Resultado: en el rango desde 2 hasta 4 no se encontró ningún número por el que 5 se divida sin resto. Eso significa que 5 es un número primo.

La búsqueda de divisores basta con limitarla a la mitad del número. Por ejemplo, 11 no se divide por 2, 3, 4, 5, y por números mayores que su mitad todavía menos se dividirá. Eso significa que el algoritmo se puede optimizar y comprobar la división solo hasta `x / 2`:

```java
public static boolean isPrime(int number) {
    if (number < 2) {
        return false;
    }

    var divider = 2;

    while (divider <= number / 2) {
        if (number % divider == 0) {
            return false;
        }

        divider++;
    }

    return true;
}

App.isPrime(1); // false
App.isPrime(2); // true
App.isPrime(3); // true
App.isPrime(4); // false
```

_Si somos honestos hasta el final, para resolver la tarea basta con comprobar los números hasta la raíz cuadrada de `number`. Pero aquí lo importante es centrarse en el trabajo con la condición dentro del ciclo_

La técnica principal de esta lección es la salida del método directamente desde dentro del ciclo:

```text
while (...) {
    if (condición) {
        return valor; ← salida del método (y del ciclo)
    }
    ...
}
─────────────────────────────────
Sin return el ciclo llega hasta el final
```

El algoritmo está construido de tal manera que, al dividir de forma secuencial por los números hasta `x / 2`, basta con encontrar al menos un divisor sin resto. Entonces el argumento que se pasó es un número compuesto, y los cálculos posteriores no tienen sentido. En ese lugar está la devolución de `false`, y `return` termina de inmediato tanto el ciclo como el método entero.

Y solo si el ciclo se ejecutó por completo y no se encontró ningún divisor sin resto, la ejecución llegará a la última línea. El método devolverá `true`, porque el número resultó ser primo.
