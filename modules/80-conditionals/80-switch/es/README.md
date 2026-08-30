Muchos lenguajes usan no solo la construcción condicional `if`, sino también `switch` como complemento. La construcción `switch` es una versión especializada de `if`, creada para situaciones particulares.

Por ejemplo, conviene usarla allí donde hay una cadena de `if else` con comprobaciones de igualdad:

```java
if (status.equals("processing")) {
    // Hacemos lo primero
} else if (status.equals("paid")) {
    // Hacemos lo segundo
} else if (status.equals("new")) {
    // Hacemos lo tercero
} else {
    // Hacemos lo cuarto
}
```

Esta comprobación compuesta tiene un rasgo distintivo. Cada rama comprueba aquí el valor de la variable `status`. La construcción `switch` escribe ese código de forma más corta y expresiva:

```java
switch (status) {
    case "processing":
        // Hacemos lo primero
        break;
    case "paid":
        // Hacemos lo segundo
        break;
    case "new":
        // Hacemos lo tercero
        break;
    default: // else
        // Hacemos lo cuarto
}
```

```text
switch (valor) {
  │
  ├── case "a" → bloque 1
  ├── case "b" → bloque 2
  ├── case "c" → bloque 3
  └── default  → bloque por defecto
}
```

Desde el punto de vista de la cantidad de elementos, `switch` es una construcción bastante compleja. Incluye:

- La descripción externa con la palabra clave `switch`. En ella hay dos elementos: la variable por cuyos valores `switch` elige el comportamiento, y las llaves para las variantes de elección
- Las construcciones `case` y `default`, dentro de las cuales se describe el comportamiento para los distintos valores de la variable. Cada `case` corresponde a un `if`, como en el ejemplo de arriba. Aquí `default` es una situación especial que corresponde a la rama `else` de las construcciones condicionales. Igual que con `else`, indicar `default` no es obligatorio
- La construcción `break`, que evita la caída de una rama a otra. Sin ella, después del `case` necesario la ejecución pasará al `case` siguiente. Y así seguirá hasta el `break` más próximo o hasta el final del `switch`

Las llaves en `switch` no definen un bloque de código, como en otros lugares. Dentro solo se admite la sintaxis que se muestra arriba. Allí se pueden usar `case` o `default`. Pero dentro de cada `case` y `default` la situación es otra. Ahí se ejecuta cualquier código arbitrario:

```java
switch (count) {
    case 1:
        // Hacemos algo útil
        break;
    case 2:
        // Hacemos algo útil
        break;
    default:
        // Hacemos algo
}
```

## La devolución de un valor desde switch

A veces el resultado obtenido dentro de un `case` termina el trabajo del método que contiene el `switch`. Entonces hay que devolverlo de alguna manera hacia fuera. Para eso hay dos formas.

La primera forma crea una variable antes del `switch`, la rellena en los `case` y al final la devuelve hacia fuera:

```java
public static String getExplanation(int count) {
    // Declaramos la variable
    String result;

    // La rellenamos
    switch (count) {
        case 1:
            result = "one";
            break;
        case 2:
            result = "two";
            break;
        default:
            result = null;
    }

    // La devolvemos
    return result;
}
```

La segunda forma es más simple y corta. En lugar de una variable, dentro del `case` se puede hacer una devolución normal desde el método. Después de `return` no se ejecuta ningún código, por eso aquí `break` no hace falta:

```java
public static String getExplanation(int count) {
    switch (count) {
        case 1:
            return "one";
        case 2:
            return "two";
        default:
            return null;
    }
}
```

## La expresión switch

El `switch` clásico tiene una forma moderna con sintaxis de flecha. Se llama expresión switch y devuelve el valor directamente. Cada rama se escribe como `case valor -> resultado;`. Aquí no hacen falta ni `break` ni la caída entre ramas:

```java
public static String getExplanation(int count) {
    return switch (count) {
        case 1 -> "one";
        case 2 -> "two";
        default -> null;
    };
}
```

Una sola rama atiende varios valores si se enumeran separados por comas:

```java
String season =
        switch (month) {
            case 12, 1, 2 -> "winter";
            case 3, 4, 5 -> "spring";
            case 6, 7, 8 -> "summer";
            default -> "autumn";
        };
```

`switch` aparece en el código, pero técnicamente siempre se puede prescindir de él. La utilidad de esta construcción está en que expresa mejor la intención del programador cuando hay que comprobar valores concretos de una variable. En comparación con los bloques `else if`, el código con `switch` se lee de forma más clara.
