En el nivel más bajo, la computadora trabaja solo con ceros y unos. Esto es el código binario. Cada cero o uno se llama bit (de binary digit, "dígito binario").

Cualquier dato dentro de la computadora es una secuencia de bits. Así se almacenan las imágenes, la música y el texto. Los números habituales del sistema decimal también se pueden representar en forma binaria:

- 0 → `0`
- 1 → `1`
- 2 → `10`

## Cómo codificar texto

La computadora no "entiende" las letras. Para almacenar texto, los caracteres se convierten en números. De eso se encargan las codificaciones. Una codificación es una tabla donde a cada carácter le corresponde un número determinado.

La forma más directa consiste en numerar las letras empezando por el uno:

- `a` → `1`
- `b` → `2`
- ...y así hasta `z` → `26`

Ahora la palabra hello se convierte en un conjunto de números:

```text
h e l l o
↓ ↓ ↓  ↓  ↓
8 5 12 12 15
```

El programa no sabe que ante él hay una palabra. Ve la instrucción "muestra el carácter con el código 8, después con el código 5", y así sucesivamente. La palabra good en la misma tabla se convertirá en los códigos 7, 15, 15 y 4.

## ASCII. La primera codificación masiva

Las primeras computadoras trabajaban principalmente con el idioma inglés. Para él, en los años 1960 se ideó la tabla ASCII de 128 caracteres. En ella entraron el alfabeto latino, las cifras, los signos de puntuación, caracteres especiales como `@`, `#`, `!` y los códigos de control.

Para los primeros programas esto bastaba, pero no para todo el mundo. Cuando las computadoras llegaron a otros países, surgió un problema. En ASCII no hay cirílico, ni jeroglíficos, ni escritura árabe, ni acentos, ni símbolos de moneda.

Entonces cada país o empresa empezó a hacer su propia tabla basada en ASCII. Windows ideó Windows-1251 para el ruso, Apple creó Mac Roman, y en Asia y en Oriente Medio aparecieron sus propias variantes.

Estas tablas eran incompatibles entre sí. El código 226 en una codificación significaba la letra é, y en otra un carácter completamente distinto. El texto escrito con una tabla y leído con otra se convertía en basura.

## Caracteres ilegibles

Si en el texto, en lugar de palabras, aparece algo así:

```text
ÐÑÐ¸Ð²ÐµÑ
```

significa que el programa leyó los bytes con la tabla equivocada. Obtuvo un conjunto de números, pero los asoció con caracteres incorrectos. En los años 1990 y 2000 esto ocurría constantemente.

## Unicode y UTF-8

Para reducir todas las tablas a una sola, en los años 1990 se empezó a crear Unicode. Es una tabla común en la que entraron los caracteres de todos los sistemas de escritura del mundo. En ella hay alfabeto latino y cirílico, escritura china y árabe, signos matemáticos, alfabetos antiguos e incluso emojis.

Dentro de Unicode hay varios formatos de almacenamiento. El más extendido de ellos es UTF-8. Codifica los caracteres ingleses de forma compacta, y para el resto de los caracteres se expande según haga falta.

Hoy UTF-8 está por defecto en internet, en Linux, en las bases de datos y en los editores de código. Java almacena el texto en Unicode, por eso las letras de cualquier idioma y símbolos como `©` o `€` se muestran igual en cualquier sistema.

## Para qué saber esto

El texto aparece en cada programa, y los errores de codificación siguen ocurriendo. Con más frecuencia esto sucede al leer archivos, procesar datos e intercambiar datos con las bases de datos. Si en la pantalla aparecen caracteres ilegibles, casi siempre es una codificación confundida. Conviene recordar UTF-8 también al trabajar con archivos externos, ya que el editor o el sistema podrían haberlos guardado con otra tabla.
