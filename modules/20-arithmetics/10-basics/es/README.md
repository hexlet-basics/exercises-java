A nivel básico, las computadoras operan solo con números. Incluso en aplicaciones de alto nivel, hay muchos números y operaciones dentro de ellas.

Afortunadamente, para comenzar, es suficiente conocer la aritmética básica, así que empecemos por ahí.

En matemáticas, para sumar dos números, escribimos, por ejemplo, *3 + 4*. En programación, es lo mismo. Aquí hay un programa que suma dos números:

```java
class App {
    public static void main(String[] args) {
        3 + 4;
    }
}
```

Si ejecutas este programa, se ejecutará en silencio y finalizará. No se mostrará nada en la pantalla. La operación de suma, al igual que las demás operaciones, no hace nada más que sumar.

Para utilizar el resultado de la suma, debes mostrarlo en la pantalla:

```java
System.out.println(3 + 4);
```

Después de ejecutarlo, se mostrará el resultado en la pantalla:

```text
7
```

Además de la suma, están disponibles las siguientes operaciones:

* `*` — multiplicación
* `/` — división
* `-` — resta
* `%` — [módulo](https://es.wikipedia.org/wiki/Operaci%C3%B3n_m%C3%B3dulo)

Ahora, vamos a mostrar en pantalla el resultado de una división y luego el resultado de elevar un número a una potencia:

```java
System.out.println(8 / 2);
System.out.println(3 * 3 * 3);
```

```text
4
27
```
