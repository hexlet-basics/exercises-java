Imagina que tienes la tarea de imprimir en la pantalla la frase *¡Padre!* dos veces. Puedes resolver este problema de manera directa:

```java
System.out.println("¡Padre!"); // => ¡Padre!
System.out.println("¡Padre!"); // => ¡Padre!
```

En el caso más simple, esto funciona bien. Sin embargo, si la frase *¡Padre!* se utiliza con más frecuencia y en diferentes partes del programa, tendrás que repetirla en todas partes. Los problemas con este enfoque surgirán cuando necesites cambiar la frase, lo cual ocurre con bastante frecuencia. Tendrás que encontrar todos los lugares donde se utilizó la frase *¡Padre!* y realizar el reemplazo necesario. Pero hay otra forma de hacerlo. En lugar de copiar nuestra expresión, simplemente crea una variable con esta frase:

```java
// greeting - se traduce como saludo
// var - solo se necesita al definir la variable
var greeting = "¡Padre!";
System.out.println(greeting);
System.out.println(greeting);
```

En la línea `var greeting = "¡Padre!"`, se asigna el valor `"¡Padre!"` a la variable con el nombre `greeting`.

Una vez que se crea la variable, puedes comenzar a usarla. Se inserta en los lugares donde solía estar nuestra frase. Durante la ejecución del código, en la línea `System.out.println(greeting)`, el contenido de la variable se inserta en lugar de la variable misma, y luego se ejecuta el código. Como resultado, la salida de nuestro programa será la siguiente:

<pre class='hexlet-basics-output'>
¡Padre!
¡Padre!
</pre>

Para el nombre de la variable, se puede utilizar cualquier conjunto de caracteres válidos, que incluyen letras del alfabeto inglés, números y el guión bajo `_`. Sin embargo, no se puede colocar un número al principio. Los nombres de las variables distinguen entre mayúsculas y minúsculas, es decir, `hello` y `heLLo` son dos nombres diferentes y dos variables diferentes. A continuación se muestra un ejemplo con dos variables diferentes:

```java
var greeting1 = "¡Padre!";
System.out.println(greeting1);
System.out.println(greeting1);
var greeting2 = "¡Madre!";
System.out.println(greeting2);
System.out.println(greeting2);
```

<pre class='hexlet-basics-output'>
¡Padre!
¡Padre!
¡Madre!
¡Madre!
</pre>

https://replit.com/@hexlet/java-basics-variables-1

Para facilitar el análisis del programa, se recomienda crear variables lo más cerca posible del lugar donde se utilizan.
