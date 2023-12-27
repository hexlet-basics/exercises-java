El ciclo `while` es ideal para situaciones en las que la cantidad de iteraciones no se conoce de antemano, por ejemplo, al buscar un número primo.

Cuando se conoce la cantidad de iteraciones, es preferible utilizar el ciclo `for`. Veamos la implementación de invertir una cadena utilizando el ciclo `for`:

```java
public static String reverseString(String str) {
    var result = "";
    // El contador se incrementa utilizando el operador de incremento.
    // Hablaremos sobre esta operación más adelante.
    for (var i = 0; i < str.length(); i++) {
        result = str.charAt(i) + result;
    }

    return result;
}
```

https://replit.com/@hexlet/java-basics-conditions-for

Este código se puede describir de la siguiente manera:

> El ciclo con el índice `i` se repite mientras `i < str.length()`, y después de cada paso, `i` se incrementa en 1.

En la definición del ciclo `for` se encuentran:

1. El valor inicial del contador. Este código se ejecuta exactamente una vez antes de la primera iteración.
2. El predicado: la condición de repetición del ciclo. Se evalúa en cada iteración, al igual que en el `while`.
3. La descripción del cambio del contador. Este código se ejecuta al final de cada iteración.

Por lo demás, el principio de funcionamiento es exactamente el mismo que el del ciclo `while`.
