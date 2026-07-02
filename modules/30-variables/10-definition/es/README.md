Imagina que necesitas imprimir la frase *Father!* dos veces:

```java
System.out.println("Father!");
System.out.println("Father!");
```

Este enfoque sirve si la frase aparece solo un par de veces. Pero ¿qué pasa si se usa con frecuencia, en diferentes partes del programa? Entonces tendrías que copiar la misma expresión una y otra vez.

¿Y qué pasa si hay que cambiar la frase, por ejemplo reemplazar *Father!* por *Mother!*? Tendrías que buscar y corregir todas las apariciones a mano. Esto es incómodo y provoca errores.

## Variables

Para no duplicar la misma cadena, puedes guardarla en una variable e imprimir su contenido:

```java
var greeting = "Father!";

System.out.println(greeting);
System.out.println(greeting);
```

Resultado:

```text
Father!
Father!
```

Una **variable** es un nombre tras el cual se guarda un valor. En este ejemplo creamos una variable llamada `greeting` y escribimos en ella la cadena `"Father!"`.

```text
var greeting = "Father!";

Variable         Valor
┌──────────┐     ┌──────────┐
│ greeting │ ──→ │ "Father!"│
└──────────┘     └──────────┘
```

La línea `var greeting = "Father!"` se lee así: "toma el valor `"Father!"` y asígnalo a la variable llamada `greeting`". El signo `=` funciona aquí como un operador de asignación, no como una señal de igualdad como en matemáticas. Coloca el valor dentro de la variable.

La palabra clave `var` le indica al compilador que estamos creando una nueva variable. Java determina por sí misma el tipo de la variable según el valor que escribimos en ella. Como a la derecha hay una cadena `"Father!"`, la variable `greeting` se convierte en una variable de cadena.

Cuando escribimos `System.out.println(greeting)`, el programa sustituye el nombre `greeting` por el valor que se almacena en ella. Como resultado, en la pantalla se imprime la cadena `Father!`.

```text
System.out.println(greeting);
                   |
                   v
System.out.println("Father!");
```

## Tipos de variables

En Java, cada variable tiene un tipo. El tipo indica qué datos se almacenan dentro de la variable. Un número entero, un número decimal o una cadena definen tipos diferentes:

```java
var age = 25;       // número entero
var price = 9.99;   // número decimal
var name = "Tom";   // cadena
```

En los ejemplos anteriores, el tipo se determina automáticamente según el valor a la derecha del signo `=`. También se puede indicar el tipo de forma explícita, entonces en lugar de `var` se escribe el nombre del tipo:

```java
int age = 25;
double price = 9.99;
String name = "Tom";
```

Ambas formas crean una variable con el mismo resultado. La escritura con `var` es más corta, por eso la usaremos en los ejemplos.

## Nombres de las variables

Los nombres de las variables los inventa el propio programador. En Java se pueden usar:

- letras latinas (a-z, A-Z),
- dígitos (pero no al principio),
- guion bajo `_`.

Ejemplos de nombres válidos: `greeting`, `name1`, `helloWorld`. Java distingue entre letras minúsculas y mayúsculas. Las variables `greeting`, `Greeting` y `GREETING` serán tres variables diferentes.

## Variables y literales

En el código es importante distinguir dónde usamos una variable y dónde escribimos un valor directamente. Esto se nota especialmente en el ejemplo con `System.out.println()`:

```java
var greeting = "Mother!";
System.out.println(greeting);   // => Mother!
System.out.println("greeting"); // => greeting
```

En el primer caso se usa la **variable** `greeting`, y el programa sustituye su valor. En el segundo caso, `"greeting"` está entre comillas, por lo que es un **literal de cadena**, es decir, un valor listo escrito directamente en el código. Aunque vemos la palabra `greeting` en ambos casos, desde el punto de vista del compilador son cosas diferentes.

Los literales son datos escritos de forma explícita (por ejemplo, `"Hello"`, `42`, `3.14`). Los identificadores funcionan como nombres de variables y métodos (por ejemplo, `greeting`, `println`), que apuntan a valores o comandos ya existentes.

## Varias variables en un programa

En un mismo programa se pueden crear tantas variables como quieras. Cada una almacena sus propios datos y no interfiere con las demás:

```java
var greeting1 = "Father!";
System.out.println(greeting1);
System.out.println(greeting1);

var greeting2 = "Mother!";
System.out.println(greeting2);
System.out.println(greeting2);
```

Resultado:

```text
Father!
Father!
Mother!
Mother!
```

La cantidad de variables depende de la lógica del programa. Cuanto más compleja es la tarea, más datos intermedios hay que almacenar en algún lugar.

## Dónde crear las variables

Los programadores procuran crear las variables más cerca del lugar donde se usan. Esto hace que el código sea más legible. Esto es especialmente importante en programas grandes, donde puede haber decenas y cientos de miles de variables.
