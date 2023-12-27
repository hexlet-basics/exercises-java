Las estructuras condicionales permiten ejecutar diferentes fragmentos de código basados en comprobaciones lógicas. Veamos un ejemplo típico:

* Una persona quiere pagar una compra con tarjeta.
* Si hay suficiente dinero en la cuenta, se deducirá automáticamente la cantidad necesaria.
* Si no hay suficiente dinero, la operación será rechazada.

Para el ejemplo, escribiremos un método que determina el tipo de una oración dada. Al principio, distinguirá entre oraciones normales e interrogativas:

```java
public static String getTypeOfSentence(String sentence) {
    if (sentence.endsWith("?")) {
        return "pregunta";
    }

    return "general";
}

App.getTypeOfSentence("Hola");    // "general"
App.getTypeOfSentence("¿Hola?");  // "pregunta"
```

`if` es una construcción del lenguaje que controla el orden de las instrucciones. Se le pasa una expresión lógica entre paréntesis y luego se describe un bloque de código entre llaves. Este bloque de código se ejecutará solo si la condición se cumple.

Si la condición no se cumple, se omitirá el bloque de código entre llaves y el método continuará su ejecución. En nuestro caso, la siguiente línea de código, `return "general";`, hará que el método devuelva una cadena y finalice.
