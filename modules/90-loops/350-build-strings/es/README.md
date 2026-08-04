Otro uso de los ciclos es la **formación de cadenas**. Una tarea así aparece bastante a menudo en programación. Se reduce a la agregación habitual mediante concatenación.

Hay una tarea que es popular en las entrevistas: **invertir una cadena**. Se puede resolver de muchas maneras distintas, pero justamente el recorrido carácter a carácter se considera la básica:

```java
App.reverse("Hexlet"); // "telxeH"
```

La idea general de la inversión es la siguiente: hay que tomar los caracteres por turnos desde el principio de la cadena y unirlos en orden inverso. Comprobemos cómo funciona:

```java
public static String reverse(String str) {
    var i = 0;
    // El elemento neutro para las cadenas es la cadena vacía
    var result = "";
    while (i < str.length()) {
        // Unimos en orden inverso
        result = str.charAt(i) + result;
        i += 1;
    }

    return result;
}

var name = "Bran";
App.reverse(name); // "narB"
// Comprobación del elemento neutro
App.reverse(""); // ""
```

Es importante captar cómo se construye la cadena en sí: cada carácter siguiente se pega a la cadena resultante por la izquierda, y al final la cadena queda invertida.
