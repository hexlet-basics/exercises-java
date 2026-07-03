Los programas operan con cadenas de texto constantemente. Todo lo que vemos en los sitios web o en las aplicaciones móviles está representado de una u otra forma como texto. Ese texto casi siempre es **dinámico**: se ensambla a partir de distintas partes que se unen entre sí. Por ejemplo, unimos el nombre y el apellido, agregamos una unidad de medida o componemos un mensaje a partir de una plantilla. La operación de unir cadenas de texto en programación se llama **concatenación** y se ve así:

```java
// El operador es el mismo que para sumar números,
// pero aquí tiene un significado diferente (semántica)
System.out.println("Dragon" + "stone");
// => Dragonstone
```

La concatenación de cadenas siempre ocurre en el mismo orden en el que se escriben los operandos. El operando izquierdo se convierte en la parte izquierda del resultado, y el derecho, en la parte derecha. Se pueden concatenar tantas partes seguidas como se quiera. Aquí hay algunos ejemplos más:

```java
System.out.println("Kings" + "wood"); // => Kingswood
// Orden inverso de las palabras
System.out.println("road" + "Kings"); // => roadKings
// Se puede concatenar absolutamente cualquier cadena
System.out.println("King's" + "Landing"); // => King'sLanding
```

En el último ejemplo, el nombre de la ciudad quedó con un error: *King's Landing* debe escribirse con un espacio. Pero en nuestras cadenas originales no había espacios, y los espacios que hay en el propio código alrededor del símbolo `+` no influyen en nada, porque no forman parte de las cadenas.

## El espacio también es un carácter

Al unir cadenas, Java no inserta espacios automáticamente. Si hace falta un espacio entre las partes, se agrega manualmente. Hay tres salidas para la situación de *King's Landing*:

```java
// Ponemos un espacio en la parte izquierda
System.out.println("King's " + "Landing"); // => King's Landing
// Ponemos un espacio en la parte derecha
System.out.println("King's" + " Landing"); // => King's Landing
// Agregamos un espacio por separado
System.out.println("King's" + " " + "Landing"); // => King's Landing
```

El resultado es el mismo en los tres casos. El espacio es un carácter como cualquier otro, y cuantos más espacios haya en las cadenas, más ancha será la separación entre las palabras.

## Concatenación con un número

El operador `+` puede unir una cadena no solo con otra cadena, sino también con un número. En ese caso el número se convierte en texto y se pega a la cadena:

```java
System.out.println("Suma: " + 5);
// => Suma: 5
```

A la izquierda hay una cadena, a la derecha el número `5`. Java los muestra juntos, como un único texto.

## Secuencias de escape

En las cadenas aparecen secuencias de escape, por ejemplo `\n` para el salto de línea. Durante la concatenación funcionan igual que cualquier otro carácter:

```java
System.out.println("Hello," + "\n" + "World!");
// =>
// Hello,
// World!
```

## Conclusión

La concatenación es la unión de cadenas mediante `+`. La unión va estrictamente de izquierda a derecha, en el orden de los operandos. Los espacios no se agregan automáticamente, por eso se incluyen en las cadenas manualmente.
