En programación, muchos métodos tienen parámetros que cambian muy pocas veces. A menudo a un parámetro así conviene asignarle un único valor y usarlo cuando en la llamada no se pasa nada distinto. Ese valor se llama **valor predeterminado**.

En muchos lenguajes el valor predeterminado se escribe directamente en la definición. Por ejemplo, en Python el método de elevar a una potencia se ve así:

```python
# El exponente es el segundo parámetro con el valor predeterminado 2
def pow(x, base=2):
    return x**base


pow(3)  # 9, por defecto elevamos al cuadrado
pow(3, 3)  # 27, el exponente se pasa de forma explícita
```

En Java los parámetros no tienen valores predeterminados. Sin embargo, el mismo resultado se consigue con la **sobrecarga de métodos**.

¿Qué es eso? Java permite crear varios métodos con el mismo nombre. Esos métodos iguales deben tener:

- Distintos tipos de parámetros de entrada
- Distinta cantidad de parámetros
- O todo eso a la vez

Veámoslo con el ejemplo de un método que suma números. Crearemos dos versiones de `sum()` en una misma clase. La primera recibe dos números; la segunda recibe solo uno y le suma 10:

```java
class App {
    public static int sum(int x, int y) {
        return x + y;
    }

    public static int sum(int x) {
        return x + 10;
    }
}

App.sum(2, 3); // 5, funcionó la versión con dos parámetros
App.sum(2);    // 12, funcionó la versión con un parámetro
```

El compilador creará sin problemas dos métodos con un mismo nombre. ¿Cómo sabe Java a cuál de ellos llamar?

Durante la compilación se elige la versión del método que coincide en el tipo y la cantidad de parámetros. Cuando no hay un método adecuado, el compilador informa de un error.

Con al menos un método sobrecargado ya nos hemos encontrado: es el método `substring()`. Por defecto extrae la subcadena hasta el final, pero se le puede pasar un segundo parámetro que limite la longitud:

```java
// Se llaman dos métodos distintos con un mismo nombre
"hexlet".substring(3); // "let"
"hexlet".substring(3, 5); // "le"
```

La sobrecarga de métodos puede llevar a la duplicación de código, sobre todo cuando se trata de valores predeterminados. En esas situaciones la lógica es la misma, y la diferencia está solo en la inicialización inicial.

Para reducir la duplicación basta con dar dos pasos:

- Primero, definir un método común que reciba la mayor cantidad de parámetros
- Después, llamarlo desde aquellos métodos que tienen valores predeterminados

En el código se ve así:

```java
class App {
    public static int sum(int x, int y) {
        return x + y;
    }

    public static int sum(int x) {
        // Llamamos al método de suma que ya está listo
        return App.sum(x, 10);
    }
}
```

En este ejemplo no hemos acortado el código, pero muestra con claridad el principio descrito arriba.
