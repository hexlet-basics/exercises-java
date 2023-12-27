
Ya sabemos cómo escribir métodos que verifican condiciones individuales. En esta lección continuaremos trabajando con métodos y aprenderemos a construir condiciones compuestas.

Estas habilidades son útiles en tareas bastante comunes, como verificar contraseñas. Como sabes, algunos sitios web solicitan contraseñas de 8 a 20 caracteres de longitud durante el registro.

En matemáticas, escribiríamos `8 <= x <= 20`, pero en Java esto no funciona. Tendremos que hacer dos expresiones lógicas separadas y combinarlas con el operador especial "Y".

Escribamos un método que tome una contraseña y determine si cumple con las condiciones:

```java
// La contraseña tiene más de 8 caracteres **Y** menos de 20 caracteres
public static boolean esContraseñaCorrecta(String contraseña) {
    var longitud = contraseña.length();
    return longitud > 8 && longitud < 20;
}

esContraseñaCorrecta("qwerty"); // false
esContraseñaCorrecta("qwerty1234"); // true
```

El operador `&&` significa "Y". En este caso, la expresión se considera verdadera solo si cada *operando* es verdadero, es decir, cada una de las expresiones compuestas. En otras palabras, `&&` significa "y esto, y aquello".

La prioridad de este operador es menor que la de los operadores de comparación, por lo que la expresión funciona correctamente sin paréntesis.

Además de `&&`, se utiliza con frecuencia el operador `||`, que significa "O". Significa "o esto, o aquello, o ambos". Los operadores se pueden combinar en cualquier cantidad y en cualquier secuencia. La única excepción es cuando se encuentran `&&` y `||` al mismo tiempo, en ese caso es mejor establecer la prioridad con paréntesis:

```java
a && b || c; // Sin paréntesis es difícil entender la prioridad
a && (b || c) // La prioridad es obvia
```

Veamos otro ejemplo. Supongamos que queremos comprar un apartamento que cumpla con las siguientes condiciones:

> Más de 100 m^2 en cualquier calle **O** más de 80 m^2 en la calle central *Main Street*

Escribamos un método que verifique el apartamento. Toma dos parámetros: el área y el nombre de la calle:

```java
esBuenApartamento(91, "Queens Street"); // false
esBuenApartamento(78, "Queens Street"); // false
esBuenApartamento(70, "Main Street"); // false

esBuenApartamento(120, "Queens Street"); // true
esBuenApartamento(120, "Main Street"); // true
esBuenApartamento(80, "Main Street"); // true

public static boolean esBuenApartamento(int area, String calle) {
  return area >= 100 || (area >= 80 && "Main Street".equals(calle));
}
```

https://replit.com/@hexlet/java-basics-logical-operators

El área de las matemáticas que estudia los operadores lógicos se llama **álgebra booleana**. A continuación se muestran las "tablas de verdad" que nos permiten determinar el resultado de la aplicación de un operador:

### Operador Y `&&`

| A     | B     | A && B   |
| ----- | ----- | -------  |
| TRUE  | TRUE  | **TRUE** |
| TRUE  | FALSE | FALSE    |
| FALSE | TRUE  | FALSE    |
| FALSE | FALSE | FALSE    |

### Operador O `||`

| A     | B     | A &VerticalSeparator;&VerticalSeparator; B |
| ----- | ----- | -------- |
| TRUE  | TRUE  | **TRUE** |
| TRUE  | FALSE | **TRUE** |
| FALSE | TRUE  | **TRUE** |
| FALSE | FALSE | FALSE    |
