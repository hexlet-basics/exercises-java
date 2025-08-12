¿Qué pasa si necesitamos calcular una expresión como *3 + 5 - 2*? Así es como lo escribiríamos:

```java
System.out.println(3 + 5 - 2); // 3 + 5 - 2 => 8 - 2 => 6
```

Observa que la computadora realiza las operaciones aritméticas en el orden correcto: primero la división y la multiplicación, luego la suma y la resta. A veces es necesario cambiar este orden, lo veremos más adelante.

Otro ejemplo:

```java
System.out.println(2 * 4 * 5 * 10); // 2 * 4 * 5 * 10 => 8 * 5 * 10 => 40 * 10 => 400
```

Como puedes ver, las operaciones se pueden combinar entre sí y así calcular expresiones compuestas más complejas. Para entender cómo se realizan los cálculos dentro del intérprete, analicemos un ejemplo:

```text
2 * 4 * 5 * 10
```

En este ejemplo:

1. Primero calculamos *2 * 4* y obtenemos la expresión *8 * 5 * 10*
2. Luego multiplicamos *8 * 5*. Al final tenemos *40 * 10*
3. Finalmente, se realiza la última multiplicación y se obtiene el resultado *400*
