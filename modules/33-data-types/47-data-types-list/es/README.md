En esta lección, vamos a examinar el sistema de tipos en Java desde una perspectiva general, sin entrar en detalles. Pero primero, respondamos a la pregunta de por qué es importante conocerlos.

En el código, siempre estamos trabajando con datos. Estos datos tienen diferentes naturalezas y pueden estar organizados de diferentes maneras, lo que afecta la facilidad de trabajar con ellos. Los tipos nos persiguen en cada paso, por lo que sin ellos, la programación en Java solo es posible a un nivel muy básico.

Por otro lado, no intentes memorizar toda esta información sobre los tipos de memoria: se proporciona solo para tener una idea general. Todo lo importante sobre los tipos lo aprenderás durante el proceso de programación. En Java, los tipos de datos se dividen en dos grandes grupos:

- **Primitivos** - predefinidos en Java
- **Referenciales** o **no primitivos** - creados por el programador, excepto _String_ y _Array_

Estos grupos tienen diferencias que discutiremos más adelante, cuando nos familiaricemos con `null` y la programación orientada a objetos. Por ahora, es suficiente saber que los nombres de los tipos primitivos comienzan con minúscula (`int`), mientras que los nombres de los tipos referenciales comienzan con mayúscula (`String`).

En total, Java tiene ocho tipos primitivos de datos:

- _byte_
- _short_
- _int_
- _long_
- _float_
- _double_
- _boolean_
- _char_

Veamos los primeros cuatro tipos. Estos son números enteros de diferentes tamaños:

- _byte_ - ocupa 1 byte en memoria, por lo que puede almacenar números del -128 al 127
- _short_ - ocupa 2 bytes en memoria
- _int_ - ocupa 4 bytes en memoria
- _long_ - ocupa 8 bytes en memoria

Veamos un ejemplo de código:

```java
byte x = 3; // Funcionará sin problemas

// Error: tipos incompatibles: posible conversión de int a byte con pérdida de información
byte y = 270;
```

La declaración de la variable `y` termina con un error porque hemos especificado el tipo _byte_, pero le hemos asignado el valor _270_, que está fuera del rango de valores permitidos.

Surge una pregunta lógica. ¿Por qué necesitamos cuatro tipos para almacenar números? ¿Por qué no tener uno que pueda contener casi cualquier número grande?

Técnicamente, esto es posible, pero estamos en el mundo de las soluciones de ingeniería. Cualquier solución siempre tiene un lado negativo, por lo que no se puede hacer perfectamente: tendrás que sacrificar algo. En este caso, el tamaño de la memoria ocupada. Si solo dejamos _long_, un programa que opera activamente con números comenzará a ocupar demasiado espacio en la memoria RAM, lo cual puede ser crítico.

La misma lógica se aplica a los tipos _float_ y _double_. Ambos representan números racionales. La diferencia es que _double_ es el doble de _float_, es decir, ocupa el doble de espacio en memoria.

Los creadores de Java confían en la sensatez de los programadores, en su capacidad para elegir los tipos adecuados según la tarea. Para algunas aplicaciones extremas, esto es cierto, pero en el desarrollo típico, es simple. Los programadores eligen _int_ para números enteros y _double_ para números racionales.

Veamos los tipos de datos restantes.

El tipo _boolean_ representa los valores lógicos `true` y `false`. Le dedicaremos una sección completa más adelante, donde hablaremos de él.

El tipo _char_ es especial: representa un carácter. No es una cadena, se define de manera diferente, con comillas simples:

```java
char ch = 'a';

// Error: tipos incompatibles: no se puede convertir java.lang.String a char
char ch2 = "b";
```

Una cadena que consta de un solo carácter no es un carácter. Parece ilógico, pero desde el punto de vista de los tipos, debe ser así, y con el tiempo lo entenderás.

Extraer un carácter de una cadena extrae un carácter, no una cadena que consta de un solo carácter:

```java
"hexlet".charAt(1); // 'e'
```

Bien, ¿y dónde está el tipo de datos _String_ - cadena? El caso es que no es un tipo primitivo. Internamente, es un conjunto de caracteres. A pesar de esta diferencia técnica, las cadenas se utilizan junto con los tipos primitivos sin ninguna diferencia especial.
