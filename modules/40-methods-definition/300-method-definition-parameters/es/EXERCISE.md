
Implementa el método estático `App.truncate()`, que recorta la cadena pasada hasta la cantidad de caracteres indicada, añade puntos suspensivos al final y devuelve la cadena resultante. Una lógica parecida se usa a menudo en los sitios web para mostrar un texto largo de forma abreviada. El método recibe dos parámetros:

1. La cadena (`String`) que hay que recortar
2. El número (`int`) de caracteres que hay que dejar

Un ejemplo de cómo debe funcionar el método que escribas:

```java
// Pasamos el texto directamente
// Recortamos el texto dejando 2 caracteres
App.truncate("hexlet", 2); // he...

// A través de una variable
var text = "it works!"
// Recortamos el texto dejando 4 caracteres
App.truncate(text, 4); // it w...
```

Este método se puede implementar de distintas maneras; te sugerimos solo una de ellas. Para resolverlo así necesitarás tomar una subcadena de la cadena que se pasa como primer parámetro al método `truncate()`. Usa para eso el método [substring()](https://ru.hexlet.io/qna/java/questions/kak-izvlech-podstroku-iz-stroki-v-java?utm_source=code-basics&utm_medium=referral&utm_campaign=qna&utm_content=lesson). Piensa, a partir del enunciado, desde qué índice y hasta cuál tienes que extraer la subcadena.

  ```java
  var text = "welcome";
  // Los parámetros se pueden pasar al método a través de variables
  var index = 3;
  text.substring(0, index); // wel
  ```

Desde el punto de vista del sistema de comprobación, no importa de qué manera se implemente por dentro el método `truncate()`; lo importante es que cumpla la tarea planteada
