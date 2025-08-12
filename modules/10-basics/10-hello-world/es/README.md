Tradicionalmente, se comienza a aprender un lenguaje de programación con el programa "Hello, World!", que muestra este texto en la pantalla.

```text
¡Hola, Mundo!
```

En Java, este programa se vería así:

```java
class App {
    public static void main(String[] args) {
        System.out.println("¡Hola, Mundo!");
    }
}
```

El texto *¡Hola, Mundo!* aparecerá en la pantalla gracias al comando `System.out.println()`, donde `println()` es una abreviatura de la expresión en inglés *print line*. Este comando muestra en la pantalla el valor especificado entre paréntesis `("¡Hola, Mundo!")`, en este caso, una cadena de texto. La cadena de texto se encierra entre comillas dobles `""`. Si no se hace esto, el compilador mostrará un error de sintaxis:

```bash
# Por ejemplo, así
App.java:5: error: unclosed character literal
System.out.println('¡Hola, Mundo!');
```

Este comando se encuentra dentro de varias construcciones que son necesarias incluso para los programas más simples en Java. En este caso, se trata de la clase `App` y el método `main()`.

Por ahora, no nos detendremos en ellos, ya que para entenderlos es necesario tener un poco de conocimiento en programación. Por lo tanto, en muchos ejercicios se proporcionan "tal cual", es decir, no tendrás que definirlos tú mismo. Cuando llegue el momento, los analizaremos.

## JShell

A medida que avances en las lecciones, te encontrarás constantemente con ejemplos de código y descripciones de su funcionamiento. Para comprenderlos mejor y poder utilizar el lenguaje, es necesario practicar y experimentar constantemente.

Por lo tanto, siempre que sea posible, ejecuta todos los ejemplos de la teoría y realiza experimentos con los aspectos que no entiendas.

La forma más sencilla de comenzar con Java es en el sitio web [onecompiler](https://onecompiler.com/jshell), que te permite ejecutar el código línea por línea directamente en el navegador. Intenta ir allí ahora mismo y escribir este código:

```text
System.out.println(85 * 3);
```
