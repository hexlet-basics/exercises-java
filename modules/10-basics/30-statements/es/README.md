Una instrucción es un comando para la computadora. El código en Java es un conjunto de instrucciones, y cada una de ellas termina con el carácter `;`. Puede haber tantas instrucciones como quieras: cada una se ejecuta después de que la anterior haya terminado, y así, a partir de elementos simples, se obtiene un programa tan grande y complejo como se desee.

```text
Instrucción 1: System.out.println("Hello");   →  ejecutada
        ↓
Instrucción 2: System.out.println("World");   →  ejecutada
        ↓
Instrucción 3: System.out.println("!");        →  ejecutada
```

Aquí tienes un ejemplo de código con dos instrucciones. Estas líneas le dicen a la computadora que muestre frases en la pantalla:

```java
System.out.println("Mother of Dragons"); // Primera instrucción
System.out.println("Dracarys!"); // Segunda instrucción
```

Al ejecutar este código, se muestran en la pantalla dos frases una tras otra:

```text
Mother of Dragons
Dracarys!
```

## El orden importa

Java ejecuta el código estrictamente en el orden en que lo escribiste. Si intercambias las líneas:

```java
System.out.println("Dracarys!");
System.out.println("Mother of Dragons");
```

en la pantalla también se intercambiarán:

```text
Dracarys!
Mother of Dragons
```

## Finalización de las instrucciones

En Java, el carácter `;` es obligatorio: marca el final de cada instrucción. Si lo olvidas, el compilador informará de un error. Gracias al `;`, incluso se pueden escribir varias instrucciones en una sola línea:

```java
System.out.println("Mother of Dragons"); System.out.println("Dracarys!");
```

El resultado en la pantalla será el mismo, pero en la práctica este enfoque se considera malo: el código es más difícil de leer. Por eso, las instrucciones casi siempre se escriben una por línea.

## Para qué sirve

Ahora escribimos programas muy simples, pero con el tiempo empezarán a complicarse. Una de las habilidades más importantes que te ayudará a entenderlos es la capacidad de dividir mentalmente el programa en instrucciones independientes. Solo así se puede comprender qué ocurre en el código. A continuación, un ejemplo para captar tu atención; por ahora no hace falta entenderlo:

```java
static boolean isPrime(int number) {
    if (number < 2) {
        return false;
    }

    int divider = 2;

    while (divider <= number / 2) {
        if (number % divider == 0) {
            return false;
        }

        divider++;
    }

    return true;
}
```
