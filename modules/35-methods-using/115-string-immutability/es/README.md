Pensemos en qué mostrará en pantalla el siguiente código:

```java
var company = "hexlet";
company.toUpperCase(); // a mayúsculas
System.out.println(company); // => ?
```

Parece que la respuesta será `"HEXLET"`, pero no es así. Este programa mostrará `"hexlet"`. ¿Por qué?

El asunto es que las cadenas en Java son **inmutables** (o **no modificables**). Después de crearlas, su contenido no se puede cambiar. No existen métodos capaces de cambiar la propia cadena. Cualquier método de una cadena solo devuelve una nueva cadena, mientras que el original permanece igual.

## Los métodos de las cadenas no cambian el original

Cuando llamamos a un método en una cadena, parece que la estamos cambiando. Por ejemplo, la convertimos a mayúsculas. En realidad, el método `toUpperCase()` devuelve una nueva cadena en mayúsculas, mientras que la cadena original no cambia.

```text
company = "hexlet"

company.toUpperCase()  →  "HEXLET"  (una cadena nueva)
company                →  "hexlet"  (no ha cambiado)
```

Para no perder el resultado, guardémoslo en una variable:

```java
var company = "hexlet";
var upper = company.toUpperCase();
System.out.println(upper); // => HEXLET
```

Si no se guarda el resultado de un método, simplemente se pierde. Otros métodos funcionan de la misma manera:

```java
var text = "   hi   ";
var cleaned = text.trim();
System.out.println(cleaned); // => "hi", el resultado sin espacios
System.out.println(text);    // => "   hi   ", la cadena no ha cambiado
```

El método `trim()` devolvió una nueva cadena sin espacios en los bordes, pero el propio `text` permaneció igual.

La razón principal de este comportamiento es el rendimiento. Las cadenas y otros tipos de datos primitivos no se pueden cambiar en casi ningún lenguaje moderno. La inmutabilidad permite a Java reutilizar cadenas idénticas en la memoria y ahorrar recursos. También simplifica el código multihilo, donde los mismos datos son leídos por varios hilos a la vez.

La segunda razón está relacionada con la claridad del código. Cuando no cambiamos los datos, sino que creamos nuevos a partir de los antiguos, el código es más fácil de analizar y modificar. Sobre todo si con los datos ocurren muchas transformaciones, algo con lo que aún te toparás. Es imposible cambiar por accidente el valor de una cadena, y esto elimina toda una clase de errores.

## Cómo cambiar los datos

Pero ¿qué hacer si hay que cambiar los datos? Para ello basta con escribir el resultado del método de vuelta en la misma variable:

```java
var language = "JAVA";
language = language.toLowerCase();
System.out.println(language); // => java
```

Esto es apropiado cuando la esencia de los datos no cambia. Después de `toLowerCase()`, es el mismo lenguaje, solo que en minúsculas.

Por otro lado, en una situación así se puede crear una nueva variable con un nombre diferente:

```java
var language = "JAVA";
var processedLanguage = language.toLowerCase();
System.out.println(processedLanguage); // => java
```

Este enfoque a menudo es preferible por motivos de legibilidad. Las variables que cambian constantemente son más difíciles de analizar. Si el resultado de un método representa otra entidad, conviene darle un nombre aparte. Al final, todo depende de la tarea. Con la experiencia llegará la comprensión de qué enfoque es mejor.
