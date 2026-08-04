Cuando un programa crece, en él no solo hay más líneas de código, sino también más clases. Cada clase resuelve su propia tarea y está en un archivo aparte, y en una aplicación real esos archivos pueden ser cientos o miles. Una parte de las clases se escribe uno mismo, y otra parte llega junto con las bibliotecas conectadas.

Con esa cantidad de clases, es casi inevitable que aparezca una situación en la que dos clases distintas reciban el mismo nombre. Si dos clases con el mismo nombre acaban en un mismo proyecto, el programa no compilará. La clase propia se puede renombrar, pero con una clase de una biblioteca ajena eso no funciona. Por eso, la exigencia de que los nombres sean únicos dificultaría mucho la reutilización del código de otros.

Para resolver este problema, en Java se usan los **paquetes**. Un paquete es un mecanismo para reunir clases en grupos relacionados lógicamente. Los paquetes se parecen a las carpetas del sistema de archivos: igual que las carpetas organizan los archivos, los paquetes organizan las clases. Paquetes distintos pueden contener clases con el mismo nombre, y no habrá conflicto.

## Definición de paquetes

El paquete se indica con la palabra clave `package` al principio del archivo; justo después va el nombre del paquete:

```java
// Archivo company/User.java
package company;

public class User {
    // código para trabajar con el usuario
}
```

La estructura de los paquetes está ligada a la estructura de archivos del proyecto: el nombre del paquete corresponde al directorio en el que está el archivo. Los paquetes pueden estar anidados; entonces los directorios también están anidados unos dentro de otros. Si una clase está en el paquete `io.hexlet.model`, el archivo se encuentra en el directorio `io/hexlet/model`.

Normalmente el nombre del paquete empieza con un prefijo asignado a la empresa o al desarrollador, y lo más habitual es que sea el nombre de dominio en orden inverso. Por ejemplo, para el dominio `hexlet.io` los paquetes empiezan por `io.hexlet`. Después la estructura depende de la arquitectura de la aplicación: las clases se agrupan por su sentido; por ejemplo, en el paquete `model` se ponen las entidades principales, los usuarios y los cursos:

```java
// Archivo io/hexlet/model/User.java
package io.hexlet.model;

public class User {
    public static String getGreeting(String userName) {
        return "Hello, " + userName + "!";
    }
}
```

## Importación de clases

Las clases de un mismo paquete se llaman entre sí simplemente por su nombre. Pero constantemente hay que usar también clases de otros paquetes. Para acceder a una clase de otro paquete hay que importarla; para eso sirve la palabra clave `import`, tras la cual va el nombre completo de la clase:

```java
package io.hexlet;

import io.hexlet.model.User;

class App {
    public static void main(String[] args) {
        var greeting = User.getGreeting("John");
        System.out.println(greeting);
    }
}
```

Después de la importación, a la clase se accede por su nombre corto. Sin la importación habría que escribir cada vez el nombre completo (fully qualified), incluido el nombre del paquete:

```java
var greeting = io.hexlet.model.User.getGreeting("John");
```

El nombre completo saca del apuro cuando en un mismo lugar se necesitan dos clases con el mismo nombre de paquetes distintos: una clase se importa y a la segunda se accede por su nombre completo.

Se pueden importar a la vez todas las clases de un paquete con la ayuda de `*`:

```java
import java.util.*;
```

Así es cómodo cuando del paquete se necesitan muchas clases, pero no conviene abusar de ello: importar «todo de golpe» ensucia el espacio de nombres y aumenta el riesgo de conflicto de nombres entre paquetes.

## Importación estática

Java permite importar no solo clases, sino también métodos estáticos concretos; entonces se pueden llamar sin indicar la clase. Esto es cómodo cuando algún método se usa a menudo, y hace el código más compacto:

```java
import static java.lang.Math.ceil;

public class App {
    public static void main(String[] args) {
        // El nombre de la clase Math se puede omitir en la llamada
        double result = ceil(2.3); // 3.0
        System.out.println(result);
    }
}
```

También se pueden importar a la vez todos los métodos estáticos de una clase: `import static java.lang.Math.*;`. La importación estática la usamos en el ejercicio de esta lección.
