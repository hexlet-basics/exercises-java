Imagina que tenemos un programa como este:

```java
var x = "Father!";
System.out.println(x);
```

Desde el punto de vista técnico, todo funciona. Pero aquí se usa una variable llamada `x`. Los nombres malos dificultan leer y entender el código. Aquí tienes algunos ejemplos de variables poco afortunadas:

```java
var a = "John";
var n = 42;
var ddr = "New York";
```

¿Qué son estas variables? ¿Qué se guarda en ellas? Para entenderlo, hay que leer todo el resto del código y adivinar por el contexto.

A la computadora le da igual cómo se llame una variable. Para ella, `x`, `abc`, `message` o `elephantInTheRoom` son simplemente etiquetas para almacenar datos. Para las personas es distinto. Los programadores leen código mucho más a menudo de lo que lo escriben, y no solo el suyo propio, sino también el escrito por otras personas. Por eso los nombres de las variables se convierten en una parte importante de la comunicación a través del código.

## Buenos ejemplos

```java
var userName = "Arya Stark";
var unpaidOrdersCount = 3;
var maxAttempts = 5;
```

Un buen nombre de variable ayuda a entender qué hace el programa sin necesidad de leer con atención cada línea. Es especialmente importante dar nombres cuyo significado se entienda sin contexto, sin leer todo el código de alrededor.

Aquí tienes algunos consejos:

- Usa el inglés. Es el estándar internacional. Es mejor escribir `ordersCount` en lugar de `kolvoZakazov`. Si el inglés todavía te resulta difícil, usa un traductor, es algo normal. Con el tiempo se hará más fácil.
- Procura que el nombre refleje el significado de la variable. Que sea un poco más largo, pero comprensible.
- No tengas miedo de dedicar tiempo a elegir un buen nombre. Es una inversión en la legibilidad y el mantenimiento del código.

Entre los programadores incluso hay un chiste: "Algunas de las tareas más difíciles en programación siguen siendo la invalidación de la caché y la elección de nombres para las variables". A veces inventar un nombre adecuado es realmente difícil. Aquí tienes un ejemplo: ¿cómo llamarías a una variable que almacena la cantidad de pedidos impagos de clientes con deuda del trimestre anterior?

Y ahora un pequeño ejercicio. Inventa un nombre para una variable que vaya a almacenar "la cantidad de hermanos y hermanas del rey". Anótalo en una libreta o envíatelo por correo. Solo el nombre, sin explicaciones. Al cabo de un tiempo, míralo de nuevo y comprueba si el significado de la variable se entiende solo por el nombre.
