La agregación se aplica no solo a los números, sino también a las cadenas.

Al agregar cadenas, la cadena se forma dinámicamente, es decir, no se sabe de antemano su tamaño ni qué contendrá. Imagina un método que puede multiplicar una cadena, es decir, repetirla la cantidad de veces especificada:

```java
App.repeat("hexlet", 3); // "hexlethexlethexlet"
```

El principio de funcionamiento de este método es bastante simple. En un bucle, la cadena se incrementa la cantidad de veces especificada:

```java
public static String repeat(String text, int times) {
    // El elemento neutro para las cadenas es una cadena vacía
    var result = "";
    var i = 1;

    while (i <= times) {
        // Agregamos la cadena al resultado cada vez
        result = result + text;
        i = i + 1;
    }

    return result;
}
```

Desglosemos la ejecución de este código paso a paso:

```java
// Para llamar a repeat("hexlet", 3);
var result = "";
result = result + "hexlet"; // "hexlet"
result = result + "hexlet"; // "hexlethexlet"
result = result + "hexlet"; // "hexlethexlethexlet"
```
