La programación existe para realizar operaciones muy diversas. A veces son acciones simples, como sumar números o unir cadenas de texto. Pero más a menudo son procesos complejos, como transferir dinero de una cuenta a otra, tramitar un pedido en una tienda en línea, calcular impuestos o preparar un informe.

Estas operaciones no se pueden expresar con una sola instrucción. Detrás de una acción como "transferir dinero" se ocultan decenas, cientos e incluso miles de líneas de código. Esto incluye comprobar el saldo, descontar la cantidad, tener en cuenta la comisión, actualizar la base de datos y enviar una notificación al usuario.

Para gestionar este código y no perderse en los detalles, en la programación se ideó un mecanismo especial. Reúne un bloque de código en un todo único, oculta la implementación y permite centrarse en el sentido. Al programador le basta con llamarlo y confiarle todo el trabajo interno.

## Cómo se expresan las operaciones

Para expresar una operación arbitraria, la mayoría de los lenguajes de programación utilizan **funciones**. Una función reúne un bloque de código bajo un solo nombre. Desde fuera, todo parece una sola instrucción, mientras que los cientos de líneas de su interior permanecen ocultas.

Aquí hay que hacer una aclaración. En Java no es posible crear una función común, como lo permiten la mayoría de los otros lenguajes. Todas las funciones en Java se crean solo dentro de clases, que aún no hemos estudiado. Las funciones definidas dentro de clases se suelen llamar **métodos**. En adelante nos atendremos a esta terminología.

Ya conocemos un método: `println()`. Muestra datos en la pantalla. Los métodos son una de las construcciones clave en la programación, sin ellos no se puede hacer casi nada. Primero aprenderemos a usar métodos ya creados y solo después a crear los nuestros propios.

Empecemos con los métodos para trabajar con cadenas de texto. A continuación se muestra una llamada al método `length()`, que cuenta la cantidad de caracteres en una cadena:

```java
"Hexlet".length(); // 6
"ABBA".length();   // 4
```

La primera cadena tiene seis caracteres, por eso `"Hexlet".length()` devuelve `6`. La segunda cadena tiene cuatro caracteres, y el resultado es `4`.

Los **métodos** son acciones que se realizan sobre los datos. En programación, se llama **objetos** a los datos que tienen métodos. En realidad todo es un poco más complicado, pero por ahora esta definición es suficiente. En Java, todos los tipos de datos no primitivos (de referencia) son objetos, y las cadenas están entre ellos.

Veamos la estructura de una llamada. Primero se escribe el propio objeto, luego un punto, después el **nombre** del método y los **paréntesis**. El punto muestra que el método se llama sobre un objeto concreto. Los paréntesis muestran que se trata precisamente de una llamada, y no de un acceso a los datos.

Dentro de los paréntesis se indican los **argumentos**, es decir, los datos que el método recibe para trabajar. Puede haber varios, uno o ninguno. El método `length()` no tiene argumentos, por eso los paréntesis están vacíos.

## De dónde vienen los métodos

Algunos métodos están incorporados en el lenguaje, otros los crean los propios programadores.

Los **métodos incorporados** vienen junto con Java. Se pueden usar de inmediato, sin acciones adicionales. Un ejemplo de tal método es `length()` en una cadena. Una gran cantidad de métodos está disponible en las cadenas, los números y otros tipos de datos directamente, de fábrica.

Los **métodos que crean los programadores** aparecen cuando hace falta organizar la propia lógica en un bloque aparte. A tal método se le puede dar cualquier nombre y llamarlo igual que a uno incorporado. Aprenderemos esto más adelante.

Además, existen métodos de bibliotecas externas. Para usarlos, la biblioteca se conecta mediante el mecanismo de importación. Por ahora no estudiamos la importación en detalle. Basta con saber que añade al programa un conjunto de métodos ya listos.

## Un método sin argumentos

