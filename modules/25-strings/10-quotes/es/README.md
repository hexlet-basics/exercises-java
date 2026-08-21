Las cadenas de texto en Java aparecen a cada paso. Con su ayuda trabajamos con texto, mostramos mensajes en la pantalla, procesamos la entrada del usuario e intercambiamos datos con sistemas externos.

Desde el punto de vista de Java, una cadena de texto es un conjunto de caracteres encerrado entre comillas dobles. Veamos algunos ejemplos.

```text
"Hello"
"Goodbye"
"G"
" "
""
```

Todas estas variantes son cadenas de texto.

- `"Hello"` y `"Goodbye"` son cadenas de varios caracteres
- `"G"` es una cadena de un solo carácter
- `" "` es una cadena de un solo espacio
- `""` es una cadena vacía, no contiene ningún carácter. Cumple el mismo papel que el 0 en matemáticas

Todo lo que está dentro de las comillas se considera una cadena de texto, aunque solo haya un espacio o nada en absoluto.

Si mostramos estas cadenas en la pantalla, `"Hello"` y `"Goodbye"` se verán con claridad. En cambio, `" "` y `""` resultan confusas. Mostrar una cadena vacía se ve como una ausencia total de texto, mientras que una cadena con un espacio muestra un "espacio vacío" que visualmente es difícil de distinguir del vacío. Java distingue con claridad estos casos. Una cadena vacía significa la ausencia de caracteres, mientras que una cadena con un espacio contiene un carácter de espacio concreto.

Pregunta de control. ¿Son iguales estas cadenas o no?

```text
"hexlet"
" hexlet"
```

## Terminología. ¿Cadena o línea?

En programación existe una trampa terminológica.

- Una cadena (string) es un tipo de dato, ese mismo conjunto de caracteres entre comillas, por ejemplo `"hello"`
- Una línea (line) es una línea de texto en un archivo o en el código

Por ejemplo, en el código de abajo hay una línea, pero no una cadena.

```java
System.out.println(5);
```

Para no confundirnos, en este curso nos atendremos a las siguientes formulaciones.

- Cadena, cuando hablamos del tipo de dato
- Línea, cuando hablamos de las líneas de código

## Solo comillas dobles

En algunos lenguajes las cadenas se pueden escribir tanto con comillas simples como con comillas dobles. En Java una cadena siempre se encierra entre comillas dobles `"`.

```java
System.out.println("Hello");
```

Las comillas simples también aparecen en Java, pero esa es una historia completamente distinta. Una notación como `'A'` representa un solo carácter, no una cadena. Por eso, cuando se trata de texto, usamos solo comillas dobles.

## El problema con las comillas dentro de una cadena

Imagina que quieres imprimir la frase *Dragon's mother*. En ella hay un apóstrofo (*'s*), que coincide con el carácter de comilla simple. Como la cadena está delimitada por comillas dobles, el apóstrofo que hay dentro no molesta.

```java
System.out.println("Dragon's mother");
// => Dragon's mother
```

Java entiende que una comilla simple dentro de una cadena es un carácter corriente. La cadena empieza y termina con comillas dobles, y todo lo que hay entre ellas se considera su contenido.

Las dificultades empiezan cuando dentro de la cadena hacen falta las propias comillas dobles. Imagina que queremos mostrar el siguiente texto:

```text
Dragon's mother said "No"
```

Si insertamos las comillas dobles directamente dentro de la cadena, el programa no compilará.

```java
// Termina con un error de sintaxis
System.out.println("Dragon's mother said "No"");
```

Desde el punto de vista de Java, aquí resulta una construcción extraña de tres partes.

- La cadena `"Dragon's mother said "`
- La palabra `No`, que no está entre comillas y por eso no se considera una cadena
- La cadena vacía `""`

Java decidirá que la primera cadena termina antes de la palabra *No*, y a continuación viene código incomprensible. Eso es lo que provoca el error.

## El carácter de escape

Para colocar una comilla doble dentro de una cadena, se la escapa con una barra invertida `\`. Le indica al compilador que el carácter que le sigue es parte de la cadena, no el límite de la cadena.

```java
System.out.println("Dragon's mother said \"No\"");
// => Dragon's mother said "No"
```

Aquí escapamos las comillas dobles dentro de una cadena encerrada entre comillas dobles. Java interpreta `\"` como un único carácter de comilla, no como dos caracteres separados. Estas notaciones se llaman secuencias de escape.

Para mostrar la propia barra invertida, también se la escapa con una segunda barra.

```java
System.out.println("\\");
// => \
```
