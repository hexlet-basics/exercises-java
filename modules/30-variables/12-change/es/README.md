La palabra "variable" en sí misma sugiere que su valor puede cambiar. Esta es una de las principales razones por las que existen las variables.

Aquí tienes un ejemplo:

```java
var greeting = "Father!";
System.out.println(greeting); // => Father!

// var ya no se usa, la variable está definida arriba
greeting = "Mother!";
System.out.println(greeting); // => Mother!
```

Aquí primero escribimos una cadena (*Father!*) en la variable, y luego otra (*Mother!*). El nombre de la variable no cambió, pero el valor de su interior pasó a ser otro. La palabra clave `var` solo se necesita al crear la variable. Al cambiar el valor, ya no se escribe.

```text
Antes:   greeting ──→ "Father!"
Después: greeting ──→ "Mother!"
```

## Para qué cambiar un valor

En los programas reales, las variables cambian constantemente. Aquí tienes algunas razones:

- El programa reacciona a las acciones del usuario. Por ejemplo, mientras introduces datos en un formulario de un sitio web, las variables que contienen esos datos cambian constantemente.
- Resultados intermedios. A menudo los datos pasan por una serie de transformaciones, y en cada etapa la variable se actualiza con un nuevo valor. Un mecanismo similar existe incluso en las calculadoras, cuando los valores intermedios se guardan con las teclas `m+` o `m-`.
- Almacenamiento del estado. Si escribes un juego, la posición del personaje, su salud, la puntuación y el nivel actual serán variables que cambian constantemente.

## El tipo de la variable no cambia

Java es un lenguaje de tipado estático. El tipo de una variable se establece al crearla y ya no vuelve a cambiar. En el ejemplo anterior, escribimos una cadena al crear la variable. El compilador recuerda el tipo y verifica todos los cambios posteriores.

Si intentamos asignar un número a esa misma variable, obtendremos un error:

```java
greeting = 5;
// Error:
// incompatible types: int cannot be converted to java.lang.String
// tipos incompatibles: un número no se puede convertir en una cadena
```

El compilador realiza esta comprobación sin ejecutar el código. Precisamente por eso a este tipo de tipado se le llama **estático**. En JavaScript, Ruby, PHP, Python y otros lenguajes dinámicos, este comportamiento no se considera un error, y una variable puede cambiar su tipo durante la ejecución.

## La otra cara de la mutabilidad

Las variables ofrecen una forma de almacenar datos que cambian a lo largo de la ejecución del programa. Gracias a esto, se pueden escribir programas que se comportan de manera diferente según las condiciones, las acciones del usuario o los resultados de los cálculos.

Pero la mutabilidad también tiene su otra cara. A veces es difícil entender qué se ha escrito exactamente en una variable en un momento concreto. El desarrollador tiene que rastrear dónde y cómo cambió, sobre todo si el código es largo.

Esto es justamente lo que se hace durante la depuración. El desarrollador averigua por qué el programa funciona de forma distinta a lo previsto. Se comprueban los valores de las variables, se sigue el orden de ejecución del código y se busca dónde algo salió mal.
