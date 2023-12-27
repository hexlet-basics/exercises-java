Observa la definición de un método que devuelve el módulo de un número:

```java
// Si es mayor o igual a cero, devuelve el número. Si es menor, quita el signo
public static int abs(int number) {
  if (number >= 0) {
    return number;
  }

  return -number;
}

App.abs(10);  // 10
App.abs(-10); // 10
```

En Java existe una construcción que es similar a la estructura *if-else*, pero es una expresión. Se llama **operador ternario**.

El operador ternario es único en su tipo, ya que requiere tres operandos. Ayuda a escribir menos código para expresiones condicionales simples. Nuestro ejemplo anterior con el operador ternario se reduce a tres líneas de código:

```java
public static int abs(int number) {
  return number >= 0 ? number : -number;
}
```

El patrón general se ve así:

```java
<predicado> ? <expresión si verdadero> : <expresión si falso>
```

Es decir, primero escribimos la expresión lógica y luego dos variantes de comportamiento:

1. Si la condición es verdadera, se ejecuta la variante antes de los dos puntos
2. Si la condición es falsa, se ejecuta la variante después de los dos puntos
