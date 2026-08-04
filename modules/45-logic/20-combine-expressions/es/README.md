
Las operaciones lógicas son expresiones. Eso significa que **las operaciones lógicas se pueden combinar con otras expresiones**. Veámoslo con un ejemplo. Supongamos que queremos comprobar la paridad de un número. En programación, la paridad se comprueba con el resto de la división por 2:

* Si el resto es 0, el número era par
* Si el resto no es 0, el número era impar

El resto de la división es un concepto simple, pero muy importante en aritmética, álgebra, teoría de números y criptografía. La idea es sencilla: hay que dividir un número en varios grupos iguales. Si al final queda algo, eso es el resto de la división.

Repartimos caramelos a partes iguales entre personas:

* 7 caramelos, 2 personas: 2 x 3 + **resto 1**. Significa que 7 no es múltiplo de 2
* 21 caramelos, 3 personas: 3 x 7 + **resto 0**. Significa que 21 es múltiplo de 3
* 19 caramelos, 5 personas: 5 x 3 + **resto 4**. Significa que 19 no es múltiplo de 5

En el código, el resto se calcula con la ayuda del operador `%`:

* `7 % 2` → `1`
* `21 % 3` → `0`
* `19 % 5` → `4`

Con su ayuda escribiremos un método para comprobar la paridad:

```java
// Definido en la clase App
public static boolean isEven(int number) {
    return number % 2 == 0;
}

App.isEven(10); // true
App.isEven(3); // false
```

En una sola expresión hemos combinado dos operadores:

* `==` — comprobación de igualdad
* `%` — operador aritmético del resto de la división

**La prioridad de las operaciones aritméticas es mayor que la de las lógicas.** Eso significa que primero se calcula la expresión aritmética `number % 2`, y después el resultado participa en la comparación lógica.

En palabras, se puede leer así: «Hay que calcular el resto de la división del número `number` por 2 y compararlo con cero; después devolver el resultado de la comparación».

Veamos otro ejemplo. Escribamos un método que recibe una cadena y comprueba si la primera letra es mayúscula. El algoritmo de acciones será el siguiente:

1. Obtenemos y guardamos en una variable el primer carácter de la cadena que llega como argumento
2. Comparamos si el carácter es igual a su versión en mayúscula
3. Devolvemos el resultado

Y así se verá la implementación en el código:

```java
public static boolean isFirstLetterInUpperCase(String string) {
    var firstLetter = string.charAt(0);
    // La clase Character contiene distintos métodos para trabajar con caracteres
    // El método isUpperCase() comprueba que el carácter que se le pasa está en mayúscula
    return Character.isUpperCase(firstLetter);
}

App.isFirstLetterInUpperCase("marmont"); // false
App.isFirstLetterInUpperCase("Robb"); // true
```
