El procesamiento de datos puede constar de una gran cantidad de pasos que hay que realizar uno tras otro.

Tomemos como ejemplo la siguiente tarea: formar la dirección de una página web a partir del título de un artículo introducido por el usuario. Esta tarea surge a menudo al publicar artículos en blogs. Estas direcciones se ven así:

```text
https://codica.la/blog/de-obrero-a-programador
```

La última parte aquí, _de-obrero-a-programador_, se crea automáticamente con el código que escribimos en Hexlet. Tiene un nombre especial: se llama [**slug**](https://es.wikipedia.org/wiki/URL_sem%C3%A1ntica).

¿Qué pasos hay que realizar para obtener una cadena similar? Aquí solo algunos de ellos:

- Convertir todo a minúsculas, para que no se creen accidentalmente duplicados de páginas idénticas en los motores de búsqueda
- Limpiar el título de los espacios en blanco de los extremos. Pueden aparecer accidentalmente al escribir
- Realizar la transliteración, porque en las direcciones es mejor usar caracteres del alfabeto latino
- Recortar los caracteres especiales como los signos de interrogación y de exclamación
- Reemplazar los espacios por guiones

Algunos de los pasos requieren conocimientos nuevos para nosotros, por eso los omitiremos. Los demás pasos se verán más o menos así:

```java
// Nombre introducido por el usuario. En inglés para simplificar
var name = " How much is the fish?   \n";
// recortamos los espacios de los extremos y el salto de línea
name = name.trim();
// Eliminamos el signo de interrogación
name = name.replace("?", "");
// Reemplazamos los espacios por un guion
name = name.replace(" ", "-");
// Convertimos a minúsculas
name = name.toLowerCase();
System.out.println(name); // => how-much-is-the-fish
```

Si observamos con atención este código, podemos notar un patrón común. Un método devuelve datos que asignamos a una variable, y luego los procesamos más adelante en la cadena.

## La cadena de métodos

Este patrón se puede simplificar eliminando la reescritura intermedia de la variable. Un método devuelve una nueva cadena, y a esta cadena se le aplica de inmediato el siguiente método. Esta técnica se llama **cadena de métodos (method chaining)**.

```java
var name = " How much is the fish?   ";
name = name.trim().replace("?", "").replace(" ", "-").toLowerCase();
System.out.println(name); // => how-much-is-the-fish
```

Los métodos se llaman uno tras otro, como eslabones de una cadena. Esto permite escribir un código compacto y legible. Si la cadena se vuelve demasiado larga, se puede dividir en varias líneas:

```java
name = name.trim()
    .replace("?", "")
    .replace(" ", "-")
    .toLowerCase();
```

A pesar de la comodidad de este mecanismo, no conviene abusar de él. Las variables intermedias a veces facilitan la comprensión del código.

## Orden de evaluación

En una cadena de métodos, el orden de ejecución va de izquierda a derecha. Cada método siguiente se llama sobre el resultado del anterior:

```java
var text = "  hExLeT  ";
System.out.println(text.trim().toLowerCase().replace("h", "x")); // => xexlet
```

1. `"  hExLeT  "` es la cadena original.
2. `trim()` elimina los espacios de los extremos y devuelve `"hExLeT"`.
3. `toLowerCase()` convierte a minúsculas y devuelve `"hexlet"`.
4. `replace("h", "x")` reemplaza `"h"` por `"x"` y devuelve `"xexlet"`.

El mismo resultado se obtiene sin la cadena, mediante variables intermedias:

```java
var text = "  hExLeT  ";
var step1 = text.trim();                 // "hExLeT"
var step2 = step1.toLowerCase();         // "hexlet"
var step3 = step2.replace("h", "x");     // "xexlet"
System.out.println(step3);
```

Cada método devuelve una nueva cadena, y el siguiente método se aplica ya sobre ella.

```text
"  hExLeT  ".trim().toLowerCase().replace("h", "x")
             │       │              │
             ↓       ↓              ↓
          "hExLeT"   │              │
                  "hexlet"          │
                              "xexlet"
```

En la cadena simplemente te mueves de izquierda a derecha, leyéndola como una oración común. Si se confunde el orden, el resultado puede diferir. Por ejemplo, el reemplazo de los espacios funcionará de otra manera si se hace antes de eliminar los espacios de los extremos. En unas situaciones el resultado coincidirá por casualidad, en otras el orden realmente influirá en el resultado.

## Dónde termina la cadena

La cadena se puede continuar mientras el resultado siga siendo una cadena u otro tipo que tenga métodos. Si un método devuelve un número u otro tipo primitivo, ya no se pueden llamar más métodos:

```java
var text = "hexlet";
var index = text.toUpperCase().indexOf("E");
System.out.println(index); // => 1
```

El método `indexOf()` devuelve el número `1`, es decir, la posición del primer carácter `"E"` en la cadena `"HEXLET"`. Un número no tiene métodos de cadena, por eso la cadena termina aquí.

Las cadenas de métodos sirven como una forma cómoda de combinar varias operaciones sobre un valor sin variables intermedias.
