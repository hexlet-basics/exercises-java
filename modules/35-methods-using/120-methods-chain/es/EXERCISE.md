
Escribe un código que tome los datos de la variable `name` y realice la capitalización. En programación, así se llama la operación que pone en mayúscula la primera letra de una palabra y convierte todas las demás a minúsculas. Por ejemplo: _heXlet => Hexlet_. El programa debe mostrar el resultado en pantalla.

Para extraer partes de una palabra, usa el método [substring()](https://ru.hexlet.io/qna/java/questions/kak-izvlech-podstroku-iz-stroki-v-java?utm_source=code-basics&utm_medium=referral&utm_campaign=qna&utm_content=lesson):

```java
// parámetro 1 – el índice inicial, parámetro 2 – el índice final (no incluido)
"hexlet".substring(0, 1); // "h"
// Por defecto, hasta el final de la cadena
"hexlet".substring(1); // "exlet"
```
