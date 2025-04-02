Muchos lenguajes utilizan no solo la estructura condicional `if`, sino también `switch` en adición a ella. La estructura `switch` es una versión especializada de `if`, creada para algunas situaciones particulares.

Por ejemplo, se debe utilizar cuando hay una cadena de `if else` con comprobaciones de igualdad:

```java
if (status.equals("processing")) {
    // Hacer algo
} else if (status.equals("paid")) {
    // Hacer algo más
} else if (status.equals("new")) {
    // Hacer algo más
} else {
    // Hacer algo más
}
```

Esta comprobación compuesta tiene una característica distintiva: cada rama aquí es una comprobación del valor de la variable `status`. La estructura `switch` permite escribir este código de forma más corta y expresiva:

```java
switch (status) {
    case "processing":
        // Hacer algo
        break;
    case "paid":
        // Hacer algo más
        break;
    case "new":
        // Hacer algo más
        break;
    default: // else
        // Hacer algo más
}
```

En términos de cantidad de elementos, `switch` es una estructura bastante compleja. Incluye:

* Una declaración externa con la palabra clave `switch`. Tiene dos elementos:
    - Una variable, cuyos valores serán utilizados por `switch` para seleccionar el comportamiento
    - Llaves para los casos de selección
* Las construcciones `case` y `default`, dentro de las cuales se describe el comportamiento para diferentes valores de la variable considerada. Cada `case` corresponde a un `if`, como en el ejemplo anterior. Aquí, `default` es una situación especial que corresponde a la rama `else` en las estructuras condicionales. Al igual que con `else`, no es obligatorio especificar `default`.
* La construcción `break`, que evita la "caída". Si no se especifica, después de ejecutar el `case` necesario, la ejecución pasará al siguiente `case`. Este ciclo se repetirá hasta el `break` más cercano o hasta el final del `switch`.

Las llaves en `switch` no definen un bloque de código, como en otros lugares. Dentro de ellas solo se permite la sintaxis que se muestra arriba, donde se pueden utilizar `case` o `default`. Pero dentro de cada `case` (y `default`) la situación es diferente. Aquí se puede ejecutar cualquier código arbitrario:

```java
switch (count) {
  case 1:
    // Hacer algo útil
    break;
  case 2:
    // Hacer algo útil
    break;
  default:
    // Hacer algo
}
```

A veces, el resultado obtenido dentro de un `case` es el final de la ejecución del método que contiene el `switch`. En este caso, es necesario devolverlo de alguna manera al exterior. Para resolver esta tarea, hay dos formas.

La primera forma es crear una variable antes del `switch`, llenarla en los `case` y luego devolver el valor de esta variable al exterior:

```java
class App {
    public static String getExplanation(int count) {
        // Declarar la variable
        String result;

        // Llenarla
        switch(count) {
            case 1:
                result = "uno";
                break;
            case 2:
                result = "dos";
                break;
            default:
                result = null;
        }

        // Devolverla
        return result;
    }
}
```

La segunda forma es más simple y corta. En lugar de crear una variable, se puede utilizar `case`, dentro del cual se puede hacer un retorno normal del método. Después de `return`, no se ejecuta ningún código, por lo que podemos eliminar el `break`:

```java
class App {
    public static String getExplanation(int count) {

        switch(count) {
            case 1:
                return "uno";
            case 2:
                return "dos";
            default:
                return null;
        }
    }
}
```

Aunque `switch` se encuentra en el código, técnicamente siempre se puede prescindir de él.

La utilidad de esta estructura radica en que expresa mejor la intención del programador cuando se necesita comprobar valores específicos de una variable. A diferencia de los bloques `else if`, el código con `switch` es un poco más largo, pero mucho más fácil de leer.
