Tradicionalmente, aprender un lenguaje de programación comienza con el programa "Hello, World!", que muestra este texto en la pantalla.

```text
Hello, World!
```

En Java, este programa se ve así:

```java
class App {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }
}
```

El texto _Hello, World!_ aparece en la pantalla gracias al comando `System.out.println()`, donde `println()` es la abreviatura del inglés _print line_. Muestra en la pantalla el valor indicado entre paréntesis `("Hello, World!")` — en este caso, una cadena de texto. En lugar del ejemplo, puedes mostrar cualquier otro texto:

```java
System.out.println("Hexlet — escuela de programación");
```

El comando sigue siendo el mismo; solo cambia el contenido de los paréntesis.

Para que el programa entienda que entre los paréntesis hay texto, este se encierra entre comillas. En Java, una cadena siempre se enmarca con comillas **dobles** `"..."`. No se pueden usar comillas simples `'...'` para una cadena: en ellas se escribe un único carácter (el tipo `char`), por ejemplo `'A'`. Si enmarcas una cadena con comillas simples, el compilador señalará un error de sintaxis:

```bash
# Por ejemplo, así
App.java:5: error: unclosed character literal
System.out.println('Hello, World!');
```

El comando en sí se encuentra dentro de varias construcciones que son necesarias incluso para los programas más simples en Java. En este caso, se trata de la clase `App` y el método `main()`.

Por ahora no nos detendremos en ellas, ya que para entenderlas hace falta saber programar un poco. Por eso, en muchos ejercicios se dan "tal cual", es decir, no tendrás que escribirlas tú mismo. Cuando llegue el momento, las analizaremos.

## El significado de los símbolos

El código se compone de comandos, y cada uno de ellos debe escribirse de una forma determinada. Además de las letras, en el código importan las comillas `"`, los paréntesis `()`, las llaves `{}` y el punto y coma `;`. Un símbolo omitido o confundido hará que el programa no compile. ¿Puedes averiguar qué error hay en cada una de las líneas?

```java
System.out.println("I am the King");
System.out.println("I am the King";
System.out.println(I am the King");
System.ouprintln("I am the King");
System.out.println("I am the King")
```

Incluso una pequeña diferencia — una letra de más, un paréntesis perdido o un `;` olvidado — puede hacer que el programa no funcione. Esto también se aplica a las mayúsculas y minúsculas, es decir, a la diferencia entre letras grandes y pequeñas. Si en un texto normal `Hola` y `hola` se ven iguales, para Java son palabras distintas. Java considera `println`, `Println` y `PRINTLN` como nombres diferentes, y solo funcionará la primera opción.

## Dónde practicar

La teoría se asimila mejor cuando ejecutas el código en paralelo y ves el resultado. A medida que avances por las lecciones, te encontrarás constantemente con ejemplos de código y descripciones de su funcionamiento. Para entenderlos mejor y saber usar el lenguaje, hay que practicar y experimentar constantemente — siempre que sea posible, ejecuta todos los ejemplos de la teoría.

Lo más fácil para empezar con Java es el sitio [onecompiler](https://onecompiler.com/jshell), que permite ejecutar el código línea por línea directamente en el navegador con JShell. Intenta ir allí ahora mismo y escribir este código:

```text
System.out.println(85 * 3);
```

¿Cómo funciona esto técnicamente? A diferencia de los lenguajes que se ejecutan línea por línea con un intérprete, el código en Java primero pasa por un compilador y luego lo ejecuta la máquina virtual de Java (JVM), que muestra el resultado en la pantalla:

```text
Código                   Compilador + JVM          Pantalla
┌──────────────────┐     ┌─────────────────┐     ┌──────────────┐
│ System.out       │ ──→ │  javac + JVM    │ ──→ │ Hello, World!│
│   .println(…)    │     │                 │     │              │
└──────────────────┘     └─────────────────┘     └──────────────┘
```
