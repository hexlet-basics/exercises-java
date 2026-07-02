A veces el texto en un programa debe ocupar varias líneas. Esto ocurre al generar una carta, crear una plantilla, formatear un mensaje de error o trabajar con textos largos.

Ya hemos visto una forma. Es el carácter de salto de línea `\n` dentro de una cadena normal entre comillas dobles:

```java
System.out.println("Texto de ejemplo,\nque consta de\nvarias líneas");
```

Al imprimirlo, se obtiene esto:

```text
Texto de ejemplo,
que consta de
varias líneas
```

Es una forma que funciona, pero incómoda. Cada `\n` hay que insertarlo a mano, y cuanto más largo es el texto, peor se lee el código.

## Bloques de texto

En Java existe una notación en la que el texto en el código se ve igual que al imprimirlo. Es un bloque de texto (text block). Comienza y termina con tres comillas dobles `"""`.

Las `"""` de apertura se colocan al final de la línea, y el texto se escribe en la línea siguiente:

```java
System.out.println("""
    Texto de ejemplo,
    que consta de
    varias líneas""");
```

La salida será la misma que en la versión con `\n`:

```text
Texto de ejemplo,
que consta de
varias líneas
```

Java añade los saltos de línea dentro del bloque por sí mismo, así que no hace falta escribir `\n`.

## Sangría dentro del bloque

Conviene desplazar el texto del bloque hacia la derecha para que no se confunda con el código. Java mira la sangría común de todas las líneas del bloque y la recorta de cada línea. En el ejemplo anterior, cada línea tiene cuatro espacios a la izquierda, y los cuatro desaparecen del resultado. En la salida, las líneas empiezan desde el primer carácter.

La posición de las `"""` de cierre también afecta a la sangría. Si las desplazas a la izquierda del texto, parte de los espacios de la izquierda quedará en el resultado. Por eso las comillas de cierre suelen mantenerse al nivel del texto o justo después de la última línea.

## Comillas sin escapar

Dentro de un bloque de texto, las comillas dobles se pueden escribir directamente, sin barra invertida:

```java
System.out.println("""
    Aquí las comillas "dobles" se ven tal cual""");
```

Salida:

```text
Aquí las comillas "dobles" se ven tal cual
```

En una cadena normal, para esto habría que escapar cada comilla con `\"`.

## Conclusión

Un bloque de texto se escribe entre tres comillas dobles `"""`. Las `"""` de apertura se colocan al final de la línea, y el texto se escribe debajo. Java añade los saltos de línea por sí mismo, y la sangría común de la izquierda se recorta. Para la máquina, un bloque de texto y una cadena con `\n` significan lo mismo, pero para una persona el bloque es más claro.
