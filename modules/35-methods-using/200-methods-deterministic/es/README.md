Independientemente del lenguaje de programación utilizado, los métodos tienen algunas propiedades fundamentales. Conocer estas propiedades facilita predecir el comportamiento de los métodos, las formas de probarlos y dónde utilizarlos. Una de estas propiedades es el determinismo. Un método se considera determinista cuando, para los mismos parámetros de entrada, devuelve siempre el mismo resultado. Por ejemplo, un método que extrae un carácter de una cadena es determinista.

```java
"wow".charAt(1); // 'o'
"wow".charAt(1); // 'o'
```

No importa cuántas veces llamemos a este método pasándole el valor `1`, siempre devolverá `'o'`. Por otro lado, un método que devuelve un número aleatorio no es determinista, ya que para una misma entrada (incluso si está vacía, es decir, no se aceptan parámetros) siempre obtendremos un resultado diferente. No importa cuán diferente sea, incluso si una de cada millón de llamadas devuelve algo diferente, automáticamente se considera un método no determinista.

```java
// Método que devuelve un número aleatorio
Math.random(); // 0.09856613113197676
Math.random(); // 0.8839904367241888
```

https://replit.com/@hexlet/java-basics-pure-functions

¿Por qué es importante saber esto? El determinismo afecta seriamente muchos aspectos. Las funciones deterministas son convenientes para trabajar, son fáciles de optimizar y de probar. Si es posible hacer que una función sea determinista, es mejor hacerlo así.
