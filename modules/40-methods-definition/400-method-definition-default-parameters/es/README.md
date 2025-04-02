<!-- Tal vez sea conveniente agregar una lección sobre la sobrecarga de métodos antes de esta -->

En programación, muchas funciones y métodos tienen parámetros que rara vez cambian.

En estos casos, se les asignan **valores predeterminados** a estos parámetros, que se pueden cambiar según sea necesario. Esto reduce un poco la cantidad de código repetitivo.

Esto se puede ver claramente en el siguiente ejemplo:

```java
class App {
    // Función de potenciación
    // El exponente es el segundo parámetro con un valor predeterminado de 2
    function pow(x, base = 2) {
      return x ** base;
    }
}

App.pow(3); // Resultado: 9, ya que se eleva al cuadrado de forma predeterminada
// Elevar al cubo
App.pow(3, 3); // 27
```

A diferencia de otros lenguajes, en Java no es posible asignar un valor predeterminado, pero se puede simular utilizando la **sobrecarga de métodos**.

¿Qué es la sobrecarga de métodos? Java permite crear varios métodos con el mismo nombre. Estos métodos deben tener:

* Diferentes tipos de parámetros de entrada
* Diferente cantidad de parámetros
* O ambas cosas a la vez

Veamos un ejemplo de un método que suma dos números:

```java
class App {
    public static int sum(int x, int y) {
        return x + y;
    }
}

App.sum(2, 3); // 5
```

Ahora escribamos otro método `sum()` que solo recibe un parámetro y lo suma con el número 10:

```java
class App {
    public static int sum(int x) {
        return x + 10;
    }
}

App.sum(2); // 12
App.sum(2, 1); // 3
```

El compilador ejecutará este código sin problemas y creará dos métodos con el mismo nombre. ¿Cómo sabe Java qué método utilizar?

Es muy simple: durante la compilación, se elige la versión del método que coincide en tipo y cantidad de parámetros. Si no se encuentra dicho método, se producirá un error.

Ya hemos visto al menos un método sobrecargado: `substring()`. Por defecto, extrae una subcadena hasta el final, pero se le puede pasar un segundo parámetro que limite la longitud:

```java
// Se llaman a dos métodos diferentes con el mismo nombre
"hexlet".substring(3); // "let"
"hexlet".substring(3, 5); // "le"
```

La sobrecarga de métodos puede llevar a la duplicación de código, especialmente cuando se trata de valores predeterminados. En tales situaciones, la lógica es la misma, solo difiere en la inicialización inicial.

Para reducir la duplicación, basta con seguir estos dos pasos:

* Primero, definir un método común que acepte la mayor cantidad de parámetros
* Luego, llamar a ese método desde los métodos que tienen valores predeterminados

En el código, se vería así:

```java
class App {
    public static int sum(int x, int y) {
        return x + y;
    }

    public static int sum(int x) {
        // Llamamos al método de suma ya existente
        return App.sum(x, 10);
    }
}
```

En este ejemplo, no hemos reducido el código, pero muestra claramente el principio descrito anteriormente.
