En los lenguajes humanos la gramática es importante, pero un texto con errores casi siempre se puede entender y leer. En la programación, todo es estricto. Cualquier mínima violación, y el programa no se ejecutará.

Un ejemplo puede ser un `;` olvidado, paréntesis mal colocados y otros detalles. Estos errores se llaman **errores de sintaxis**, porque violan las reglas de sintaxis del lenguaje.

## ¿Qué es un error de sintaxis?

Un error de sintaxis es una violación de las reglas gramaticales para escribir código en un lenguaje de programación concreto. Estos errores surgen cuando el código se escribe con una desviación del formato esperado: una cadena sin cerrar, un paréntesis o un punto y coma omitido, un orden de caracteres alterado, etc.

```text
Código con error           Compilador              Resultado
┌──────────────────┐      ┌─────────────┐      ┌──────────────────┐
│ println("Hi"     │  ──> │   javac     │  ──> │ error: ')' o     │
└──────────────────┘      └─────────────┘      │ ';' expected     │
                                               └──────────────────┘
```

A diferencia de los lenguajes naturales, donde un texto con errores se puede entender por el contexto, en la programación incluso la mínima desviación hace que el código no funcione.

Si un programa en Java está escrito de forma sintácticamente incorrecta, el compilador muestra en la pantalla:

* Un mensaje de error
* Una indicación del archivo
* La línea del archivo donde, según él, ocurrió el error

A continuación, un ejemplo de código con un error de sintaxis:

```java
System.out.println("alala
```

Si ejecutamos el código anterior, veremos el siguiente mensaje:

```text
|  Error:
|  unclosed string literal
|  System.out.println("alala
```

## ¿Por qué estos errores se consideran simples?

Los errores de sintaxis:

- son fáciles de detectar: el código a menudo se resalta en el editor;
- son fáciles de corregir: basta con restaurar el carácter que falta (`"`, `)`, `;`) o arreglar la estructura.

Pero hay una pega. El compilador no siempre señala exactamente el lugar donde se cometió el error. A veces el problema está unas líneas más arriba. Por ejemplo, un paréntesis abierto pero no cerrado en una línea puede "romper" todo el código siguiente.

## ¿Qué hacer ante un error de sintaxis?

- Lee el mensaje de error. Casi siempre contiene información útil: el tipo de error y la línea donde el compilador "tropezó".
- Revisa la línea indicada en el mensaje, y la línea anterior: a veces el error está "escondido" un poco antes (un `;` olvidado en la línea previa).
- Usa un [editor con resaltado de sintaxis](https://code.visualstudio.com/): te ayudará a detectar de inmediato comillas o paréntesis sin cerrar, o caracteres omitidos.
