Observa la definición de un método que devuelve el valor absoluto del número que se le pasa:

```java
// Si es mayor que cero, damos el propio número. Si es menor, le quitamos el signo
public static int abs(int number) {
  if (number >= 0) {
    return number;
  }

  return -number;
}

App.abs(10);  // 10
App.abs(-10); // 10
```

En Java existe una construcción que por su acción es análoga a `if-else`, pero que además es una expresión. Se llama **operador ternario**.

El operador ternario es el único de su tipo que exige tres operandos. Ayuda a escribir menos código para las expresiones condicionales simples. Nuestro ejemplo de arriba, con el operador ternario, se reduce a una sola línea:

```java
public static int abs(int number) {
  return number >= 0 ? number : -number;
}
```

La plantilla general se ve así:

```java
<predicado> ? <expresión si es true> : <expresión si es false>
```

Primero se escribe la expresión lógica, y después dos variantes de comportamiento:

1. Si la condición es verdadera, se evalúa la variante que está antes de los dos puntos
2. Si la condición es falsa, se evalúa la variante que está después de los dos puntos

Reescribamos con el operador ternario el método que determina el tipo de la oración.

Antes:

```java
public static String getTypeOfSentence(String sentence) {
    if (sentence.endsWith("?")) {
        return "question";
    }

    return "general";
}
```

Después:

```java
public static String getTypeOfSentence(String sentence) {
    return sentence.endsWith("?") ? "question" : "general";
}

App.getTypeOfSentence("Hodor");  // "general"
App.getTypeOfSentence("Hodor?"); // "question"
```

El operador ternario se puede anidar dentro de otro operador ternario. Pero eso se considera una mala práctica: ese código es difícil de leer.
