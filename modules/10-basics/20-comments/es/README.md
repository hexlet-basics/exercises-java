Casi todos los lenguajes de programación permiten dejar comentarios en el código. Los comentarios no son utilizados por el código y sirven únicamente para las personas: para que el programador deje notas para sí mismo y para otros programadores, explique cómo funciona el código, marque errores o recuerde lo que aún queda por hacer.

```java
// Eliminar la línea de abajo tras implementar la tarea de registro
System.out.println(10);
```

El compilador ignora por completo los comentarios: no afectan al funcionamiento del programa:

```text
// comentario                        ──→  [ omitido por el compilador ]
System.out.println("hello");         ──→  [ ejecutado → hello ]
// otro más                          ──→  [ omitido por el compilador ]
```

En Java hay tres tipos de comentarios:

**Comentarios de una línea** que comienzan con `//`. Después de estos dos caracteres puede seguir cualquier texto; la línea completa no será analizada ni ejecutada.

El comentario puede ocupar toda la línea:

```java
// For Winterfell!
```

También el comentario puede estar en la línea, después de algún código:

```java
System.out.println("I am the King"); // => For Lannisters!
```

**Comentarios de varias líneas** que comienzan con `/*` y terminan con `*/`. Es común comenzar cada línea con el carácter `*`, aunque técnicamente no es obligatorio:

```java
/*
* The night is dark and
* full of terrors.
*/
System.out.println("I am the King"); // => I am the King
```

**Comentarios de documentación** que comienzan con `/**` y terminan con `*/`. Para estos ya es obligatorio comenzar cada línea con el carácter `*`.

Los comentarios de documentación son un subtipo de los comentarios de varias líneas. Además, cumplen una función adicional: se pueden recopilar con la herramienta especial javadoc y generar como documentación de tu código. Hablaremos de ellos más adelante, cuando veamos las clases y los métodos.

## Comentarios de servicio

Durante el trabajo te encontrarás con este código en nuestro editor:

```java
// BEGIN

// END
```

_BEGIN_ y _END_ aquí son comentarios de una línea normales que no afectan en absoluto al funcionamiento del programa. Indican dónde escribir el código del ejercicio.

```java
// BEGIN
<aquí tu solución>
// END
```

Cuando veas _BEGIN_ y _END_, escribe tu código entre ellos y deja el resto sin cambios.
