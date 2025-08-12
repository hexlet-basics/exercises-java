En los lenguajes humanos, la gramática es importante, pero generalmente se puede entender y leer un texto con errores. En la programación, todo es estricto. Cualquier pequeña violación y el programa no se ejecutará.

Un ejemplo puede ser un punto y coma olvidado, paréntesis mal colocados y otros detalles. Estos errores se llaman **errores de sintaxis** porque violan las reglas de sintaxis del lenguaje.

Si un programa escrito en Java es sintácticamente incorrecto, el compilador muestra en pantalla:

* Un mensaje de error
* Una indicación del archivo
* La línea en el archivo donde, según el compilador, ocurrió el error

A continuación se muestra un ejemplo de código con un error de sintaxis:

```java
System.out.println("alala
```

Si ejecutamos el código anterior, veremos el siguiente mensaje:

```text
|  Error:
|  unclosed string literal
|  System.out.println("alala
```

Por un lado, los errores de sintaxis son los más simples porque están relacionados únicamente con las reglas gramaticales de escribir código, no con el significado del código en sí. Son fáciles de corregir, solo hay que encontrar la violación en la escritura.

Por otro lado, el compilador no siempre puede señalar claramente esta violación. Por lo tanto, a veces es necesario colocar el paréntesis olvidado no donde indica el mensaje de error.
