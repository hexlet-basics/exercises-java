Los métodos que definimos en las lecciones anteriores finalizaban su trabajo imprimiendo algunos datos en la pantalla:

```java
public class App {
    public static void saludo() {
        System.out.println("Se acerca el invierno");
    }
}
```

No hay mucho beneficio de tales métodos, ya que sus resultados no pueden ser utilizados dentro del programa.

Veamos esto con un ejemplo. Tomemos la tarea de procesar correos electrónicos. Cuando un usuario se registra en un sitio web, puede ingresar su correo electrónico de cualquier manera:

* Agregar espacios aleatorios al principio o al final `_soporte@hexlet.io__`
* Usar letras en diferentes casos `SOPORTE@hexlet.io`

Si guardamos la dirección en esta forma en la base de datos, el usuario no podrá iniciar sesión en el sitio web si ingresa la dirección sin espacios y en un caso diferente.

Para evitar que esto suceda, la dirección debe prepararse para su almacenamiento en la base de datos, es decir, convertirse a minúsculas y recortarse los espacios al principio y al final de la cadena. La tarea completa se puede resolver en un par de líneas:

```java
class App {
    public static void main(String[] args) {
        // Obtén la dirección del formulario
        var correo = "  SoPORTE@hexlet.IO";
        // Recorta los caracteres de espacio en blanco
        var correoRecortado = correo.trim();
        // Conviértelo a minúsculas
        var correoPreparado = correoRecortado.toLowerCase();
        System.out.println(correoPreparado); // => soporte@hexlet.io
        // Guardar en la base de datos
    }
}
```

Este código se volvió posible solo gracias al valor de retorno. Los métodos `trim()` y `toLowerCase()` no imprimen nada en la pantalla. Ellos **devuelven** el resultado de su trabajo, por lo que podemos asignarlo a variables. Si en lugar de devolver el resultado, imprimieran en la pantalla, no podríamos asignar el resultado de su trabajo a una variable. Tal como no podemos hacerlo con el método `saludo()` definido arriba:

```java
// Java se quejará de que `saludo()` no devuelve nada
// El código no funcionará
var mensaje = App.saludo();
```

Modifiquemos el método `saludo()` para que comience a devolver datos en lugar de imprimirlos. Para hacerlo, necesitamos hacer dos cambios:

* Especificar el tipo de datos de retorno, en este caso, es una cadena `String`
* Usar la instrucción `return` en lugar de imprimir en la pantalla

Veamos el código modificado:

```java
class App {
    public static String saludo() {
        return "¡Se acerca el invierno!";
    }
}
```

En lugar de `void`, ahora tenemos `String` porque el método tiene un valor de retorno. De esta manera, le decimos a Java que el resultado del trabajo del método será una cadena.

También presta atención a la instrucción `return`, es una instrucción especial. Toma la expresión a la derecha y la pasa al código que llamó al método. Tan pronto como Java encuentra `return`, la ejecución del método termina:

```java
// Ahora este código funciona
var mensaje = App.saludo();
// Podemos realizar algunas acciones en el resultado
System.out.println(mensaje.toUpperCase()); // => ¡SE ACERCA EL INVIERNO!
```

Cualquier código después de `return` no se ejecuta:

```java
class App {
    public static String saludo() {
        return "¡Se acerca el invierno!";
        // Ningún código debajo se ejecutará nunca
        // El código inalcanzable en Java ni siquiera compilará
        System.out.println("Nunca seré ejecutado");
    }
}
```

Incluso si un método devuelve datos, esto no lo limita para imprimir. Además de devolver datos, también podemos imprimirlos:

```java
class App {
    public static String saludo() {
        System.out.println("Apareceré en la consola");
        return "¡Se acerca el invierno!";
    }
}

// En algún lugar en otro método del programa
// imprimirá el texto en la pantalla y devolverá el valor
var valor = App.saludo();
```

Es posible devolver no solo un valor específico. Dado que `return` funciona con expresiones, casi cualquier cosa puede aparecer a la derecha de él. Aquí debemos seguir los principios de legibilidad del código:

```java
class App {
    public static String saludo() {
        var mensaje = "¡Se acerca el invierno!";
        return mensaje;
    }
}
```

Aquí, no estamos devolviendo la variable en sí, siempre estamos devolviendo el valor que está almacenado en esta variable. A continuación, hay un ejemplo con cálculos:

```java
class App {
    public static long dobleCinco() {
        // o return 5 + 5;
        var resultado = 5 + 5;
        return resultado;
    }
}
```

En este ejemplo, se utilizó `long` en la definición del método porque se devuelve un entero.

Para poner a prueba tus conocimientos de esta lección, intenta responder la pregunta. ¿Qué crees que mostrará este código?

```java
// Definición
class App {
    public static int ejecutar() {
        return 5;
        return 10;
    }
}

// Uso
App.ejecutar(); // => ?
```
