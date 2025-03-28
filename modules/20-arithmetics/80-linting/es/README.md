Ahora que ya hemos aprendido a escribir programas simples, podemos hablar un poco sobre cómo escribirlos.

El código del programa debe ser formateado de una manera específica para que sea lo suficientemente comprensible y fácil de mantener.

Conjuntos especiales de reglas, llamados **estándares**, describen varios aspectos de la escritura de código. En Java, el estándar más común es el estándar de [Sun](https://checkstyle.sourceforge.io/checks.html).

En cualquier lenguaje de programación, existen utilidades llamadas **linters**. Estas verifican el código para asegurarse de que cumpla con los estándares. En Java, esto se hace con [checkstyle](https://github.com/checkstyle/checkstyle). Echa un vistazo a este ejemplo:

```java
System.out.println( "Hello, World!" ); System.out.println("I'm a developer!") ;
```

El linter mostrará errores en varios lugares:

* '(' está seguido de un espacio en blanco. [ParenPad]
* ')' está precedido de un espacio en blanco. [ParenPad]
* ';' está precedido de un espacio en blanco. [NoWhitespaceBefore]
* Solo se permite una instrucción por línea. [OneStatementPerLine]

Analicemos estos errores:

* La regla **ParenPad**, indicada entre corchetes, requiere que no haya espacios después del paréntesis de apertura y antes del paréntesis de cierre.
* La regla **NoWhitespaceBefore** indica que no se debe colocar un espacio adicional antes del punto y coma.
* Es común escribir cada nueva instrucción en una nueva línea. Esto es lo que indica la regla *OneStatementPerLine*.

Cumplir con estas reglas no afecta el resultado, pero ayuda a escribir un código más comprensible y fácil de entender.

El código con estas reglas se vería así:

```java
System.out.println("Hello, World!");
System.out.println("I'm a developer!");
```

Ahora el linter no mostrará errores. ¿Qué conclusión podemos sacar? El linter ayuda a escribir código que es más fácil de leer y analizar.

Recuerda que tener un linter no reemplaza el análisis y la simplificación independiente del código. En tus futuras prácticas en [Hexlet](https://ru.hexlet.io/?utm_source=code-basics&utm_medium=referral&utm_campaign=programs&utm_content=lesson) y en el desarrollo real, el linter funcionará y te informará sobre cualquier violación.
