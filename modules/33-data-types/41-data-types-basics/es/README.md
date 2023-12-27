Dentro de los lenguajes de programación de alto nivel, los datos se dividen en tipos. Por ejemplo, las cadenas de texto se clasifican como *String*, mientras que los números se clasifican como *int*.

¿Para qué sirven los tipos de datos? Para proteger el programa de errores difíciles de detectar. Los tipos de datos determinan dos cosas:

* Valores permitidos. Por ejemplo, en Java, los números se dividen en dos grupos de tipos: enteros (*int*) y racionales (*float*). Esta división está relacionada con las características técnicas del hardware.
* Conjunto de operaciones permitidas. Por ejemplo, la operación de multiplicación tiene sentido para el tipo "números enteros". Pero no tiene sentido para el tipo "cadena de texto": multiplicar la palabra "mamá" por la palabra "cuaderno" no tiene sentido.

El lenguaje de programación reconoce los tipos. Por lo tanto, Java no nos permitirá multiplicar una cadena de texto por otra cadena de texto. Pero sí nos permitirá multiplicar un número entero por otro número entero. La presencia de tipos y de tales restricciones en el lenguaje protege los programas de errores accidentales:

```
"uno" * "dos"
Error:
tipos de operandos incorrectos para el operador binario '*'
  primer tipo:  java.lang.String
  segundo tipo: java.lang.String
```

¿Cómo sabe Java qué tipo de datos tiene delante? Cada valor se inicializa en algún lugar. Dependiendo de la forma de inicialización, se entiende qué es exactamente lo que tenemos delante.

Por ejemplo, un número es simplemente un número, no está envuelto entre comillas u otros caracteres emparejados. Pero las cadenas de texto siempre están delimitadas por comillas dobles. Por ejemplo, el valor `"234"` se considera una cadena de texto, aunque dentro de ella se escriban números:

```java
// El compilador entiende que aquí hay un número
var edad = 33;
```

En inglés, las cadenas de texto en programación se llaman *strings*, mientras que las líneas de los archivos de texto se llaman *lines*. Por ejemplo, en el código anterior hay una línea (*line*) y cero cadenas (*strings*). En el idioma ruso, a veces puede haber confusión, por lo tanto, en todas las lecciones utilizaremos los siguientes términos:

* **Cadena de texto** - para denotar el tipo de datos *strings*
* **Línea** - para denotar *lines* (líneas en archivos de texto)

Hay muchos tipos de datos en Java, y también se pueden crear tipos personalizados. Gradualmente nos familiarizaremos con todos los necesarios y aprenderemos a usarlos correctamente.
