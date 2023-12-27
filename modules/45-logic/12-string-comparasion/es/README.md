Echa un vistazo al código y trata de responder cuáles son los valores de estas expresiones:

```java
// ¿Cuál es el resultado de estos ejemplos: `true` o `false`?

"a" == "a";
"a".toUpperCase() == "a".toUpperCase();
```

Respuesta correcta: en el primer caso es `true`, en el segundo es `false`. ¿Por qué? Para responder a esta pregunta, es necesario entender cómo funcionan las computadoras.

En nuestros programas, operamos con datos: números, cadenas, valores booleanos. Realizamos diversas operaciones: los almacenamos en variables, los multiplicamos, los dividimos, los concatenamos.

Así es como ve su trabajo un programador. Pero dentro de la computadora, todo es un poco diferente. Durante la ejecución del programa, este accede y manipula los datos a través de sus direcciones en la memoria:

```java
// Se asigna un área de memoria para almacenar la variable
// El programa recuerda la dirección de esta área y trabaja con ella internamente
var name = "CodeBasics";
// El programa lee el valor de la variable en la dirección de memoria donde se almacena el valor
System.out.println(name);
```

**Memoria** es una gran área para almacenar datos, similar a un almacén. Cada valor en la memoria recibe un número, que se utiliza para recuperarlo y reemplazarlo. Ese número es la **dirección**.

## Comparación por referencia y por valor

Debido a estas características técnicas, podemos ver la comparación de datos de dos maneras:

* *Lo mismo* - la misma área de memoria
* *Igual* - valores idénticos, independientemente de las direcciones a las que apuntan

Un ejemplo de la vida real: dos vasos idénticos de un mismo conjunto. A pesar de su similitud, siguen siendo vasos diferentes.

Los lenguajes de programación manejan estos conceptos de diferentes maneras. Al igual que en muchos otros lenguajes, en Java los datos se dividen en dos tipos principales:

* Los datos primitivos se comparan por valor, independientemente de las direcciones
* Los datos de referencia se comparan por direcciones

Así es como funcionan los datos primitivos:

```java
// La comparación se realiza por valor, no por direcciones
4 == 4; // true
true == true; // true
10.0 == 10.0; // true
```

Hasta ahora solo hemos trabajado con datos de referencia en forma de cadenas, pero se comportan de manera especial. Por lo tanto, como ejemplo, veamos cómo funcionan los arreglos. No te preocupes por la sintaxis desconocida, solo presta atención a que en este código, cosas aparentemente iguales no son iguales:

```java
// Creación de arreglos
int[] a = {1, 2}
int[] b = {1, 2}
// Los valores son iguales, pero las referencias son diferentes
a == b; // false
```

## Características de las cadenas

Las cadenas son consideradas datos de referencia, pero se comportan de manera extraña:

```java
// Comparación como datos primitivos
"hm" == "hm"; // true
// Comparación como datos de referencia
"hexlet".toUpperCase() == "hexlet".toUpperCase(); // false
```

Los programas operan constantemente con cadenas, por lo que la eficiencia en su manipulación es primordial. Si las cadenas siempre se comportaran como datos de referencia, se asignaría memoria adicional para cada valor en el código:

```java
// Sin optimizaciones, esta expresión resultaría en una asignación de memoria duplicada
// Una unidad de memoria para cada "hm"
"hm" == "hm";
```

Pero eso no sucede. Cuando Java encuentra una cadena creada explícitamente, verifica si ya existe en la memoria.

Si existe, se reutiliza; si no, se crea:

```java
// Se asigna memoria
var name1 = "Java";
// Como ya existe una cadena igual en la memoria, se utiliza una referencia a la cadena existente
// Esto ahorra memoria
var name2 = "Java";
// Comparación por referencia
// Ambas variables apuntan a la misma área de memoria
name1 == name2; // true
```

Pero si una cadena se devuelve desde un método, se coloca en su propia área de memoria con su dirección única:

```java
// Se asigna nueva memoria de todos modos
var name1 = "java".toUpperCase(); // "JAVA"
// Se asigna nueva memoria de todos modos
var name2 = "java".toUpperCase(); // "JAVA"
name1 == name2; // false
```

Puede parecer que los datos de referencia solo causan problemas. En realidad, son necesarios. Esto se entenderá cuando nos enfrentemos a la mutabilidad en el futuro.

En la programación aplicada, a menudo comparamos cadenas por valor en lugar de por referencia. Para esto, las cadenas tienen el método `equals()` incorporado:

```java
var name1 = "java".toUpperCase(); // "JAVA"
var name2 = "java".toUpperCase(); // "JAVA"
name1.equals(name2); // true
```

Además de `equals()`, las cadenas tienen el método `equalsIgnoreCase()`, que realiza una comparación sin tener en cuenta el caso:

```java
var name1 = "java".toUpperCase(); // "JAVA"
var name2 = "java".toLowerCase(); // "java"
name1.equalsIgnoreCase(name2); // true
```

A veces, la comparación de cadenas en Java se comporta como una comparación de valores, pero nunca confíes en eso. Al cambiar el código, es fácil olvidar corregir la comparación y obtener un error. Siempre utiliza los métodos cuando necesites comparar por valor.
