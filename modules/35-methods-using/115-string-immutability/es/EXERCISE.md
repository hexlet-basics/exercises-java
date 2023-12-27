
Los datos ingresados por los usuarios en los formularios a menudo contienen espacios en blanco adicionales al principio o al final de la cadena. Además, los usuarios pueden ingresar lo mismo en diferentes casos, lo que luego dificulta el trabajo con los datos. Por lo tanto, antes de agregarlos, los datos se procesan (se dice que se normalizan). El procesamiento básico incluye dos acciones:

* Eliminar los espacios en blanco finales utilizando el método `.trim()`, por ejemplo, si era: `"   hexlet\n "`, ahora es: `"hexlet"`
* Convertir a minúsculas utilizando el método `toLowerCase()`. Si era: `"SUPPORT@hexlet.io"`, ahora es: `"support@hexlet.io"`.

Actualiza la variable `email` asignándole el mismo valor, pero procesado según el esquema mencionado anteriormente. Imprime en pantalla el resultado obtenido.
