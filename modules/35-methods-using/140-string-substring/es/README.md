Al trabajar con cadenas, a menudo resolvemos la misma tarea: extraer una parte de la cadena. Obtener el año de una fecha, el nombre de un nombre completo o los primeros caracteres de una dirección de correo electrónico. En Java, la cadena tiene el método `substring()` para esto.

## Qué es una subcadena

Una subcadena es una parte de una cadena que está contenida dentro de otra cadena. En la cadena `"12-08-2034"`, una subcadena puede ser `"2034"`, `"12"` o incluso `"-"`. Todo depende de qué información se necesite extraer.

Supongamos que solo se necesita el año `"2034"`. Cada carácter de la cadena tiene su propio índice (posición), el conteo empieza desde cero:

```text
'1' '2' '-' '0' '8' '-' '2' '0' '3' '4'
 0   1   2   3   4   5   6   7   8   9
```

El año empieza en el índice `6` y termina en el `9`. Para extraerlo, se llama al método `substring()` de la cadena con dos argumentos:

```java
var value = "12-08-2034";
var year = value.substring(6, 10);
System.out.println(year); // => 2034
```

El método se llama en la cadena a través de un punto. El primer argumento indica el índice de inicio, el segundo indica el índice de fin. El formato de la llamada es así:

```java
cadena.substring(inicio, fin)
```

El carácter con el índice de inicio se incluye en el resultado, pero el carácter con el índice de fin no. Es cómodo pensar en el fin como el número de orden del carácter que se debe tomar como último.

```java
var value = "code-basics";

System.out.println(value.substring(5, 11)); // => basics (del índice 5 al 10)
System.out.println(value.substring(0, 7));  // => code-ba (del índice 0 al 6)
System.out.println(value.substring(2, 6));  // => de-b
```

¿Cómo se calcula todo esto? Cuando trabajamos con una cadena concreta, casi siempre lo calculamos a ojo.

## Una subcadena también es una cadena

El método `substring()` devuelve una cadena, incluso si dentro solo hay dígitos. Esto significa que el resultado se usa como una cadena normal: se imprime, se une, se pasa a otros métodos. El resultado de una llamada se puede pasar directamente a la siguiente:

```java
var value = "01-12-9873";

var part = value.substring(3, 7); // => 12-9
System.out.println(part.substring(0, 2)); // => 12
```

Primero obtuvimos la subcadena `"12-9"`, y luego extrajimos de ella una nueva subcadena `"12"`.

## Una subcadena hasta el final de la cadena

A veces se necesita una parte de la cadena desde algún carácter hasta el final. Para esto, `substring()` tiene una variante con un solo argumento. Este indica solo el índice de inicio, y el método toma el fin como igual al final de la cadena.

```java
var value = "Hexlet";

System.out.println(value.substring(3)); // => let (del carácter 3 hasta el final)
```

La llamada `value.substring(3)` toma los caracteres desde el índice `3` y en adelante hasta el final de la cadena. La longitud de la cadena `"Hexlet"` es `6`, por lo que `value.substring(3)` y `value.substring(3, 6)` dan el mismo resultado `let`. Cuando el fin coincide con la longitud de la cadena, el segundo argumento se puede omitir.

## Salida fuera de los límites de la cadena

Los índices deben caer dentro de la cadena. Si pasas un índice mayor que la longitud de la cadena, el método lanza un error:

```java
var value = "Hexlet";
System.out.println(value.substring(0, 10));
// StringIndexOutOfBoundsException
```

La cadena `"Hexlet"` tiene seis caracteres, por lo que el índice de fin no puede ser mayor que `6`. Pasamos `10`, y el método terminó con el error `StringIndexOutOfBoundsException`. Antes de la llamada, conviene asegurarse de que los índices estén dentro de los límites de la cadena.

Lo principal es entender la estructura básica `cadena.substring(inicio, fin)`, y en la práctica estas llamadas se convertirán rápidamente en un hábito.
