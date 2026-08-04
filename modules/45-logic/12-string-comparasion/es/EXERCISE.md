
Implementa el método `isPalindrome()`, que determina si una palabra es un palíndromo o no. Un palíndromo es una palabra que se lee igual en los dos sentidos.

```java
App.isPalindrome("reconocer"); // true
App.isPalindrome("ana"); // true
App.isPalindrome("hexlet"); // false

// Las palabras se pueden pasar al método en cualquier combinación de mayúsculas y minúsculas
App.isPalindrome("Ana"); // true
```

Para determinar si una palabra es un palíndromo, hay que invertir la cadena y compararla con la original. Usa para eso el método `StringUtils.reverse()`

```java
StringUtils.reverse("mama"); // "amam"
```
