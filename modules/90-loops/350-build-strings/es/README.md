Otro uso de los bucles es la **formación de cadenas**. Este tipo de tarea es común en programación y se reduce a una simple agregación mediante concatenación.

Hay una tarea que es popular en las entrevistas: **invertir una cadena**. Se puede resolver de muchas formas diferentes, pero la forma más básica es recorrerla carácter por carácter:

```java
App.reverse("Hexlet"); // "telxeH"
```

La idea general de la inversión es tomar los caracteres uno por uno desde el principio de la cadena y unirlos en orden inverso. Veamos cómo funciona:

```java
public static String reverse(String str) {
    var i = str.length() - 1;
    // El elemento neutral para las cadenas es una cadena vacía
    var result = "";
    while (i >= 0) {
        // Unir en orden inverso
        result = result + str.charAt(i);
        i -= 1;
    }

    return result;
}

var name = "Bran";
App.reverse(name); // "narB"
// Comprobación del elemento neutral
App.reverse(""); // ""
```

https://replit.com/@hexlet/java-basics-loops-using-2

Es importante comprender cómo se construye la cadena: cada carácter siguiente se une a la cadena resultante por la izquierda, y al final la cadena queda invertida.
