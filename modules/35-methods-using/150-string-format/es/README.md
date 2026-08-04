Recordemos cómo funciona la concatenación. Las cadenas necesarias y las variables con cadenas dentro se unen con el signo `+`.

```java
var firstName = "Joffrey";
var greeting = "Hello";

System.out.println(greeting + ", " + firstName + "!");
// => Hello, Joffrey!
```

En expresiones complejas, con ese código cuesta entender de inmediato qué texto saldrá. Los espacios, las comas y las comillas empiezan a entorpecer la lectura. Incluso este ejemplo requiere un pequeño esfuerzo para leer la cadena final.

Por eso, en muchos lenguajes existe una forma aparte de construir una cadena a partir de una plantilla y valores. La plantilla define la forma de la futura cadena, y en el lugar de las marcas se sustituyen los datos necesarios. En Java, para esto se llama al método `String.format()`.

```java
var firstName = "Joffrey";
var greeting = "Hello";

System.out.println(String.format("%s, %s!", greeting, firstName));
// => Hello, Joffrey!
```

El primer argumento de `String.format()` es la plantilla. Dentro de la plantilla hay marcas `%s`, en cuyos lugares se sustituyen los demás argumentos por orden. El primer `%s` se reemplaza por `greeting`, el segundo por `firstName`. La marca `%s` significa que el valor se sustituye como una cadena.

```text
String.format("%s, %s!", greeting, firstName)
               └┬┘  └┬┘
            "Hello"  "Joffrey"  →  "Hello, Joffrey!"
```

En la versión con plantilla, el texto se lee de forma completa. Los espacios, las comas y el signo de exclamación se ven de inmediato, mientras que en una cadena de `+` se pierden entre las comillas.

## El método formatted

La misma acción tiene una segunda forma de notación. El método `formatted()` se llama directamente sobre la cadena-plantilla a través de un punto, y los valores se pasan entre paréntesis.

```java
var firstName = "Joffrey";
var greeting = "Hello";

System.out.println("%s, %s!".formatted(greeting, firstName));
// => Hello, Joffrey!
```

Aquí la plantilla `"%s, %s!"` está a la izquierda del punto, y `formatted()` le sustituye los argumentos. El resultado es el mismo que con `String.format()`. Estas dos formas hacen lo mismo; elige la que prefieras.

## Un ejemplo con un número

La marca `%s` no sustituye solo cadenas. En su lugar se puede poner un número, y se convertirá en cadena por sí mismo.

```java
var school = "Hexlet";
var year = 2012;

var about = String.format("%s funciona desde %s", school, year);
System.out.println(about); // => Hexlet funciona desde 2012
```

El método construyó una cadena lista a partir de la plantilla y los argumentos, y la devolvió. El resultado se guardó en la variable `about` y se mostró en la pantalla.

## Por qué es cómodo

La plantilla se ve casi igual que la cadena final. Se ve dónde irán los espacios y los signos de puntuación, se ve dónde se sustituirán los valores. Con ese código es más fácil entender qué saldrá. Por eso, en la mayoría de las tareas se prefiere construir la cadena a partir de una plantilla antes que una larga cadena de concatenaciones.
