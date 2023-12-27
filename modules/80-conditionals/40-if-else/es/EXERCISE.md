
Implementa el método `normalizeUrl()`, que realiza lo que se conoce como normalización de datos. Recibe una dirección de un sitio web y devuelve la dirección con *https://* al principio.

El método recibe direcciones en forma de *DIRECCIÓN* o *https://DIRECCIÓN*, pero siempre devuelve la dirección en forma de *https://DIRECCIÓN*.

Puedes usar el método `startsWith()` para verificar si una cadena comienza con el prefijo *https://*. Luego, en base a esto, agregar o no agregar *https://*.

```java
App.normalizeUrl("google.com"); // "https://google.com"
App.normalizeUrl("https://ai.fi"); // "https://ai.fi"
```
