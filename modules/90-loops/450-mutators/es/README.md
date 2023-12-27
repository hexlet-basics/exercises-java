Del lenguaje C a Java se han trasladado dos operaciones: **incremento** `++` y **decremento** `--`, que se encuentran muy a menudo en combinación con bucles.

Estas operaciones unarias aumentan y disminuyen en uno el número almacenado en una variable:

```java
var i = 0;
i++; // 0
i++; // 1

i--; // 2
i--; // 1
```

Además de la forma posfija, también tienen una forma prefija:

```java
var i = 0;
++i; // 1
++i; // 2

--i; // 1
--i; // 0
```

Parece que no hay ninguna diferencia entre las formas posfija y prefija, pero aquí es donde empiezan las dificultades. A diferencia de todas las demás operaciones, el incremento y el decremento no solo devuelven un valor, sino que también **modifican el valor de la variable**.

Al utilizar la notación prefija, primero se produce la modificación de la variable y luego se devuelve. Al utilizar la notación posfija, ocurre lo contrario: se puede considerar que primero se devuelve y luego se modifica la variable.

La regla funciona de la misma manera para el incremento y el decremento. Para simplificar, consideremos solo el incremento:

```java
var x = 5;

System.out.println(++x); // => 6
System.out.println(x);   // => 6

System.out.println(x++); // => 6
System.out.println(x);   // => 7
```

Lo que sucede en el código anterior:

1. Imprimimos `++x` en la pantalla, que es un incremento prefijo. Por lo tanto, primero el valor de la variable se incrementa en 1, luego se devuelve el resultado y se imprime en la pantalla.
2. Como el valor ha cambiado, `System.out.println(x)` imprime 6.
3. Ahora imprimimos `x++` en la pantalla, que es un incremento posfijo. Por lo tanto, obtenemos el valor que tenía la variable antes de incrementarse en 1.
4. Como el valor ha cambiado, `System.out.println(x)` imprime 7.

Se vuelve especialmente complicado cuando se inserta el incremento en otras operaciones: `x = i++ - 7 + --h`. Es casi imposible entender un código así.

Recomendaciones de uso:

* Nunca mezcles operaciones sin efectos secundarios con operaciones con efectos secundarios. Lo mismo se aplica a los métodos.
* Utiliza el incremento y el decremento solo cuando no haya diferencia entre la forma prefija y la forma posfija, separados del resto del código, en una línea separada.
