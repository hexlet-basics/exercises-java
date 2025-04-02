Las variables son útiles no solo para almacenar y reutilizar información, sino también para simplificar cálculos complejos.

Veamos un ejemplo: necesitamos convertir euros a rublos a través de dólares. Los bancos a menudo realizan conversiones similares a través de una moneda intermedia al realizar compras en el extranjero.

Primero, convirtamos 50 euros a dólares. Supongamos que un euro equivale a 1.25 dólares:

```java
var amountDollars = 50 * 1.25;
System.out.println(amountDollars);
```

En el bloque anterior, asignamos un valor específico a una variable. Pero aquí, a la derecha del signo igual, hay una **expresión**:

```java
var amountDollars = 50 * 1.25;
```

El programa calculará el resultado *62.5* y lo asignará a la variable. Desde el punto de vista del programa, no importa si está escrito *62.5* o *50 * 1.25*. Ambas opciones son expresiones que deben evaluarse. Y se evalúan en el mismo valor *62.5*.

Cualquier cadena de texto es una expresión. La concatenación de cadenas también es una expresión. Cuando el programa encuentra una expresión, la evalúa y **devuelve** el resultado.

Aquí tienes algunos ejemplos de expresiones. A la derecha de cada expresión, se muestra el valor resultante:

```java
62.5            // 62.5
50 * 1.25       // 62.5
120 / 10 * 2    // 24
"Hexlet"         // "Hexlet"
"Good" + "will" // "Goodwill"
```

Las reglas de construcción del código permiten colocar cualquier cálculo donde se espera una expresión. Y el cálculo puede ser tanto matemático como de cadenas de texto, como la concatenación. El programa seguirá funcionando correctamente.

Por esta razón, no es posible describir y mostrar todos los casos de uso de todas las operaciones. Los programas están compuestos por muchas combinaciones de expresiones, y comprender este concepto es uno de los pasos clave en tu camino.

Volvamos a nuestro programa de conversión de moneda. Guardemos el valor del dólar en rublos como una variable separada. Calculemos el precio de 50 euros en dólares multiplicándolos por 1.25. Supongamos que 1 dólar equivale a 60 rublos:

```java
var rublesPerDollar = 60;
var amountDollars = 50 * 1.25; // 62.5
var amountRubles = amountDollars * rublesPerDollar; // 3750
System.out.println(amountRubles); // => 3750
```

Y ahora agreguemos texto a la salida utilizando la concatenación:

```java
var rublesPerDollar = 60;
var amountDollars = 50 * 1.25; // 62.5
var amountRubles = amountDollars * rublesPerDollar; // 3750
System.out.println("El precio es " + amountRubles + " rublos");
// => El precio es 3750 rublos
```

Cualquier variable puede formar parte de cualquier expresión. En el momento de la evaluación, el valor de la variable se sustituye en lugar de su nombre. El valor de `amountDollars` se calcula antes de que se utilice en otras expresiones. Cuando llega el momento de usar la variable, Java conoce su valor porque ya lo ha calculado.
