Los métodos, en cualquier lenguaje de programación, tienen propiedades fundamentales. Estas propiedades ayudan a entender cómo se comportará un método en distintas situaciones, cómo probarlo y dónde aplicarlo. Una de esas propiedades es el **determinismo**.

Un **método determinista** siempre devuelve el mismo resultado con los mismos datos de entrada. Por ejemplo, se puede llamar determinista al método que extrae un carácter de una cadena por su posición:

```java
"wow".charAt(1); // 'o'
"wow".charAt(1); // 'o'

"hexlet".charAt(0); // 'h'
"hexlet".charAt(0); // 'h'
```

No importa cuántas veces llamemos a `charAt()` con el argumento `1` para la cadena `"wow"`, siempre devolverá `'o'`. El resultado depende solo de los datos de entrada y no cambia de una llamada a otra.

## Métodos no deterministas

Al tipo opuesto pertenecen los **métodos no deterministas**. Devuelven resultados distintos con los mismos datos de entrada o cuando no los hay (métodos sin argumentos). Un buen ejemplo es el método que devuelve un número aleatorio:

```java
// Método que devuelve un número aleatorio
Math.random(); // 0.09856613113197676
Math.random(); // 0.8839904367241888
```

Este método no tiene argumentos, pero su resultado es diferente cada vez. Cuán diferente sea no importa. Incluso si una sola llamada entre un millón da otro resultado, el método se considera no determinista.

```text
Determinista:                  No determinista:
"wow".charAt(1) → siempre 'o'  Math.random() → 0.42
"wow".charAt(1) → siempre 'o'  Math.random() → 0.91
"wow".charAt(1) → siempre 'o'  Math.random() → 0.07
```

## Por qué esto es importante

El determinismo influye en cómo trabajamos con los métodos.

- los métodos deterministas son fáciles de probar y de predecir;
- son más simples de optimizar y de reutilizar;
- los métodos no deterministas son más difíciles de comprobar, porque el resultado cambia.

Por eso, donde sea posible, es mejor intentar que un método siga siendo determinista.
