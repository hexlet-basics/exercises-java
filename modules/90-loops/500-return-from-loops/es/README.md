
El trabajo con bucles generalmente se reduce a dos escenarios:

1. Agregación: acumular un resultado durante las iteraciones y trabajar con él después del bucle. Invertir una cadena es un ejemplo de este tipo de escenario.
2. Ejecutar el bucle hasta que se alcance un resultado deseado y salir. Por ejemplo, la tarea de buscar números primos. Recordemos que un número primo solo se divide exactamente por sí mismo y por uno.

Veamos un algoritmo simple para verificar si un número es primo. Intentaremos dividir el número buscado `x` por todos los números en el rango desde dos hasta `x - 1` y observar el resto de la división. Si no se encuentra ningún divisor en este rango que divida al número `x` sin dejar resto, entonces tenemos un número primo.

Podemos notar que es suficiente verificar los números hasta `x - 1/2`. Por ejemplo, 11 no se divide por 2, 3, 4, 5. Pero garantizamos que no se dividirá por números mayores que la mitad de sí mismo.

Por lo tanto, podemos realizar una pequeña optimización y verificar la división solo hasta `x / 2`:

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

El algoritmo está construido de tal manera que si durante la división secuencial por números hasta `x / 2` se encuentra al menos uno que divide sin dejar resto, entonces el argumento pasado no es un número primo y, por lo tanto, los cálculos posteriores no tienen sentido. En este punto, se debe devolver `false`.

Y solo si el bucle se ejecuta por completo, se puede concluir que el número es primo, ya que no se encontró ningún número que divida al número sin dejar resto.
