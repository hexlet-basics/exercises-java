Las variables y la concatenación se pueden combinar. Sintácticamente nada cambia, porque sabemos cómo concatenar, es decir, unir dos cadenas:

```java
var que = "Camino" + "de Reyes";
System.out.println(que); // => CaminodeReyes
```

Esto significa que podemos concatenar una cadena y una variable que contiene una cadena:

```java
var primero = "Caminos";
var que = primero + "de Reyes";
System.out.println(que); // => CaminodeReyes
```

Incluso podemos concatenar dos variables que contienen cadenas:

```java
var primero = "Caminos";
var ultimo = "de Reyes";
var que = primero + ultimo;
System.out.println(que); // => CaminodeReyes
```