Uno de los métodos de cadena más usados es `length()`. Para una cadena, devuelve la cantidad de caracteres.

```java
var message = "Hello!";
var count = message.length();
System.out.println(count); // => 6
```

Aquí la cadena `"Hello!"` tiene seis caracteres, por eso la llamada `message.length()` devuelve el número `6`.

```text
Objeto           Método           Resultado
┌──────────┐     ┌──────────┐     ┌──────────┐
│ "Hello!" │ ──→ │ length() │ ──→ │    6     │
└──────────┘     └──────────┘     └──────────┘
```

## Devolución de un valor

La devolución de un valor es uno de los principios clave del funcionamiento de los métodos. Gracias a ella, unimos los resultados de distintas acciones y construimos una lógica más compleja. Si un método devuelve un valor, se puede guardar en una variable, pasar a otro método o usar en cálculos. Así funciona exactamente `length()`. Cuenta la cantidad de caracteres y entrega el resultado hacia fuera.

```java
var message1 = "Hello!";
var length1 = message1.length(); // guardamos el resultado

var message2 = "World!";
var length2 = message2.length();

// usamos el resultado en una expresión
var combinedLength = length1 + length2;
System.out.println(combinedLength); // 12
```

Los métodos casi nunca muestran datos en la pantalla, los devuelven. Si `length()` imprimiera el resultado de inmediato, como hace `println()`, veríamos el número, pero no podríamos usarlo después. Por eso la devolución de un valor es tan importante. Enlaza los métodos entre sí. Unos devuelven datos, otros los usan en su trabajo. Así es exactamente como, a partir de pequeños pasos, se construyen programas grandes y complejos.

En los ejemplos anteriores, el resultado de cada llamada se escribe en una variable. Pero esto no es obligatorio, un método se puede usar directamente:

```java
var message = "Hexlet";
System.out.println(message.length()); // => 6
```

## Un método con argumentos

Algunos métodos aceptan varios datos a la vez para trabajar. Un ejemplo es el método estático `Math.max()`, que devuelve el mayor de dos números. El primer argumento indica un número, el segundo indica el otro.

```java
// Elegimos el mayor de 2 y 3
var result = Math.max(2, 3);
System.out.println(result); // => 3

// Elegimos el mayor de 10 y 7
System.out.println(Math.max(10, 7)); // => 10
```

Aquí el método se llama no sobre una cadena, sino sobre la clase `Math` a través de un punto. Estos métodos se llaman **estáticos**, pertenecen a la propia clase. En cuanto a la estructura, una llamada con varios argumentos no se diferencia de una llamada sin ellos. El mismo nombre del método, los paréntesis y los argumentos separados por comas dentro.

## Parámetros y argumentos

En las conversaciones sobre los métodos aparecen una y otra vez las palabras **parámetros** y **argumentos**. Están relacionadas entre sí, pero designan cosas diferentes.

De los **parámetros** se habla al crear un método. Se llama parámetro a la variable dentro del método en la que cae el valor pasado. De los **argumentos** se habla al llamar. Se llama argumento a lo que pasamos al método. Es un número, una variable o cualquier expresión.

```java
// números como argumentos
System.out.println(Math.max(2, 3)); // => 3

var x = 2;
// un argumento puede ser una expresión, se evalúa antes de pasarlo al método
System.out.println(Math.max(x + 1, 3)); // => 3
```

No es obligatorio memorizar esto, pero será útil al leer literatura en inglés.

Poco a poco iremos conociendo cada vez más métodos incorporados. Estos métodos son tan numerosos que es imposible recordarlos. La buena noticia es que tampoco hace falta. Nadie recuerda de memoria los nombres de los métodos. Lo principal es tener una idea aproximada de lo que se necesita, y luego ayudarán las sugerencias del editor, la documentación y las búsquedas. Los programadores pasan constantemente tiempo en la documentación, tratando de entender cómo funciona cada cosa.
