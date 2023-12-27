
Implementa el método `isPalindrome()`, que determina si una palabra es un palíndromo o no. Un palíndromo es una palabra que se lee igual en ambos sentidos.

```java
App.isPalindrome("шалаш"); // true
App.isPalindrome("ага"); // true
App.isPalindrome("хекслет"); // false

// Las palabras pueden estar en cualquier caso
App.isPalindrome("Ага"); // true
```

Para determinar si una palabra es un palíndromo, debes invertir la cadena y compararla con la original. Para esto, utiliza el método `StringUtils.reverse()`

```java
StringUtils.reverse("мама"); // "амам"
```
