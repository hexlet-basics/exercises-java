Pensemos en qué mostrará en pantalla el siguiente código:

```java
var company = "hexlet";
company.toUpperCase(); // en mayúsculas
System.out.println(company); // => ?
```

Parece que la respuesta será `"HEXLET"`, pero no es así. Este programa mostrará `"hexlet"` (compruébalo en [tryjshell](https://onecompiler.com/jshell)). ¿Por qué?

El motivo es que las cadenas en Java son inmutables. No hay forma ni métodos que puedan modificar la cadena en sí misma. Cualquier método de cadena solo puede devolver una nueva cadena.

La razón principal de esto es el rendimiento. Las cadenas y otros tipos de datos primitivos no se pueden modificar en prácticamente ningún lenguaje de programación moderno.

La segunda razón está relacionada con la simplicidad del código. Cuando no modificamos los datos, sino que creamos nuevos datos basados en los antiguos, el código es más fácil de analizar y modificar. Especialmente cuando se realizan muchas manipulaciones con los datos, lo cual te encontrarás en el futuro.

Pero, ¿qué hacer si necesitamos cambiar los datos? Para ello, simplemente debemos reemplazar el valor de la variable:

```java
var language = "JAVA";
language = language.toLowerCase();
System.out.println(language); // => java
```

Por otro lado, en una situación como esta, también podemos crear una nueva variable con un nombre diferente:

```java
var language = "JAVA";
var processedLanguage = language.toLowerCase();
System.out.println(processedLanguage); // => java
```

Este enfoque a menudo es preferible por motivos de legibilidad. Las variables que cambian constantemente son más difíciles de analizar. Al final, todo depende de la tarea. Con la experiencia, se adquiere la comprensión de qué enfoque es mejor.
