La palabra "variable" en sí misma indica que se puede cambiar. Y de hecho, con el tiempo, los valores de las variables pueden cambiar dentro de un programa:

```java
var saludo = "¡Padre!";
System.out.println(saludo);
System.out.println(saludo);
// Ya no se utiliza "var" porque la variable fue definida anteriormente
saludo = "¡Madre!";
System.out.println(saludo);
System.out.println(saludo);
```

https://replit.com/@hexlet/java-basics-variables-2

Java es un lenguaje de programación de tipado estático. Esto significa que el tipo de una variable se establece al definirla y no cambia después.

En el ejemplo anterior, asignamos una cadena de texto al crear la variable. El compilador recuerda el tipo y verifica todos los cambios posteriores en la variable. Si intentamos asignar un número a esta misma variable, obtendremos el siguiente error:

```java
saludo = 5;
# Error:
# tipos incompatibles: no se puede convertir un entero en java.lang.String
```

El compilador realiza esta verificación sin ejecutar el código, por eso se llama **tipado estático**. En JavaScript, Ruby, PHP, Python y otros lenguajes dinámicos, este comportamiento no es un error, ya que una variable puede cambiar fácilmente su tipo durante la ejecución.
