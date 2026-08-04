La construcción `if` sabe comprobar una condición y ejecutar un bloque de código cuando es verdadera. Tiene una continuación. La rama `else` marca el bloque que se ejecutará si la condición del `if` resultó falsa:

```java
if (x > 5) {
    // Se ejecutará si la condición es true
} else {
    // Se ejecutará si la condición es false
}
```

Mira el método de abajo. Determina el tipo de la oración por su último carácter. Si la oración termina con un signo de interrogación, el método devolverá `Sentence is question`; en caso contrario devolverá `Sentence is general`:

```java
public static String getTypeOfSentence(String sentence) {
    String sentenceType;

    if (sentence.endsWith("?")) {
        sentenceType = "question";
    } else {
        sentenceType = "general";
    }

    return "Sentence is " + sentenceType;
}

App.getTypeOfSentence("Hodor");  // "Sentence is general"
App.getTypeOfSentence("Hodor?"); // "Sentence is question"
```

Hemos añadido `else` y un bloque nuevo. Se ejecutará si la condición del `if` resulta falsa. La palabra `else` se traduce como "si no".

```text
      ┌───────────┐
      │ condición │
      └─────┬─────┘
  true │           │ false
      ↓           ↓
┌──────────┐ ┌──────────┐
│ rama if  │ │ rama else│
└──────────┘ └──────────┘
```

Dentro del bloque `else` se pueden anidar otras condiciones `if`:

```java
int number = 10;

if (number > 10) {
    System.out.println("Number is greater than 10");
} else {
    if (number == 10) {
        System.out.println("Number is exactly 10");
    } else {
        System.out.println("Number is less than 10");
    }
}
```

## Dos maneras de plantear un if-else

La construcción `if-else` se puede escribir de dos maneras. Con la ayuda de la negación cambia el orden de los bloques:

```java
public static String getTypeOfSentence(String sentence) {
    String sentenceType;

    if (!sentence.endsWith("?")) {
        sentenceType = "general";
    } else {
        sentenceType = "question";
    }

    return "Sentence is " + sentenceType;
}
```

Para que la construcción resulte más cómoda de plantear, elige la comprobación sin negaciones y ajusta a ella el contenido de los bloques.

## Cuando el else no hace falta

Si la rama `if` contiene un `return`, el `else` se puede omitir. Después de `return` el método termina, y la línea siguiente se ejecutará solo cuando la condición del `if` haya resultado falsa:

```java
public static String getTypeOfSentence(String sentence) {
    if (sentence.endsWith("?")) {
        return "question";
    }

    // Llegamos aquí solo si la condición de arriba es falsa
    return "general";
}
```

Ese estilo elimina la anidación innecesaria. Cuanto más simple se ve un método, más fácil es leer su lógica.
