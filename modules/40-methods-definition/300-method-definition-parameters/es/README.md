Los métodos no solo pueden devolver valores, sino también recibirlos como parámetros. Ya nos hemos encontrado con métodos con parámetros muchas veces:

```java
// Recibe un parámetro de cualquier tipo
System.out.println("soy un parámetro");
// Recibe un índice y devuelve el carácter correspondiente
"algún texto".charAt(3); // 'n'
// Recibe dos parámetros de tipo cadena
// El primero es lo que buscamos, el segundo es por qué lo reemplazamos
"google".replace("go", "mo"); // "moogle"
// Recibe dos parámetros numéricos
// el primero es el índice inicial (inclusive), el segundo es el índice final (no inclusivo)
"hexlet".substring(1, 3); // "ex"
```

En esta lección aprenderemos a crear métodos que reciben parámetros.

Supongamos que tenemos la tarea de implementar el método estático `App.getLastChar()`. Debe devolver el último carácter de la cadena que se pasa como parámetro.

Así es como se usaría este método:

```java
// Pasando parámetros directamente sin variables
App.getLastChar("Hexlet"); // 't'
App.getLastChar("Goo"); // 'o'
// Pasando parámetros a través de variables
var name1 = "Hexlet";
App.getLastChar(name1); // 't'
var name2 = "Goo";
App.getLastChar(name2); // 'o'
```

De la descripción y los ejemplos de código, podemos hacer las siguientes conclusiones:

* Necesitamos definir el método estático `getLastChar()` en la clase `App`
* El método debe recibir un parámetro de tipo `String`
* El método debe devolver un valor de tipo `char`

Para empezar, definamos el método:

```java
class App {
    public static char getLastChar(String str) {
        // Calculamos el índice del último carácter como la longitud de la cadena menos 1
        return str.charAt(str.length() - 1);
    }
}
```

Analicemos este código en detalle. `char` nos indica el tipo de valor que se devuelve. Luego, entre paréntesis, se especifica el tipo del parámetro `String` y su nombre `str`.

Dentro del método, no sabemos con qué valor específico estamos trabajando, por lo que los parámetros siempre se describen como variables.

El nombre del parámetro puede ser cualquier cosa, no está relacionado con la forma en que se llama al método. Lo importante es que este nombre refleje el significado del valor que contiene. El valor específico del parámetro dependerá de cómo se llame a este método.

Los parámetros en Java siempre son obligatorios. Si un método requiere parámetros y intentamos escribir código sin ellos, el compilador mostrará un error:

```bash
App.getLastChar(); // este código no tiene sentido
method getLastChar in class App cannot be applied to given types;
  required: String
  found:    no arguments
  reason: actual and formal argument lists differ in length
```

De la misma manera, se pueden especificar dos o más parámetros. Cada parámetro se separa por comas:

```java
class App {
    // Método para encontrar el número medio
    // El tipo de retorno es double porque
    // la división puede dar como resultado un número decimal
    public static double average(int x, int y) {
        return (x + y) / 2.0;
    }
}

App.average(1, 5); // 3.0
App.average(1, 2); // 1.5
```

Los métodos pueden requerir cualquier cantidad de parámetros que necesiten para funcionar:

```java
// el primer parámetro es lo que buscamos
// el segundo parámetro es por qué lo reemplazamos
'google'.replace('go', 'mo'); // moogle
```

Para crear tales métodos, debemos especificar la cantidad necesaria de parámetros en la definición, separados por comas, dándoles nombres descriptivos. A continuación se muestra un ejemplo de definición del método `replace()`, que reemplaza una parte de una cadena por otra:

```java
class App {
    public static String replace(String text, String from, String to) {
        // aquí va el cuerpo del método, pero lo omitimos para no distraernos
    }
}

App.replace('google', 'go', 'mo'); // moogle
```

Cuando hay dos o más parámetros, el orden en que se pasan esos parámetros se vuelve importante para casi todos los métodos. Si se cambia el orden, el método se ejecutará de manera diferente:

```java
// no se reemplaza nada,
// ya que no hay 'mo' dentro de google
App.replace('google', 'mo', 'go'); // google
```
