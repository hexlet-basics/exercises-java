Además de las operaciones aritméticas, en matemáticas escolares también conocemos las operaciones de comparación, por ejemplo:

```text
5 > 4
```

Esto se lee como una pregunta: "¿Cinco es mayor que cuatro?". En este caso, la respuesta es "sí". En otros casos, la respuesta puede ser "no", por ejemplo, para la siguiente expresión:

```text
3 < 1
```

Las operaciones de comparación no están limitadas a números. Se pueden comparar casi cualquier cosa, como cadenas de texto. Cuando ingresamos a un sitio web, se compara el nombre de usuario y la contraseña ingresados con los que están en la base de datos. Si hay una coincidencia, se realiza la autenticación.

Los lenguajes de programación han adaptado todas las operaciones de comparación matemáticas prácticamente sin cambios. La única diferencia importante son los **operadores de igualdad y desigualdad**.

En matemáticas, se utiliza el signo de igual `=`, pero en programación esto no se encuentra con frecuencia. En muchos lenguajes, el símbolo `=` se utiliza para asignar valores a variables, por lo que se utiliza `==` para las comparaciones.

Aquí tienes una lista de las operaciones de comparación en Java:

* `<` — menor que
* `<=` — menor o igual que
* `>` — mayor que
* `>=` — mayor o igual que
* `==` — igual que
* `!=` — no igual que

Veamos algunos ejemplos de operaciones lógicas:

```text
5 > 4
password == text
```

Ambos ejemplos son expresiones. El resultado de evaluar estas expresiones es uno de los dos valores especiales:

* `true` — "verdadero"
* `false`— "falso"

Este es un nuevo tipo de dato para nosotros, llamado **booleano**. Solo puede tener estos dos valores. Aquí tienes un ejemplo de código que lo utiliza:

```java
var resultado = 5 > 4;
System.out.println(resultado); // => true
```

Intentemos escribir un método que tome la edad de un niño y determine si es un bebé. Se considera bebé a un niño menor de un año:

```java
// Un método que devuelve un booleano se llama predicado
// Por lo general, estos métodos tienen un prefijo como has, can, is, was, etc.
public static boolean esBebe(int edad) {
    return edad < 1;
}
```

Aprovechamos el hecho de que cualquier operación es una expresión. Por lo tanto, en una sola línea de la función, escribimos "devolver el resultado de la comparación `edad < 1`".

Dependiendo del parámetro recibido, la comparación será verdadera (`true`) o falsa (`false`). Finalmente, `return` devuelve ese resultado:

```java
System.out.println(App.esBebe(3)); // => false
System.out.println(App.esBebe(0)); // => true
```
