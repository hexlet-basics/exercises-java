En programación, hay una clase de problemas que no se pueden resolver sin bucles: se llaman **agregación de datos**.

Estos problemas incluyen:

* Encontrar el valor máximo
* Encontrar el valor mínimo
* Calcular la suma
* Calcular el promedio aritmético

Su característica principal es que el resultado depende de todo el conjunto de datos. Para calcular la suma, es necesario sumar **todos** los números; para calcular el máximo, es necesario comparar **todos** los números.

Todos aquellos que trabajan con números están familiarizados con este tema. Por ejemplo, los contadores o los especialistas en marketing a menudo trabajan con tablas en programas como Microsoft Excel o Google Sheets.

Veamos el ejemplo más sencillo: encontrar la suma de un conjunto de números. Implementaremos una función que sume los números en un rango especificado, incluyendo los límites.

En este caso, un **rango** es una serie de números desde un punto de inicio hasta un punto final. Por ejemplo, el rango `[1, 10]` incluye todos los números enteros del 1 al 10:

```java
App.sumNumbersFromRange(5, 7); // 5 + 6 + 7 = 18
App.sumNumbersFromRange(1, 2); // 1 + 2 = 3

// Un rango [1, 1] con el mismo inicio y fin también es un rango
// Incluye un solo número, que es el límite del rango
App.sumNumbersFromRange(1, 1); // 1
App.sumNumbersFromRange(100, 100); // 100
```

Para implementar este código, necesitaremos un bucle. Elegimos un bucle porque la suma de números es un proceso iterativo. Se repite para cada número, y el número de iteraciones depende del tamaño del rango.

Para comprender mejor el tema, intenta responder a estas preguntas:

* ¿Con qué valor inicializar el contador?
* ¿Cómo cambiará el contador?
* ¿Cuándo debe detenerse el bucle?

Ahora echa un vistazo al siguiente código:

```java
public static int sumNumbersFromRange(int start, int finish) {
    // Técnicamente, se puede cambiar el valor de start, pero los argumentos de entrada deben mantenerse en su valor original
    // Esto hace que el código sea más fácil de analizar
    var i = start;
    var sum = 0; // Inicialización de la suma

    while (i <= finish) { // Avanzamos hasta el final del rango
        sum = sum + i; // Calculamos la suma para cada número
        i = i + 1; // Pasamos al siguiente número en el rango
    }

    // Devolvemos el resultado obtenido
    return sum;
}
```

La estructura general del bucle es la siguiente:

* Un contador que se inicializa con el valor inicial del rango
* El bucle en sí, con una condición de finalización cuando se alcanza el final del rango
* La modificación del contador al final del cuerpo del bucle

El número de iteraciones en este bucle es igual a `finish - start + 1`. Por ejemplo, se necesitan 3 iteraciones para calcular el rango del 5 al 7:

```text
7 - 5 + 1 = 3
```

Las principales diferencias con el procesamiento normal están relacionadas con la lógica de cálculo del resultado. En los problemas de agregación, siempre hay una variable que almacena el resultado del bucle. En el código anterior, esta variable es `sum`.

En cada iteración del bucle, se actualiza sumando el siguiente número del rango: `sum = sum + i`. Todo el proceso se ve así:

```java
// Para llamar a sumNumbersFromRange(2, 5);
var sum = 0;
sum = sum + 2; // 2
sum = sum + 3; // 5
sum = sum + 4; // 9
sum = sum + 5; // 14
// 14 es la suma de los números en el rango [2, 5]
```

En matemáticas, existe el concepto de **elemento neutro de la operación**. Una operación con este elemento no cambia el valor sobre el que se realiza la operación:

* En la suma, cualquier número más cero es igual al número original
* En la resta, es lo mismo
* Incluso en la concatenación, hay un elemento neutro: la cadena vacía `"" + "uno"` es `"uno"`
