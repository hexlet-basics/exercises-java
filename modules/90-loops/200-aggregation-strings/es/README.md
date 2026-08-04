La agregación se aplica no solo a los números, sino también a las cadenas. Por agregación de cadenas se entienden las tareas en las que no se sabe de antemano qué contienen las cadenas ni de qué tamaño son.

En la agregación, la cadena se forma dinámicamente. Imagina un método que repite una cadena la cantidad de veces indicada. En Java hay herramientas ya hechas para eso, pero aquí veremos cómo está montada esa repetición por dentro:

```java
App.repeat("hexlet", 3); // "hexlethexlethexlet"
```

El principio de funcionamiento de este método es bastante simple. En el ciclo se produce el crecimiento de la cadena la cantidad de veces indicada:

```java
public static String repeat(String text, int times) {
    // El elemento neutro para las cadenas es la cadena vacía
    var result = "";
    var i = 1;

    while (i <= times) {
        // Cada vez añadimos la cadena al resultado
        result = result + text;
        i = i + 1;
    }

    return result;
}
```

Describamos la ejecución de este código paso a paso:

```java
// Para la llamada repeat("hexlet", 3);
var result = "";
result = result + "hexlet"; // "hexlet"
result = result + "hexlet"; // "hexlethexlet"
result = result + "hexlet"; // "hexlethexlethexlet"
```

Visualmente, el proceso de crecimiento de la cadena se ve así:

```text
repeat("hexlet", 3):

i=1: result = ""             + "hexlet" = "hexlet"
i=2: result = "hexlet"       + "hexlet" = "hexlethexlet"
i=3: result = "hexlethexlet" + "hexlet" = "hexlethexlethexlet"
                                            └── resultado
```

Aquí trabajan a la vez dos variables. El contador `i` controla la cantidad de repeticiones y detiene el ciclo cuando las repeticiones llegan a `times`. La variable `result` guarda la cadena acumulada y la entrega al código que llama después del ciclo.

## El elemento neutro

Para que el crecimiento funcione hace falta un valor de partida. Para las cadenas, ese valor es la **cadena vacía** `""`.

Se la llama elemento neutro porque en la concatenación no cambia nada:

```java
System.out.println("" + "abc"); // => abc
System.out.println("abc" + ""); // => abc
```

Por eso la cadena vacía está siempre al principio en la agregación de cadenas. Desde ella el ciclo empieza el crecimiento, y después, en cada iteración, añade al resultado el siguiente trozo.
