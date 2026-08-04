Ya sabemos escribir métodos que comprueban condiciones sueltas. En esta lección seguiremos trabajando con métodos y aprenderemos a construir condiciones compuestas.

Estas habilidades sirven en tareas muy extendidas, por ejemplo al comprobar una contraseña. Algunos sitios, durante el registro, piden pensar una contraseña de entre 8 y 20 caracteres de longitud.

En matemáticas lo escribiríamos como `8 <= x <= 20`, pero en Java ese truco no funciona. Tendremos que hacer dos expresiones lógicas separadas y unirlas con el operador especial "Y".

Escribamos un método que recibe una contraseña y dice si cumple las condiciones. El resultado lo mostramos en la pantalla:

```java
// La contraseña tiene más de 8 caracteres Y la contraseña tiene menos de 20 caracteres
public static boolean isCorrectPassword(String password) {
    var length = password.length();
    return length > 8 && length < 20;
}

System.out.println(App.isCorrectPassword("qwerty"));     // => false
System.out.println(App.isCorrectPassword("qwerty1234")); // => true
```

El operador `&&` significa "Y". En lógica matemática esto se llama conjunción. Toda la expresión se considera verdadera solo cuando es verdadero cada **operando**, es decir, cada una de las expresiones que la componen. En otras palabras, `&&` significa "tanto lo uno como lo otro". La prioridad de este operador es menor que la de los operadores de comparación, por eso la expresión `length > 8 && length < 20` funciona correctamente sin paréntesis.

Además de `&&` se usa a menudo el operador `||`, que significa "O" (disyunción). Se lee como "o lo uno, o lo otro, o ambos". La expresión `a || b` se considera verdadera cuando es verdadero al menos uno de los operandos o cuando son verdaderos los dos. En los demás casos la expresión es falsa.

Veamos un método que determina si a una persona le corresponde un descuento. El descuento se da a quienes tienen menos de 18 años o son estudiantes:

```java
public static boolean hasDiscount(int age, boolean isStudent) {
    return age < 18 || isStudent;
}

System.out.println(App.hasDiscount(15, false)); // => true  (menor de 18)
System.out.println(App.hasDiscount(25, true));  // => true  (estudiante)
System.out.println(App.hasDiscount(15, true));  // => true  (las dos condiciones)
System.out.println(App.hasDiscount(25, false)); // => false
```

Los operadores se pueden combinar en cualquier cantidad y en cualquier orden. Cuando en el código coinciden a la vez `&&` y `||`, es mejor indicar la prioridad con paréntesis:

```java
a && b || c;   // Sin paréntesis es difícil entender la prioridad
a && (b || c); // Con paréntesis queda claro qué se refiere a qué
```

Veamos otro ejemplo. Imaginemos que queremos comprar un apartamento que cumpla estas condiciones:

> Más de 100 m² en cualquier calle **O** más de 80 m² en la calle central *Main Street*

Escribamos un método que comprueba el apartamento. Recibe dos parámetros, el área y el nombre de la calle. Las cadenas las comparamos con `.equals(...)`, porque para las cadenas esa es la forma correcta de comprobar la igualdad:

```java
public static boolean isGoodApartment(int area, String street) {
    return area >= 100 || (area >= 80 && "Main Street".equals(street));
}

System.out.println(App.isGoodApartment(91, "Queens Street")); // => false
System.out.println(App.isGoodApartment(78, "Queens Street")); // => false
System.out.println(App.isGoodApartment(70, "Main Street"));   // => false

System.out.println(App.isGoodApartment(120, "Queens Street")); // => true
System.out.println(App.isGoodApartment(120, "Main Street"));   // => true
System.out.println(App.isGoodApartment(80, "Main Street"));    // => true
```

Los paréntesis alrededor de `area >= 80 && "Main Street".equals(street)` marcan la prioridad. Sin ellos la regla se leería de otra manera, y así se ve enseguida qué parte pertenece a qué operador.

## Tablas de verdad

El área de las matemáticas en la que se estudian los operadores lógicos se llama álgebra booleana. Las **tablas de verdad** muestran cuál será el resultado al aplicar cada operador.

### El operador Y `&&`

| A     | B     | A && B   |
| ----- | ----- | -------  |
| true  | true  | **true** |
| true  | false | false    |
| false | true  | false    |
| false | false | false    |

### El operador O `||`

| A     | B     | A &VerticalSeparator;&VerticalSeparator; B |
| ----- | ----- | -------- |
| true  | true  | **true** |
| true  | false | **true** |
| false | true  | **true** |
| false | false | false    |
