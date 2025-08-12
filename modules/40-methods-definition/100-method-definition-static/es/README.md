La definición de métodos propios simplifica en gran medida la escritura y el mantenimiento de programas. Por ejemplo, los métodos permiten combinar operaciones compuestas en una sola.

Por ejemplo, enviar un correo electrónico en un sitio web es un proceso bastante complejo que implica interactuar con Internet. Se puede definir un método y ocultar toda la complejidad detrás de una sola construcción simple:

```java
// Lugar donde se encuentra el método
import com.example.Mailer;

var email = "support@hexlet.io";
var title = "Ayuda";
var body = "He escrito una historia de éxito, ¿cómo puedo obtener un descuento?";

// Mailer - nombre de la clase en la que se define el método send()
// Una pequeña llamada - y mucha lógica interna
Mailer.send(email, title, body);
```

Este tipo de llamada realiza bastante lógica interna. Se conecta al servidor de correo, forma una solicitud correcta basada en el encabezado y el cuerpo del mensaje, y luego lo envía todo, sin olvidar cerrar la conexión.

## Cómo crear métodos

Crearemos nuestro primer método. Su tarea es mostrar la fecha actual en la pantalla:

```text
Hoy es: 2021-10-25
```

```java
import java.time.LocalDate;

// Definición del método
// La definición no llama ni ejecuta el método
// Solo estamos diciendo que ahora existe este método
public class App {
    public static void showCurrentDate() {
        // Método incorporado en Java para obtener la fecha y hora actual
        var currentDate = LocalDate.now();
        var text = "Hoy es: " + currentDate;
        System.out.println(text);
    }
}

// Llamada al método
// Es obligatorio especificar el nombre de la clase
App.showCurrentDate(); // => Hoy es: 2021-10-25
```

La definición de un método en Java implica muchas acciones que iremos viendo gradualmente.

Se pueden dividir en dos grupos:

* Lo que afecta el funcionamiento del propio método
* Cómo se ve este método fuera de la clase

La visibilidad está determinada por la palabra *public*. Esto permite llamar a los métodos desde fuera de la clase, como en el ejemplo anterior. Además de *public*, existe *private*, que se explica en Hexlet en el curso de [POO en Java](https://codica.la/courses/java-poo-basics).

El funcionamiento del método está determinado por:

* *static* - desvincula el método del objeto y permite llamarlo directamente desde la clase
* *void* se utiliza si el método no devuelve nada. Por ejemplo, esta es la definición del método `System.out.println()`. Si el método devuelve algún dato, en lugar de *void* se especifica el tipo de dato devuelto

A diferencia de los datos normales, los métodos realizan acciones, por lo que sus nombres casi siempre deben ser verbos: "construir algo", "dibujar algo", "abrir algo".

Todo lo que se describe dentro de las llaves `{}` se llama **cuerpo del método**. Dentro del cuerpo se puede escribir cualquier código. Considéralo como un pequeño programa independiente, un conjunto de instrucciones arbitrarias.

El cuerpo se ejecuta exactamente en el momento en que se inicia el método. Además, cada llamada al método ejecuta el cuerpo de forma independiente de otras llamadas. Por cierto, el cuerpo puede estar vacío:

```java
// Definición mínima del método
public class App {
    public static void noop() {
        // Aquí podría haber código, pero no lo hay
        // Presta atención a la indentación
        // Para mayor legibilidad, cualquier código dentro del cuerpo se desplaza a la derecha en 4 espacios
    }
}
App.noop();
```

El concepto de "crear un método" tiene muchos sinónimos: "implementar", "definir" e incluso "implementar". Todos estos términos se encuentran en la práctica diaria en el trabajo.
