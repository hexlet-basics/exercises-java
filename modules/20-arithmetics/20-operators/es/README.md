Antes de continuar, vamos a repasar la terminología básica. Un signo de operación, como `+`, se llama operador. Un **operador** es simplemente un símbolo que realiza una operación, como la suma:

```java
System.out.println(8 + 2); // => 10
```

En este ejemplo, `+` es el operador, y los números *8* y *2* son los **operandos**.

En el caso de la suma, tenemos dos operandos:

* Uno a la izquierda
* Otro a la derecha del signo *+*

Las operaciones que requieren dos operandos se llaman **binarias**. Si falta al menos un operando, el programa dará un error de sintaxis. Por ejemplo:

```
`3 + ;`
```

Las operaciones no solo pueden ser binarias. También pueden ser:

* Unarias: con un solo operando
* Ternarias: con tres operandos

Además, los operadores pueden tener la misma apariencia pero representar operaciones diferentes:

```java
System.out.println(-3); // => -3
```

En el ejemplo anterior, se aplica una operación unaria al número *3*. El operador "menos" antes del tres le indica al intérprete que tome el número *3* y encuentre su opuesto, es decir, *-3*.

Esto puede ser un poco confuso, ya que *-3* es tanto un número en sí mismo como un operador con un operando, pero así es la estructura de los lenguajes de programación.
