Cuando escribimos programas, necesitamos conectar unas acciones con otras. La suma de números, la unión de cadenas de texto y el trabajo con variables son ejemplos de cómo pasos simples se combinan en un comportamiento más complejo.

```java
var rate = 10;
var hours = 5;
var salary = rate * hours + 100;
System.out.println(salary); // => 150
```

En programación, para esto se usa el concepto de **expresión**. Así se llama a una construcción que se evalúa y da un resultado. En el ejemplo anterior, `rate * hours + 100` es una expresión. Está compuesta por variables (`rate`, `hours`), un literal numérico (`100`) y operaciones aritméticas. En conjunto, devuelve un resultado que se puede guardar en una variable o usar más adelante.

La particularidad de las expresiones es que su resultado siempre se puede aplicar: asignarlo a una variable, pasarlo a un método o mostrarlo en pantalla:

```java
// Aquí la expresión es 1 + 5
var sum = 1 + 5;
System.out.println(1 + 5);
```

Pero no todo en programación es una expresión. La declaración de una variable es una instrucción, no puede formar parte de una expresión. Por eso el siguiente código dará un error:

```java
// Código sin sentido que no funcionará
10 + var sum = 1 + 5;
```

Las expresiones se pueden combinar infinitamente, complicando poco a poco la lógica. Cada nueva expresión se convierte en parte de una mayor:

```java
var rate = 10;
var hours = 5;
var bonus = 50;
// Una expresión formada por muchas operaciones
var salary = (rate * hours + bonus) * 12 - 500;
System.out.println(salary);
```

Aquí varias expresiones se combinan en una sola, y el resultado se ha vuelto aún más complejo. Así es exactamente como se construyen los programas. Los pequeños pasos se suman en grandes construcciones. Por eso en programación es imposible aprender de antemano todas las combinaciones. Es mucho más importante entender cómo se conectan las expresiones entre sí para dar el resultado deseado.

## La llamada a un método como expresión

Hablemos de los métodos. ¿Una llamada a un método es una expresión o no? Sabemos que los métodos devuelven un resultado, así que sí, una llamada a un método es una expresión. De esto se deduce automáticamente mucho de interés.

Por ejemplo, podemos usar una llamada a un método directamente en operaciones matemáticas. Así se obtiene el índice del último carácter de una palabra:

```java
// Los índices comienzan en cero
var name = "Java";
// Una llamada a un método y una resta juntas
var lastIndex = name.length() - 1;
System.out.println(lastIndex); // => 3
```

En este código no hay una sintaxis nueva. Simplemente hemos unido partes ya conocidas, apoyándonos en su naturaleza. El método `length()` devuelve el número `4`, le restamos uno y obtenemos `3`. Podemos ir aún más lejos e integrar la llamada directamente en la impresión:

```java
System.out.println(name.length() - 1); // => 3
```

## Las expresiones como argumentos de métodos

El argumento de un método siempre es algún valor. Pero un valor no solo se puede escribir directamente, también se puede calcular. Y eso significa que en los argumentos se puede sustituir cualquier expresión.

```java
// Aquí el argumento de println es el número 150
System.out.println(150);

// Y aquí el argumento es una expresión que primero se evalúa
System.out.println(10 * 15); // => 150

// Se puede combinar de forma aún más compleja
var rate = 10;
var hours = 15;
var bonus = 50;
System.out.println(rate * hours + bonus); // => 200
```

El método `println()` recibe un valor ya listo y lo muestra en pantalla. Al método le da igual cómo se obtuvo ese valor. Por eso las llamadas a métodos combinan perfectamente con cualquier expresión.

## La llamada a un método dentro de un método

Dado que una llamada a un método es en sí misma una expresión, su resultado se puede pasar de inmediato a otro método. Esto permite construir construcciones aún más complejas:

```java
var name = "Java";

// La llamada name.length() devuelve 4
// Este resultado se usa de inmediato como argumento de println()
System.out.println(name.length()); // => 4
```

Aquí `name.length()` se evalúa primero y devuelve el número `4`. Luego este valor se sustituye en la llamada `println()`. Para leer correctamente estas construcciones, hay que recordar el orden de evaluación.

1. Primero se ejecuta el método que está "dentro", en nuestro caso `name.length()`.
2. Luego su resultado se sustituye en el lugar de la llamada.
3. Después de esto se ejecuta el método externo, en nuestro caso `println()`.

El código `System.out.println(name.length())` se puede descomponer mentalmente así:

```text
System.out.println("Java".length())

Paso 1:  "Java".length()  →  4
Paso 2:  println(4)       →  imprime 4
```

Este principio funciona siempre. Primero se evalúan las llamadas anidadas, luego la externa.

## Los métodos como parte de expresiones

Los métodos devuelven valores, por eso sus llamadas se pueden usar como parte de cualquier otra expresión. Esto es válido para todos los métodos, incluidos los de cadenas:

```java
var name = "Java";
// toUpperCase() convierte la palabra a mayúsculas
System.out.println("Hola " + name.toUpperCase()); // => Hola JAVA

// Se puede usar el resultado de un método en aritmética
var text = "hexlet";
var doubled = text.length() * 2;
System.out.println(doubled); // => 12
```

Aquí las llamadas `name.toUpperCase()` y `text.length()` son expresiones de pleno derecho. Devuelven valores que se combinan con cadenas, números, variables y otras operaciones.
