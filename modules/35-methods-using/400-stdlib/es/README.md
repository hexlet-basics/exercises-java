Java, al igual que cualquier otro lenguaje, viene con un conjunto de métodos útiles. Todos juntos forman lo que se conoce como la **biblioteca estándar**. Por lo general, incluye miles de métodos que no se pueden aprender todos, y no es necesario hacerlo. Se supone que cualquier programador sabe dónde buscar la documentación y tiene una idea aproximada de lo que quiere lograr. A partir de ahí, es solo cuestión de técnica. Si se les quita a los programadores el acceso a Internet, la mayoría no podrá programar nada.

Para los principiantes, esta información a menudo parece: "Ve allí, no sé dónde, trae eso, no sé qué". Es decir, no está claro cómo aprender sobre estos métodos cuando no sabes nada en absoluto. Curiosamente, no hay una forma de aprender todo lo que necesitas saber de una vez y para siempre. Cada desarrollador, a medida que crece profesionalmente, se familiariza con métodos cada vez más interesantes que resuelven sus problemas de manera más elegante, y así enriquece su arsenal.

Aquí hay algunos consejos sobre cómo aprender sobre nuevos métodos:

- Siempre sigue claramente el tipo de datos con el que estás trabajando. Casi siempre encontrarás el método necesario en la sección correspondiente de la documentación, por ejemplo, para trabajar con cadenas, debes estudiar los métodos de cadena.
- Abre periódicamente la sección de métodos estándar relacionados con el tema que estás estudiando y simplemente revísalos, estudiando las firmas y formas de uso.
- Lee el código de otras personas con más frecuencia, especialmente el código de las bibliotecas que estás utilizando. Todo está disponible en GitHub.

