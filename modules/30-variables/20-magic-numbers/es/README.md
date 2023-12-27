Recordemos una de las lecciones anteriores:

```java
// Conversión de euros a rublos a través de dólares
var euros = 1000;
var dólares = euros * 1.25; // 1250
var rublos = dólares * 60; // 75000
System.out.println(rublos); // => 75000
```

Desde el punto de vista del desarrollo profesional, este código "huele mal". Así se describe el código que no cumple con las llamadas mejores prácticas (best practices). Y la razón aquí es la siguiente: en este momento, al ver los números *60* y *1.25*, es probable que te preguntes: "¿qué significan estos números?".

¡Imagínate lo que sucederá en un mes! ¿Cómo lo entenderá un nuevo programador que no haya visto el código antes? En nuestro ejemplo, el contexto se recupera gracias a una buena nomenclatura. Pero en la vida real, el código es mucho más complicado, por lo que a menudo es imposible adivinar el significado de los números.

Este efecto es causado por los **números mágicos** (magic numbers) - números cuyo origen es imposible de entender sin un profundo conocimiento de lo que está sucediendo dentro de una sección de código.

La solución es simple: basta con crear variables con nombres adecuados y todo encajará en su lugar:

```java
var dólaresEnEuro = 1.25;
var rublosEnDólar = 60;

var euros = 1000;
var dólares = euros * dólaresEnEuro; // 1250
var rublos = dólares * rublosEnDólar; // 75000
System.out.println(rublos); // => 75000
```

Presta atención a los siguientes detalles:

* Hemos utilizado la nomenclatura *lowerCamelCase*
* Las dos nuevas variables están separadas de los cálculos posteriores por una línea en blanco. Estas variables tienen sentido incluso sin los cálculos, por lo que esta separación es apropiada y mejora la legibilidad.
* Hemos obtenido un código bien nombrado y estructurado, pero es más largo que la versión anterior. Esto ocurre a menudo y es normal, porque el código debe ser legible.
