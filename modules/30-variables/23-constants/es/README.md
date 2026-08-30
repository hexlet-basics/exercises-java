A veces en un programa aparecen valores que nunca deben cambiar. Por ejemplo:

- La constante matemática π (pi).
- El tipo de cambio del dólar en una fecha determinada.
- La comisión fija de un servicio.

Esos valores se llaman constantes, y se acostumbra distinguirlos de las variables corrientes para que no surja la tentación de cambiarlos.

## Ejemplo: el número π

Tomemos el número π. Aproximadamente siempre es igual a _3.14_ y no puede cambiar:

```java
final var pi = 3.14;
System.out.println(pi); // => 3.14
```

Aquí `pi` será una constante que almacena el valor del número π. El sentido de una constante es que su valor no cambia durante la ejecución del programa.

## En qué se diferencia una constante de una variable

El concepto de constante es común en la mayoría de los lenguajes de programación. En Java, antes de la definición de una constante se coloca la palabra clave `final`. Le indica al compilador la prohibición de modificarla. Cualquier intento de cambiar una constante provocará un error:

```java
final var pi = 3.14;
pi = 3.14159;
// Error:
// cannot assign a value to final variable pi
// no se puede asignar un valor a la constante pi
```

El compilador encuentra ese error sin ejecutar el código. En eso está la fuerza de `final`: el propio lenguaje se encarga de que el valor permanezca invariable.

## Cómo se escriben las constantes

Una constante, al igual que una variable, puede usarse en cualquier expresión. La única restricción es que no se puede cambiar.

Cuando una constante se describe a nivel de toda la clase y está disponible para todo el programa, en Java se adopta un estilo especial para escribir el nombre:

- Todas las letras en mayúscula
- Las palabras se separan con un guion bajo `_`
- El estilo se llama UPPER_SNAKE_CASE (también se le llama SCREAMING_SNAKE_CASE)

Esas constantes suelen declararse con `static final`:

```java
static final double PI = 3.14;
static final int MAX_USERS = 100;
static final int DEFAULT_TIMEOUT = 30;
```

Por el nombre se ve enseguida que estamos ante una constante, y no una variable corriente. Las mayúsculas la destacan en el código.

## Para qué sirven las constantes

Las constantes hacen que el código sea más claro y seguro. Ayudan a ver de inmediato qué valores del programa se consideran fijos y no deben cambiar. Esto es especialmente importante al trabajar con constantes matemáticas y físicas, ajustes por defecto o límites fijos.

El uso de constantes reduce el riesgo de errores. Gracias a la palabra clave `final`, el compilador no permitirá cambiar el valor por accidente. Además, si aun así hay que cambiar el valor, por ejemplo en los ajustes, basta con corregirlo en un solo lugar, y el cambio se aplicará en todo el programa.
