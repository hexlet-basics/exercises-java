Además de las operaciones aritméticas, de las matemáticas escolares conocemos también las operaciones de comparación, por ejemplo `5 > 4` o `3 < 1`. También existen en programación. Las comparaciones se usan a menudo en tareas reales relacionadas con números. Cuando hacemos una compra en una tienda online, el sistema comprueba si al usuario le alcanza el dinero de su cuenta. Si el importe de la cuenta es mayor o igual que el precio del producto, el pedido se confirma. Si no hay fondos suficientes, aparece un mensaje de error.

## La comparación en programación

Empecemos por un ejemplo en el que se comparan dos números. El resultado de la comparación lo mostramos en la pantalla:

```java
System.out.println(5 > 4); // => true
System.out.println(4 > 4); // => false
```

El resultado de una comparación es un valor de tipo `boolean`. Este tipo tiene solo dos variantes posibles, `true` y `false`. Son valores especiales del lenguaje y se pueden mostrar directamente:

```java
System.out.println(true);  // => true
System.out.println(false); // => false
```

En la práctica se usan pocas veces así, de forma tan directa, pero sobre ellos se construye la lógica del comportamiento del programa. Nos topamos con esto cada día, cuando introducimos códigos PIN y contraseñas, cuando realizamos acciones con distintos desenlaces posibles. Todas esas variantes están escritas dentro del programa en forma de expresiones condicionales. El programa razona más o menos así: _si es así, haz una cosa; si es de otra manera, haz otra_.

En Java están disponibles las siguientes operaciones de comparación:

- `<` — menor que
- `<=` — menor o igual que
- `>` — mayor que
- `>=` — mayor o igual que
- `==` — igual que
- `!=` — distinto de

Los lenguajes de programación adaptaron todas las operaciones matemáticas de comparación sin cambios, excepto los operadores de igualdad y desigualdad. En matemáticas, para la igualdad se usa el habitual `=`, pero en programación el símbolo `=` asigna valores a las variables. Por eso en Java se compara con la ayuda de `==`. Unos cuantos ejemplos mostrando el resultado en la pantalla:

```java
System.out.println(5 >= 3); // => true
System.out.println(7 < 0);  // => false
System.out.println(5 > 5);  // => false
System.out.println(5 >= 5); // => true
System.out.println(2 == 5); // => false
System.out.println(2 != 5); // => true
```

Cualquier operación de comparación se puede guardar en una variable de tipo `boolean` y después mostrarla:

```java
boolean result = 5 > 4;
System.out.println(result); // => true
```

Cuando en la comparación hay números fijos, la operación parece no tener sentido. Ya conocemos su resultado, y siempre es el mismo, porque tres es mayor que dos en cualquier circunstancia. El panorama cambia cuando los valores llegan de fuera. Escribamos un método que recibe la edad de un niño y determina si es un bebé. Se consideran bebés los niños de menos de un año:

```java
public static boolean isInfant(int age) {
    return age < 1;
}
```

Con la única línea del método escribimos "devolver el valor que resulte de la comparación `age < 1`". Según el argumento que llegue, la comparación será verdadera (`true`) o falsa (`false`). El método devolverá ese resultado:

```java
System.out.println(App.isInfant(3)); // => false
System.out.println(App.isInfant(1)); // => false
System.out.println(App.isInfant(0)); // => true
```

## Predicados

Cuando los métodos devuelven el resultado de una comparación, responden a la pregunta "sí" o "no". Esos métodos se llaman **predicados**. Se reconocen porque devuelven un valor lógico `true` o `false`. A menudo en el nombre de un predicado hay una pregunta o una afirmación que se puede comprobar (`is`, `has`, `can`, `was`). Aquí está un método que comprueba si un número es negativo:

```java
public static boolean isNegative(int number) {
    // Comprobamos si el número es menor que cero
    return number < 0;
}

System.out.println(App.isNegative(-5)); // => true
System.out.println(App.isNegative(7));  // => false
```

El método `isNegative` reúne la condición dentro y hacia fuera entrega una respuesta corta. Así el cálculo se esconde detrás de un nombre comprensible.
