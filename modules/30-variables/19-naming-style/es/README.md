
`greeting` - es un ejemplo de un nombre simple, pero no todos los nombres son tan simples. Con frecuencia, los nombres de las variables son compuestos, es decir, incluyen varias palabras. Por ejemplo, "nombre de usuario". En diferentes lenguajes de programación se utilizan diferentes convenciones de codificación, por lo que el nombre de la variable puede variar.

En la nomenclatura de variables se pueden identificar cuatro enfoques principales, que a veces se combinan entre sí. Todos estos enfoques se aplican cuando el nombre de la variable consta de varias palabras:

* kebab-case - las partes compuestas de la variable se separan con guiones (`mi-super-var`)
* snake_case - se utiliza un guion bajo para separar las palabras (`mi_super_var`)
* CamelCase - cada palabra en la variable se escribe con mayúscula inicial (`MiSuperVar`)
* lowerCamelCase - cada palabra en la variable se escribe con mayúscula inicial, excepto la primera (`miSuperVar`)

En Java se utiliza CamelCase y su variante lowerCamelCase, donde la primera letra de la primera palabra es minúscula.

Es precisamente lowerCamelCase el que se utiliza para las variables. Esto significa que los nombres se unen entre sí, y todas las palabras, excepto la primera, se escriben con mayúscula inicial: `nombreDeUsuario`. Con tres palabras, se vería así: `miSuperVariable`.

Veamos cómo se ve esto en el código:

```java
var primerNombre = "John";
System.out.println(primerNombre); // => John

var numeroJugador = 24;
System.out.println(numeroJugador); // => 24
```
