El procesamiento de datos puede constar de una cantidad considerable de pasos que deben realizarse.

Tomemos como ejemplo la tarea de crear una dirección de página web basada en el nombre de un artículo ingresado por el usuario. Esta tarea a menudo surge al publicar artículos en blogs. Estas direcciones se ven así:

```
https://codica.la/blog/de-obrero-a-programador
```

La última parte aquí, *de-obrero-a-programador*, se crea automáticamente con el código que hemos escrito en Hexlet. Por cierto, tiene un nombre especial: se llama [**slug**](https://en.wikipedia.org/wiki/Clean_URL#Slug).

¿Qué pasos se deben seguir para obtener una cadena similar? Aquí hay solo algunos de ellos:

* Convertir todo a minúsculas para evitar la creación accidental de duplicados de páginas en los motores de búsqueda.
* Limpiar el nombre de los espacios en blanco alrededor. Pueden aparecer accidentalmente al ingresar el nombre.
* Realizar transliteración. Es mejor que las direcciones solo contengan caracteres del alfabeto latino.
* Eliminar todos los caracteres especiales, como signos de interrogación, exclamaciones, etc.
* Reemplazar todos los espacios por guiones.

Algunos de estos pasos requieren conocimientos nuevos para nosotros, por lo que los omitiremos. Los demás pasos se verán más o menos así:

```java
// Nombre ingresado por el usuario. En inglés para mayor simplicidad
var name = " How much is the fish?   \n";
// Eliminamos los espacios y saltos de línea al final
name = name.trim();
// Eliminamos el signo de interrogación
name = name.replace("?", "");
// Reemplazamos los espacios por guiones
name = name.replace(" ", "-");
// Convertimos a minúsculas
name = name.toLowerCase();
System.out.println(name); // => how-much-is-the-fish
```

Si observamos detenidamente este código, podemos notar un patrón común. El método devuelve los datos que asignamos a la variable y luego los procesa en una cadena de llamadas de métodos.

Este patrón se puede simplificar eliminando la reasignación intermedia de la variable:

```java
var name = " How much is the fish?   ";
name = name.trim().replace("?", "").replace(" ", "-").toLowerCase();
System.out.println(name); // => how-much-is-the-fish
```

Gracias a que cada método devuelve una nueva cadena, podemos seguir procesándola llamando a los métodos uno tras otro. Si la cadena de métodos se vuelve demasiado larga, se puede dividir en varias líneas:

```java
name = name.trim()
    .replace("?", "")
    .replace(" ", "-")
    .toLowerCase();
```

https://replit.com/@hexlet/java-basics-methods-chain

A pesar de la conveniencia de este mecanismo, no se debe abusar de él. Las variables intermedias pueden facilitar la comprensión del código.
