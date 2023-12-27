Algunos datos nunca cambian, como las constantes matemáticas. Tomemos el número *π*. Aproximadamente siempre es igual a *3.14* y no puede cambiar.

En Java, se acostumbra utilizar constantes para acceder a este tipo de datos:

```java
final var pi = 3.14;
System.out.println(pi); // 3.14
```

https://replit.com/@hexlet/java-basics-variables-5

A diferencia de las variables, al definir una constante se utiliza la palabra clave `final`. Esto le indica al compilador que no se puede modificar. Cualquier intento de cambiar una constante resultará en un error.

Una constante, al igual que una variable, puede ser utilizada en cualquier expresión. La única restricción es que no se puede modificar una constante, lo cual tiene bastante sentido.
