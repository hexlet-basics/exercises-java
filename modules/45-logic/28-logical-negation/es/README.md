Junto con la conjunción (**Y**) y la disyunción (**O**), a menudo se utiliza la operación de "**negación**".

La negación cambia el valor lógico a su opuesto. En programación, se corresponde con el operador `!`. Si hay un método que verifica si un número es par, se puede realizar una verificación de impar utilizando la negación:

```java
public static boolean esPar(int numero) {
    return numero % 2 == 0;
}

esPar(10);  // true
!esPar(10); // false
```

Es decir, simplemente agregamos `!` antes de llamar al método y obtenemos la acción opuesta. La negación se puede aplicar no solo a la llamada de un método, sino también a una expresión completa:

```java
!(x == 5 || x == 3)

// Esta misma expresión se puede escribir de otra manera:
// x no es igual a 5 y no es igual a 3
x != 5 && x != 3
```

La negación es una herramienta poderosa que permite expresar reglas de manera concisa en el código sin necesidad de escribir nuevos métodos.
