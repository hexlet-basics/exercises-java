Una comparación suelta como `age >= 18` responde a una sola pregunta. Las comprobaciones reales reúnen varias preguntas de ese tipo en una expresión compuesta. Un formulario de un sitio recibe los datos y comprueba a la vez que el usuario es mayor de edad y que ha dado su consentimiento para el tratamiento de los datos. Todo eso cabe en una línea:

```java
var age = 20;
var hasConsent = true;
System.out.println(age >= 18 && hasConsent); // => true
```

Una expresión lógica compuesta en Java siempre se evalúa a `true` o a `false`. Las partes intermedias también se convierten en valores lógicos, y el resultado final se construye a partir de ellas paso a paso.

## El orden de evaluación

En una misma expresión coinciden aritmética, comparaciones y operadores lógicos. Java los evalúa en un orden estricto de prioridades:

```text
Prioridad (de la más alta a la más baja):

  ()                   paréntesis
   ↓
  * / %  + -           aritmética
   ↓
  < <= > >=  == !=     comparaciones
   ↓
  !                    negación
   ↓
  &&                   Y lógico
   ↓
  ||                   O lógico
```

Primero se calcula la aritmética, después las comparaciones dan `true` o `false`, y solo entonces los operadores lógicos unen esos valores. El operador `&&` es verdadero cuando son verdaderos los dos operandos. El operador `||` es verdadero cuando es verdadero al menos uno. El operador `!` cambia el valor por el contrario.

## La evaluación paso a paso

Analicemos la expresión del ejemplo de arriba. Tenemos `age` igual a `20` y `hasConsent` igual a `true`:

```java
age >= 18 && hasConsent
20 >= 18 && true          // sustituimos los valores de las variables
true && true              // la comparación 20 >= 18 dio true
true                      // los dos operandos de && son verdaderos
```

Tomemos una expresión más complicada, en la que participan los tres operadores. Comprobamos que el número está en el rango de 1 a 10 y además es par:

```java
var number = 4;
System.out.println(number >= 1 && number <= 10 && number % 2 == 0); // => true
```

Java la despliega así:

```text
4 >= 1 && 4 <= 10 && 4 % 2 == 0
true   && true    && 4 % 2 == 0   // dos comparaciones dieron true
true   && true    && 0 == 0       // calculamos el resto 4 % 2
true   && true    && true         // la última comparación dio true
true                              // todos los operandos de && son verdaderos
```

## Los paréntesis y la prioridad

Cuando en una expresión se mezclan `&&` y `||`, el orden lo marcan los paréntesis. Sin ellos, `&&` se aplica antes que `||`, y el sentido puede no ser el que se pretendía:

```java
// && une b y c, por eso esto es a || (b && c)
System.out.println(true || false && false); // => true

// los paréntesis cambian el orden, primero se calcula lo que está dentro
System.out.println((true || false) && false); // => false
```

La primera expresión calcula primero `false && false`, obtiene `false`, y después `true || false` da `true`. En el segundo caso los paréntesis obligan a calcular `true || false` primero, sale `true && false`, y el resultado es `false`.

## La evaluación abreviada

Java se detiene en cuanto el resultado ya está claro. Si el operando izquierdo de `||` es verdadero, el derecho no se evalúa, porque toda la expresión ya es verdadera. Si el operando izquierdo de `&&` es falso, el derecho también se salta:

```java
var hasAccess = true;
System.out.println(hasAccess || age < 0); // => true, Java no calcula la parte derecha
```

A este comportamiento se le llama evaluación abreviada. Acelera las comprobaciones y protege del trabajo innecesario en la parte derecha de la expresión.
