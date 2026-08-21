Las variables son útiles no solo para almacenar y reutilizar información, sino también para simplificar cálculos complejos.

Veamos un ejemplo: necesitamos convertir euros a rublos a través de dólares. Los bancos suelen hacer conversiones similares a través de una moneda intermedia al realizar compras en el extranjero.

Para empezar, convirtamos 50 euros a dólares. Supongamos que un euro son 1.25 dólares:

```java
var dollarsCount = 50 * 1.25;
System.out.println(dollarsCount);
```

En el bloque anterior escribíamos un valor concreto en la variable. Pero aquí, a la derecha del signo igual, hay una **expresión**:

```java
var dollarsCount = 50 * 1.25;
```

El programa calculará el resultado *62.5* y lo escribirá en la variable. Desde el punto de vista del programa, no importa qué esté escrito: *62.5* o *50 * 1.25*. Ambas variantes son expresiones que hay que calcular. Y ambas se calculan al mismo valor *62.5*.

Cualquier cadena es una expresión. La concatenación de cadenas también es una expresión. Cuando el programa ve una expresión, la calcula y **devuelve** el resultado.

Aquí tienes algunos ejemplos de expresiones. En los comentarios a la derecha de cada expresión se indica el valor resultante:

```text
62.5            // 62.5
50 * 1.25       // 62.5
120 / 10 * 2    // 24
"Hexlet"         // "Hexlet"
"Good" + "will" // "Goodwill"
```

Las reglas de construcción del código son tales que, en los lugares donde se espera una expresión, se puede poner cualquier cálculo. Además, el cálculo puede ser no solo matemático, sino también de cadenas, por ejemplo, la concatenación. Y el programa seguirá funcionando.

Por esta razón, es imposible describir y mostrar todos los casos de uso de todas las operaciones. Los programas están formados por muchas combinaciones de expresiones, y comprender este concepto es uno de los pasos clave en tu camino.

Volvamos a nuestro programa de divisas. Escribamos el valor del dólar en rublos como una variable aparte. Calculemos el precio de 50 euros en dólares multiplicándolos por 1.25. Supongamos que 1 dólar son 60 rublos:

```java
var rublesPerDollar = 60;
var dollarsCount = 50 * 1.25; // 62.5
var rublesCount = dollarsCount * rublesPerDollar; // 3750
System.out.println(rublesCount); // => 3750
```

Y ahora agreguemos texto a la salida mediante la concatenación:

```java
var rublesPerDollar = 60;
var dollarsCount = 50 * 1.25; // 62.5
var rublesCount = dollarsCount * rublesPerDollar; // 3750
System.out.println("The price is " + rublesCount + " rubles");
// => The price is 3750 rubles
```

Cualquier variable puede formar parte de cualquier expresión. En el momento del cálculo, el nombre de la variable se sustituye por su valor. El valor de `dollarsCount` se calcula antes de que empiece a usarse en otras expresiones. Cuando llega el momento de usar la variable, Java conoce su valor, porque ya lo ha calculado.
