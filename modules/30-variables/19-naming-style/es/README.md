`greeting` sirve como ejemplo de un nombre de variable simple y claro. Pero a menudo nombres como `name`, `email` o `price` resultan insuficientes. Por ejemplo, hay que describir el nombre de un usuario, la cantidad total de pedidos, la longitud máxima de un mensaje. Esos nombres ya constan de varias palabras. ¿Cómo se verá el nombre de la variable en ese caso?

En los distintos lenguajes de programación se usan diferentes estilos de nomenclatura. De eso depende cómo se verá un nombre compuesto. Por ejemplo, así se puede escribir una variable que almacena la longitud máxima de un mensaje:

1. `maxmessagelength`
1. `maxMessageLength`
1. `max-message-length`
1. `max_message_length`

## Estilos principales

En la nomenclatura de variables se pueden distinguir cuatro enfoques principales. Todos ellos se manifiestan cuando el nombre consta de varias palabras:

- kebab-case: las palabras se separan con un guion, por ejemplo `max-message-length`.

  No funciona en Java, porque el guion se interpreta como el operador de resta.

- snake_case: las palabras se separan con un guion bajo, por ejemplo `max_message_length`.

- CamelCase (o UpperCamelCase): cada palabra con mayúscula inicial y sin separadores, por ejemplo `MaxMessageLength`.

- lowerCamelCase: lo mismo, pero la primera palabra empieza con minúscula, por ejemplo `maxMessageLength`.

## Cómo hacerlo correctamente en Java

Para los nombres de variables en Java se adopta el estilo lowerCamelCase. Las palabras se unen entre sí, y cada palabra, excepto la primera, se escribe con mayúscula inicial:

```java
var userName = "Daenerys";
var maxLength = 280;
var totalOrdersCount = 17;
```

- La primera palabra empieza con minúscula
- Cada palabra siguiente empieza con mayúscula
- No hay separadores entre las palabras

Veámoslo en el código:

```java
var firstName = "John";
System.out.println(firstName); // => John

var playerNumber = 24;
System.out.println(playerNumber); // => 24
```

## Cómo no hacerlo

No conviene incluir el tipo de dato en el nombre de la variable. Esos nombres se leen peor y se quedan obsoletos rápidamente. Por ejemplo, `userNameString` o `messagesNumber` describen no el significado de la variable, sino su implementación técnica.

El nombre debe responder a la pregunta "¿qué se almacena?", y no "¿de qué tipo es?". Por eso es mejor escribir `userName` en lugar de `userNameString` y `messagesCount` en lugar de `messagesNumber`.
