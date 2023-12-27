
En el mapa electrónico de Westeros que Sam implementó, los aliados de los Stark se representan con un círculo verde, los enemigos con un círculo rojo y las familias neutrales con un círculo gris.

Escriba un método `whoIsThisHouseToStarks()` para Sam, que reciba el apellido de una familia y devuelva uno de los tres valores: `"friend"`, `"enemy"`, `"neutral"`.

Reglas de determinación:

  * Amigos (`"friend"`): "Karstark", "Tally"
  * Enemigos (`"enemy"`): "Lannister", "Frey"
  * Todas las demás familias se consideran neutrales

Ejemplos de llamadas:

```java
App.whoIsThisHouseToStarks("Karstark"); // "friend"
App.whoIsThisHouseToStarks("Frey");     // "enemy"
App.whoIsThisHouseToStarks("Joar");     // "neutral"
App.whoIsThisHouseToStarks("Ivanov");   // "neutral"
```
