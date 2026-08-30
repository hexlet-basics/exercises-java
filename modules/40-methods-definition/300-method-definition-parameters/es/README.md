Los métodos no solo pueden devolver valores, sino también recibirlos en forma de parámetros. Ya nos hemos topado muchas veces con parámetros de métodos:

```java
// Recibe un parámetro de cualquier tipo
System.out.println("soy un parámetro");
// Recibe el índice por el que se extrae el carácter
"un texto cualquiera".charAt(3); // 't'
// Recibe dos parámetros de tipo cadena
// El primero, qué buscamos; el segundo, por qué lo cambiamos
"google".replace("go", "mo"); // "moogle"
// Recibe dos parámetros numéricos
// el primero, el índice inicial inclusive; el segundo, el índice final no inclusive
"hexlet".substring(1, 3); // "ex"
```

En esta lección aprenderemos a crear métodos que reciben parámetros.

Imaginemos que tenemos la tarea de implementar el método estático `App.getLastChar()`. Debe devolver el último carácter de la cadena que se le pasa como parámetro.

Así se vería el uso de este método:

```java
// Paso de parámetros directamente, sin variables
App.getLastChar("Hexlet"); // 't'
App.getLastChar("Goo"); // 'o'
// Paso de parámetros a través de variables
var name1 = "Hexlet";
App.getLastChar(name1); // 't'
var name2 = "Goo";
App.getLastChar(name2); // 'o'
```

A partir de la descripción y de los ejemplos de código podemos sacar las siguientes conclusiones:

- Necesitamos definir el método estático `getLastChar()` en la clase `App`
- El método debe recibir un parámetro de tipo `String`
- El método debe devolver un valor de tipo `char`

Para empezar, definamos el método:

```java
class App {
    public static char getLastChar(String str) {
        // Calculamos el índice del último carácter como la longitud de la cadena menos 1
        return str.charAt(str.length() - 1);
    }
}
```

Analicemos este código con más detalle. `char` nos indica el tipo del valor devuelto. Después, entre paréntesis, se indica el tipo del parámetro `String` y su nombre `str`.

Dentro del método no sabemos con qué valor concreto se está trabajando, por eso los parámetros siempre se describen como variables.

El nombre del parámetro puede ser cualquiera: no está ligado a cómo se llama al método. Lo importante es que ese nombre refleje el sentido del valor que contiene. El valor concreto del parámetro dependerá de la llamada a ese método.

Los parámetros en Java siempre son obligatorios. Si un método necesita parámetros y probamos a escribir código sin parámetro, el compilador mostrará un error:

```sh
App.getLastChar(); // este código no tiene sentido
method getLastChar in class App cannot be applied to given types;
  required: String
  found:    no arguments
  reason: actual and formal argument lists differ in length
```

Exactamente de la misma manera se pueden indicar dos o más parámetros. Cada parámetro se separa con una coma:

```java
class App {
    // Método para hallar el número medio
    // El tipo devuelto es double, porque
    // al dividir puede salir un número decimal
    public static double average(int x, int y) {
        return (x + y) / 2.0;
    }
}

App.average(1, 5); // 3.0
App.average(1, 2); // 1.5
```

Los métodos pueden exigir en la entrada cualquier cantidad de parámetros que necesiten para funcionar:

```java
// el primer parámetro, qué buscamos
// el segundo parámetro, por qué lo cambiamos
"google".replace("go", "mo"); // "moogle"
```

Para crear métodos así hay que indicar en la definición la cantidad necesaria de parámetros separados por comas, dándoles nombres comprensibles. Abajo hay un ejemplo de definición del método `replace()`, que sustituye una parte de la cadena por otra:

```java
class App {
    public static String replace(String text, String from, String to) {
        // Aquí va el cuerpo del método, pero lo
        // omitimos para no distraernos
        return text.replace(from, to);
    }
}

App.replace("google", "go", "mo"); // "moogle"
```

Cuando hay dos o más parámetros, para casi todos los métodos pasa a ser importante el orden en que se pasan esos parámetros. Al intercambiar los argumentos de lugar, el resultado del método cambia:

```java
// No se sustituyó nada,
// porque dentro de google no hay mo
App.replace("google", "mo", "go"); // "google"
```
