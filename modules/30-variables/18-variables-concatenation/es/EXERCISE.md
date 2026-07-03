
Los sitios web envían correos electrónicos constantemente a sus usuarios. Una tarea típica es configurar el envío automático de un correo personalizado, donde el encabezado contenga el nombre del usuario. Si el nombre de una persona se guarda en algún lugar de la base de datos del sitio como una cadena, la tarea de generar el encabezado se reduce a la concatenación: por ejemplo, hay que unir la cadena *Hola* con la cadena que contiene el nombre.

Escribe un programa que genere el encabezado y el cuerpo del correo utilizando las variables ya preparadas, y que muestre las cadenas resultantes en la pantalla.

Para el encabezado, usa las variables `firstName` y `greeting`, una coma y un signo de exclamación. Muéstralo en la pantalla en el orden correcto.

Para el cuerpo del correo, usa las variables `info` e `intro`, y la segunda oración debe estar en una nueva línea.

El resultado en la pantalla se verá así:

```text
Hello, Joffrey!
Here is important information about your account security.
We couldn't verify you mother's maiden name.
```

Completa la tarea utilizando solo dos `System.out.println()`.
