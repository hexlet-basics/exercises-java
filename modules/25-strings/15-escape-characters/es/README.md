Queremos mostrar un diálogo entre la Madre de los Dragones y su hijo:

```text
- ¿Tienes hambre?
- ¡Aaaarrrgh!
```

Si imprimimos una cadena de texto con este contenido:

```java
System.out.println("- ¿Tienes hambre?- ¡Aaaarrrgh!");
```

Obtendremos esto:

```text
- ¿Tienes hambre?- ¡Aaaarrrgh!
```

No es lo que queríamos. Las líneas están una al lado de la otra en lugar de estar una debajo de la otra. Necesitamos decirle al intérprete "presiona Enter" - hacer un salto de línea después del signo de interrogación. Esto se puede hacer utilizando el carácter de salto de línea: `\n`:

```java
System.out.println("- ¿Tienes hambre?\n- ¡Aaaarrrgh!");
```

resultado:

```text
- ¿Tienes hambre?
- ¡Aaaarrrgh!
```

`\n` es un carácter especial. En la literatura a menudo se le llama *LF* (Line Feed). Es posible que ahora estés pensando que esto es un error tipográfico, ya que aquí vemos dos caracteres `\` y `n`, pero no es así. Desde el punto de vista de la computadora, es un solo carácter de salto de línea invisible:

```java
// No hemos estudiado esto, pero debes saber la verdad
// A continuación, el código que devuelve la longitud de una cadena
"a".length();    // 1
"\n".length();   // 1 !!!
"\n\n".length(); // 2 !!!
```

¿Por qué se hizo así? `\n` es solo una forma de escribir el carácter de salto de línea, pero el salto de línea en sí es un solo carácter, aunque invisible.

Es por eso que surgió esta tarea. Necesitábamos representarlo de alguna manera en el teclado. Y dado que la cantidad de caracteres en el teclado es limitada y se destina a los más importantes, todos los caracteres especiales se implementan en forma de estas representaciones.

El carácter de salto de línea no es algo específico de la programación. Todos los que han escrito en una computadora han usado el salto de línea al presionar Enter.

Muchos editores tienen una opción que permite mostrar caracteres invisibles. Esta opción ayuda a comprender dónde se encuentran, aunque es solo una representación esquemática, ya que estos caracteres invisibles no tienen una representación gráfica:

```text
- ¡Hola!¶
- ¡Oh, hola!¶
- ¿Cómo estás?
```

El dispositivo que muestra el texto correspondiente tiene en cuenta este carácter. Por ejemplo, una impresora, al encontrar un LF, avanza el papel hacia arriba una línea, y un editor de texto mueve todo el texto siguiente hacia abajo, también una línea.

`\n` es un ejemplo de una **secuencia de escape** (escape sequence). También se les llama construcciones de control. Aunque hay más de una docena de estos caracteres, en programación solo se encuentran unos pocos con frecuencia.

Además del salto de línea, estos caracteres incluyen:

* Tabulación - la separación que se obtiene al presionar la tecla Tab
* Retorno de carro (solo en Windows)

Los programadores a menudo necesitan usar el salto de línea `\n` para formatear correctamente el texto:

```java
System.out.println("Gregor Clegane\nDunsen\nPolliver\nChiswyck");
```

Se mostrará en la pantalla:

```text
Gregor Clegane
Dunsen
Polliver
Chiswyck
```

Ten en cuenta los siguientes puntos:

1. No importa lo que haya antes o después de `\n`: un carácter o una cadena vacía. El salto de línea se detectará y se realizará de todos modos.

2. Recuerda que una cadena puede contener un solo carácter o incluso cero caracteres. Y también una cadena puede contener solo `\n`. Analiza el siguiente ejemplo:

    ```java
    System.out.println("\n");
    System.out.println("Dunsen");
    ```

    Aquí primero imprimimos una cadena "salto de línea" y luego imprimimos una cadena normal. El programa mostrará en la pantalla:

    ```text


    Dunsen
    ```

    ¿Por qué aparecieron dos líneas vacías antes de la cadena *Dunsen* en lugar de una? El caso es que `System.out.println()` agrega automáticamente un carácter de salto de línea al final al imprimir un valor.

    Por lo tanto, especificamos un salto de línea explícitamente pasando este carácter de secuencia de escape como argumento a la función, y el segundo salto de línea se agregó automáticamente por la función.

    Otro ejemplo de código:

    ```java
    System.out.println("Polliver");
    System.out.println("Gregor Clegane");
    System.out.println();
    System.out.println("Chiswyck\n");
    System.out.println("Dunsen");
    ```

    La salida será así:

    ```text
    Polliver
    Gregor Clegane

    Chiswyck

    Dunsen
    ```

    Ahora tienes suficiente conocimiento para entender por qué la salida se formó de esta manera.

3. Si necesitamos imprimir `\n` como texto (dos caracteres de impresión separados), podemos usar el método de escape que ya conocemos, agregando otro `\` al principio. Es decir, la secuencia `\\n` se mostrará como los caracteres `\` y `n` uno después del otro:

    ```java
    System.out.println("Joffrey ama usar \\n");
    ```

    se mostrará en la pantalla:

    ```text
    Joffrey ama usar \n
    ```

Una pequeña pero importante nota sobre Windows. En Windows, por defecto se utiliza `\r\n` para el salto de línea - esto se debe a razones históricas. Esta combinación funciona bien solo en Windows, pero crea problemas al transferir a otros sistemas, por ejemplo, cuando hay usuarios tanto de Windows como de Linux en el equipo de desarrollo.

El caso es que la secuencia `\r\n` tiene diferentes interpretaciones dependiendo de la codificación seleccionada. Por lo tanto, en el entorno de desarrollo, siempre se usa `\n` sin `\r`, ya que LF siempre se interpreta de la misma manera y funciona perfectamente en cualquier sistema. No olvides configurar tu editor para usar `\n`.