Supongamos que hay que quitar los espacios de los extremos de una cadena. Para buscar el método sirve la [documentación de la clase `String`](https://docs.oracle.com/en/java/javase/26/docs/api/java.base/java/lang/String.html). La sección Method Summary muestra los métodos con descripciones breves. Allí `trim()` se describe como un método que devuelve una cadena sin espacios iniciales ni finales. Su enlace abre el contrato detallado. Para `"  Java  "`, la llamada a `trim()` devuelve `"Java"`. Las operaciones numéricas, como el valor absoluto, se encuentran en la [documentación de la clase `Math`](https://docs.oracle.com/en/java/javase/26/docs/api/java.base/java/lang/Math.html).

## Cómo leer la documentación de un método

La documentación describe qué datos recibe un método y qué resultado devuelve. La referencia de la biblioteca estándar de Java está organizada por clases, y cada clase tiene su propia página. En la página de una clase hay dos secciones que hacen falta para escribir una llamada. La sección Method Summary enumera los métodos de la clase en una tabla, y la sección Method Details describe cada método en detalle.

Veamos el método `indexOf()`, que busca una subcadena y devuelve su posición. En la tabla Method Summary cada método indica el tipo del resultado, el nombre con sus parámetros y una descripción breve. Para `indexOf()` la tabla tiene varias filas, entre ellas estas dos.

```text
int    indexOf(String str)
int    indexOf(String str, int fromIndex)
```

Al hacer clic en el nombre del método se abre su descripción en la sección Method Details. Abajo está la descripción de la segunda versión, con una parte del texto omitida.

```text
public int indexOf(String str, int fromIndex)

Returns the index within this string of the first occurrence of the
specified substring, starting at the specified index.
...

Parameters:
    str - the substring to search for.
    fromIndex - the index from which to start the search.
Returns:
    the index of the first occurrence of the specified substring,
    starting at the specified index, or -1 if there is no such occurrence.
```

La descripción se lee de arriba abajo, paso a paso.

1. La primera línea contiene la declaración del método con el tipo del resultado, el nombre y los parámetros.
2. La primera oración resume qué hace el método.
3. Luego vienen los detalles. A veces incluyen fórmulas y notas, y en la primera lectura se pueden saltar.
4. La sección Parameters explica cada parámetro por el nombre que tiene en la declaración. Aquí `fromIndex` es el índice desde el que empieza la búsqueda.
5. La sección Returns describe el resultado, incluidos los casos especiales. Aquí el método devuelve `-1` si no encuentra la subcadena.

La tabla relaciona las partes de la declaración con los argumentos de la llamada `"Java".indexOf("a", 2)`.

| Parte de la declaración | Qué significa | En la llamada `"Java".indexOf("a", 2)` |
| --- | --- | --- |
| `public` | El método está disponible desde cualquier código | Llamamos al método desde nuestro programa |
| `int` | Tipo del resultado, un número entero | Obtenemos la posición del carácter |
| `indexOf` | Nombre del método | Llamamos a `indexOf()` sobre la cadena `"Java"` |
| `String str` | Parámetro de tipo `String`, la subcadena que se busca | Pasamos `"a"` |
| `int fromIndex` | Parámetro de tipo `int`, la posición donde empieza la búsqueda | Pasamos `2` |

La declaración muestra qué argumentos pasar, y la descripción explica qué se obtiene. Comprobémoslo con llamadas.

```java
System.out.println("Java".indexOf("a")); // => 1
System.out.println("Java".indexOf("a", 2)); // => 3
System.out.println("Java".indexOf("a", 4)); // => -1
```

La primera llamada encuentra la primera `a` en la posición `1`. La segunda empieza a buscar en la posición `2` y encuentra la segunda `a` en la posición `3`. La tercera empieza en la posición `4`, donde la cadena ya terminó, así que devuelve `-1`, tal como indica la sección Returns.

## Sobrecargas en lugar de parámetros opcionales

En Java los parámetros de un método no tienen valores por defecto. Si un argumento se puede omitir, la clase declara varios métodos con el mismo nombre y distintos parámetros. Estos métodos se llaman **sobrecargas**. Por eso en Method Summary `indexOf()` aparece en varias filas. La versión `indexOf(String str)` busca desde el principio de la cadena, y la versión `indexOf(String str, int fromIndex)` busca desde la posición indicada.

Java elige la sobrecarga según los argumentos de la llamada. La llamada `"Java".indexOf("a")` con una cadena va a la primera versión, y la llamada `"Java".indexOf("a", 2)` con una cadena y un número va a la segunda. Para saber en qué se diferencian las versiones, se lee la descripción de cada una.

## Notación en la referencia

En las declaraciones de los métodos aparecen palabras y signos auxiliares. Ayudan a leer la declaración y no se copian en la llamada.

| Notación en la referencia | Cómo leerla |
| --- | --- |
| `int indexOf(String str)` | El tipo va delante del nombre. `int` a la izquierda del método es el tipo del resultado, y `String` delante de `str` es el tipo del parámetro |
| `static int max(int a, int b)` | La palabra `static` indica que el método se llama a través del nombre de la clase, por ejemplo `Math.max(3, 7)` |
| `static String join(CharSequence delimiter, CharSequence... elements)` | Los puntos suspensivos después del tipo indican que en ese lugar se puede pasar cualquier cantidad de argumentos |

Por ejemplo, la declaración `static int max(int a, int b)` de la referencia de la clase `Math` describe un método con dos parámetros. La llamada `Math.max(3, 7)` pasa los números `3` y `7` y devuelve `7`. Ni `static`, ni los tipos, ni los nombres `a` y `b` se copian en la llamada. En la declaración de `join()` aparece el tipo `CharSequence`. En su lugar también sirven cadenas, por eso la llamada `String.join(":", "8", "30")` funciona igual que en la lección sobre la cantidad variable de parámetros.

Si el navegador traduce la página, hay que comparar los nombres de métodos y parámetros y los tipos con el original. En el código se usan los nombres originales de la documentación.

## Trabajar con un método desconocido

La lectura de la referencia empieza por la tarea. Por ejemplo, para encontrar la segunda `a` de una palabra, abrimos la página de la clase `String`, en Method Summary buscamos las sobrecargas de `indexOf()`, en Method Details leemos qué hace `fromIndex` y probamos la llamada `"Java".indexOf("a", 2)` en [JShell](https://onecompiler.com/jshell). Si el resultado coincide con la descripción, la llamada se puede usar en el programa.
