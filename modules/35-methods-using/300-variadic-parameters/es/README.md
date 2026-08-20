La mayoría de los métodos aceptan un número fijo de argumentos: hay que pasar tantos valores como parámetros se indiquen en la declaración. Pero hay métodos a los que se les puede pasar cualquier cantidad de argumentos, desde cero hasta decenas. Estos métodos se llaman **métodos con un número variable de parámetros** (en inglés, *variadic*).

Un buen ejemplo es el método `String.join()`. Une cadenas con un separador, y la cantidad de cadenas que se unen puede ser cualquiera:

```java
String.join("-", "2024", "01", "15");    // "2024-01-15"
String.join(" ", "Hola", "mundo");       // "Hola mundo"
String.join(", ", "a", "b", "c", "d");   // "a, b, c, d"
```

El primer argumento es el separador, y todo lo que viene después es el número variable de cadenas. En la primera llamada hay tres, en la segunda dos, en la tercera cuatro. El método se adapta por sí mismo a cualquier cantidad de argumentos.

Los métodos `String.format()` y `System.out.printf()` funcionan de la misma manera: también se les puede pasar un número diferente de argumentos según cuántos valores haya que sustituir.

## Cómo funciona

Cuando se declara un método, el número variable de parámetros se escribe con tres puntos después del tipo:

```java
// String... values es justamente el número variable de argumentos de cadena
public static String join(String separator, String... values) {
    // aquí va el código que procesa values
}
```

La notación `String...` significa "cero o más cadenas". Los parámetros obligatorios (como `separator`) van primero, y la parte variable siempre va al final. Dentro del método, estos argumentos están disponibles como un array normal, por lo que se puede recorrerlos y hacer algo con ellos.

## Para qué sirve

El número variable de parámetros hace que los métodos sean flexibles. No hay que crear métodos separados `join2()`, `join3()`, `join4()` para cada cantidad de cadenas: basta con un solo método que acepte cualquier cantidad de ellas. Esto elimina la duplicación y simplifica el trabajo con la biblioteca estándar: una enorme cantidad de sus métodos está diseñada precisamente para un número variable de argumentos.
