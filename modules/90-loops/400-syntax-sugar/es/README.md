En programación aparecen a menudo construcciones repetidas. En Java, como en muchos otros lenguajes, su escritura se puede acortar. Esas simplificaciones se llaman **azúcar sintáctico**. Hacen que escribir código sea más corto y más agradable, conservando el mismo resultado.

## Las formas abreviadas de asignación

A menudo el valor de una variable se cambia sumándole o restándole algo, multiplicándolo o dividiéndolo por un número. La variante básica se ve así:

```java
index = index + 1;
count = count * 2;
total = total - 5;
price = price / 3;
```

Java permite escribir lo mismo de forma más corta, con la ayuda de los operadores compuestos:

```java
index += 1; // lo mismo que index = index + 1
count *= 2; // lo mismo que count = count * 2
total -= 5; // lo mismo que total = total - 5
price /= 3; // lo mismo que price = price / 3
```

Cada uno de esos operadores toma el valor actual de la variable, aplica la operación y guarda el resultado en la misma variable. A la izquierda siempre está el nombre de la variable en la que se escribirá el nuevo valor.

## El azúcar en los ciclos

En los ciclos esas abreviaturas aparecen especialmente a menudo. En ellos normalmente se cambia el contador y se acumula el resultado:

```java
var sum = 0;
var index = 1;

while (index <= 5) {
    sum += index;  // lo mismo que sum = sum + index
    index += 1;    // lo mismo que index = index + 1
}

System.out.println(sum); // => 15
```

Sin las abreviaturas, el cuerpo del ciclo sería más largo y más verboso:

```java
while (index <= 5) {
    sum = sum + index;
    index = index + 1;
}
```

## La concatenación de cadenas

Los operadores compuestos funcionan no solo con números. Para las cadenas sirve `+=`, porque `+` une cadenas:

```java
var text = "Hello";
text += " World"; // lo mismo que text = text + " World"
// "Hello World"
```

Por eso, al construir una cadena en un ciclo, el contador se cambia con `+=`, y al resultado se le añade cada vez el siguiente carácter con el mismo operador.

## Las abreviaturas disponibles

Casi todos los operadores tienen forma abreviada: `+=`, `-=`, `*=`, `/=`, `%=`. Todos funcionan según el mismo principio: toman el valor actual de la variable, aplican la operación y devuelven el resultado a su sitio.

Aparte queda el cambio de una variable en una unidad. La escritura `index += 1` se puede acortar a `index++`, y `index -= 1`, a `index--`. Esas dos operaciones se llaman incremento y decremento, tienen sus matices y se les dedica una conversación aparte.
