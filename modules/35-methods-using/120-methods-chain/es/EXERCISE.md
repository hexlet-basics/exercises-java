
Escriba un código que tome los datos de la variable `name` y los capitalice. En programación, esto se llama capitalización, que convierte la primera letra de una palabra en mayúscula y el resto en minúsculas. Por ejemplo: *heXlet => Hexlet*. El programa debe imprimir el resultado en la pantalla.

Para extraer partes de una palabra, use el método [substring()](https://ru.hexlet.io/qna/java/questions/kak-izvlech-podstroku-iz-stroki-v-java):

```java
// El primer parámetro es el índice inicial, el segundo es el índice final (no incluido)
"hexlet".substring(0, 1); // "h"
// Por defecto, hasta el final de la cadena
"hexlet".substring(1); // "exlet"
```
