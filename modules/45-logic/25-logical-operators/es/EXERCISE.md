
Implementa el método `isLeapYear()`, que determina si un año es bisiesto o no. Un año es bisiesto si es divisible (es decir, no tiene residuo) por 400 o si es divisible por 4 y no es divisible por 100. Como puedes ver, la lógica necesaria ya está definida en la descripción, solo falta convertirla en código:

```java
App.isLeapYear(2018); // false
App.isLeapYear(2017); // false
App.isLeapYear(2016); // true
```

Puedes verificar la divisibilidad de la siguiente manera:

```javascript
// % - devuelve el residuo de la división del operando izquierdo por el operando derecho
// Verificar si number es divisible por 10
number % 10 == 0

// Verificar si number no es divisible por 10
number % 10 != 0
```
