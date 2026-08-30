Los métodos que definimos en las lecciones anteriores terminaban su trabajo imprimiendo algunos datos en la pantalla:

```java
public class App {
    public static void greeting() {
        System.out.println("Winter is coming");
    }
}
```

Métodos como estos no son de mucha utilidad, ya que el resultado de su trabajo no se puede aprovechar dentro del programa.

Veámoslo con un ejemplo. Tomemos la tarea de procesar el correo electrónico. Cuando un usuario se registra en un sitio, puede escribir su correo de cualquier manera:

- Añadir espacios por accidente al principio o al final `_support@hexlet.io__`
- Usar letras en distintas mayúsculas y minúsculas `SUPPORT@hexlet.io`

Si guardamos la dirección así en la base de datos, el usuario no podrá entrar en el sitio cuando escriba la dirección sin espacios y con otras mayúsculas.

Para que eso no ocurra, la dirección hay que prepararla antes de guardarla: convertirla a minúsculas y recortar los espacios de los extremos de la cadena. Toda la tarea se resuelve en un par de líneas:

```java
class App {
    public static void main(String[] args) {
        // Obtenemos la dirección del formulario
        var email = "  SuppORT@hexlet.IO";
        // Recortamos los caracteres de espacio
        var trimmedEmail = email.trim();
        // Convertimos a minúsculas
        var preparedEmail = trimmedEmail.toLowerCase();
        System.out.println(preparedEmail); // => support@hexlet.io
        // Lo guardamos en la base de datos
    }
}
```

Este código fue posible solo gracias a la devolución del valor. Los métodos `trim()` y `toLowerCase()` no imprimen nada en la pantalla. Ellos **devuelven** el resultado de su trabajo, y por eso podemos guardarlo en variables. Si en su lugar imprimieran en la pantalla, no podríamos asignar el resultado de su trabajo a una variable. Igual que no podemos hacerlo con el método `greeting()` definido arriba:

```java
// Java se quejará de que `greeting()` no devuelve nada
// El código no funcionará
var message = App.greeting();
```

Cambiemos el método `greeting()` para que empiece a devolver datos en lugar de imprimirlos. Para eso tenemos que hacer dos correcciones:

- Describir el tipo de los datos devueltos — aquí es la cadena `String`
- Devolver el valor en lugar de imprimirlo en la pantalla

Veamos el código modificado:

```java
class App {
    public static String greeting() {
        return "Winter is coming!";
    }
}
```

En lugar de `void` ahora está escrito `String`, porque el método tiene devolución. Así le indicamos a Java que el resultado del trabajo del método será una cadena.

Fíjate también en `return`: es una instrucción especial. Toma la expresión que está a su derecha y la entrega hacia fuera, al código que llamó al método. En cuanto Java se encuentra con `return`, la ejecución del método termina ahí:

```java
// Ahora este código funciona
var message = App.greeting();
// Podemos realizar algunas acciones con el resultado
System.out.println(message.toUpperCase()); // => WINTER IS COMING!
```

Cualquier código después de `return` no se ejecuta:

```java
class App {
    public static String greeting() {
        return "Winter is coming!";
        // Cualquier código de abajo no se ejecutará nunca
        // El código inalcanzable en Java ni siquiera compila
        System.out.println("I will never be executed");
    }
}
```

Incluso si un método devuelve datos, eso no le impide imprimir. Además de devolver datos, también podemos imprimirlos:

```java
class App {
    public static String greeting() {
        System.out.println("I will appear in the console");
        return "Winter is coming!";
    }
}

// En algún otro método, el programa
// imprimirá el texto en la pantalla y devolverá el valor
var value = App.greeting();
```

Se puede devolver no solo un valor concreto. Como `return` trabaja con expresiones, a su derecha puede aparecer casi cualquier cosa. Aquí hay que guiarse por los principios de legibilidad del código:

```java
class App {
    public static String greeting() {
        var message = "Winter is coming!";
        return message;
    }
}
```

Aquí no devolvemos la variable: siempre se devuelve el valor que está dentro de esa variable. A continuación, un ejemplo con cálculos:

```java
class App {
    public static long doubleFive() {
        // o return 5 + 5;
        var result = 5 + 5;
        return result;
    }
}
```

En este ejemplo, en la definición del método se usó `long`, porque se devuelve un número entero.

Para comprobar los conocimientos de esta lección, intenta responder a la pregunta. ¿Qué crees que mostrará este código?

```java
// Definición
class App {
    public static int run() {
        return 5;
        return 10;
    }
}

// Uso
App.run(); // => ?
```
