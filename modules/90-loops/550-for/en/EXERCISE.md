
Samwell discovered that his messages are being intercepted in the castle "The Twins" and read there. Because of this their attacks stopped being sudden. After thinking a little, he developed a program that would encrypt the messages by the following algorithm. It would take the text and swap every two consecutive characters in it.

```java
App.encrypt("move"); // "omev"
App.encrypt("attack"); // "taatkc"
// If the number of characters is odd
// then the last character stays in its place
App.encrypt("go!"); // "og!"
```

Implement the static method `App.encrypt()`, which accepts the original message and returns the encrypted one.
