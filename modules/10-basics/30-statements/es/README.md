Una instrucción es un comando para la computadora. El código en Java es un conjunto de instrucciones que generalmente se separan entre sí con el símbolo `;`. Aquí hay un ejemplo de código con dos instrucciones:

```java
System.out.println("Madre de Dragones");
System.out.println("¡Dracarys!");
```

Al ejecutar este código, se mostrarán en pantalla dos frases de forma secuencial:

<pre class='hexlet-basics-output'>
Madre de Dragones
¡Dracarys!
</pre>

¿Por qué es importante saber esto? Una instrucción es una unidad de ejecución. El programa que ejecuta el código en Java realiza las instrucciones estrictamente en orden. Los desarrolladores deben comprender este orden y ser capaces de dividir mentalmente el programa en partes independientes que sean fáciles de analizar.

Teóricamente, las instrucciones se pueden escribir una tras otra sin saltar a una nueva línea:

```java
System.out.println("Madre de Dragones."); System.out.println("¡Dracarys!");
```

El resultado en pantalla será el mismo, pero en la práctica, este enfoque se considera incorrecto.
