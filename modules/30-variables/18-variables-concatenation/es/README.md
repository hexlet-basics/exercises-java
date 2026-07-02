Las cadenas se pueden unir directamente mediante la concatenación. Ahora hagamos lo mismo, pero con variables. La sintaxis sigue siendo la misma, el programa sustituye los valores de las variables.

## Unimos dos cadenas directamente

```java
var what = "Kings" + "road";
System.out.println(what); // => Kingsroad
```

Aquí dos cadenas se unen en una sola. Así funciona la concatenación: el operador `+` suma las cadenas y crea una nueva cadena.

## Unimos una cadena y una variable

Si en la variable `first` está la cadena `"Kings"`, podemos unirla con otra cadena:

```java
var first = "Kings";
var what = first + "road";
System.out.println(what); // => Kingsroad
```

Java sustituirá el valor de la variable, ejecutará la operación y creará la cadena resultante.

## Unimos dos variables

Del mismo modo, se pueden combinar los valores de dos variables si ambas contienen cadenas:

```java
var first = "Kings";
var last = "road";
var what = first + last;
System.out.println(what); // => Kingsroad
```

También se pueden añadir espacios:

```java
var first = "Kings";
var last = "road";
var full = first + " " + last;
System.out.println(full); // => Kings road
```

```text
first = "Kings"
last  = "road"

first   +  " "  +  last
└─┬──┘           └─┬─┘
"Kings" + " "  + "road"
└────────┬─────────┘
    "Kings road"
```

## Y si una variable contiene un número

En Java, el operador `+` sabe unir una cadena con un número. Si al menos uno de los operandos es una cadena, el número se convierte automáticamente en cadena, y se obtiene una cadena común:

```java
var age = 42;
System.out.println("Age: " + age); // => Age: 42
```

Java ve la cadena `"Age: "` a la izquierda, por eso convierte el número `42` en la cadena `"42"` y las une. Lo mismo funciona con los resultados de los cálculos:

```java
var price = 50 * 1.25 * 6.91; // => 431.875
System.out.println("Price in yuans: " + price);
// => Price in yuans: 431.875
```

Aquí Java primero calcula la expresión, obtiene el número `431.875`, luego lo convierte en cadena y lo pega al texto de la izquierda.

## El orden de cálculo importa

Cuando en una misma expresión aparecen números y cadenas, el resultado depende del orden de las operaciones. De izquierda a derecha, `+` primero suma dos números y solo después los pega a la cadena:

```java
System.out.println("Sum: " + 2 + 3); // => Sum: 23
System.out.println("Sum: " + (2 + 3)); // => Sum: 5
```

En la primera línea, `"Sum: " + 2` ya se convierte en la cadena `"Sum: 2"`, y luego se le pega `3`, y se obtiene `"Sum: 23"`. En la segunda línea, los paréntesis obligan a sumar primero `2 + 3`, obtener el número `5`, y solo después unirlo con la cadena.
