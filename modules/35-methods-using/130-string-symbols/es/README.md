A veces necesitas extraer un solo carácter de una cadena. Un sitio conoce el nombre y el apellido de un usuario, pero quiere mostrarlos de forma abreviada, A. Ivanov. Para ello, se toma la primera letra del nombre y se coloca un punto al lado.

En Java, cada carácter de una cadena tiene su propio número, que se llama índice. El conteo empieza desde cero. El primer carácter tiene el índice `0`, el segundo `1`, y así sucesivamente. Para extraer un carácter por su índice, se llama al método `charAt()` de la cadena. Dentro de los paréntesis se indica el índice deseado.

```java
var firstName = "Alexander";
System.out.println(firstName.charAt(0)); // => A
```

El método `charAt()` se llama en la cadena a través de un punto. En los paréntesis está el argumento `0`, por lo que el método devuelve el primer carácter. La estructura es la misma que en otros métodos de cadena. Primero el objeto, luego un punto, después el nombre del método y los paréntesis con el argumento.

La relación entre los caracteres y sus índices se ve en el diagrama:

```text
Carácter  A  l  e  x  a  n  d  e  r
Índice    0  1  2  3  4  5  6  7  8
```

La longitud de la cadena `Alexander` es `9`, por lo que el índice del último carácter es `8`, es decir, `9 - 1`. Para extraer el último carácter, se pasa exactamente ese índice:

```java
var firstName = "Alexander";
System.out.println(firstName.charAt(8)); // => r
```

## Qué devuelve el método

El método `charAt()` devuelve un solo carácter. En Java existe un tipo de dato aparte, `char`, para un carácter individual. Un valor de tipo `char` se escribe entre comillas simples, por ejemplo `'A'`. Una cadena entre comillas dobles y un carácter individual entre comillas simples pertenecen a tipos diferentes.

```java
var firstName = "Alexander";
var letter = firstName.charAt(0);
System.out.println(letter); // => A
```

Aquí el resultado de la llamada se guarda en la variable `letter`. Esto es cómodo cuando el carácter se necesita más adelante en el código. Pero la variable no es obligatoria; el método se puede imprimir de inmediato:

```java
System.out.println("Hexlet".charAt(0)); // => H
```

El método se llama directamente en el literal de cadena `"Hexlet"`. Primero se evalúa `charAt(0)`, luego el resultado pasa a `println()`.

## Salida fuera de los límites de la cadena

El índice debe caer dentro de la cadena. Si pasas un índice mayor que el último, el programa termina con un error:

```java
var firstName = "Alexander";
System.out.println(firstName.charAt(9));
// StringIndexOutOfBoundsException
```

La cadena `Alexander` tiene nueve caracteres con índices del `0` al `8`. No existe el índice `9`, por lo que el método lanza el error `StringIndexOutOfBoundsException`. Por eso, al trabajar con caracteres, primero se comprueba la longitud de la cadena y se accede a un carácter solo cuando el índice está definitivamente dentro de los límites. Esta técnica se estudia más adelante en el curso.

## Caracteres especiales

El método `charAt()` cuenta todos los caracteres seguidos. No solo las letras y los signos, sino también los caracteres especiales. Cada uno de ellos ocupa su propia posición y tiene un índice, aunque no se vea en la pantalla.

Por ejemplo, en la cadena `"\nyou"` en el índice `0` está `\n` (un salto de línea), y en el índice `1` ya viene la letra `y`. Por eso, la llamada `magic.charAt(1)` devuelve exactamente `y`.

```java
var magic = "\nyou";
System.out.println(magic.charAt(1)); // => y
```
