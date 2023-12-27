
Implementa el método `getHiddenCard()`, que recibe como entrada el número de una tarjeta de crédito (compuesto por 16 dígitos) como una cadena y devuelve su versión oculta, que se puede utilizar en el sitio web para su visualización. Si la tarjeta original tenía el número *2034399002125581*, entonces la versión oculta se vería así: *\*\*\*\*5581*. En otras palabras, la función reemplaza los primeros 12 caracteres por asteriscos. La cantidad de asteriscos se controla mediante un segundo parámetro opcional. El valor predeterminado es 4.

```java
// La tarjeta de crédito se pasa como una cadena
App.getHiddenCard("1234567812345678", 2); // "**5678"
App.getHiddenCard("1234567812345678", 3); // "***5678"
App.getHiddenCard("1234567812345678"); // "****5678"
App.getHiddenCard("2034399002121100", 1); // "*1100"
```

Para completar esta tarea, necesitarás el método `repeat` de la cadena, que repite la cadena un número determinado de veces.

```java
"+".repeat(5); // "+++++"
"o".repeat(5); // "ooooo"
```
