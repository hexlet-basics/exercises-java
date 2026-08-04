La definición de métodos propios simplifica en gran medida la escritura y el mantenimiento de los programas. Por ejemplo, los métodos permiten combinar operaciones compuestas en una sola.

Enviar un correo desde un sitio web es un proceso complejo que incluye la interacción con internet. Se puede definir un método y ocultar toda esa complejidad detrás de una construcción corta:

```java
// El lugar de donde se toma el método
import com.example.Mailer;

var email = "support@hexlet.io";
var title = "Ayuda";
var body = "He escrito una historia de éxito, ¿cómo puedo obtener un descuento?";

// Mailer es el nombre de la clase en la que está definido el método send()
// Una llamada pequeña, y mucha lógica dentro
Mailer.send(email, title, body);
```

Por dentro, una llamada como esta ejecuta bastante lógica. Se conecta al servidor de correo, forma la petición correcta a partir del asunto y del cuerpo del mensaje, y luego lo envía todo, sin olvidar cerrar la conexión.

## Cómo crear métodos

Vamos a crear nuestro primer método. Su tarea es mostrar la fecha actual en la pantalla:

```text
Today is: 2021-10-25
```

```java
import java.time.LocalDate;

// Definición del método
// La definición no llama ni ejecuta el método
// Solo decimos que ahora ese método existe
public class App {
    public static void showCurrentDate() {
        // Método incorporado en Java para obtener la fecha y la hora actuales
        var currentDate = LocalDate.now();
        var text = "Today is: " + currentDate;
        System.out.println(text);
    }
}

// Llamada al método
// Es obligatorio indicar el nombre de la clase
App.showCurrentDate(); // => Today is: 2021-10-25
```

Veamos la firma del método por partes:

```text
public static void showCurrentDate()
  │      │     │           │
  │      │     │           nombre del método y lista de parámetros entre paréntesis
  │      │     tipo del valor devuelto
  │      static — el método se llama directamente desde la clase
  visibilidad del método fuera de la clase
```

La definición de un método en Java incluye muchas cosas que iremos viendo poco a poco.

Se pueden dividir en dos grupos:

* Lo que afecta al funcionamiento del propio método
* Cómo se ve ese método fuera de la clase

De la visibilidad se encarga la palabra *public*. Permite llamar a los métodos desde fuera de la clase, como en el ejemplo anterior. Además de ella existe *private*, que se estudia en Hexlet en el curso de [POO en Java](https://codica.la/carreras/java).

Del funcionamiento del método se encargan:

* *static* — desvincula el método del objeto y hace posible llamarlo directamente desde la clase
* *void* se usa si el método no devuelve nada. Por ejemplo, esa es la definición del método `System.out.println()`. Si el método devuelve algún dato, en lugar de *void* se indica el tipo de los datos devueltos

A diferencia de los datos normales, los métodos realizan acciones, por eso sus nombres casi siempre deben ser verbos: "construir algo", "dibujar algo", "abrir algo".

Todo lo que se describe dentro de las llaves `{}` se llama **cuerpo del método**. Dentro del cuerpo se puede escribir cualquier código. Considéralo un pequeño programa independiente, un conjunto de instrucciones arbitrarias.

El cuerpo se ejecuta exactamente en el momento en que se lanza el método. Además, cada llamada al método ejecuta el cuerpo de forma independiente de las demás llamadas. Por cierto, el cuerpo puede estar vacío:

```java
// Definición mínima de un método
public class App {
    public static void noop() {
        // Aquí podría haber código, pero no lo hay
        // Fíjate en la indentación
        // Para mayor legibilidad, cualquier código dentro del cuerpo se desplaza 4 espacios a la derecha
    }
}
App.noop();
```

El concepto de "crear un método" tiene muchos sinónimos: "implementar", "definir" e incluso "codificar". Todos estos términos se encuentran en la práctica diaria del trabajo.

## Reutilización y legibilidad

Los métodos ayudan a evitar la duplicación. Supongamos que en el programa aparece varias veces el mismo conjunto de acciones:

```java
System.out.println("Hello, Hexlet!");
System.out.println("Hello, world!");
System.out.println("Hello, Java!");
```

Ese patrón se puede reunir en un solo método y llamarlo en distintos lugares. Cuando haya que cambiar el texto, la corrección se hace en un único lugar: en la definición del método. Cuanto más grande es el proyecto y más a menudo se repite la lógica, más notable es la ganancia.

El nombre del método por sí mismo indica qué hace. El método `showCurrentDate()` habla de su tarea sin comentarios adicionales. Esto ayuda a otros programadores a leer el código, y también a ti mismo un mes después de haberlo escrito.
