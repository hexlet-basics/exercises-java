Implementa el método `compress()`, que comprime una cadena con el método RLE (Run-Length Encoding).

El algoritmo es el siguiente: si un carácter se repite varias veces seguidas, se sustituye por el propio carácter y la cantidad de repeticiones. Los caracteres sueltos se escriben sin número.

```java
App.compress("aaabcccc"); // => "a3bc4"
App.compress("abcd");      // => "abcd"
App.compress("aabbaa");    // => "a2b2a2"
App.compress("");          // => ""
```

Pistas:

- recorre la cadena y cuenta cuántos caracteres iguales van seguidos;
- en cuanto el carácter cambie, añade el carácter anterior y su contador (si es mayor que uno) y reinicia el contador;
- no te olvides de procesar el último grupo de caracteres después de terminar el ciclo;
- si algo no sale bien, añade impresión de depuración de los valores de `i`, del carácter actual y del contador: eso ayudará a ver dónde se rompe la lógica.
