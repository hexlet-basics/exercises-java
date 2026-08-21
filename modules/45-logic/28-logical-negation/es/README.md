Junto con los operadores lógicos **Y** y **O** se usa a menudo la operación de "**negación**". Cambia el valor lógico por el contrario. En Java a la negación le corresponde el operador unario `!`:

```java
System.out.println(!true);  // => false
System.out.println(!false); // => true
```

Si hay un método que comprueba la paridad de un número, con la ayuda de la negación se puede hacer la comprobación de la imparidad:

```java
public static boolean isEven(int number) {
    return number % 2 == 0;
}

System.out.println(App.isEven(10));  // => true
System.out.println(!App.isEven(10)); // => false
```

En el ejemplo de arriba añadimos `!` a la izquierda de la llamada al método y obtuvimos la acción contraria. La negación permite expresar en el código las reglas que tenemos en mente sin escribir métodos nuevos.

La negación se aplica no solo a la llamada de un método, sino también a una expresión completa. Los paréntesis marcan a qué se refiere exactamente el operador:

```java
System.out.println(!(5 == 5 || 5 == 3)); // => false

// Esta misma expresión se puede escribir de otra manera,
// "el número no es igual a 5 y no es igual a 3"
System.out.println(5 != 5 && 5 != 3);    // => false
```

## La doble negación

La negación se puede poner varias veces seguidas. En lógica, la doble negación equivale a la ausencia de negación:

```java
System.out.println(!!true);  // => true
System.out.println(!!false); // => false

System.out.println(!!App.isEven(10)); // => true
System.out.println(!!App.isEven(11)); // => false
```

## La prioridad

El operador `!` se puede combinar con `&&` y `||`. Entre los operadores lógicos, la negación tiene la prioridad más alta, por eso se aplica primero:

```java
// (!true) || true  =>  false || true  =>  true
System.out.println(!true || true);     // => true

// (!true) && false  =>  false && false  =>  false
System.out.println(!true && false);    // => false
```

Los paréntesis cambian el orden de cálculo, y `!` se aplica ya al resultado que está dentro de ellos:

```java
// !(true || true)  =>  !true  =>  false
System.out.println(!(true || true));   // => false

// !(true && false)  =>  !false  =>  true
System.out.println(!(true && false));  // => true
```

Un ejemplo práctico. El método comprueba si un conductor puede ponerse al volante. Se necesita el carné y estar sobrio, por eso la segunda condición pasa por la negación:

```java
public static boolean canDrive(boolean hasLicense, boolean isDrunk) {
    return hasLicense && !isDrunk;
}

System.out.println(App.canDrive(true, false));  // => true  (tiene carné, está sobrio)
System.out.println(App.canDrive(true, true));   // => false (tiene carné, pero está borracho)
System.out.println(App.canDrive(false, false)); // => false (no tiene carné)
```

Ahora ya sabes qué significan los operadores **Y**, **O** y `!`. Con su ayuda podrás plantear condiciones compuestas a partir de dos o más expresiones lógicas.

## Las leyes de De Morgan

Al trabajar con expresiones lógicas complejas, a veces hace falta invertirlas o reescribirlas en una forma equivalente que resulte más cómoda de leer. Para eso existen las **leyes de De Morgan**, dos reglas que describen cómo se reparte la negación por una expresión compuesta:

```text
!(A && B)  ==  !A || !B
!(A || B)  ==  !A && !B
```

La primera ley dice que la negación de la conjunción es igual a la disyunción de las negaciones. Comprobemos las dos partes con valores concretos:

```java
System.out.println(!(true && false));     // => true
System.out.println(!true || !false);       // => true
```

La segunda ley dice que la negación de la disyunción es igual a la conjunción de las negaciones:

```java
System.out.println(!(true || false));      // => false
System.out.println(!true && !false);        // => false
```

En la práctica, las leyes de De Morgan ayudan a simplificar las condiciones. En lugar de `!(isAdmin || isModerator)` se puede escribir `!isAdmin && !isModerator`. La segunda variante se lee como "no es administrador y no es moderador", y es más fácil de seguir.
