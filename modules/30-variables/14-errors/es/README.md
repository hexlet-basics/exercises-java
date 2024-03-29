El orden de las instrucciones en el código con variables es de gran importancia. La variable debe ser definida antes de ser utilizada. A continuación se muestra un ejemplo de error que cometen con frecuencia los principiantes:

```java
System.out.println(greeting);
var greeting = "¡Padre!";
```

La ejecución del programa anterior termina con un error:

```text
Error: java: no se puede encontrar el símbolo
símbolo: variable greeting
```

El error **cannot find symbol** significa que se está utilizando una variable en el código que no está definida. Además, el propio error lo indica claramente: `variable greeting`.

Además del orden incorrecto de la definición, también se encuentran errores tipográficos tanto al utilizar la variable como al declararla.

Otro error común es intentar declarar una variable que ya ha sido declarada:

```java
var greeting = "¡Padre!";
var greeting = "¡Padre!";
```

Esto no se puede hacer. Tendrás que crear una nueva variable.

La cantidad de este tipo de errores se reduce mediante el uso de un editor correctamente configurado. Este tipo de editor resalta los nombres que se utilizan sin ser declarados y advierte sobre posibles problemas.
