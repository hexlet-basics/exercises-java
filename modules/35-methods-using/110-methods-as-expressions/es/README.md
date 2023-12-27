En programación, una expresión es algo que devuelve un resultado que se puede utilizar.

Ya sabemos bastante sobre las expresiones y los principios de su construcción. La suma, la resta, la concatenación y otras operaciones matemáticas y de cadenas de texto son todas expresiones:

```java
1 + 5 * 3;
"He" + "Let";
// Las variables pueden formar parte de una expresión
rate * 5;
```

La característica de las expresiones es que devuelven un resultado que se puede utilizar, como asignarlo a una variable o mostrarlo en pantalla:

```java
// Aquí la expresión es 1 + 5
var sum = 1 + 5;
System.out.println(1 + 5);
```

Pero no todo en programación es una expresión. La declaración de una variable es una instrucción y no puede formar parte de una expresión. Es decir, este código dará un error:

```java
// Código sin sentido que no funcionará
10 + var sum = 1 + 5;
```

Como verás más adelante, las expresiones se pueden combinar para obtener comportamientos más complejos en lugares inesperados y de formas inesperadas. Entenderás mejor cómo se pueden unir las partes del código para obtener el resultado deseado.

Hablemos de los métodos. ¿Una llamada a un método es una expresión o no? Sabemos que los métodos devuelven un resultado, por lo que sí, son expresiones. De esto se deduce automáticamente muchas cosas interesantes.

Por ejemplo, podemos utilizar una llamada a un método directamente en operaciones matemáticas. Así es como se puede obtener el índice del último carácter de una palabra:

```java
// Los índices comienzan en cero
var name = "Java";
// ¡Llamada al método y resta juntos!
var lastIndex = name.length() - 1;
System.out.println(lastIndex); // => 3
```

En este código no hay una nueva sintaxis. Simplemente hemos combinado partes conocidas basándonos en su naturaleza. Podemos ir aún más lejos:

```java
System.out.println(name.length() - 1); // => 3
```

Todo esto es válido para cualquier método, incluyendo los métodos de cadenas de texto:

```java
var name = "Java";
// toUpperCase() convierte la palabra a mayúsculas
System.out.println("Hola " + name.toUpperCase()); // => Hola JAVA
```
