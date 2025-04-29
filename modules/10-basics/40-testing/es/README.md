Nuestro sitio web verifica automáticamente tus soluciones. ¿Cómo funciona?

En el caso más simple, el sistema simplemente ejecuta tu código y verifica lo que se muestra en la pantalla. Luego lo compara con lo que "esperábamos" según la tarea.

En lecciones más avanzadas, escribirás métodos, que son pequeños programas que toman información del mundo exterior y realizan ciertas operaciones. La verificación de tus soluciones en estos casos es un poco más complicada: el sistema ejecuta tu solución y le pasa cierta información. El sistema también sabe qué respuesta exacta debería devolver el método correcto para esos datos de entrada.

Por ejemplo, si tu tarea es escribir código para sumar dos números, el sistema de verificación le pasará diferentes combinaciones de números y comparará la respuesta de tu código con las sumas reales. Si las respuestas coinciden en todos los casos, la solución se considera correcta.

Aquí tienes un ejemplo sencillo: en una de las futuras lecciones, tendrás que escribir código que realice cálculos y devuelva una respuesta. Supongamos que cometiste un pequeño error y el método devolvió un número incorrecto. El sistema responderá algo como esto:

<pre class='hexlet-basics-output'>expected: "35" but was: "10"</pre>

Lo más importante comienza después de los dos puntos: "se esperaba: "35", pero fue "10"". Es decir, el código correcto debería haber devuelto 35, pero la solución actual no funciona correctamente y devuelve 10.

---

A veces, durante el proceso de resolución, puede parecer que has hecho todo correctamente, pero el sistema se "comporta de manera caprichosa" y no acepta la solución. Este comportamiento es prácticamente imposible. Las pruebas no funcionales simplemente no pueden llegar al sitio web, se ejecutan automáticamente después de cada cambio. En la gran mayoría de estos casos (y todos nuestros proyectos en conjunto han realizado millones de verificaciones a lo largo de los años), el error se encuentra en el código de la solución. Puede ser muy sutil, como haber ingresado accidentalmente una letra rusa en lugar de una letra en inglés, haber utilizado minúsculas en lugar de mayúsculas o haber olvidado poner una coma. Otros casos son más complicados. Es posible que tu solución funcione para un conjunto de datos de entrada, pero no funcione para otro. Por lo tanto, siempre lee atentamente la descripción de la tarea y los resultados de las pruebas. Casi seguro que habrá alguna indicación del error.

Sin embargo, si estás seguro del error o has encontrado alguna imprecisión, siempre puedes señalarlo. Al final de cada teoría hay un enlace al contenido de la lección en GitHub (¡este proyecto es completamente abierto!). Al ir allí, puedes escribir un issue, ver el contenido de las pruebas (se puede ver cómo se llama tu código) e incluso enviar un pull request. Si esto todavía te resulta confuso, únete a nuestra comunidad en [Comunidad de Hexlet en Telegram](https://t.me/hexletcommunity/12), allí en el canal de Voluntarios siempre estaremos dispuestos a ayudar.
