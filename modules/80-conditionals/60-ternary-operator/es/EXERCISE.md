
Implementa el método `convertString()`, que recibe una cadena de texto y, si la primera letra no es mayúscula, devuelve la versión invertida de la cadena original. Si la primera letra es mayúscula, la cadena se devuelve sin cambios. Si se pasa una cadena vacía como entrada, el método debe devolver una cadena vacía.

```java
App.convertString("Hello"); // "Hello"
App.convertString("hello"); // "olleh"

// ¡No olvides tener en cuenta la cadena vacía!
App.convertString(""); // ""
```

* `StringUtils.reverse()` – invierte una cadena de texto
* `Character.isUpperCase()` – verifica si un carácter está en mayúscula
