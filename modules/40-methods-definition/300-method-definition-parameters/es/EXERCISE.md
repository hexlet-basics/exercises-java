
Implementa el método estático `App.truncate()`, que recorta la cadena pasada como parámetro hasta el número de caracteres especificado, agrega puntos suspensivos al final y devuelve la cadena resultante. Esta lógica se utiliza a menudo en sitios web para mostrar texto largo de forma abreviada. El método recibe dos parámetros:

1. Una cadena (`String`) que se debe truncar
2. Un número (`int`) de caracteres que se deben conservar

Aquí tienes un ejemplo de cómo debería funcionar el método que escribas:

```java
// Pasando el texto directamente
// Se recorta el texto dejando 2 caracteres
App.truncate("hexlet", 2); // he...

// A través de una variable
var text = "¡funciona!"
// Se recorta el texto dejando 4 caracteres
App.truncate(text, 4); // it w...
```

Puedes implementar este método de diferentes maneras, solo te daremos una pista. Para resolverlo de esta manera, necesitarás tomar una subcadena de la cadena pasada como primer parámetro en el método `truncate()`. Utiliza el método [substring()](https://ru.hexlet.io/qna/java/questions/kak-izvlech-podstroku-iz-stroki-v-java) para esto. Piensa, según la tarea, desde qué índice y hasta qué índice debes extraer la subcadena.

  ```java
  var text = "bienvenido";
  // Puedes pasar parámetros al método a través de variables
  var index = 3;
  text.substring(0, index); // bie
  ```

Desde el punto de vista del sistema de evaluación, no importa qué método uses para implementar `truncate()` internamente, lo importante es que cumpla con la tarea planteada.
