Con la ayuda de los ciclos se procesan números y se trabaja con cadenas. Una cadena está formada por caracteres, y a cada carácter se puede llegar por su índice. Los índices empiezan en cero, por eso el primer carácter de la cadena `"Arya"` tiene el índice `0`, y el último, el índice `length() - 1`.

Obtener un carácter por su índice lo permite el método `charAt()`, y conocer la longitud de la cadena, el método `length()`. Con esos dos métodos y un contador basta para recorrer la cadena carácter a carácter. Abajo hay un ejemplo de código que imprime las letras de una palabra en líneas separadas:

```java
public static void printNameBySymbol(String name) {
    var i = 0;
    // Esta comprobación se realiza hasta el final de la cadena,
    // incluido el último carácter. Su índice es `length() - 1`.
    while (i < name.length()) {
        // Accedemos al carácter por su índice
        System.out.println(name.charAt(i));
        i = i + 1;
    }
}

var name = "Arya";
App.printNameBySymbol(name);
// "A"
// "r"
// "y"
// "a"
```

El ciclo recorre cada carácter de la cadena por turnos:

```text
"Arya"
 │ │ │ │
 A r y a
 ↓ ↓ ↓ ↓
cada carácter se procesa por turno
```

Lo más importante en este código es poner la condición correcta en el `while`. Se puede hacer de dos maneras:

- `i < name.length()`
- `i <= name.length() - 1`

Las dos maneras llevan al mismo resultado. La primera aparece más a menudo, porque tiene menos aritmética.

## El recorrido en orden inverso

El contador no está obligado a crecer desde cero. Si se empieza por el último índice y se va disminuyendo hasta cero, la cadena se recorrerá al revés. Escribamos un método que imprime los caracteres de una palabra en orden inverso:

```java
public static void printReversed(String name) {
    // Empezamos por el último carácter
    var i = name.length() - 1;
    while (i >= 0) {
        System.out.println(name.charAt(i));
        i = i - 1;
    }
}

App.printReversed("Arya");
// "a"
// "y"
// "r"
// "A"
```

Aquí el contador `i` arranca con el valor `name.length() - 1`, se mueve hacia cero y termina el ciclo cuando pasa a ser menor que cero. En cada paso el método toma el carácter que está en el índice actual y lo imprime. La dirección del recorrido la marcan solo el valor inicial del contador y la forma de cambiarlo.
