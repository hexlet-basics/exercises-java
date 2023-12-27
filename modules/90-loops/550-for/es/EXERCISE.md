
Samwell descubrió que sus mensajes estaban siendo interceptados en la fortaleza "Gemelos" y leídos allí. Como resultado, sus ataques dejaron de ser sorpresivos. Después de pensar un poco, desarrolló un programa que cifraba los mensajes utilizando el siguiente algoritmo. Tomaba el texto y reorganizaba cada dos caracteres consecutivos.

```java
App.encrypt("move"); // "omev"
App.encrypt("attack"); // "taatkc"
// Si el número de caracteres es impar,
// el último carácter permanece en su lugar.
App.encrypt("go!"); // "og!"
```

Implementa el método estático `App.encrypt()`, que recibe el mensaje original y devuelve el mensaje cifrado.
