Los programas que escribimos durante el aprendizaje se vuelven cada vez más complejos y extensos. Aunque todavía están muy lejos de los programas reales, donde la cantidad de líneas de código se mide en decenas y cientos de miles, la complejidad actual puede ser desafiante para las personas sin experiencia.

A partir de esta lección, nos adentraremos en uno de los temas básicos más complejos de la programación: los **ciclos**.

Todos los programas de aplicación tienen objetivos muy pragmáticos. Ayudan a gestionar empleados, finanzas y, en última instancia, a entretener. A pesar de las diferencias, todos estos programas ejecutan algoritmos que son muy similares entre sí.

Un **algoritmo** es una secuencia de acciones o instrucciones que nos lleva a un resultado esperado. Esta descripción se aplica a cualquier programa, pero los algoritmos suelen ser algo más específicos.

Imagina que tenemos un libro y queremos encontrar una frase específica en su interior. Recordamos la frase, pero no sabemos en qué página está. ¿Cómo podemos encontrar la página que buscamos?

La forma más sencilla y lenta es revisar el libro secuencialmente hasta encontrar la página deseada. En el peor de los casos, tendríamos que revisar todas las páginas, pero de todas formas obtendríamos el resultado.

Este proceso se llama **algoritmo**. Incluye la búsqueda de páginas y comprobaciones lógicas para determinar si encontramos la frase o no. No sabemos de antemano cuántas páginas tendremos que revisar, pero el proceso de revisión se repite de la misma manera una y otra vez.

Para realizar acciones repetitivas, necesitamos los ciclos. Cada repetición se llama **iteración**.

Supongamos que queremos escribir un método que imprima en pantalla todos los números del 1 al número que se especifica como parámetro:

```java
App.printNumbers(3);
// 1
// 2
// 3
```

No podemos implementar este método con los conocimientos que ya tenemos, ya que no sabemos de antemano cuántas veces se imprimirá en pantalla. Pero con los ciclos, esto no es un problema:

```java
public static void printNumbers(int lastNumber) {
    // i es una abreviatura de "índice"
    // Se utiliza por convención en muchos lenguajes como contador del ciclo
    var i = 1;

    while (i <= lastNumber) {
        System.out.println(i);
        i = i + 1;
    }
    System.out.println("finished!");
}

App.printNumbers(3);
```

<pre class='hexlet-basics-output'>
1
2
3
finished!
</pre>

En el código del método se utiliza el ciclo `while`. Está compuesto por tres elementos:

* La **palabra clave** `while`. Aunque se parece a una llamada a un método, no lo es.
* El **predicado** es una condición que se especifica entre paréntesis después de `while` y se evalúa en cada iteración.
* El **cuerpo del ciclo** es un bloque de código entre llaves, similar a un bloque de código en un método. Todas las constantes o variables definidas dentro de este bloque solo serán visibles dentro de él.

La construcción se lee de la siguiente manera: "haz lo que se especifica en el cuerpo del ciclo mientras la condición `i <= lastNumber` sea verdadera". Veamos cómo funciona este código para la llamada `App.printNumbers(3)`:

```java
// Se inicializa i
var i = 1;

// El predicado devuelve true, por lo que se ejecuta el cuerpo del ciclo
while (1 <= 3)
// System.out.println(1);
// i = 1 + 1;

// Se termina el cuerpo del ciclo, por lo que se vuelve al principio
while (2 <= 3)
// System.out.println(2);
// i = 2 + 1;

// Se termina el cuerpo del ciclo, por lo que se vuelve al principio
while (3 <= 3)
// System.out.println(3);
// i = 3 + 1;

// El predicado devuelve false, por lo que la ejecución continúa después del ciclo
while (4 <= 3)

// System.out.println("finished!");
// En este punto, i es igual a 4, pero ya no lo necesitamos
// El método finaliza
```

Lo más importante en un ciclo es su **finalización**, es decir, **salir del ciclo**. El proceso que genera el ciclo debe detenerse en algún momento. La responsabilidad de detenerlo recae completamente en el programador.

Por lo general, la tarea se reduce a introducir una variable llamada **contador del ciclo**. Funciona de la siguiente manera:

* Primero, se inicializa el contador, es decir, se le asigna un valor inicial. En el ejemplo anterior, el contador es la instrucción `var i = 1`, que se ejecuta antes de entrar al ciclo.
* Luego, en la condición del ciclo, se verifica si el contador ha alcanzado su valor límite.
* Finalmente, el contador cambia su valor `i = i + 1`

Los principiantes cometen la mayoría de los errores en este punto. Supongamos que hay un error en la verificación del predicado. Esto puede llevar a un **bucle infinito**, una situación en la que el ciclo se ejecuta indefinidamente y el programa nunca se detiene.

En ese caso, tendríamos que detenerlo forzosamente:

```java
public static void printNumbers(int lastNumber) {
    var i = 1;

    // Este ciclo nunca se detendrá
    // y siempre imprimirá el mismo valor
    while (i <= lastNumber) {
        System.out.println(i);
    }
    System.out.println("finished!");
}
```

En algunos casos, los bucles infinitos son útiles. No los estamos considerando aquí, pero es útil ver cómo se ve este código:

```java
while (true) {
    // Hacer algo
}
```

En resumen, ¿cuándo se necesitan los ciclos y cuándo se pueden evitar? No se pueden evitar los ciclos cuando el algoritmo para resolver un problema requiere la repetición de ciertas acciones y no se conoce de antemano la cantidad de operaciones necesarias. Esto fue evidente en el ejemplo del libro que vimos al comienzo de la lección.
