Hasta ahora, al definir variables, hemos usado la palabra clave `var`. Esto puede sorprender a quienes ya tienen experiencia con Java. Normalmente, la definición de variables se muestra así:

```java
int x = 3;
String greeting = "Hello Hexlet!";
```

Ha llegado el momento de descubrir las cartas. Java es un lenguaje de tipado estático. En estos lenguajes, el tipo de una variable se fija en su declaración y no cambia hasta el final del programa. El tipo se indica antes del nombre de la variable. En el ejemplo anterior, se trata de un número entero (_int_) y una cadena (_String_).

## El tipo se indica explícitamente y no cambia

En un lenguaje de tipado estático, cada variable tiene un tipo, y este está fijado. Si una variable se declara como _int_, entonces solo se puede poner en ella un número entero:

```java
int n = 5;
double x = 1.5;
boolean flag = true;
char c = 'A';
String s = "hi";
```

Un intento de poner en una variable un valor de otro tipo provoca un error. Una cadena no se puede asignar a una variable de tipo _int_:

```java
// Error: incompatible types: java.lang.String cannot be converted to int
int ops = "test";
```

## Cuándo se comprueban los tipos

Java comprueba los tipos de antemano, aún antes de ejecutar el programa, en la etapa de compilación. El compilador lee el código, coteja los tipos de los valores y las operaciones, y se niega a construir el programa si encuentra una incongruencia. Por eso veremos el error del ejemplo anterior antes de que el programa empiece a funcionar.

En esto Java se diferencia de los lenguajes con tipado dinámico, donde los tipos se comprueban durante la ejecución del programa. En estos lenguajes, el error de incongruencia de tipos aparece solo en el momento en que se ejecuta la línea de código correspondiente. La comprobación estática detecta parte de los errores antes y ayuda a no arrastrarlos hasta el usuario.

La indicación explícita de tipos tiene también una segunda ventaja. El tipo junto al nombre de la variable funciona como una pista para quien lee el código. Por la línea `int count = 0;` se ve enseguida que la variable almacena un número entero. Java asume el control de los tipos, y el código se vuelve más claro para las personas.

## Cuándo Java convierte los tipos por sí misma

A veces, en una misma expresión aparecen valores de tipos numéricos diferentes. Si sumas un número entero y uno racional, Java convierte por sí misma el entero en racional:

```java
double result = 1 + 1.5;
System.out.println(result); // => 2.5
```

El entero `1` se convierte en `1.0`, y el resultado sale `2.5`. Esto ocurre porque cualquier número entero se puede representar con exactitud como número racional, y no se pierden datos. En cambio, Java no mezclará por sí misma una cadena y un número. Para eso se necesita una conversión explícita, y aprenderemos a hacerla.

## La inferencia de tipos y la palabra var

Antes en Java las variables se creaban solo con una indicación explícita del tipo, hasta que apareció la palabra `var`. Es una palabra clave especial que activa el mecanismo de **inferencia de tipos**. La inferencia de tipos determina por sí misma el tipo del valor asignado y lo vincula a la variable:

```java
// El compilador entiende que aquí hay un número entero
var age = 33;

// Y aquí hay una cadena
var name = "Tom";
```

La inferencia de tipos apareció en Java en 2018, aunque en algunos otros lenguajes existe desde hace varias décadas. El primer lenguaje con inferencia de tipos se llama ML, y apareció ya en 1973. Desde entonces, la inferencia de tipos se ha añadido a OCaml, Haskell, C#, F#, Kotlin, Scala y muchos otros lenguajes.

La palabra `var` no anula el tipado estático. La variable sigue teniendo un tipo; lo infiere el compilador. Después de eso el tipo queda igualmente fijado, y no podrás poner en esa variable un valor de otro tipo. La inferencia de tipos es preferible en la mayoría de las situaciones. Sucede que el tipo inferido no nos conviene, y entonces el tipo se indica explícitamente.
