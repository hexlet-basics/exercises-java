En los programas reales, a menudo surge una situación en la que hay que convertir datos de un tipo en otro. Un ejemplo es el trabajo con formularios en los sitios web. Los datos del formulario llegan en formato de texto, incluso si por su significado allí hay un número. Para operar con ese valor, se convierte al tipo necesario.

## Conversión de una cadena en número

Imaginemos que del formulario llegó la cadena `"345"`, y necesitamos sumar a este número otro. Primero se convierte la cadena en un número entero:

```java
var number = Integer.parseInt("345");
System.out.println(number + 5); // => 350
```

El método `Integer.parseInt` recibe una cadena y devuelve un número entero de tipo _int_. De forma parecida se convierte una cadena en un número racional con `Double.parseDouble`.

## Conversión entre tipos primitivos

Si hay que convertir de un tipo primitivo a otro, basta con indicar el tipo entre paréntesis antes del valor. El valor se convierte al tipo escrito entre paréntesis:

```java
var result = (int) 5.1;
System.out.println(result); // => 5
```

Al convertir un número racional en entero, la parte decimal se descarta sin redondear. Por eso `(int) 5.9` da `5`. En sentido inverso, `(double) 7` da `7.0`.

La conversión también ayuda en la división. Dividir un entero entre un entero en Java da un número entero, y la parte decimal se pierde:

```java
System.out.println(7 / 2);          // => 3
System.out.println((double) 7 / 2); // => 3.5
```

En el primer caso ambos valores son enteros, por eso el resultado es entero. En el segundo caso el dividendo está convertido al tipo _double_, y la división pasó a ser racional.

## Conversión dentro de expresiones compuestas

La conversión de tipos también funciona dentro de expresiones grandes. Los paréntesis adicionales ayudan a separar visualmente unas partes de la expresión de otras:

```java
var result = 10 + ((int) 5.1);
System.out.println(result); // => 15
```

Aquí `5.1` se convierte en `5`, y luego se suma con `10`.
