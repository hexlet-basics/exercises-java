Los programas trabajan con información diferente. Puede ser texto, números, fechas, valores lógicos. Dentro de los lenguajes de programación de alto nivel, cada valor pertenece a algún tipo. Por ejemplo, las cadenas pertenecen al tipo *String*, y los números enteros al tipo *int*.

¿Para qué sirven los tipos? Protegen el programa de errores difíciles de detectar. Un tipo define dos cosas.

* Valores permitidos. Por ejemplo, los números en Java se dividen en dos grupos. Los números enteros pertenecen al tipo *int*, y los racionales (decimales) al tipo *double*. Esta división está relacionada con las particularidades del funcionamiento del hardware.
* Un conjunto de operaciones permitidas. Por ejemplo, la operación de multiplicación tiene sentido para los números enteros. Pero no tiene sentido para las cadenas. Multiplicar la palabra "mamá" por la palabra "cuaderno" es un sinsentido.

El lenguaje de programación reconoce los tipos. Por eso Java no permitirá multiplicar una cadena por una cadena, pero sí permitirá multiplicar un número entero por otro número entero. La presencia de tipos y de tales restricciones protege los programas de errores accidentales:

```text
"one" * "two"
Error:
bad operand types for binary operator '*'
  first type:  java.lang.String
  second type: java.lang.String
```

## Los números y las cadenas pertenecen a tipos diferentes

¿Cómo entiende Java qué tipo de datos tiene delante? Por la forma en que se escribe el valor. Un número se escribe sin comillas, mientras que las cadenas siempre están delimitadas por comillas dobles. Por ejemplo, el valor `"234"` se considera una cadena, aunque dentro estén escritos dígitos:

```java
System.out.println(5);     // => 5
System.out.println("234"); // => 234
```

En la pantalla el resultado se ve parecido, pero dentro del programa son valores diferentes. El número `5` pertenece al tipo *int*, y `"234"` al tipo *String*. Java no te dejará sumar una cadena y un número directamente sin una indicación explícita de cómo convertir los datos.

## Tipos primitivos y de referencia

Una parte de los tipos está integrada en el lenguaje. Se les llama primitivos. Además de los números enteros *int* y los racionales *double*, incluyen el tipo lógico *boolean* con los valores `true` y `false`, así como el carácter *char*:

```java
int n = 5;           // número entero
double x = 1.5;      // número racional
boolean flag = true; // valor lógico
char c = 'A';        // un carácter
```

Presta atención al tipo *char*. Un carácter se escribe entre comillas simples, por ejemplo `'A'`. En cambio, una cadena de un solo carácter se encierra entre comillas dobles, por ejemplo `"A"`. Son valores diferentes de tipos diferentes.

El tipo *String* pertenece a los tipos de referencia y describe un conjunto de caracteres, es decir, texto. Al mismo tiempo, las cadenas se usan al mismo nivel que los tipos primitivos.

Hay muchos tipos de datos en Java, y además se pueden crear los propios. Poco a poco nos familiarizaremos con todos los necesarios y aprenderemos a usarlos correctamente.
