Incluso a los desarrolladores más experimentados el código les funciona pocas veces a la perfección desde el primer intento. Cuanto más experimentado es un desarrollador, con más seguridad **depura** el código, es decir, analiza los errores y los elimina.

La habilidad de depurar no aparece por sí sola. Hay que desarrollarla, y cuanto antes, mejor. A lo largo del aprendizaje harás ejercicios y practicarás, y con el tiempo el análisis de errores se convertirá en un hábito.

## Cómo encontrar un error en el código

Depurar a base de prueba y error lleva mucho tiempo. Es mucho más productivo entender primero qué es exactamente lo que salió mal y después eliminar la causa.

Si el programa se cayó con una excepción, lo primero que hay que estudiar es la **pila de llamadas** (stack trace). Contiene la cadena de llamadas a métodos desde el lugar del error hasta el arranque del programa. Cada entrada indica la clase, el método, el archivo y la línea. Por la pila se ve qué métodos se ejecutaron y dónde surgió el problema:

```bash
Exception in thread "main" java.lang.ArithmeticException: / by zero
    at App.divide(App.java:6)
    at App.main(App.java:2)
```

En la primera línea está el tipo de la excepción y el mensaje de error: `ArithmeticException` con la aclaración `/ by zero` (división por cero). Después va la pila en sí: el error surgió en el método `divide`, en la línea 6, y lo llamaron desde `main`, en la línea 2. Por los nombres de las clases también se puede entender si el problema está en tu código o en una biblioteca conectada.

**Si quieres pedir consejo a un desarrollador con experiencia, lo primero que debes mostrar es el mensaje de error y la pila de llamadas.** Un fragmento de código sin contexto dice poco, mientras que el texto del error orienta de inmediato hacia la causa.

## Tipos de errores

Los errores más comprensibles son los **sintácticos**. Surgen cuando el código está escrito de forma incorrecta: falta un paréntesis o un punto y coma, no coinciden las comillas. Ese código no compila, y el compilador indica directamente el lugar:

```bash
App.java:2: error: ';' expected
        System.out.println("Hello")
                                   ^
```

Más difíciles de corregir son los **errores de tiempo de ejecución**. El código compila, pero al ejecutarlo se cae con una excepción: división por cero, acceso a `null`, salida de los límites de una cadena o de un array. Se manifiestan ya durante el trabajo del programa, y la causa no siempre está allí donde se cayó.

Lo más complicado es luchar con los **errores lógicos**. El programa se ejecuta sin excepciones, pero da un resultado incorrecto. No hay mensaje de error, solo una salida inesperada. Por ejemplo, un método debería calcular la suma, pero calcula la diferencia:

```java
// El método debería calcular la suma de los números, pero calcula la diferencia
public static int sum(int a, int b) {
    return a - b;
}
```

## Formas de depurar

En la base de cualquier método de depuración está la observación de las variables durante la ejecución. Veamos un método que calcula la suma de los números desde `start` hasta `finish`. Con `start = 3` y `finish = 5` debería calcular `3 + 4 + 5`:

```java
public static int sumOfSeries(int start, int finish) {
    int result = 0;
    int n = start;
    while (n < finish) {
        result = result + n;
        n = n + 1;
    }
    return result;
}
```

Las variables clave aquí son `n` y `result`. Para encontrar el error hay que mirar qué valores toman en cada iteración. Para eso existen los **depuradores visuales**, integrados en los editores de código: permiten ejecutar el programa paso a paso, observando las variables en tiempo real.

En Hexlet, en lugar de un depurador se usa la **impresión de depuración**. El principio es el mismo, solo que los valores de las variables se muestran con el habitual `System.out.println()`:

```java
public static int sumOfSeries(int start, int finish) {
    int result = 0;
    int n = start;
    while (n < finish) {
        System.out.println("new iteration !!!!");
        System.out.println(n);
        result = result + n;
        n = n + 1;
        System.out.println(result);
    }
    return result;
}

// new iteration !!!!
// 3
// 3
// new iteration !!!!
// 4
// 7
```

La salida muestra que hay una iteración menos de las que hacen falta: el cinco (`finish`) no entró en la suma. En la condición está `n < finish` en lugar de `n <= finish`. Hay que cambiar el signo `<` por `<=`.

Los desarrolladores que empiezan se disgustan a menudo por los errores y se consideran despistados. Errores los tiene todo el mundo, tanto los junior como los senior. La diferencia está solo en la seguridad con la que los encuentras.
