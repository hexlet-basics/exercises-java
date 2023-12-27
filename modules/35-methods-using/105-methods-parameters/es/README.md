
El método `length()` no requiere ninguna aclaración. Siempre funciona de manera unívoca y extrae la longitud completa de una cadena.

Pero esto no siempre es así. Por ejemplo, si queremos extraer el primer carácter de una cadena, debemos especificar explícitamente que el carácter es el primero. Para esto, se pueden pasar parámetros a las llamadas de los métodos:

```java
var searchEngine = "google";
// Devuelve el primer carácter (tipo char)
searchEngine.charAt(0); // 'g'
```

¿Por qué el carácter es el primero pero se indica 0? En programación, la numeración comienza desde cero. Por lo tanto, el primer carácter se encuentra en la posición cero, es decir, "índice 0".

En consecuencia, el índice del último carácter es igual a la longitud de la cadena menos 1:

```java
// google length => 6
searchEngine.charAt(5); // 'e'
```

## Varios parámetros

Puede haber más de un parámetro. Por ejemplo, el método `replace()` trabaja con dos parámetros, donde el primero es lo que se va a reemplazar y el segundo es por qué se va a reemplazar:

```java
searchEngine.replace("go", "mo"); // "moogle"
```

## Valores predeterminados

Los parámetros pueden tener un valor predeterminado cuando ese valor se utiliza con mayor frecuencia.

Esta posibilidad se ha agregado a los lenguajes de programación para liberar al programador de tareas rutinarias. Un ejemplo simple es un método que extrae una subcadena de una cadena.

Este método acepta:

* El primer parámetro es el índice desde el cual se debe comenzar a extraer la subcadena.
* El segundo parámetro es el índice hasta el cual se deben extraer los caracteres.

Por defecto, se toma la cadena hasta el final:

```java
"hexlet".substring(1);    // "exlet"
"hexlet".substring(1, 2); // "e"
"hexlet".substring(1, 3); // "ex"
"hexlet".substring(3, 6); // "let"
```

https://replit.com/@hexlet/java-basics-methods-calling-1
