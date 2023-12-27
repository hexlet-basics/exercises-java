
Las operaciones lógicas son expresiones. Esto significa que **las operaciones lógicas se pueden combinar con otras expresiones**. Veamos un ejemplo. Supongamos que queremos verificar si un número es par. En programación, la paridad se verifica mediante el residuo de la división por 2:

* Si el residuo es 0, entonces el número es par
* Si el residuo no es 0, entonces el número es impar

El residuo de la división es un concepto simple pero muy importante en aritmética, álgebra, teoría de números y criptografía. La idea es simple: se debe dividir un número en grupos iguales. Si queda algo al final, eso es el residuo de la división.

Dividimos caramelos entre personas:

* 7 caramelos, 2 personas: 2 x 3 + **residuo 1**. Esto significa que 7 no es divisible por 2
* 21 caramelos, 3 personas: 3 x 7 + **residuo 0**. Esto significa que 21 es divisible por 3
* 19 caramelos, 5 personas: 5 x 3 + **residuo 4**. Esto significa que 19 no es divisible por 5

En el código, el residuo se calcula utilizando el operador `%`:

* `7 % 2` → `1`
* `21 % 3` → `0`
* `19 % 5` → `4`

Usando esto, escribiremos un método para verificar la paridad:

```java
// Definido en la clase App
public static boolean esPar(int numero) {
    return numero % 2 == 0;
}

App.esPar(10); // true
App.esPar(3); // false
```

https://replit.com/@hexlet/java-basics-logical-operations-1

En una sola expresión hemos combinado dos operadores lógicos:

* `==` - verificación de igualdad
* `%` - operador aritmético de residuo de la división

**La prioridad de las operaciones aritméticas es mayor que la de las operaciones lógicas**. Esto significa que primero se calcula la expresión aritmética `numero % 2`, y luego el resultado se utiliza en la comparación lógica.

En ruso, esto se puede descifrar de la siguiente manera: "Es necesario calcular el residuo de la división del número `numero` por 2 y compararlo con cero; luego devolver el resultado de la comparación".

Veamos otro ejemplo. Escribiremos un método que toma una cadena y verifica si la primera letra es mayúscula. El algoritmo será el siguiente:

1. Obtener y guardar en una variable el primer carácter de la cadena argumento
2. Comparar si el carácter es igual a su versión en mayúscula
3. Devolver el resultado

La implementación en código se verá así:

```java
public static boolean esPrimeraLetraMayuscula(String cadena) {
    var primeraLetra = cadena.charAt(0);
    // La clase Character contiene varios métodos para trabajar con caracteres
    // El método isUpperCase() verifica si el carácter pasado está en mayúscula
    return Character.isUpperCase(primeraLetra);
}

App.esPrimeraLetraMayuscula("marmont"); // false
App.esPrimeraLetraMayuscula("Robb"); // true
```
