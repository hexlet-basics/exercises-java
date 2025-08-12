```java
"Hola"
"Adiós"
"G"
" "
""
```

¿Cuáles de estas cinco opciones son cadenas de texto? Con las primeras dos está claro: son definitivamente cadenas de texto, ya hemos trabajado con construcciones similares. ¿Pero qué pasa con las demás?

Cualquier carácter individual entre comillas es una cadena de texto. Una cadena de texto vacía `""` también es una cadena de texto. Es decir, consideramos como cadena de texto todo lo que está dentro de las comillas, incluso si es un espacio, un solo carácter o la ausencia total de caracteres.

Imagina que quieres imprimir la frase *la madre del dragón*. El apóstrofe antes de la letra **s** es un carácter igual que una comilla simple. Intentemos. Esta versión del programa funcionará correctamente:

```java
System.out.println("La madre del dragón");
```

Pero, ¿qué pasa si queremos crear una cadena de texto como esta:

```text
La madre del dragón dijo "No"
```

En ella hay tanto comillas simples como comillas dobles. ¿Qué hacer en esta situación? Si simplemente intentamos imprimir esta cadena de texto, obtendremos un error:

```java
// Terminará con un error de sintaxis
System.out.println("La madre del dragón dijo "No"");
```

Desde el punto de vista de Java, esta es una construcción extraña de dos componentes de tres:

- La cadena de texto *"La madre del dragón dijo "*
- La cadena de texto *""*
- La palabra *No* entre ellos, que no se considera una cadena de texto porque no está entre comillas

No se puede imprimir esta cadena de texto de la manera habitual. Para imprimir cadenas de texto como esta, se utiliza el **carácter de escape**: `\`.

Si colocamos `\` antes de una comilla, significa que la comilla debe considerarse como parte de la cadena de texto, no como el inicio o el final de la misma:

```java
System.out.println("La madre del dragón dijo \"No\"");
```
