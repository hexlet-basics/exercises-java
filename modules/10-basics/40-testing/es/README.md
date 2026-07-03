Nuestro sitio web verifica automáticamente tus soluciones. ¿Cómo funciona?

En el caso más simple, el sistema simplemente ejecuta tu código y observa lo que se mostró en la pantalla. Luego lo compara con lo que "esperábamos" según la tarea.

En las siguientes lecciones, más complejas, escribirás métodos: pequeños programas que toman información del mundo exterior y realizan algunas operaciones. La verificación de tus soluciones en estos casos es un poco más complicada: el sistema ejecuta tu solución y le pasa cierta información. El sistema también sabe —"espera"— qué respuesta exacta debe devolver el método correcto para esos datos de entrada.

Por ejemplo, si tu tarea es escribir código que sume dos números, el sistema de verificación le pasará diferentes combinaciones de números y comparará la respuesta de tu código con las sumas reales. Si las respuestas coinciden en todos los casos, la solución se considera correcta.

Aquí tienes un ejemplo sencillo: en una de las lecciones futuras, tendrás que escribir código que realice cálculos y devuelva una respuesta. Supongamos que cometiste un pequeño error y el método devolvió un número incorrecto. El sistema responderá algo así:

```text
expected: "35" but was: "10"
```

Lo más importante empieza después de los dos puntos: "se esperaba: "35", pero fue "10"". Es decir, el código correcto debería haber devuelto 35, pero la solución actual funciona mal y devuelve 10.

Este enfoque se llama testing (pruebas) y se usa en el desarrollo real. Las pruebas ayudan a comprobar si un programa funciona correctamente y a detectar rápidamente un error tras los cambios. Precisamente por eso nuestro sitio dice "Pruebas superadas" cuando has resuelto la tarea correctamente.

## ¿Es mi error o no?

A veces, durante la resolución, parecerá que hiciste todo bien, pero el sistema "se pone caprichoso" y no acepta la solución. Este comportamiento es prácticamente imposible. Las pruebas que no funcionan simplemente no pueden llegar al sitio; se ejecutan automáticamente después de cada cambio. En la gran mayoría de estos casos (y todos nuestros proyectos en conjunto han realizado millones de verificaciones a lo largo de los años), el error está en el código de la solución. Puede ser muy sutil: en lugar de una letra en inglés escribiste por accidente una rusa, usaste minúsculas en lugar de mayúsculas u olvidaste mostrar una coma. Otros casos son más complicados. Es posible que tu solución funcione para un conjunto de datos de entrada, pero no para otro. Por eso, lee siempre con atención el enunciado de la tarea y la salida de las pruebas. Casi seguro que allí hay una indicación del error.

Sin embargo, si estás seguro de un error o has encontrado alguna imprecisión, siempre puedes señalarlo. Al final de cada teoría hay un enlace al contenido de la lección en GitHub (¡este proyecto es completamente abierto!). Al ir allí, puedes escribir un issue, ver el contenido de las pruebas (allí se ve cómo se llama tu código) e incluso enviar un pull request. Si por ahora esto te resulta un mundo desconocido, únete a nuestra comunidad [Comunidad de Hexlet en Telegram](https://t.me/hexletcommunity/12); allí, en el canal de Voluntarios, siempre te ayudaremos.
