Las expresiones lógicas saben comprobar distintas condiciones. Pero por sí solas únicamente devuelven `true` o `false`. Para que el programa realice acciones distintas según el resultado, en Java existe la construcción `if`.

```java
if (5 > 3) {
    System.out.println("Yes, it is true");
}
```

Aquí la cadena `"Yes, it is true"` se imprimirá, porque la condición `5 > 3` es verdadera.

```text
┌───────────┐
│ condición │
└─────┬─────┘
  true │
      ↓
┌───────────┐
│ cuerpo if │
└───────────┘
```

Después de la palabra `if`, entre paréntesis, se escribe una expresión lógica. Luego, entre llaves, va un bloque de código. Ese bloque se ejecutará solo si la condición es verdadera. Si es falsa, el bloque se salta y el método sigue trabajando desde la línea siguiente.

## Bloques de código

Todas las instrucciones que están dentro de las llaves forman un bloque. Se ejecutan juntas cuando la condición es verdadera.

```java
if (10 == 10) {
    System.out.println("First");
    System.out.println("Second");
}

System.out.println("Goodbye!");
```

Aquí se imprimirán `"First"` y `"Second"`, porque la condición se cumplió. Y `"Goodbye!"` se imprimirá en cualquier caso, porque esa línea está ya fuera del bloque. El principio es el mismo que en la definición de métodos.

## El uso de if dentro de un método

Escribamos un método que determina el tipo de la oración que se le pasa. Si la oración termina con un signo de interrogación, el método devolverá `"question"`; en caso contrario devolverá `"general"`:

```java
public static String getTypeOfSentence(String sentence) {
    if (sentence.endsWith("?")) {
        return "question";
    }

    return "general";
}

App.getTypeOfSentence("Hodor");  // "general"
App.getTypeOfSentence("Hodor?"); // "question"
```

Aquí funcionan a la vez dos `return`. Si la condición dentro de `if` se cumple, se ejecuta `return "question"` y el método termina. Si la condición es falsa, el bloque se salta y el control pasa a la línea con `return "general"`.

El método acaba teniendo varios puntos de salida. Es una práctica frecuente. Según la condición, el método termina de una manera o de otra.

El método `getTypeOfSentence` usa `if`, pero devuelve cadenas, por eso no se considera un predicado. Como predicado veamos un método que comprueba si hay dinero suficiente para una compra:

```java
public static boolean hasEnoughMoney(int balance, int price) {
    if (balance >= price) {
        return true;
    }

    return false;
}

App.hasEnoughMoney(100, 50); // true
App.hasEnoughMoney(30, 50);  // false
```

## if y las expresiones lógicas

El método `hasEnoughMoney` lo escribimos con `if`. Pero tal como está podría prescindir de él, porque el resultado de la comparación ya es de por sí una expresión lógica:

```java
public static boolean hasEnoughMoney(int balance, int price) {
    return balance >= price;
}
```

En los casos simples es mejor devolver esa expresión directamente. `if` se necesita allí donde dentro del bloque se realizan acciones adicionales además de devolver el resultado. Cuanto más complejos se vuelven los programas, más a menudo aparecen esas situaciones.
