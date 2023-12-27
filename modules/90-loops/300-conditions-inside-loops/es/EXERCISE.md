
El método de la teoría tiene en cuenta el caso de las letras. Es decir, `A` y `a` son considerados caracteres diferentes. Implementa una versión de este mismo método en la que el caso de las letras no importe:

```java
App.countChars("HexlEt", 'e'); // 2
App.countChars("HexlEt", 'E'); // 2
```

* `Character.toLowerCase()` - convierte un carácter a minúscula
